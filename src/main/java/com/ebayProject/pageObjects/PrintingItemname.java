package com.ebayProject.pageObjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class PrintingItemname {

    WebDriver driver;
	
	public PrintingItemname(WebDriver rdriver)
	{
		driver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	@FindBy(name="_nkw")
	@CacheLookup
	WebElement enterkey;
	
	public void enterKey(String value)
	{
		enterkey.sendKeys(value);
	}
	
	@FindBy(name="_ex_kw")
	@CacheLookup
	WebElement excludeWord;
	
	public void excludeword(String value)
	{
		excludeWord.sendKeys(value);
	}
	
	@FindBy(name="_in_kw")
	@CacheLookup
	WebElement keywordOption;
	
	public void kwOption()
	{
		Select select=new Select(keywordOption);
		select.selectByIndex(2);
	}
	
	@FindBy(name="_sacat")
	@CacheLookup
	WebElement allcategory;
	
	public void Allcategory()
	{
		Select select=new Select(allcategory);
        select.selectByIndex(4);
	}
	
	@FindBy(xpath ="(//button[@type='submit'])[1]")
	@CacheLookup
	WebElement search01;
	
	public void search1()
	{
		search01.click();
	}
	
	public void printItemName()
	{
		List <WebElement> element=driver.findElements(By.xpath("//div[@class='s-item__title']"));
		WebElement itemstored;
		for(int i=0;i<element.size();i++)
		{
			if(i==5)
			break;
			itemstored=element.get(i);
			
			System.out.println("title: "+itemstored.getText());

		}
	}				

	
}
