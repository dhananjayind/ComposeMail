$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:Email.feature");
formatter.feature({
  "name": "Sending mail feature test",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Send an email with the body Hello World and subject Incubyte",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "User is on rediff home page",
  "keyword": "Given "
});
formatter.match({
  "location": "ComposeSteps.rediff_home_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User clicks on Sign in button",
  "keyword": "When "
});
formatter.match({
  "location": "ComposeSteps.user_clicks_on_Sign_in_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Redirected to rediff Login page",
  "keyword": "Then "
});
formatter.match({
  "location": "ComposeSteps.redirected_to_rediff_Login_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Enter Username or Email",
  "keyword": "Then "
});
formatter.match({
  "location": "ComposeSteps.enter_Username_Email()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Enter the password",
  "keyword": "And "
});
formatter.match({
  "location": "ComposeSteps.enter_the_password()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Clicks on Sign in button",
  "keyword": "When "
});
formatter.match({
  "location": "ComposeSteps.clicks_on_Sign_in_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User redirected to Rediffmail page",
  "keyword": "Then "
});
formatter.match({
  "location": "ComposeSteps.user_redirected_to_Rediffmail_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User clicks on Write Mail button",
  "keyword": "When "
});
formatter.match({
  "location": "ComposeSteps.user_clicks_on_Write_Mail_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "New mail Tab open beside inbox tab",
  "keyword": "Then "
});
formatter.match({
  "location": "ComposeSteps.new_mail_Tab_open_beside_inbox_tab()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Enter name or email of rec",
  "keyword": "Then "
});
formatter.match({
  "location": "ComposeSteps.enter_name_or_email_of_rec()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Enter Incubyte in mail subject",
  "keyword": "And "
});
formatter.match({
  "location": "ComposeSteps.enter_Incubyte_in_mail_subject()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Enter Hello World in mail body",
  "keyword": "And "
});
formatter.match({
  "location": "ComposeSteps.enter_Hello_World_in_mail_body()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Clicks on Send button",
  "keyword": "When "
});
formatter.match({
  "location": "ComposeSteps.clicks_on_Send_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User redirected to Rediffmail page with a notification Message sent",
  "keyword": "Then "
});
formatter.match({
  "location": "ComposeSteps.user_redirected_to_Rediffmail_page_with_a_notification_Message_sent()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "USer Clicks on Logout button",
  "keyword": "When "
});
formatter.match({
  "location": "ComposeSteps.user_Clicks_on_Logout_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User signed out successfully of Rediffmail",
  "keyword": "Then "
});
formatter.match({
  "location": "ComposeSteps.user_signed_out_successfully_of_Rediffmail()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Close the browser",
  "keyword": "And "
});
formatter.match({
  "location": "ComposeSteps.close_the_browser()"
});
formatter.result({
  "status": "passed"
});
});