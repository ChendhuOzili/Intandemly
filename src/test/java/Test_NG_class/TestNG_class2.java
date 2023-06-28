package Test_NG_class;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.Transferable;
import java.awt.event.KeyEvent;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;



public class TestNG_class2 {
	@Test (priority=1)
	public static void main() {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\LENOVO T480\\Downloads\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver=new ChromeDriver();

		//create account
		driver.get("https://v3.intandemly.com/account/user/login");
		driver.manage().window().maximize();


	}
	//=======================================================================================================================
	//Sign in another account.
	@Test (priority=2)
	public void SigninAnother () throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\LENOVO T480\\Downloads\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver=new ChromeDriver();

	
		driver.get("https://v3.intandemly.com/account/user/login");
		driver.manage().window().maximize();

		driver.get("https://v3.intandemly.com/account/user/login");
		driver.manage().window().maximize();
		driver.findElement(By.id("login-form-login")).sendKeys("madiraju.nischal@gmail.com");// madiraju.nischal@gmail.com
		driver.findElement(By.xpath("//input[@id=\"passwordInput\"]")).sendKeys("Password@2022");
		Thread.sleep(1000);
		driver.findElement(By.id("passwordIcon")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
		driver.findElement(By.xpath("//i[normalize-space()='account_circle']")).click();
		driver.findElement(By.xpath("//a[normalize-space()='Logout']")).click();

		Thread.sleep(2000);
		//Enter new signin details.

		driver.findElement(By.id("login-form-login")).sendKeys("itzmeanvithreddy@gmail.com");// itzmeanvithreddy@gmail.com
		driver.findElement(By.xpath("//input[@id=\"passwordInput\"]")).sendKeys("Geetha@123");
		Thread.sleep(1000);
		driver.findElement(By.id("passwordIcon")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();

		// Sign in successfull
	}



	//===================================================================================================================
	@Test(priority=3)
	public void LogIn() throws InterruptedException
	{

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\LENOVO T480\\Downloads\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver=new ChromeDriver();

		//create account
		driver.get("https://v3.intandemly.com/account/user/login");
		driver.manage().window().maximize();
		driver.findElement(By.id("login-form-login")).sendKeys("madiraju.nischal@gmail.com");// madiraju.nischal@gmail.com
		driver.findElement(By.xpath("//input[@id=\"passwordInput\"]")).sendKeys("Password@2022");
		Thread.sleep(1000);
		driver.findElement(By.id("passwordIcon")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();



		//successfully login.

	}




	//======================================================================================================================
	@Test (priority=4)
	public void Createaccount() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\LENOVO T480\\Downloads\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver=new ChromeDriver();

		//create account
		driver.get("https://v3.intandemly.com/account/user/login");
		driver.manage().window().maximize();
		driver.findElement(By.id("login-form-login")).sendKeys("madiraju.nischal@gmail.com");// madiraju.nischal@gmail.com
		driver.findElement(By.xpath("//input[@id=\"passwordInput\"]")).sendKeys("Password@2022");
		Thread.sleep(1000);
		driver.findElement(By.id("passwordIcon")).click();
		System.out.println("Intandemly");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();


		driver.findElement(By.xpath("//a[normalize-space()='Accounts']")).click();
		Thread.sleep(2000);
		//verify create account.
		driver.findElement(By.xpath("//span[normalize-space()='Create Account']")).click();
		//Account name
		driver.findElement(By.id("company_name")).sendKeys("Deo_123");
		//Account domain
		driver.findElement(By.xpath("//input[@id='company_domain']")).sendKeys("Telee");
		//Phone number
		driver.findElement(By.xpath("//input[@id='company_phone']")).sendKeys("79982965");
		//Adress
		driver.findElement(By.xpath("//input[@id='company_address']")).sendKeys("Sri city, Andrapradesh",Keys.ENTER);
		//Anual revenue
		driver.findElement(By.xpath("//input[@id='annual_revenue']")).sendKeys("100");			 
		//Select Annual revunue drop down
		driver.findElement(By.xpath("//div[contains(text(),'- - Select Revenue Units - -')]")).click();
		//select annual revenue (Billions) dropdown

		WebElement  StaticDropdown = driver.findElement(By.id("revenue_units"));
		Select dropdown = new Select (StaticDropdown);
		dropdown.selectByValue("2");
		System.out.println(dropdown.getFirstSelectedOption().getText());





		//select county dropdown.	
		WebElement  StaticDropdown2 = driver.findElement(By.id("company_country"));
		Select dropdown2 = new Select (StaticDropdown2);
		dropdown2.selectByValue("19");
		System.out.println(dropdown2.getFirstSelectedOption().getText());



		//select owner dropdown
		WebElement  StaticDropdown3 = driver.findElement(By.id("company_owner_id"));
		Select dropdown3 = new Select (StaticDropdown3);
		dropdown3.selectByValue("3122");
		System.out.println(dropdown3.getFirstSelectedOption().getText());




		//crete company button
		driver.findElement(By.xpath("//form[@id='addcompany']//button[@id='addcompany-submit']")).click();


		Thread.sleep(3000); 
		driver.findElement(By.xpath("(//button[@type='button'])[2]")).click();
	}

	//==========================================================================================================================
	//Actions of the accounts.

	@Test(priority=5)

	public void Account_Actions() throws InterruptedException {
		//Actions of the accounts.
		//Setting Chrome browser path
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\LENOVO T480\\Downloads\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver =new ChromeDriver();

		//Launching Browser
		driver.get("https://v3.intandemly.com/account/user/login");
		driver.manage().window().maximize();
		//Enter user credentials

		driver.findElement(By.xpath("//input[@id=\"login-form-login\"]")).sendKeys("madiraju.nischal@gmail.com");//E-mail id
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id=\"passwordInput\"]")).sendKeys("Password@2022"); //password
		Thread.sleep(1000);
		driver.findElement(By.id("passwordIcon")).click(); //Eye icon button
		Thread.sleep(1000);
		driver.findElement(By.id("passwordIcon")).click(); 
		driver.findElement(By.xpath("//button[@type=\"submit\"]")).click(); //submit

