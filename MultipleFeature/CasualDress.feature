Feature: Dress Booking in AutomationPractice Application 

Background: 

	When user Enter The "mubeen2824@gmail.com" In Username Field 
	And user Enter The "123456789" in Password Field 
	Then user Click On The Login Buttion tab And It Navigate to Login Page 
	
@CasualDress 
Scenario: Casual Dress Booking 

	Given user Move To Dresses Tab 
	Then user Click On The Casual Dress 
	When move To Dress You Liked 
	Then click On The Dress You Viewed 
	Given user Handle the Frame Window 
	Then user Click To Increase The Size of Quality 
	Then user Select The Size They Want 
	Then user Click On The Add To Cart 
	Then user Click To Proceed Checkout To Process 
	Then user Click On Summary To Proceed Checkout 
	Then  user Click On Address To Proceed Checkout 
	Then  user Click On T&C Condition 
	Then  user Click On Shipping To Proceed Checkout 
	Then  user Click On Pay By Bank Wire 
	Then user Click On Confirm Order 
	Given user Take Screenshot 
	
	
	