package Test_NG_class;

import java.util.List;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;

import org.testng.annotations.BeforeMethod;

import org.testng.annotations.Test;



public class Contact_module_scenarios {

	
	private static ChromeDriver driver;
	@BeforeMethod
	
	public static void Advance_search_bar() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\LENOVO T480\\Downloads\\chromedriver_win32\\chromedriver.exe");

		driver=new ChromeDriver();

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
		driver.  findElement(By.xpath("//button[@type=\"submit\"]")).click(); //submit
		driver. findElement(By.xpath("//a[normalize-space()='Dashboard']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[normalize-space()='Contacts']//*[name()='svg']")).click();
	}
		@AfterMethod
		public void browse_close() {
			
		driver.quit();
		
		}
		
		@Test(priority=1)
		public void create_account() throws InterruptedException {
		//Assert.assertTrue(driver.findElement(By.xpath("//div[@id='contactsindextable_wrapper']")).isDisplayed());

		driver.findElement(By.xpath("//button[contains(@title,'Advance search')]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='advancesearch']")).sendKeys("TATA");
		Thread.sleep(2000);
		//select owner dropdown.
		WebElement Staticdropdown= driver.findElement(By.id("searchowner"));
		Select dropdown = new Select (Staticdropdown);
		dropdown.selectByValue("3106");
		System.out.println(dropdown.getFirstSelectedOption().getText());



		//Select date Rangers.
		driver.findElement(By.xpath("//input[@id='addedfromdatesearch']")).click();
		for (int i=1;i>3;i++)
		{
			driver.findElement(By.xpath("(//i[@class='material-icons'])[21]")).click();

		}
		driver.findElement(By.xpath("//a[normalize-space()='03']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//button[@class='dtp-btn-ok btn btn-flat btn-sm'])[2]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[contains(@title,'Advance search')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='addedtodatesearch']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//body[1]/div[5]/div[1]/div[1]/div[3]/div[1]/table[1]/tbody[1]/tr[5]/td[4]/a[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//button[@class='dtp-btn-ok btn btn-flat btn-sm'])[1]")).click();

		driver.findElement(By.xpath("//button[contains(@title,'Advance search')]")).click();
		//Select Email dropdown.


		WebElement Staticdropdown1= driver.findElement(By.id("emailstatus"));
		Select dropdown1 = new Select (Staticdropdown1);
		dropdown1.selectByValue("valid");
		System.out.println(dropdown1.getFirstSelectedOption().getText());



		Thread.sleep(2000);
		//Select Source dropdown.


		WebElement Staticdropdown11= driver.findElement(By.id("contact_source_from"));
		Select dropdown11 = new Select (Staticdropdown11);
		dropdown11.selectByValue("identifier");
		System.out.println(dropdown11.getFirstSelectedOption().getText());



		Thread.sleep(2000);
		// click on search bar 
		driver.findElement(By.id("contactadvancesearch")).click();

		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@id='resetadvancesearch']")).click();
		driver.quit();




	}



	//============================================================================================================================================



	@Test(priority=3)
	public void Add_deal() throws InterruptedException {


			driver. findElement(By.xpath("//a[normalize-space()='Dashboard']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[normalize-space()='Contacts']//*[name()='svg']")).click();
		//click on create account buttton button.
		Thread.sleep(1000);


		// Update created contact details

		driver.findElement(By.xpath("//*[@id=\"contactsindextable\"]/tbody/tr[1]/td[2]/a")).click();
		Thread.sleep(2000);


		driver.findElement(By.xpath("//button[normalize-space()='Add Deal']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='intorgdeals-deal_name']")).sendKeys("zommoto");
		Thread.sleep(2000); 
		System.out.println("ZTT 2");
		Thread.sleep(2000);
		System.out.println("Glol logics Mor");
		driver.findElement(By.xpath("//input[@id='intorgdeals-deal_value']")).sendKeys("234");
		//Select dropdown currency.

		driver.findElement(By.xpath("//*[@id=\"adddeal\"]/div[1]/div[2]")).click();
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("div[class='dropdown bootstrap-select show-tick form-control form-line bs3 dropup open'] input[aria-label='Search']")).click();
		driver.findElement(By.cssSelector("div[class='dropdown bootstrap-select show-tick form-control"
				+ " form-line bs3 dropup open'] input[aria-label='Search']")).sendKeys("USD",Keys.ENTER);


		// SELECT THE PIPELINE STAGE .
	driver.findElement(By.cssSelector("button[title='- -Please select pipeline- -']")).click();
	Thread.sleep(2000);
	driver.findElement(By.cssSelector("div[class='dropdown bootstrap-select show-tick form-control form-line pipelinename bs3 "
			+ "dropup open'] input[aria-label='Search']")).sendKeys("intandemly_3",Keys.ENTER);
	// Select the stage 
	driver.findElement(By.xpath("(//button[@data-toggle='dropdown'])[14]")).click();
	Thread.sleep(3000);
	driver.findElement(By.cssSelector("option[value='654']")).click();
	
	
	
		//Expected cloase date 

	driver.findElement(By.xpath("//input[@id='intorgdeals-deal_expected_close_date']")).click();
		Thread.sleep(1000);

		for(int i=1;i<3;i++)
		{
			driver.findElement(By.xpath("(//i[@class='material-icons'])[34]")).click();
		}
		driver.findElement(By.xpath("//a[@class='dtp-select-day selected']")).click();

		Thread.sleep(1000);
		//cancel select date 
		//	findElement(By.xpath(("(//button[@class='dtp-btn-cancel btn btn-flat'])[4]"))).click(); 
		driver.findElement(By.xpath(("(//button[@class='dtp-btn-ok btn btn-flat'])[4]"))).click();
		Thread.sleep(3000);

		Thread.sleep(2000);

		driver.findElement(By.xpath("//button[@data-type='ajax-loader']")).click();
		Thread.sleep(2000);////button[@id='adddeal-submit']

