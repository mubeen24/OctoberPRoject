Feature: Evening Dress Booking in AutomationPractice Application 

Background: 

	When user Enter The "mubeen2824@gmail.com" In Username Field 
	And user Enter The "123456789" in Password Field 
	Then user Click On The Login Buttion tab And It Navigate to Login Page 
	
@EveningDress 
Scenario: Evening Dress Booking 

	Given user Move To Dresses1 Tab 
	Then user Click On The Evening Dress 
	When move To Dress You Liked in Evening
	Then click On The Dress You Viewed In Evening
	Given user Handle the Frame Window In Evening
	Then user Click To Increase The Size of Quality In Evening
	Then user Select The Size They Want In Evening
	Then user Select The Color They Want In Evening
	Then user Click On The Add To Cart In Evening
	Then user Click To Proceed Checkout To Process In Evening
	Then user Click On Summary To Proceed Checkout In Evening 
	Then  user Click On Address To Proceed Checkout In Evening 
	Then  user Click On T&C Condition In Evening 
	Then  user Click On Shipping To Proceed Checkout In Evening 

	Then  user Click On Pay By Check 
	Then user Click On Confirm Order In Evening 
	
	Given user Take Screenshot In Evening
	