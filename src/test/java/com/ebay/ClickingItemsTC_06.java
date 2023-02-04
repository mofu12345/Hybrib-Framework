package com.ebay;

import java.io.IOException;

import org.junit.Assert;
import org.testng.annotations.Test;

import com.ebayProject.Base.BaseClass;
import com.ebayProject.pageObjects.ClickingItems;

public class ClickingItemsTC_06 extends BaseClass{
	
	@Test
	public void TC() throws IOException
	{
		ClickingItems ci=new ClickingItems(driver);
		
		try
		{
			ci.clickItems();
			Assert.assertTrue(true);
//			logger.info("Clickng all the side links");
		}
		catch(Exception e)
		{
			capturescreen(driver,"ClickingItemsTC_06");
			Assert.assertTrue(false);
//			logger.info("Failed to click all the links");
		}
	}
	
	

}
