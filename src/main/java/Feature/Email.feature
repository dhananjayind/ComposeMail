Feature: Sending mail feature test

Scenario: Send an email with the body Hello World and subject Incubyte  
	Given User is on rediff home page
	When User clicks on Sign in button 
	Then Redirected to rediff Login page
	Then Enter Username or Email
	And  Enter the password
	When Clicks on Sign in button
	Then User redirected to Rediffmail page
	When User clicks on Write Mail button
	Then New mail Tab open beside inbox tab
	Then Enter name or email of rec
	And Enter Incubyte in mail subject
	And Enter Hello World in mail body
	When Clicks on Send button
	Then User redirected to Rediffmail page with a notification Message sent
	When USer Clicks on Logout button
	Then User signed out successfully of Rediffmail
	And Close the browser
	