System.out.println("Success! Deal created successfully.");


		driver.findElement(By.xpath("(//button[@class='close reload'])[2]")).click();











	}






	private WebElement findElement(By xpath) {
		// TODO Auto-generated method stub
		return null;
	}



	//===================================================================================================================================================
	@Test(priority=2)

	public void Update_create_account_details() throws InterruptedException {

				driver.findElement(By.xpath("//a[normalize-space()='Contacts']//*[name()='svg']")).click();
		//click on create account buttton button.
		Thread.sleep(1000);


		// Update created contact details

		driver.findElement(By.xpath("//*[@id=\"contactsindextable\"]/tbody/tr[1]/td[2]/a")).click();
		Thread.sleep(2000);



		driver.findElement(By.xpath("//span[@class='glyphicon glyphicon-pencil contactupdate']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='prmorgcompanycontacts-contact_first_name']")).clear();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='prmorgcompanycontacts-contact_first_name']")).sendKeys("Writable");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='prmorgcompanycontacts-contact_last_name']")).clear();
		Thread.sleep(2000);

		driver.findElement(By.xpath("//input[@id='prmorgcompanycontacts-contact_last_name']")).sendKeys("Suzuki");
		Thread.sleep(2000);
		// SLECT THE PHONE NUMBER DROPDOWNS.

		//SELECT PHONE TYPE.
		driver.findElement(By.xpath("//div[@class='dropdown bootstrap-select show-tick form-control form-line phone_comm_type_purpose bs3 dropup']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"contact_form\"]/div[2]/div/div[1]/span/div/div[1]/div/div/div[1]/input")).sendKeys("Home",Keys.ENTER);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='dropdown bootstrap-select show-tick form-control form-line phone_country_code bs3 dropup']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"contact_form\"]/div[2]/div/div[2]/span/div/div[1]/div/div/div[1]/input")).sendKeys("Australia",Keys.ENTER);

		// SELECT COUNTRY PHONE NUMBER System.out.println(dropdown11.getFirstSelectedOption().getText());
		Thread.sleep(2000);


		// ENTER PHONE NUMBER IN TEXT FIELD.
		driver.findElement(By.xpath("//input[@id='prmorgcompanycontacts-phone']")).clear();
		Thread.sleep(2000);

		driver.findElement(By.xpath("//input[@id='prmorgcompanycontacts-phone']")).sendKeys("775");
	 Thread.sleep(2000);
	 driver.findElement(By.xpath("//input[@id='prmorgcompanycontacts-email']")).clear();
	 driver.findElement(By.xpath("//input[@id='prmorgcompanycontacts-email']")).sendKeys("chandhu@gmail.com");
	 Thread.sleep(2000);
	 driver.findElement(By.xpath("//input[@id='accountname']")).clear();
	 Thread.sleep(2000);
	 driver.findElement(By.xpath("//input[@id='accountname']")).sendKeys("ztt2");
	 Thread.sleep(2000);
	 driver.findElement(By.xpath("//input[@id='contact_designation']")).clear();
	 
	 driver.findElement(By.xpath("//input[@id='contact_designation']")).sendKeys("Teting_Role");
	 Thread.sleep(2000);
	 driver.findElement(By.xpath("//input[@id='contact_department']")).clear();
	 Thread.sleep(2000);
	 driver.findElement(By.xpath("//input[@id='contact_department']")).sendKeys("Quality");
	 Thread.sleep(2000);
	 driver.findElement(By.xpath("//button[normalize-space()='Submit']")).click();
	 driver.quit();
	 
	 	 	
	}

	
