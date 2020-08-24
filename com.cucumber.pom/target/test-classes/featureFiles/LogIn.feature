@LogIn-Negative
Feature: Login Feature 
Scenario Outline: verify login functionslity with wrong credentials 

Given I am on home page "https://www.carsguide.com.au/" of cars guild.com
When user mousehover SignUp/SignIn
Then click on Sign in
Then User enters "<userid>" email
And User enters "<password>" password
Then user clicks on Sign in button 
And Validate login

Examples:
|userid|password|
|suraj@gmail.com|MyPass1|
|Tom@gmail.com|MyPass2|
|Peter@gmail.com|MyPass3|