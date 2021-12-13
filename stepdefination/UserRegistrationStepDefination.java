package com.retail.stepdefination;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import com.base.retail.InitiateDriver;
import com.retail.pages.RegisterUser;

import cucumber.api.DataTable;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class UserRegistrationStepDefination {
	public WebDriver driver;
	public RegisterUser register;
	
	
	
	@Given("^I am on retail upskill website$")
	public void i_am_on_retail_upskill_website() throws Throwable {
	   InitiateDriver init  =new InitiateDriver();
	   driver  = init.getDriverInstance();
	    
	}

	@When("^I enter the firstname$")
	public void i_enter_the_firstname_on_register(DataTable arg1) throws Throwable {
		List<List<String>> data = arg1.raw();
	    register = new RegisterUser(driver);
	    register.driver.findElement(By.xpath("//a[@href='http://retaim1.upskills.in/account/account']")).click();
	    register.driver.findElement(By.xpath("//a[@href='http://retaim1.upskills.in/account/register")).click();
	    register.driver.findElement(By.id("input-firstname")).sendKeys(data.get(0).get(1));
	}

	@When("^enter lastname$")
	public void enter_lastname(DataTable arg1) throws Throwable {
		List<List<String>> data = arg1.raw();
		register.enterLastName(data.get(0).get(1)); 
	}

	@When("^enter email$")
	public void enter_email(DataTable arg1) throws Throwable {
		List<List<String>> data = arg1.raw();
		register.enterEmail(data.get(0).get(1));
	    
	}

	@When("^enter moblenum$")
	public void enter_moblenum(DataTable arg1) throws Throwable {
		List<List<String>> data = arg1.raw();
		register.enterMobile(data.get(0).get(1));
	    
	}

	@When("^enter address(\\d+)$")
	public void enter_address(int arg1, DataTable arg2) throws Throwable {
		List<List<String>> data = arg2.raw();
		register.enterAddress1(data.get(0).get(1));

	    
	}

	@When("^enter city$")
	public void enter_city(DataTable arg1) throws Throwable {
		List<List<String>> data = arg1.raw();
		register.enterCity(data.get(0).get(1));
	    
	}

	@When("^enter post code$")
	public void enter_post_code(DataTable arg1) throws Throwable {
		List<List<String>> data = arg1.raw();
		register.enterPostalCode(data.get(0).get(1));
	}

	@When("^enter country$")
	public void enter_country(DataTable arg1) throws Throwable {
		List<List<String>> data = arg1.raw();
		register.enterCountry(data.get(0).get(1));
	}

	@When("^enter region$")
	public void enter_region(DataTable arg1) throws Throwable {
		List<List<String>> data = arg1.raw();
		register.enterState(data.get(0).get(1));
	    
	}

	@When("^enter password$")
	public void enter_password(DataTable arg1) throws Throwable {
		List<List<String>> data = arg1.raw();
		register.enterPassword(data.get(0).get(1));
	}

	@When("^enter confirm password$")
	public void enter_confirm_password(DataTable arg1) throws Throwable {
		List<List<String>> data = arg1.raw();
		register.enterConfirmPassword(data.get(0).get(1));
	}

	@When("^select the radio button to subscribe$")
	public void select_the_radio_button_to_subscribe() throws Throwable {
	    register.clickSubscribeNewsletter();
	    
	}

	@When("^select the checkbox for agree provacy policy$")
	public void select_the_checkbox_for_agree_provacy_policy() throws Throwable {
	   register.selectAgreeTermsConditions();
	    
	}

	@When("^click on continue$")
	public void click_on_continue() throws Throwable {
	    register.clickContinue();
	    
	}
	
	@When("^I enter userid and password$")
	public void i_enter_userid_and_password(DataTable arg1) throws Throwable {
		List<List<String>> data = arg1.raw();
	    register = new RegisterUser(driver);
	    register.driver.findElement(By.xpath("//a[@href='http://retaim1.upskills.in/account/account']")).click();
	   // register.driver.findElement(By.xpath("//a[@href='http://retaim1.upskills.in/account/register")).click();
	    register.enterEmailAddress(data.get(0).get(1));
	    register.enterPassword(data.get(0).get(1));
	    throw new PendingException();
	}

	@Then("^User is logged in successfully$")
	public void user_is_logged_in_successfully() throws Throwable {
	    register.validateUserLoggedIn();
	    throw new PendingException();
	}


}
