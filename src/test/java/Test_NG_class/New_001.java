package Test_NG_class;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class New_001 {
	
	
	@Test
	public void log_in() throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\LENOVO T480\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();

		//Enter the Sign in Details.
		driver.get("https://v3.intandemly.com/account/user/login");
		driver.manage().window().maximize();
		driver.findElement(By.id("login-form-login")).sendKeys("madiraju.nischal@gmail.com");// madiraju.nischal@gmail.com
		driver.findElement(By.xpath("//input[@id=\"passwordInput\"]")).sendKeys("Password@2022");
		Thread.sleep(1000);
		driver.findElement(By.id("passwordIcon")).click(); //Eye icon button
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@type=\"submit\"]")).click(); //submit


		driver.findElement(By.xpath("//a[normalize-space()='Dashboard']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[normalize-space()='Accounts']//*[name()='svg']")).click();
		Thread.sleep(3000);

		driver.findElement(By.xpath("//a[normalize-space()='ZTT 2']")).click();	

		driver.findElement(By.xpath("//div[@class='col-lg-1 col-md-1 col-sm-1 col-xs-1']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='company_name']")).clear();
		//Thread.sleep(2000);

		driver.findElement(By.xpath("//input[@id='company_name']")).sendKeys("Ztt 2");

		driver.findElement(By.xpath("//input[@id='company_domain']")).clear();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='company_domain']")).sendKeys("Kimbely crank");
		driver.findElement(By.id("company_phone")).clear();
		Thread.sleep(2000);
		driver.findElement(By.id("company_phone")).sendKeys("98876645");
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//input[@type='text'])[4]")).clear();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//input[@type='text'])[4]")).sendKeys("Delhi, India ",Keys.ENTER);


		Thread.sleep(2000);
		//Select country 
				WebElement StaticDropDown = driver.findElement(By.id("company_country"));
				Select dropdown = new Select (StaticDropDown);
				System.out.println(dropdown.getFirstSelectedOption());
				dropdown.selectByValue("236");

				Thread.sleep(2000);
				//Select the industry dropdown.

				Thread.sleep(2000);
				WebElement StaticDropdown = driver.findElement(By.id("company_industry"));
				Select dropdown1 = new Select (StaticDropdown);

				System.out.println(dropdown.getFirstSelectedOption());
				dropdown.selectByValue("7"); //Apparel & Fashion.
				//Select no.of employes
				driver.findElement(By.xpath("//input[@id='no_of_employees']")).clear();
				Thread.sleep(2000);
				driver.findElement(By.xpath("//input[@id='no_of_employees']")).sendKeys("1000");
				//Enter revenue units value 
				driver.findElement(By.id("annual_revenue")).clear();
				Thread.sleep(2000);
				driver.findElement(By.id("annual_revenue")).sendKeys("2000");
				Thread.sleep(2000);

				//Select revenue units dropdown 
				Thread.sleep(2000);
				WebElement staticdropdown = driver.findElement(By.id("revenue_units"));
				Select dropdown2 =  new Select (StaticDropdown);
				System.out.println(dropdown.getFirstSelectedOption());
				dropdown2.selectByValue("3");;
				Thread.sleep(2000);
				driver.findElement(By.id("linkedin_page")).clear();
				//Thread.sleep(2000);
				//river.findElement(By.id("linkedin_page")).sendKeys("//https://www.linkedin.com");
				Thread.sleep(2000);
				driver.findElement(By.id("company_form-submit")).click();
				//Successfully updated account details.

		
				
				
				
				
	}




//=========================================================================================================================
@Test (priority=2)

