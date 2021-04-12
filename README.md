# Proceed to the below loaction and upadte username and password with the valid username and passsword

*****Make the below changes before executing the code********


file: src/main/java>MailComposeSteps>MailComposeSteps.java

@Then("Enter Username or Email") public void enter_Username_Email() { driver.findElement(By.id("login1")).sendKeys("************enter valid username*****************"); }

@Then("Enter the password")
public void enter_the_password() {
	driver.findElement(By.id("password")).sendKeys("********enter valid password**************");
}


@Then("Enter name or email of rec")
	public void enter_name_or_email_of_rec() {
		driver.findElement(By.xpath("//*[@id='TO_IDcmp2']")).sendKeys("*******enter valid email id here******");
	}


