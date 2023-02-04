package com.ebay;

import java.io.IOException;

import org.junit.Assert;
import org.testng.annotations.Test;

import com.ebayProject.Base.BaseClass;
import com.ebayProject.pageObjects.PrintingItemname;

public class PrintingItemTC_05 extends BaseClass {
	
	@Test
	public void printname() throws IOException
	{
		logger.info("URL has opened");
		PrintingItemname pi=new PrintingItemname(driver);
		
		pi.enterKey("java");
		logger.info("Item name entered");
		
		pi.excludeword("program");
		logger.info("Excluded word from the search item");
		
		pi.kwOption();
		logger.info("Select key from dropdown");
		
		pi.Allcategory();
		logger.info("Category selected");
		
		pi.search1();
		logger.info("Item searched");
		
		pi.printItemName();
		logger.info("Item names printed");
		
		if(driver.getTitle().equals("java -program in Books &amp; Magazines for sale"))
		{
			Assert.assertTrue(true);
			logger.info("Test passed");
		}
		else 
		{
			capturescreen(driver,"FindItemTC_04");
			Assert.assertTrue(false);
			logger.info("Test failed");
		}
			
			
		
		
	}

}
