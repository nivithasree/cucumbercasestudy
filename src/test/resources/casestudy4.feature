Feature: Add to cart testing

Scenario: The one where the user moves to the cart without adding any item in it
Given Alex has registered into the testmeapp
When Alex search a particular product like headphones
And Try to proceed to payment without adding any product into the cart
Then Testmeapp doesnt display cart icon