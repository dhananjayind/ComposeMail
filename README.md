# Proceed to the below loaction and upadte username and password with the valid username and passsword

file: src/main/java>MailComposeSteps>MailComposeSteps.java

@Then("Enter Username or Email")
	public void enter_Username_Email() {
		driver.findElement(By.id("login1")).sendKeys("username"); 
	}

	@Then("Enter the password")
	public void enter_the_password() {
		driver.findElement(By.id("password")).sendKeys("password");
	}




