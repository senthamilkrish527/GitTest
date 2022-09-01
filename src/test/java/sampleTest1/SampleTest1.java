package sampleTest1;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SampleTest1 {

	
	@Test
	public void loginTest () throws IOException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver wd = new ChromeDriver();
		wd.manage().window().maximize();
		
		wd.get("https://www.google.com/");
		
		File f = ((TakesScreenshot)wd).getScreenshotAs(OutputType.FILE); 	// casting two interfaces
		
		// FileUtils // comes from apache. since its a third party tool, we don't use it.
				 // Selenium itself has its own file handler.
		
		FileHandler.copy(f, new File ("F:\\VCENTRY\\GitTest\\screenshot\\google.png"));
		
		
	}
	
}
