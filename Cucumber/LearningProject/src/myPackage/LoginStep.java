package myPackage;

import java.util.List;
import java.util.Map;

import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class LoginStep {

	 /*
     * Given launch the application
     * Then  enter valid username and password
     * And click on login button
     * Then I am logged into application
     */
    
	
	
	// this is background method
	@Given("Lanuch chrome browser")
	 public void Lanuch_chrome_browser(){
		 System.out.println("******* Launching Chrome Browser*********");
	 } 
	
	
	

	// this is background method
	@Given("Do One More Job")
	 public void Do_One_More_Job(){
		 System.out.println("*******  Do One More Job*********");
	 } 
	
	
	
	
	
	
	

	@Given("^launch the application$")
	public void launch_the_application(){
		System.out.println("launch the application>>>>>");
	} 
	   
	@Then("^enter valid username and password$")
	public  void enter_valid_username_and_password(DataTable data){
		
		// executing with the values of data table 
		List<Map<String, String>> list = data.asMaps(String.class, String.class);
		
		System.out.println("---------with the data table values ------------");
		System.out.println(list.get(0).get("User_Name"));
		System.out.println(list.get(0).get("Password"));
		
		System.out.println("++++++++ second user ++++++++++");
		System.out.println(list.get(1).get("User_Name"));
		System.out.println(list.get(1).get("Password"));
		
		System.out.println("++++++++ third user ++++++++++");
		System.out.println(list.get(2).get("User_Name"));
		System.out.println(list.get(2).get("Password"));
		
		
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
