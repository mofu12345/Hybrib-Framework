package com.ebay;

import java.io.IOException;

import org.junit.Assert;
import org.testng.annotations.Test;

import com.ebayProject.Base.BaseClass;
import com.ebayProject.pageObjects.AllFooterLinks;
import com.ebayProject.pageObjects.Checkboxbtn;
import utilities.ReadConfig;

public class TitleTC_01 extends BaseClass{

	@Test
	public void titlecheck() throws IOException
	{
		ReadConfig rc=new ReadConfig();

		
		if(driver.getTitle().equals(rc.titleofThePage()))
		{
			Assert.assertTrue(true);
			logger.info("Testcase passed");
		}
		else
		{
			capturescreen(driver,"titlecheck");
			Assert.assertFalse(false);
			logger.info("Testcase failed");
		}
	}
	
		
	
}