		//successfully login.


		driver.findElement(By.xpath("//a[normalize-space()='Dashboard']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[normalize-space()='Accounts']//*[name()='svg']")).click();

		//Verify check box for account actions.
		Thread.sleep(2000);
		driver.findElement(By.xpath("//label[@for='1715126']")).click();
		Thread.sleep(2000);
		//Select Assign 
		driver.findElement(By.xpath("//span[normalize-space()='Assign']")).click();
		//Select Assign to owner dropdown.
		WebElement assignowner = driver.findElement(By.id("assignowner"));

		Select assignownerDropdown = new Select(assignowner);
		List<WebElement>assignownerDropdownOptions = assignownerDropdown.getOptions();
		for (WebElement option : assignownerDropdownOptions) {


		}
		assignownerDropdown.selectByIndex(1);
		Thread.sleep(3000); 
		assignownerDropdown.selectByValue("3041");

		//Assign company owner.
		driver.findElement(By.xpath("//form[@id='assignuser']//button[@id='addcompany-submit']")).click();

		Thread.sleep(3000); 
		driver.findElement(By.xpath("//button[@class='confirm']")).click();
		




	}



	private char[] getFirstSelectedOption() {
		// TODO Auto-generated method stub	
		return null;
	}


	//=================================================================================================================

	//update contact 
	@Test (priority=6)
	public void AccountUpdate() throws InterruptedException{
		//Setting Chrome browser path
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\LENOVO T480\\Downloads\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver=new ChromeDriver();

		//Launching Browser
		driver.get("https://v3.intandemly.com/account/user/login");
		driver.manage().window().maximize();
		//Enter user credentials

		driver.findElement(By.xpath("//input[@id=\"login-form-login\"]")).sendKeys("madiraju.nischal@gmail.com");//E-mail id
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id=\"passwordInput\"]")).sendKeys("Password@2022"); //password
		Thread.sleep(1000);
		driver.findElement(By.id("passwordIcon")).click(); //Eye icon button
		Thread.sleep(1000);
		driver.findElement(By.id("passwordIcon")).click(); 
		driver. findElement(By.xpath("//button[@type=\"submit\"]")).click(); //submit


		driver. findElement(By.xpath("//a[normalize-space()='Dashboard']")).click();
		Thread.sleep(1000);
		driver. findElement(By.xpath("//a[normalize-space()='Accounts']//*[name()='svg']")).click();

		//Verify check box for account actions.
		Thread.sleep(2000);
		driver.  findElement(By.xpath("//label[@for='1715126']")).click();
		Thread.sleep(2000);
		//Select update.
		driver.findElement(By.xpath("//span[normalize-space()='Update']")).click();
		//findElement(By.xpath("//button[contains(@data-id,'assign_company_country')]")).click();
		//Thread.sleep(2000);

		//findElement(By.xpath("//div[@id='assigncountrytouser']//li[2]//a[1]")).click();
		WebElement assign_company_country = driver.findElement(By.id("assign_company_country"));

		Select assign_company_countryDropdown = new Select(assign_company_country);
		List<WebElement>assign_company_countryDropdownOptions = assign_company_countryDropdown.getOptions();
		for (WebElement option : assign_company_countryDropdownOptions) {


		}
		assign_company_countryDropdown.selectByIndex(1);
		Thread.sleep(3000); 
		assign_company_countryDropdown.selectByValue("113");

		Thread.sleep(2000);
		assign_company_countryDropdown.selectByValue("13");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//form[@id='assigncountry']//button[@id='addcompany-submit']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@class='confirm']")).click();
		//Organisation(s) Country Assigned Successfully			


	}



	private WebElement findElement(By xpath) {
		// TODO Auto-generated method stub
		return null;
	}


	//==========================================================================================

	//Account Export.
	@Test (priority=7)
	public void Account_Export() throws InterruptedException
	{


		//Setting Chrome browser path
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\LENOVO T480\\Downloads\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver=new ChromeDriver();

		//Launching Browser
		driver.get("https://v3.intandemly.com/account/user/login");
		driver.manage().window().maximize();
		//Enter user credentials
		driver.findElement(By.xpath("//input[@id=\"login-form-login\"]")).sendKeys("madiraju.nischal@gmail.com");//E-mail id
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id=\"passwordInput\"]")).sendKeys("Password@2022"); //password
		Thread.sleep(1000);
		driver.findElement(By.id("passwordIcon")).click(); //Eye icon button
		Thread.sleep(1000);
		driver.findElement(By.id("passwordIcon")).click(); 
		driver. findElement(By.xpath("//button[@type=\"submit\"]")).click(); //submit
		//successfully login.


		driver. findElement(By.xpath("//a[normalize-space()='Dashboard']")).click();
		Thread.sleep(1000);
		driver. findElement(By.xpath("//a[normalize-space()='Accounts']//*[name()='svg']")).click();

		//Verify check box for account actions.
		Thread.sleep(1000);
		driver.  findElement(By.xpath("//label[@for='1715126']")).click();
		Thread.sleep(1000);
		//Select category add to category button.

		driver.findElement(By.xpath("//span[@class='icon-name font-14 companycategory']")).click();
		Thread.sleep(2000);

		
		
			
	}

	//Account details downlaoded successfully in Excel file.