public void Add_deal() throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\LENOVO T480\\Downloads\\chromedriver_win32\\chromedriver.exe");

	WebDriver driver=new ChromeDriver();

	//Lanching url in chrome browser.
	driver.get("https://v3.intandemly.com/account/user/login");
	driver.manage().window().maximize();

	//Enter the Sign in Details.
	driver.get("https://v3.intandemly.com/account/user/login");
	driver.manage().window().maximize();
	driver.findElement(By.id("login-form-login")).sendKeys("madiraju.nischal@gmail.com");// madiraju.nischal@gmail.com
	driver.findElement(By.xpath("//input[@id=\"passwordInput\"]")).sendKeys("Password@2022");
	Thread.sleep(1000);
	driver.findElement(By.id("passwordIcon")).click(); //Eye icon button
	Thread.sleep(1000);
	driver.findElement(By.xpath("//button[@type=\"submit\"]")).click(); //submit


	driver.findElement(By.xpath("//a[normalize-space()='Dashboard']")).click();
	Thread.sleep(1000);
	driver.findElement(By.xpath("//a[normalize-space()='Accounts']//*[name()='svg']")).click();
	Thread.sleep(3000);
	driver.findElement(By.xpath("//a[normalize-space()='ZTT 2']")).click();
	Thread.sleep(1000);
	driver.findElement(By.xpath("//button[normalize-space()='Add Deal']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@id='intorgdeals-deal_name']")).sendKeys("on pls");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@id='intorgdeals-deal_name']")).click();
	System.out.println("Ztt2");
	//Select contact person.
	WebElement StaticDropdown = driver.findElement(By.id("contactpersonname_dropdown"));
	Select dropdown = new Select (StaticDropdown);
	System.out.println(dropdown.getAllSelectedOptions());
	dropdown.selectByValue("3350329");
	Thread.sleep(2000);
	dropdown.selectByIndex(1);


	driver.findElement(By.xpath("//input[@id='intorgdeals-deal_value']")).sendKeys("3000");
	//Select dropdown currency.
	driver. findElement(By.xpath("//*[@id=\"adddeal\"]/div[1]/div[2]/span/div/div[1]/div/button/div")).click();
	Thread.sleep(2000);
	//Select currency dropdown.
	driver.findElement(By.xpath("//*[@id=\"adddeal\"]/div[1]/div[2]/span/div/div[1]/div/div/div[2]/ul/li[2]/a")).click();
	Thread.sleep(2000);

	WebElement pipelinename = driver.findElement(By.id("pipelinename"));

	Select pipelinenameDropdown = new Select(pipelinename);
	List<WebElement>pipelinenameDropdownOptions = pipelinenameDropdown.getOptions();

	WebElement webElement = driver.findElement(By.id("pipelinename"));
	Select dropdown11= new Select(webElement);
	Thread.sleep(3000); 
	pipelinenameDropdown.selectByValue("242");
	//select stage .
	Thread.sleep(1000);

	// Select the stage 
	WebElement StaticDropdown1 = driver.findElement(By.id("stage"));
	Select dropdown1 = new Select (StaticDropdown1);
	System.out.println(dropdown1.getAllSelectedOptions());



	dropdown1.selectByIndex(1);
	Thread.sleep(1000); 
	dropdown1.selectByValue("748");

	Thread.sleep(1000);

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

	driver.findElement(By.xpath("//button[@id='adddeal-submit']")).click();
	Thread.sleep(2000);



	driver.findElement(By.xpath("//div[@id='addcompanydealform']"
			+ "//button[contains(@type,'button')][normalize-space()='×']")).click();

	//===========//select create contact button.
	driver.findElement(By.xpath("//button[@type='button'][normalize-space()='Create Contact']")).click();
	Thread.sleep(2000);
	//Click Account name.


	//verify first name.
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@id='fname']")).sendKeys("Glolgics");
	Thread.sleep(2000);
	//Verify Last name             

	driver.findElement(By.xpath("//input[@id='lname']")).sendKeys("Moreeee");  
	//Select phone number type dropdown.
	Thread.sleep(2000);
	driver.findElement(By.xpath("//button[@title='-- Select Type --']")).click();

	Thread.sleep(2000);	
	driver.findElement(By.xpath("//span[normalize-space()='Mobile']")).click(); //select type in dropdown
	//Select country dropdown. 
	Thread.sleep(2000);
	driver.findElement(By.xpath("//button[@title='-- Select Country Code --']")).click(); //select country dropdown
	Thread.sleep(3000);
	driver.findElement(By.xpath("//span[normalize-space()='Jordan (+962)']")).click();    //select country code 

	driver.findElement(By.xpath("//input[@id='prmorgcompanycontacts-phone']")).sendKeys("91117119"); //Enter phone number

	Thread.sleep(3000);
	
        //Add Email adress
		driver.findElement(By.xpath("//input[@id='prmorgcompanycontacts-email']")).sendKeys("chandhu99t23@gmail.com"); //chandhu99ts123@gmail.com
		Thread.sleep(3000);
		//Add designation.    
		driver.findElement(By.xpath("//input[@id='contact_designation']")).sendKeys("Wrd"); //Intandemly
		//Add Department.
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@class='form-line']//input[@id='company_address']")).sendKeys("lneooo"); //Tech team
		// Select owner dropdown.
		WebElement company_owner_id = driver.findElement(By.id("company_owner_id"));

		Select company_owner_idDropdown = new Select(company_owner_id);
		List<WebElement>company_owner_idDropdownOptions = company_owner_idDropdown.getOptions();

		company_owner_idDropdown.selectByIndex(1);
		Thread.sleep(3000); 
		company_owner_idDropdown.selectByValue("3105");

		// create button.     

		Thread.sleep(3000);  

		driver.findElement(By.xpath("//button[@id='addcontact-submit']"));

		// contact created successfully.
		// close the window popup


		Thread.sleep(3000); 



		driver.findElement(By.xpath("//button[@data-tableid='companyindextable']")).click();
	}

	//=================================================================================================================
	@Test
	public void View_account() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\LENOVO T480\\Downloads\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver=new ChromeDriver();

		//Lanching url in chrome browser.
		driver.get("https://v3.intandemly.com/account/user/login");
		driver.manage().window().maximize();

		//Enter the Sign in Details.
		driver.get("https://v3.intandemly.com/account/user/login");
		driver.manage().window().maximize();
		driver.findElement(By.id("login-form-login")).sendKeys("madiraju.nischal@gmail.com");// madiraju.nischal@gmail.com
		driver.findElement(By.xpath("//input[@id=\"passwordInput\"]")).sendKeys("Password@2022");
		Thread.sleep(1000);
		driver.findElement(By.id("passwordIcon")).click(); //Eye icon button
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@type=\"submit\"]")).click(); //submit


		driver.findElement(By.xpath("//a[normalize-space()='Dashboard']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[normalize-space()='Accounts']//*[name()='svg']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[normalize-space()='ZTT 2']")).click();
		
		driver.findElement(By.xpath("//a[@id='tabcommunicate']")).click();
		//Enter text in note body
		Thread.sleep(2000); 
		driver.findElement(By.xpath("//div[contains(@data-placeholder,'Notes...')]//div")).sendKeys("A note in a note pad"
				+ " either does or does not have content. A note without content is said to be a null note."
				+ " A note with content contains a copy of data supplied by the application. The format and content"
				+ " of these data are determined by the requirements and design of the application. The note size is the number of bytes of data that the note contains. Two fixed note sizes are supported, 0 and 1024. A note of size 0 is a null note. A note with content has 1024 bytes of data.");




		driver.findElement(By.xpath("//button[normalize-space()='Save']")).click();

		//Verify Email tempalate.	
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[@id='emailtab']")).click();
		//Enter E-mail adress.
		Thread.sleep(1000); 
		driver.findElement(By.xpath("//input[@id='intstackmailsrelation-email_to']")).sendKeys("rkchendu1537@gmail.com");

		Thread.sleep(1000);
		//Enter subject.

		driver.findElement(By.xpath("//input[@id='intstackmailsrelation-subject']")).sendKeys("interview scheduling");
		//Wriete content of the body.

		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@data-placeholder='Free Write...']//div")).sendKeys("Testing");
		driver.findElement(By.cssSelector("button[class='btn btn-int-green waves-effect btn-lg forAddEmail']")).click();

