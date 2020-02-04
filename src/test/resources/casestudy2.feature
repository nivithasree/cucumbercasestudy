Feature: Login into testmeapp

Scenario Outline: successfull login
Given User is on the login page
When User enters "<username>" and "<password>" and clicks submit button
Then User does Successfull login

Examples:
| username | password |
|lalitha|Password123|

