package com.ebayProject.pageObjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Checkboxbtn {
	
	WebDriver driver;
	
	public Checkboxbtn(WebDriver rdriver)
	{
		driver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	

	@FindBy(xpath="//input[@type='checkbox']")
	@CacheLookup
	WebElement allCB;
	
	public void clickCB()
	{List<WebElement> checkbox=driver.findElements(By.xpath("//input[@type='checkbox' ]"));
	for(int i=0;i<checkbox.size();i++)
	{
		checkbox.get(i).click();
	}}
	}