//=======================================================================================================================================
	@Test (priority=8)
	public void Account_Category() throws InterruptedException {

		//Setting Chrome browser path
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\LENOVO T480\\Downloads\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver=new ChromeDriver();

		//Launching Browser
		driver.get("https://v3.intandemly.com/account/user/login");
		driver.manage().window().maximize();
		//Enter user credentials

		driver.findElement(By.xpath("//input[@id=\"login-form-login\"]")).sendKeys("madiraju.nischal@gmail.com");//E-mail id
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id=\"passwordInput\"]")).sendKeys("Password@2022"); //password
		Thread.sleep(1000);
		//findElement(By.xpath("//i[@id='passwordIcon']")).click(); //Eye icon button
		//Thread.sleep(1000);

		driver.findElement(By.xpath("//button[@type=\"submit\"]")).click(); //submit
		//successfully login.

 {
	

		driver.findElement(By.xpath("//a[normalize-space()='Dashboard']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[normalize-space()='Accounts']//*[name()='svg']")).click();

		//Verify check box for account actions.
		Thread.sleep(1000);
		driver.findElement(By.xpath("//label[@for='1715126']")).click();
		Thread.sleep(1000);
		// click on category button.
		driver.findElement(By.xpath("//span[@class='icon-name font-14 companycategory']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='category_name']")).sendKeys("Techica group",Keys.ENTER);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@id='addcompanycategorylist']")).click();

		//driver.findElement(By.xpath("//button[@class='confirm']")).click();  //ok button.
		Assert.assertEquals(true, false);
 }

	}


	//========================================================================================================================================
	// create New category.

	@Test (priority=9)
	public void create_new_account() throws InterruptedException

	{//Setting Chrome browser path
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\LENOVO T480\\Downloads\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver=new ChromeDriver();

		//Launching Browser
		driver.get("https://v3.intandemly.com/account/user/login");
		driver.manage().window().maximize();
		//Enter user credentials

		driver.findElement(By.xpath("//input[@id=\"login-form-login\"]")).sendKeys("madiraju.nischal@gmail.com");//E-mail id
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id=\"passwordInput\"]")).sendKeys("Password@2022"); //password
		Thread.sleep(1000);
		driver.findElement(By.id("passwordIcon")).click(); //Eye icon button
		Thread.sleep(1000);
		driver.findElement(By.id("passwordIcon")).click(); 
		driver. findElement(By.xpath("//button[@type=\"submit\"]")).click(); //submit
		//successfully login.


		driver. findElement(By.xpath("//a[normalize-space()='Dashboard']")).click();
		Thread.sleep(1000);
		driver. findElement(By.xpath("//a[normalize-space()='Accounts']//*[name()='svg']")).click();

		//Verify check box for account actions.
		Thread.sleep(2000);
		driver.  findElement(By.xpath("//label[@for='1715126']")).click();
		Thread.sleep(2000);
		//Select category add to category button.

		driver.findElement(By.xpath("//span[@class='icon-name font-14 companycategory']")).click();
		Thread.sleep(2000);

		//Select the add to existing button.
		driver.findElement(By.xpath("//label[normalize-space()='Add to existing']")).click();
		//select category name dropdown.
		WebElement category = driver.findElement(By.id("category"));

		Select categoryDropdown = new Select(category);
		List<WebElement>categoryDropdownOptions = categoryDropdown.getOptions();
		for (WebElement option :categoryDropdownOptions) {


		}
		categoryDropdown.selectByIndex(1);
		Thread.sleep(3000); 
		categoryDropdown.selectByValue("19");
		Thread.sleep(3000); 
		categoryDropdown.selectByValue("13");
		Thread.sleep(3000); 
		categoryDropdown.selectByValue("26");




		//click update category.
		driver.findElement(By.xpath("//button[@id='updatecompanycategorylist-submit']")).click();
		Thread.sleep(3000); 
		driver.findElement(By.xpath("//button[@class='confirm']")).click();



	}








	//=======================================================================================================================================================================
	//Add to category with existing data.
	@Test (priority=10)

	public void Add_TO_Category_Existing() throws InterruptedException {
		//Setting Chrome browser path
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\LENOVO T480\\Downloads\\chromedriver_win32\\chromedriver.exe");


		WebDriver driver=new ChromeDriver();

		//Launching Browser
		driver.get("https://v3.intandemly.com/account/user/login");
		driver.manage().window().maximize();
		//Enter user credentials

		driver.findElement(By.xpath("//input[@id=\"login-form-login\"]")).sendKeys("madiraju.nischal@gmail.com");//E-mail id
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id=\"passwordInput\"]")).sendKeys("Password@2022"); //password
		Thread.sleep(1000);
		driver.findElement(By.id("passwordIcon")).click(); //Eye icon button
		Thread.sleep(1000);
		driver.findElement(By.id("passwordIcon")).click(); 
		driver.  findElement(By.xpath("//button[@type=\"submit\"]")).click(); //submit



		//successfully login.


		driver.findElement(By.xpath("//a[normalize-space()='Dashboard']")).click();
		Thread.sleep(1000);
		driver. findElement(By.xpath("//a[normalize-space()='Accounts']//*[name()='svg']")).click();

		//Verify check box for account actions.
		Thread.sleep(2000);
		driver. findElement(By.xpath("//label[@for='1715126']")).click();
		Thread.sleep(2000);
		//Select category add to category button.

		driver.findElement(By.xpath("//span[@class='icon-name font-14 companycategory']")).click();
		Thread.sleep(2000);

		//Select the add to existing button.
		driver.findElement(By.xpath("//label[normalize-space()='Add to existing']")).click();
		//select category name dropdown.				
		WebElement category = driver.findElement(By.id("category"));

		Select categoryDropdown = new Select(category);
		List<WebElement>categoryDropdownOptions = categoryDropdown.getOptions();
		for (WebElement option :categoryDropdownOptions) {


		}
		categoryDropdown.selectByIndex(1);
		Thread.sleep(3000); 
		categoryDropdown.selectByValue("19");
		Thread.sleep(3000); 
		categoryDropdown.selectByValue("13");
		Thread.sleep(3000); 
		categoryDropdown.selectByValue("26");
		//click update category.
		driver.findElement(By.xpath("//button[@id='updatecompanycategorylist-submit']")).click();
		Thread.sleep(3000); 
		driver.findElement(By.xpath("//button[@class='confirm']")).click();
		//Selected Account(s) added to Category list Successfully.
