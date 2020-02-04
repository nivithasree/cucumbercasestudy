Feature: Registering in testmeapp

Scenario Outline: Successfull registration
Given User enters into Registration page
When User enters "<username>" , "<firstname>" , "<lastname>" , "<password>" , "<confirmpassword>" , "<email>" , "<mobilenumber>" , "<dob>" , "<address>" , "<answer>"  in registration page
Then User navigates to login page

Examples:
|username|firstname|lastname|password|confirmpassword|email|mobilenumber|dob|address|answer|
|Lalitha|Lalitha|Kumar|Password123|Password123|nivithasree1997@gmail.com|7338769195|17/12/1997|d-13,southernshelters,katupakkam,chennai|chennai|