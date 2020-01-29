Feature: Register
Scenario: Register on testmeapp
When user open testmeapp
And click on signUp
And enter Username as "shweta098"
And enter FirstName as "sweta"
And enter Last Name as "kapade"
And enter Password as "0987654321"
And enter Confirm Password as "0987654321"
And select gender as "female"
And enter E-mail as "shwetakapade@gmail.com"
And enter Mobile Number as "1234567894"
And enter DOB as "1/14/1997"
And enter Address as "12,xyz,abcd"
And select Security Question as "What is your favour color?"
And enter Answer as "blue"
Then click on Register



@login
Scenario: user login to testmeapp
When user open app
And click on signin
And user enter credential
|lalitha | Password123|

@product
Scenario: product search
Given open test me app
When user search product
|Head|
And product display
 
 
 @payment
 Scenario: Add to cart
 Given open testmeapplication
 When user searchpro
 And Add to cart
 And checkout
 
 
 