driver.quit();
	}

	

//==========================================================================================================================================================
@Test
public <StringSelection> void Import_Account() throws InterruptedException, AWTException {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\LENOVO T480\\Downloads\\chromedriver_win32\\chromedriver.exe");


	WebDriver driver=new ChromeDriver();

	//Launching Browser
	driver.get("https://v3.intandemly.com/account/user/login");
	driver.manage().window().maximize();
	//Enter user credentials

	driver.findElement(By.xpath("//input[@id=\"login-form-login\"]")).sendKeys("madiraju.nischal@gmail.com");//E-mail id
	Thread.sleep(1000);
	driver.findElement(By.xpath("//input[@id=\"passwordInput\"]")).sendKeys("Password@2022"); //password
	Thread.sleep(1000);
	driver.findElement(By.id("passwordIcon")).click(); //Eye icon button
	Thread.sleep(1000);
	driver.findElement(By.id("passwordIcon")).click(); 
	driver.  findElement(By.xpath("//button[@type=\"submit\"]")).click(); //submit



	//successfully login.


	driver.findElement(By.xpath("//a[normalize-space()='Dashboard']")).click();
	Thread.sleep(1000);
	driver. findElement(By.xpath("//a[normalize-space()='Accounts']//*[name()='svg']")).click();
Thread.sleep(2000);
driver.findElement(By.xpath("//*[@id=\"companyindextable_wrapper\"]/div[1]/div[4]/div/a[2]")).click();
Thread.sleep(2000);
driver.findElement(By.xpath("//*[@id=\"companyImporterForm\"]")).click();
Thread.sleep(2000);




 


	
}
}




