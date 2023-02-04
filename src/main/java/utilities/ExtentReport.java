package utilities;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.ChartLocation;
import com.aventstack.extentreports.reporter.configuration.Theme;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;

import java.util.Date;

import org.testng.*;

public class ExtentReport extends TestListenerAdapter{
	
	public ExtentHtmlReporter htmlreporter;
	public ExtentReports extent;
	public ExtentTest logger;
	
	public void onStart(ITestContext testcontext)
	{
		String timeStamp=new SimpleDateFormat("yyy.MM.dd.HH.mm.ss").format(new Date());
		String repname="Test-Report-"+timeStamp+".html";
		htmlreporter=new  ExtentHtmlReporter(System.getProperty("user.dir")+"/Report/"+repname);
		htmlreporter.loadXMLConfig(System.getProperty("user.dir")+"/extent-config.xml");
		
		extent =new ExtentReports();
		
		extent.attachReporter(htmlreporter);
		extent.setSystemInfo("Host Name","localhost");
		extent.setSystemInfo("Enviaronment","QA");
		extent.setSystemInfo("user","Anik");
		
		htmlreporter.config().setDocumentTitle("Ebay Test Reporting");
		htmlreporter.config().setReportName("Functional test Report");
		htmlreporter.config().setTestViewChartLocation(ChartLocation.TOP);
	    htmlreporter.config().setTheme(Theme.DARK);
	}
	
	public void onTestSuccess(ITestResult tr)
	{
		logger=extent.createTest(tr.getName());
		logger.log(Status.PASS,MarkupHelper.createLabel(tr.getName(), ExtentColor.GREEN) );
		
	}
	
	public void onTestFailure(ITestResult tr)
	{
		logger=extent.createTest(tr.getName());
		logger.log(Status.FAIL,MarkupHelper.createLabel(tr.getName(), ExtentColor.RED) );
		
		String screenshotpath=System.getProperty("user.dir")+"/screenshots/"+tr.getName()+".jpg";
		
		File f=new File(screenshotpath);
		
		if(f.exists())
		{
			try
			{
				logger.fail("screenshot is below"+logger.addScreenCaptureFromPath(screenshotpath));
			}
			catch(IOException e)
			{
				e.printStackTrace();
			}
		}
	}
	
	public void onTestSkipped(ITestResult tr)
	{
		logger=extent.createTest(tr.getName());
		logger.log(Status.SKIP,MarkupHelper.createLabel(tr.getName(), ExtentColor.ORANGE) );
	}
	
	public void onFinish(ITestContext testcontext)
	{
		extent.flush();
	}
	
	
	
	

}
