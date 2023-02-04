package com.ebay;

import java.io.IOException;

import org.junit.Assert;
import org.testng.annotations.Test;

import com.ebayProject.Base.BaseClass;
import com.ebayProject.pageObjects.AllFooterLinks;

public class FooterLinkTC_03 extends BaseClass{
	
	@Test
	public void clickFooterLink() throws IOException
	{
		AllFooterLinks fl=new AllFooterLinks(driver);
		try 
		{
		fl.footerl();
		Assert.assertTrue(true);
		logger.info("Click to open all the links in new tab");
		}
		catch(Exception e)
		{
			capturescreen(driver,"clickFooterLink");
			Assert.assertTrue(false);
			logger.info("Failed to click all the links");
		}
		
	
		
	}
	

}
