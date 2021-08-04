package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class registartion {

	WebDriver driver;
	public registartion(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath="//body/section[@id='section']/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/input[1]")
	static
	WebElement fname;
	@FindBy(xpath="//body/section[@id='section']/div[1]/div[1]/div[2]/form[1]/div[1]/div[2]/input[1]")
	static WebElement lname;
	@FindBy(xpath="//body/section[@id='section']/div[1]/div[1]/div[2]/form[1]/div[2]/div[1]/textarea[1]")
	static WebElement add;
	@FindBy(xpath="//body/section[@id='section']/div[1]/div[1]/div[2]/form[1]/div[3]/div[1]/input[1]")
	static WebElement email;
	@FindBy(xpath="//body/section[@id='section']/div[1]/div[1]/div[2]/form[1]/div[4]/div[1]/input[1]")
	static WebElement phone;
	@FindBy(xpath="//body/section[@id='section']/div[1]/div[1]/div[2]/form[1]/div[5]/div[1]/label[1]/input[1]")
	static WebElement gender;
	@FindBy(xpath="//input[@id='checkbox1']")
	static WebElement hobbies;
	@FindBy(xpath="//input[@id='checkbox2']")
	static WebElement hobbies1;


	public void getfname_lname(String fullname, String lastname )
	{

		fname.sendKeys(fullname);
		lname.sendKeys(lastname);
	}

	public void addressemail(String address, String mail)

	{
		add.sendKeys("address");
		email.sendKeys("pinkeshchoudhary007@gmail.com");


	}

	public void getphonezendhob(String mob)
	{
		phone.sendKeys("mob");

		if (gender.isSelected()) {
			gender.clear();

		}
		else 
		{
			gender.click();
		}


	}
	public void hobbieslanguage()
	{
		if (hobbies.isSelected()) {
			hobbies.clear();

		}
		else 
		{
			hobbies.click();
		}
		if (hobbies1.isSelected()) {
			hobbies1.clear();

		}
		else 
		{
			hobbies1.click();
		}

		driver.findElement(By.xpath("//div[@id='msdd']")).click();
		driver.findElement(By.xpath("//a[contains(text(),'English')]")).click();
		driver.findElement(By.xpath("//body/section[@id='section']/div[1]/div[1]/div[2]/form[1]/div[7]/div[1]/multi-select[1]/div[2]/ul[1]/li[16]")).click();

	}
	public void skillscountry()
	{
		Select skill=new Select(driver.findElement(By.id("Skills")));
		if(skill.isMultiple())
		{
			System.out.println("select multiple values");
		}
		else
		{
			System.out.println("select single skill");
		}

		skill.selectByValue("C++");

		Select selcountry=new Select(driver.findElement(By.id("countries")));
		if(selcountry.isMultiple())
		{
			System.out.println("select multiple values");
		}
		else
		{
			System.out.println("select single country");
		}

		selcountry.selectByVisibleText("India");

		driver.findElement(By.xpath("//body/section[@id='section']/div[1]/div[1]/div[2]/form[1]/div[10]/div[1]/span[1]/span[1]/span[1]")).click();;
		driver.findElement(By.id("select2-country-container"));

	}
	public void dob()
	{
		Select selyear=new Select (driver.findElement(By.id("yearbox")));
		selyear.selectByVisibleText("1994");
		Select selmonth=new Select (driver.findElement(By.xpath("//body/section[@id='section']/div[1]/div[1]/div[2]/form[1]/div[11]/div[2]/select[1]")));
		selmonth.selectByVisibleText("January");
		Select seldate=new Select(driver.findElement(By.id("daybox")));
		seldate.selectByValue("7");
	}
	public void verifypasswords(String fpassword,String cpassword) 
	{
		driver.findElement(By.id("firstpassword")).sendKeys("fpassword");
		driver.findElement(By.id("secondpassword")).sendKeys("cpassword");
		if(fpassword.equals(cpassword))
		{
			driver.findElement(By.id("submitbtn")).click();;
		}
		else
		{
			System.out.println("----------first password and confirm password should be same");
		}

	}



	public  static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