//==============================================================================================================	



@Test (priority=4)
public void create_contact() throws InterruptedException {
	driver. findElement(By.xpath("//a[normalize-space()='Dashboard']")).click();
	Thread.sleep(1000);
	driver.findElement(By.xpath("//a[normalize-space()='Contacts']//*[name()='svg']")).click();
	//click on create account buttton button.
	Thread.sleep(1000);
	
	driver.findElement(By.xpath("//span[normalize-space()='Create Contact']")).click();
	Thread.sleep(1000);
	driver.findElement(By.xpath("//input[@id='accountname']")).sendKeys("apsar");
	Thread.sleep(1000);
	driver.findElement(By.xpath("//input[@id='fname']")).sendKeys("DEVA");
	Thread.sleep(1000);
	driver.findElement(By.xpath("//*[@id=\"lname\"]")).sendKeys("intandemly team");
	Thread.sleep(1000);
	driver.findElement(By.xpath("//button[@title='-- Select Type --']//div[@class='filter-option']")).click();
	driver.findElement(By.xpath("//*[@id=\"phone_comm_type_purpose\"]/option[3]")).click();
	Thread.sleep(1000);
	driver.findElement(By.xpath("//*[@id=\"addcontact\"]/div[2]/div/div[2]/span/div/div[1]/div/button")).click();
	Thread.sleep(1000);
	driver.findElement(By.xpath("//*[@id=\"phone_country_code\"]/option[11]")).click();
	
	driver.findElement(By.xpath("//input[@id='prmorgcompanycontacts-phone']")).sendKeys("9988334455");
	Thread.sleep(1000);
	driver.findElement(By.xpath("//input[@id='prmorgcompanycontacts-email']")).sendKeys("rkchendu1537@gmail.com");
	driver.findElement(By.xpath("//*[@id=\"contact_designation\"]")).sendKeys(".net");
	Thread.sleep(1000);
	driver.findElement(By.xpath("//*[@id=\"company_address\"]")).sendKeys("wifi_test");
// select the owner 
	// Select owner dropdown.
			WebElement company_owner_id = driver.findElement(By.id("company_owner_id"));

			Select company_owner_idDropdown = new Select(company_owner_id);
			List<WebElement>company_owner_idDropdownOptions = company_owner_idDropdown.getOptions();

			company_owner_idDropdown.selectByIndex(1);
			Thread.sleep(3000); 
			company_owner_idDropdown.selectByValue("3105");

	driver.findElement(By.xpath("//button[@id='addcontact-submit']")).click();
	
	Thread.sleep(1000);
  driver.findElement(By.xpath("//button[@data-tableid='contactsindextable']")).click();
  
     
     
	
	
	
	
	
	
	



	
}



private char[] getText(String string) {
	// TODO Auto-generated method stub
	return null;
}
//===================================================================================================================================
@Test (priority=5)
public void contact_actions() throws InterruptedException {
	driver. findElement(By.xpath("//a[normalize-space()='Dashboard']")).click();
	Thread.sleep(1000);
	driver.findElement(By.xpath("//a[normalize-space()='Contacts']//*[name()='svg']")).click();

	Thread.sleep(1000);
	driver.findElement(By.xpath("//label[@for='3350458']")).click();
	Thread.sleep(1000);
	driver.findElement(By.xpath("//span[normalize-space()='Assign']")).click();
	WebElement assignowner = driver.findElement(By.id("assignowner"));

	Select assignownerDropdown = new Select(assignowner);
	List<WebElement>assignownerDropdownOptions = assignownerDropdown.getOptions();
	for (WebElement option : assignownerDropdownOptions) {

		
		

	}
	assignownerDropdown.selectByIndex(1);
	Thread.sleep(3000); 
	assignownerDropdown.selectByValue("3041");

	//Assign company owner.
	driver.findElement(By.xpath("//button[@id='test']")).click();

	Thread.sleep(3000); 
	driver.findElement(By.xpath("//button[@class='confirm']")).click();

	driver.findElement(By.xpath("//a[normalize-space()='Contacts']//*[name()='svg']")).click();

	Thread.sleep(1000);
	driver.findElement(By.xpath("//label[@for='3350458']")).click();
	Thread.sleep(1000);
	driver.findElement(By.xpath("//span[@id='exportcontacts']")).click();
	
	//system should downlaod the contact deatils in "Excel" file.

	
	
	

}

}	

