package com.ebay;

import java.io.IOException;

import org.junit.Assert;
import org.testng.annotations.Test;

import com.ebayProject.Base.BaseClass;
import com.ebayProject.pageObjects.Checkboxbtn;

public class CheckboxTC_02 extends BaseClass{
	
	@Test
	public void checkboxbtn() throws IOException
	{
		Checkboxbtn ckbx=new Checkboxbtn(driver);
		try
		{
			ckbx.clickCB();
			logger.info("Testcase passed");
			Assert.assertTrue(true);
		}
		catch(Exception e)
		{
			capturescreen(driver,"checkboxbtn");
			logger.info("Testcase failed");
			Assert.assertTrue(false);
		}
		
		
	}


}
