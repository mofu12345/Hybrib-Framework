package utilities;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ReadConfig {
	
	Properties prop;
	public ReadConfig()
	{
		File src=new File("/Users/hart/eclipse-workspace/ebayProject/src/main/java/resources/config.properties");
		FileInputStream fis;
		
		try
		{
		    fis=new FileInputStream(src);
			prop=new Properties();
			prop.load(fis);
		}
		catch(Exception e)
		{
			System.out.println("Exception is"+e.getMessage());
			e.printStackTrace();
		}
	}

	public String getApplicationURL()
	{
		String url=prop.getProperty("baseurl");
		return url;
	}
	
	public String titleofThePage()
	{
		String title=prop.getProperty("pagetitle");
		return title;
		
	}
}
