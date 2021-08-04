package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.registartion;

public class hompage_toolsqa { 


	public hompage_toolsqa(WebDriver driver) {
		super();
		// TODO Auto-generated constructor stub
	}

	static WebDriver driver;
	@BeforeTest
	public static void setup()
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\DELL\\Desktop\\my files\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		@SuppressWarnings("unused")
		String baseurl = "http://demo.automationtesting.in/Register.html";	
		driver.get(baseurl);
		driver.manage().window().maximize();


	}

	@Test
	public static void verifytitle()
	{	
		String Title=driver.getTitle();
		System.out.println(""+Title);



		if(Title.equals("Register"))
		{
			System.out.println("-------------ur on right page proceed-------");

		}
		else
		{
			System.out.println("-------------ur on different page go to homepage");
		}


	}


	@AfterTest
	public static void closesetup()
	{
		driver.close();
	}

	public static void main(String[] args)
	{

		// TODO Auto-generated method stub
		hompage_toolsqa.setup();
		hompage_toolsqa.verifytitle();
		registartion reg=new registartion(driver);
		reg.getfname_lname("pinkesh","choudhary");
		reg.addressemail("boisar", "pinkeshchoudhary007@gmail.com");
		reg.getphonezendhob("8788415411");
		reg.hobbieslanguage();
		reg.skillscountry();
		reg.dob();
		reg.verifypasswords("Pinkesh123", "Pinkesh123");
		hompage_toolsqa.closesetup();

	}

}
