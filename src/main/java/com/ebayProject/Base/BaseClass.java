package com.ebayProject.Base;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import io.github.bonigarcia.wdm.WebDriverManager;
import utilities.ReadConfig;

import org.testng.annotations.*;

public class BaseClass {
	
	public static WebDriver driver;
	public static Logger logger;
	ReadConfig readconfig=new ReadConfig();
	public String baseURL=readconfig.getApplicationURL();

	
	
	@Parameters("browser")
	@BeforeClass
	public void setup(String br)
	{
		logger=Logger.getLogger("website");
		PropertyConfigurator.configure("Log4j.properties");

		if(br.equalsIgnoreCase("chrome"))
		{
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		}
		else if(br.equalsIgnoreCase("firefox"))
		{
		}
		else if(br.equalsIgnoreCase("ie"))
		{
		}
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();
		driver.get(baseURL);

	}
	
	@AfterClass
	public void teardown()
	{
		driver.close();
	}
	
	public void capturescreen(WebDriver driver,String tname) throws IOException
	{
		TakesScreenshot cs=(TakesScreenshot)driver;
		File src=cs.getScreenshotAs(OutputType.FILE);
		File target=new File(System.getProperty("user.dir")+"/screenshots/"+ tname +".jpg");
		FileUtils.copyFile(src, target);
		System.out.println("Screenshot taken");
	}
	

}
