package testingdemo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;

public class extenntreportdemo {

	WebDriver driver=null;
	@BeforeTest
	public void setup()
	{
		
		ExtentHtmlReporter htmlReporter = new ExtentHtmlReporter("extent.html");
	    
        // create ExtentReports and attach reporter(s)
        ExtentReports extent = new ExtentReports();
        extent.attachReporter(htmlReporter);
	}
	@Test
	public void extentreport() throws IOException 
	{
		Properties pro = new Properties();
		FileInputStream fis=null;
		try {
			fis = new FileInputStream(("C:\\Users\\DELL\\eclipse-workspace\\Toolqa Automation\\application.properties"));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}									
		pro.load(fis);
		String baseurl=pro.getProperty("URL");
		driver.get(baseurl);
		
	}
	@AfterTest
	public void exitsetup()
	{
		driver.quit();
	}
	public static void main(String[] args) {

		// TODO Auto-generated method stub

	}

}
