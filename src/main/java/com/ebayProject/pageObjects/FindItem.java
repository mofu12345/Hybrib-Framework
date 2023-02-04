package com.ebayProject.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class FindItem {
	
	WebDriver ldriver;
	
	public FindItem(WebDriver rdriver)
	{
		ldriver=rdriver;
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
	
	@FindBy(name="_udlo")
	@CacheLookup
	WebElement pricefrom;
	
	public void price_from(String key)
	{
		pricefrom.sendKeys(key);
	}
	
	@FindBy(name="_udhi")
	@CacheLookup
	WebElement priceto;
	
	public void price_to(String key)
	{
		priceto.sendKeys(key);
	}
	
	@FindBy(name="LH_TitleDesc")
	@CacheLookup
	WebElement cbSearchInclude;
	
	@FindBy(name="LH_BIN")
	@CacheLookup
	WebElement cbBuyingFormat;
	
	@FindBy(id="LH_ItemConditionNew")
	@CacheLookup
	WebElement cbCondition;
	
	@FindBy(name="_ftrt")
	@CacheLookup
	WebElement listingFirstCB;
	
	public void listingCB01()
	{
		Select s1=new Select(listingFirstCB);
		s1.selectByIndex(0);
	}
	
	@FindBy(name="_ftrv")
	@CacheLookup
	WebElement listingSecondCB;
	
	public void listingCB02()
	{
		Select s2=new Select(listingSecondCB);
		s2.selectByIndex(0);
	}
	
	@FindBy(name="_sabdlo")
	@CacheLookup
	WebElement bidsFrom;
	
	public void bidsfrom(String key)
	{
		bidsFrom.sendKeys(key);
	}
	
	@FindBy(name="_sabdhi")
	@CacheLookup
	WebElement bidsTo;
	
	public void bidsto(String key)
	{
		bidsTo.sendKeys(key);
	}
	
	@FindBy(name="_samilow")
	@CacheLookup
	WebElement listingFrom;
	
	@FindBy(name="_samihi")
	@CacheLookup
	WebElement listingto;
	
	@FindBy(name="LH_FS")
	@CacheLookup
	WebElement freeShipping;
	
	@FindBy(name="LH_LPickup")
	@CacheLookup
	WebElement localPickup;
	
	@FindBy(name="_fsradio2")
	@CacheLookup
	WebElement sellerCB;
	
	@FindBy(name="_sop")
	@CacheLookup
	WebElement sortBy;
	
	@FindBy(name="_dmd")
	@CacheLookup
	WebElement viewResult;
	
	@FindBy(name="_ipg")
	@CacheLookup
	WebElement resultPerPage;
		
	
	

	

	


	

	
	

	

	
	
	
	
	

}
