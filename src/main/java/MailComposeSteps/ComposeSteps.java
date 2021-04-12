package MailComposeSteps;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import UserInterface.MainUI;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class ComposeSteps extends MainUI {

	//=============Home page=============
	@Given("^User is on rediff home page$")
	public void rediff_home_page() {
		 //enter the browser name to execute the test by default test will execute in opera browser
		invokeBrowser("");    
		openURL();
	}

	@When("User clicks on Sign in button")
	public void user_clicks_on_Sign_in_button() {
		driver.findElement(By.linkText("Sign in")).click();
	}

	//=============Login Page=============
	@Then("Redirected to rediff Login page")
	public void redirected_to_rediff_Login_page() {
		String LoginPage_title = driver.getTitle();
		System.out.println(LoginPage_title);

	}

	//=============Enter Username and password=============
	@Then("Enter Username or Email")
	public void enter_Username_Email() {
		driver.findElement(By.id("login1")).sendKeys("dhananjaychauhan.mca");
	}

	@Then("Enter the password")
	public void enter_the_password() {
		driver.findElement(By.id("password")).sendKeys("Ksrp@123");
	}

	@When("Clicks on Sign in button")
	public void clicks_on_Sign_in_button() {
		driver.findElement(By.className("signinbtn")).click();
	}
	
	
	//=============Logged in=============
	@Then("User redirected to Rediffmail page")
	public void user_redirected_to_Rediffmail_page() {
		String Rediffmail_title = driver.getTitle();
		System.out.println(Rediffmail_title);
	}

	//=============Compose mail and send=============
	@When("User clicks on Write Mail button")
	public void user_clicks_on_Write_Mail_button() {
		driver.findElement(By.className("rd_write")).click();
	}

	@Then("New mail Tab open beside inbox tab")
	public void new_mail_Tab_open_beside_inbox_tab() {

	}

	@Then("Enter name or email of rec")
	public void enter_name_or_email_of_rec() {
		driver.findElement(By.xpath("//*[@id='TO_IDcmp2']")).sendKeys("dhananjaychauhan3@gmail.com");
	}

	@Then("Enter Incubyte in mail subject")
	public void enter_Incubyte_in_mail_subject() {
		driver.findElement(By.xpath("//*[@id='rd_compose_cmp2']/ul/li[4]/input")).sendKeys("Incubyte");
	}

	@Then("Enter Hello World in mail body")
	public void enter_Hello_World_in_mail_body() {
		driver.switchTo().frame(driver.findElement(By.xpath("//*[@id='cke_1_contents']/iframe")));
		driver.findElement(By.xpath("/html/body")).sendKeys("Hello World");
	}

	@When("Clicks on Send button")
	public void clicks_on_Send_button() {
		driver.switchTo().parentFrame();
		driver.findElement(By.xpath("//*[@id='rd_compose_cmp2']/div[1]/a[1]")).click();
	}

	@Then("User redirected to Rediffmail page with a notification Message sent")
	public void user_redirected_to_Rediffmail_page_with_a_notification_Message_sent() {
		String Emial_sending = driver.findElement(By.id("rdNotify")).getText();
		System.out.println(Emial_sending);
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {

			e.printStackTrace();
		}
		String Emial_sent = driver.findElement(By.id("rdNotify")).getText();
		System.out.println(Emial_sent);
	}

	//=============Log out=============
	@When("USer Clicks on Logout button")
	public void user_Clicks_on_Logout_button() {
		driver.findElement(By.linkText("Logout")).click();
	}

	@Then("User signed out successfully of Rediffmail")
	public void user_signed_out_successfully_of_Rediffmail() {
		System.out.println(driver.getTitle());
	}
	
	
	//=============Close browser=============
	@Then("Close the browser")
	public void close_the_browser() {
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {

			e.printStackTrace();
		}
		quitBrowser();
	}

}
