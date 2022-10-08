package com.stepdef;

import java.io.IOException;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import com.helperfiles.File_Reader_Manager;
import com.pom.manager.ProjectObjectManager;
import com.runner.Automation_Runner;
import com.utilityfiles.Utility_File_BaseClass;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Step_Def extends Utility_File_BaseClass {

	public static WebDriver driver = Automation_Runner.driver;
	public static ProjectObjectManager pommanger = new ProjectObjectManager(driver);;

	@Before
	public static void click_SingIn() {
		ImplicitWait(20);
		click_On_Element(pommanger.getStore().getLogin());
	}

	@After
	public static void logOuted() throws IOException {
		ImplicitWait(20);
		click_On_Element(pommanger.getlogOut().getLogOut());
		String url = File_Reader_Manager.get_InstanceFileReaderManager().get_Instacne_Reader().get_URL();
		driver.navigate().to(url);
	}

	@Then("user Click On The Signin Button And It Navigate to {string}")
	public void user_click_on_the_signin_button_and_it_navigate_to(String login) {
		click_On_Element(pommanger.getStore().getLogin());
		Assert.assertEquals(login, driver.getTitle());
	}

	@When("user Enter The {string} In Username Field")
	public void user_enter_the_in_username_field(String username) {

		send_Keys(pommanger.getMylogin().getEmail(), username);
	}

	@When("user Enter The {string} in Password Field")
	public void user_enter_the_in_password_field(String password) {

		send_Keys(pommanger.getMylogin().getPassword(), password);
	}

	@Then("user Click On The Login Buttion tab And It Navigate to Login Page")
	public void user_click_on_the_login_buttion_tab_and_it_navigate_to_login_page() {
		click_On_Element(pommanger.getMylogin().getSigin());
	}

	@Given("user Move To Dresses Tab")
	public void user_move_to_dresses_tab() {
		ImplicitWait(20);
		ActionMovetoElement(pommanger.getMyAccStore().getDresses());
	}

	@Then("user Click On The Casual Dress")
	public void user_click_on_the_casual_dress() {
		ImplicitWait(20);
		click_On_Element(pommanger.getMyAccStore().getCasualdress());
	}

	@When("move To Dress You Liked")
	public void move_to_dress_you_liked() {
		ImplicitWait(20);
		ActionMovetoElement(pommanger.getCasualdress().getquickView());
	}

	@Then("click On The Dress You Viewed")
	public void click_on_the_dress_you_viewed() {
		ImplicitWait(20);
		click_On_Element(pommanger.getCasualdress().getviewClick());
	}

	@Given("user Handle the Frame Window")
	public void user_handle_the_frame_window() {
		ImplicitWait(20);
		iframe(pommanger.getPrintedDress().getFrame());
	}

	@Then("user Click To Increase The Size of Quality")
	public void user_click_to_increase_the_size_of_quality() {
		ImplicitWait(20);
		click_On_Element(pommanger.getPrintedDress().getPlus());
	}

	@Then("user Select The Size They Want")
	public void user_select_the_size_they_want() {
		select_ByValue(pommanger.getPrintedDress().getSize(), "2");
	}

	@Then("user Click On The Add To Cart")
	public void user_click_on_the_add_to_cart() {
		ImplicitWait(20);
		click_On_Element(pommanger.getPrintedDress().getAddtocart());
	}

	@Then("user Click To Proceed Checkout To Process")
	public void user_click_to_proceed_checkout_to_process() {
		ImplicitWait(20);

		click_On_Element(pommanger.getPrintedDress1().getcheckout());
	}

	@Then("user Click On Summary To Proceed Checkout")
	public void user_click_on_summary_to_proceed_checkout() {
		ImplicitWait(20);
		click_On_Element(pommanger.getOrder().getCheckOut());
	}

	@Then("user Click On Address To Proceed Checkout")
	public void user_click_on_address_to_proceed_checkout() {
		ImplicitWait(20);
		click_On_Element(pommanger.getOrder1().getCheckOut());
	}

	@Then("user Click On T&C Condition")
	public void user_click_on_t_c_condition() {
		ImplicitWait(20);
		click_On_Element(pommanger.getOrder2().getcheckBox());
	}

	@Then("user Click On Shipping To Proceed Checkout")
	public void user_click_on_shipping_to_proceed_checkout() {
		ImplicitWait(20);
		click_On_Element(pommanger.getOrder2().getcheckOut());
	}

	@Then("user Click On Pay By Bank Wire")
	public void user_click_on_pay_by_bank_wire() {
		ImplicitWait(20);
		click_On_Element(pommanger.getPayment().getpay());
	}

	@Then("user Click On Confirm Order")
	public void user_click_on_confirm_order() {
		ImplicitWait(20);
		click_On_Element(pommanger.getConfirmorder().getconfirmOrder());
	}

	@Given("user Take Screenshot")
	public void user_take_screenshot() throws IOException, InterruptedException {
		Thread.sleep(10000);
		ScreenShot("C:\\Users\\DELL\\eclipse-workspace\\Cucumber_Practice\\screenshot\\CucumberDressBooked.png");
	}

	@Then("user Click on SignOut")
	public void user_click_on_sign_out() {
		ImplicitWait(20);
		click_On_Element(pommanger.getlogOut().getLogOut());
	}

	@Given("user Move To Dresses1 Tab")
	public void user_move_to_dresses1_tab() {
		ImplicitWait(20);
		ActionMovetoElement(pommanger.getMyAccStore().getDresses());
	}

	@Then("user Click On The Evening Dress")
	public void user_click_on_the_evening_dress() {
		ImplicitWait(20);
		click_On_Element(pommanger.getMyAccStore().getEveningDress());
	}

	@When("move To Dress You Liked in Evening")
	public void move_to_dress_you_liked_in_evening() {
		ImplicitWait(20);
		ActionMovetoElement(pommanger.getEveningdress().getQuickview());
	}

	@Then("click On The Dress You Viewed In Evening")
	public void click_on_the_dress_you_viewed_in_evening() {
		ImplicitWait(20);
		click_On_Element(pommanger.getEveningdress().getViewclick());
	}

	@Given("user Handle the Frame Window In Evening")
	public void user_handle_the_frame_window_in_evening() {
		ImplicitWait(20);
		iframe(pommanger.getEveningprinted().getFrame());
	}

	@Then("user Click To Increase The Size of Quality In Evening")
	public void user_click_to_increase_the_size_of_quality_in_evening() {
		ImplicitWait(20);
		click_On_Element(pommanger.getEveningprinted().getQuantity());
	}

	@Then("user Select The Size They Want In Evening")
	public void user_select_the_size_they_want_in_evening() {
		ImplicitWait(20);
		select_ByVisibleText(pommanger.getEveningprinted().getSize(), "L");
	}

	@Then("user Select The Color They Want In Evening")
	public void user_select_the_color_they_want_in_evening() {
		ImplicitWait(20);
		click_On_Element(pommanger.getEveningprinted().getColor());
	}

	@Then("user Click On The Add To Cart In Evening")
	public void user_click_on_the_add_to_cart_in_evening() {
		ImplicitWait(20);
		click_On_Element(pommanger.getEveningprinted().getAddtocart());
	}

	@Then("user Click To Proceed Checkout To Process In Evening")
	public void user_click_to_proceed_checkout_to_process_in_evening() {
		ImplicitWait(20);
		click_On_Element(pommanger.getEveningprinted1().getCheckout());
	}

	@Then("user Click On Summary To Proceed Checkout In Evening")
	public void user_click_on_summary_to_proceed_checkout_in_evening() {
		ImplicitWait(20);
		click_On_Element(pommanger.getEveOrder().getcheckout());
	}

	@Then("user Click On Address To Proceed Checkout In Evening")
	public void user_click_on_address_to_proceed_checkout_in_evening() {
		ImplicitWait(20);
		click_On_Element(pommanger.getEveOrder1().getcheckout());
	}

	@Then("user Click On T&C Condition In Evening")
	public void user_click_on_t_c_condition_in_evening() {
		ImplicitWait(20);
		click_On_Element(pommanger.getEveOrder2().getCheckbox());
	}

	@Then("user Click On Shipping To Proceed Checkout In Evening")
	public void user_click_on_shipping_to_proceed_checkout_in_evening() {
		ImplicitWait(20);
		click_On_Element(pommanger.getEveOrder2().getCheckout());
	}
	

@Then("user Click On Pay By Check")
public void user_click_on_pay_by_check() {
	ImplicitWait(20);
	click_On_Element(pommanger.getPayment1().getcheck());
}

@Then("user Click On Confirm Order In Evening")
public void user_click_on_confirm_order_in_evening() {
	ImplicitWait(20);
	click_On_Element(pommanger.getConfirmorder1().getcheckout());
}

@Given("user Take Screenshot In Evening")
public void user_take_screenshot_in_evening() throws InterruptedException, IOException {
	Thread.sleep(10000);
	ScreenShot("G:\\Testing Training\\Class\\Screenshot\\Dress2Booked.png");
}

}