Thread.sleep(1000);
		//Verify linkedin page.
driver.findElement(By.xpath("//a[@id='linkedintab']")).click();
//Enter text in linkdin body
	Thread.sleep(2000); 
driver.findElement(By.xpath("//div[@data-placeholder='Type your in-mail or message here..']")).sendKeys("Go to option “Format Cells” and under Number Tab option, select Text and click on OK. By default it will be general, you need to make it as Number.");

Thread.sleep(2000);
//click "Add to clipboard"
driver.findElement(By.xpath("//button[normalize-space()='Add to clipboard']")).click(); 
Thread.sleep(2000); 

driver.findElement(By.xpath("//button[@style='display: inline-block; background-color: rgb(140, 212, 245); bo"
		+ "x-shadow: rgba(140, 212, 2"
		+ "45, 0.8) 0px 0px 2px, rgba(0, 0, 0, 0.05) 0px 0px 0px 1px inset;']")).click();
//system should navigate to the linkedin page.



		Thread.sleep(1000); 

		driver.findElement(By.xpath("//input[@placeholder='what are you meeting about?']")).sendKeys("Testing");
		Thread.sleep(1000); 
		// verify the body text 
		driver.findElement(By.xpath("//div[@data-placeholder='Describe the meeting']")).sendKeys("What is Testing? Testing is the process of evaluating a system or its component(s) with the intent to find whether it satisfies the specified requirements or not. In simple words, testing is executing a system in order to identify any gaps, errors, or missing requirements in contrary to the actual requirements.");
		//Select Associate comapany dropdown.
		driver.findElement(By.xpath("//div[contains(text(),'Ztt')]")).click();
		
		
		

		//select associate deal 

		WebElement schedule_deal_id = driver.findElement(By.id("schedule_deal_id"));

		Select schedule_deal_idDropdown = new Select(schedule_deal_id);
		List<WebElement>company_owner_idDropdownOptions = schedule_deal_idDropdown.getOptions();
		
		schedule_deal_idDropdown.selectByIndex(1);
		Thread.sleep(1000); 
		schedule_deal_idDropdown.selectByValue("9119");
		Thread.sleep(1000); 
		schedule_deal_idDropdown.selectByValue("9120");
		Thread.sleep(1000); 
		//select start time 
		driver.findElement(By.xpath("//input[@id='datetime']")).click();

		Thread.sleep(1000); 

		for(int i=1;i<3;i++)
		{
			driver.findElement(By.xpath("//div[@class='dtp-date']//div//a[@class='dtp-select-month-after']"
					+ "//i[@class='material-icons'][normalize-space()='chevron_right']")).click();

		}


		driver.findElement(By.xpath("//a[normalize-space()='30']")).click();

		Thread.sleep(2000); 
		driver.findElement(By.xpath("(//button[@class='dtp-btn-ok btn btn-flat'][normalize-space()='OK'])[2]")).click(); 
		Thread.sleep(3000); 
		driver.findElement(By.xpath("//*[name()='text' and @id='th-0']")).click();
		Thread.sleep(2000); 
		driver.findElement(By.xpath("(//button[@class='dtp-btn-ok btn btn-flat'])[2]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[name()='text' and @id='tm-30']")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("(//button[@class='dtp-btn-ok btn btn-flat'])[2]")).click();

		// verify validating Tasks 
		driver.findElement(By.xpath("//a[@id='tasktab']")).click();
		// verify task about.
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='intstacktasksrelation-task_about']")).sendKeys("testing");
		//find Task field notes.
		driver.findElement(By.xpath("//div[@data-placeholder='Describe the task']//div")).sendKeys("Ramco");
		
		
		
		
		
		

		// Verify the schedule account 
	
		
		
		WebElement task_deal_id = driver.findElement(By.id("task_deal_id"));

		Select task_deal_idDropdown = new Select(task_deal_id);
		List<WebElement>task_deal_idDropdownOptions = task_deal_idDropdown.getOptions();
		
		task_deal_idDropdown.selectByIndex(1);
		Thread.sleep(3000); 
		task_deal_idDropdown.selectByValue("9119");
		Thread.sleep(1000); 
		task_deal_idDropdown.selectByValue("9120");

		//verify contact field.
		
		Thread.sleep(3000); 
		WebElement task_contact_id = driver.findElement(By.id("task_contact_id"));

		Select task_contact_idDropdown = new Select(task_deal_id);
		List<WebElement>task_contact_idDropdownOptions = task_contact_idDropdown.getOptions();

		task_contact_idDropdown.selectByIndex(1);
		Thread.sleep(3000); 
		task_contact_idDropdown.selectByValue("3350329"); //chandu ram
		Thread.sleep(3000); 


		//select date 
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("#intstacktasksrelation-task_duedate")).click();
		Thread.sleep(2000);
		//select date rangers
		driver.findElement(By.xpath("//a[normalize-space()='17']")).click();
		Thread.sleep(2000);  	 
		driver.findElement(By.xpath("//button[@class='dtp-btn-ok btn btn-flat']")).click();   
		Thread.sleep(2000);  
		driver.findElement(By.xpath("//*[name()='text' and @id='th-17']")).click();
		Thread.sleep(2000);  
		driver.findElement(By.xpath("//button[@class='dtp-btn-ok btn btn-flat']")).click(); 
		Thread.sleep(5000);  
		driver.findElement(By.xpath("//*[name()='text' and @id='tm-20']")).click();   

		Thread.sleep(3000);     
		driver.findElement(By.xpath("//button[@xpath='1']")).click(); 

	}






	}

