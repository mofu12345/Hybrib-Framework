package com.ebayProject.pageObjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ClickingItems {
	
	
WebDriver driver;
	
	public ClickingItems(WebDriver rdriver)
	{
		driver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	@FindBy(name="//ul[@class='adv l-adv']")
	WebElement items;
	
	public void clickItems()
	{
//	    WebElement item=items;
//	    System.out.println(item.findElements(By.tagName("a")).size());
//	    
//	    for(int i=1;i<item.findElements(By.tagName("a")).size();i++)
//	    {
//	    	String clickItem=Keys.chord(Keys.COMMAND,Keys.ENTER);
//	    	item.findElements(By.tagName("a")).get(i).sendKeys(clickItem);
//	    }
		
		List<WebElement> webelement= driver.findElements(By.xpath("//div[@class='sbx-b rct-c']/ul/li/a"));
		System.out.println(webelement.size());
		
		for(int i=1;i<webelement.size();i++)
		{
			List<WebElement> list=driver.findElements(By.xpath("//div[@class='sbx-b rct-c']/ul["+i+"]/li/a"));
			for(int j=1;j<=list.size();j++)
			{
				driver.findElement(By.xpath("//div[@class='sbx-b rct-c']/ul["+i+"]/li["+j+"]/a")).click();
			}
			}
			driver.switchTo().defaultContent();
		}
	}

	
	
