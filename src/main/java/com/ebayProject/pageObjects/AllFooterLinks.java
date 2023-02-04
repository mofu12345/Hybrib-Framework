package com.ebayProject.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AllFooterLinks {
	
WebDriver ldriver;
	
	public AllFooterLinks(WebDriver rdriver)
	{
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	@FindBy(id="gf-t-box")
	@CacheLookup
	WebElement fotterlinks;
	
	public void footerl()
	{
		WebElement tabs= fotterlinks;
		System.out.println(tabs.findElements(By.tagName("a")).size());
		
		for(int i=1; i<tabs.findElements(By.tagName("a")).size();i++)
		{
			String opentab=Keys.chord(Keys.COMMAND,Keys.ENTER);
			tabs.findElements(By.tagName("a")).get(i).sendKeys(opentab);
		}

	}


}
