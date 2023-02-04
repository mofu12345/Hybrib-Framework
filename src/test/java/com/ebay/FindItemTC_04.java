package com.ebay;

import java.io.IOException;

import org.junit.Assert;
import org.testng.annotations.Test;

import com.ebayProject.Base.BaseClass;
import com.ebayProject.pageObjects.FindItem;

public class FindItemTC_04 extends BaseClass{

	@Test
	public void TC() throws IOException
	{
		logger.info("URL has opened");
		FindItem fi=new FindItem(driver);
		
		fi.enterKey("java");
		logger.info("Item name entered");
		
		fi.excludeword("program");
		logger.info("Excluded word from the search item");
		
		fi.kwOption();
		logger.info("Select key from dropdown");
		
		fi.Allcategory();
		logger.info("Category selected");
		
		fi.search1();
		logger.info("Item searched");
		
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
