package com.mavencucumber.mavenCucumberPrototype;

import java.util.List;
import java.util.Map;

import cucumber.api.DataTable;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class LoginStep {



	// this is background method
	@Given("Lanuch chrome browser")
	 public void Lanuch_chrome_browser(){
		 System.out.println("******* Launching Chrome Browser*********");
	 } 
	

	@Given("^launch the application$")
	public void launch_the_application(){
		System.out.println("launch the application>>>>>");
	} 
	   
	@Then("^enter valid username and password$")
	public  void enter_valid_username_and_password(){
		System.out.println("enter valid username and password >>>>>>>>>");
	}
	  
	@And("^click on login button$")
	public void click_on_login_button(){
		System.out.println("click on login button>>>>>>>>");
	}

	@Then("^I am logged into application$")
	public void I_am_logged_into_application(){
		System.out.println("I am logged into application>>>>>>>>>>");
	}
}
