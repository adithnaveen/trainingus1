package myPackage;

import java.util.List;
import java.util.Map;

import cucumber.api.DataTable;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginStep {

	
	// hooks 
	@Before
	public void doBefore(){
		System.out.println("^^^^^^^ This will be executed before ^^^^^^^");
	}
	@After
	public void doAfter(){
		System.out.println("^^^^^^^ This will be executed after ^^^^^^^");
	}
	
	
	
	
	

//	Given: launch the application 
//	When: user enters valid username and password
//	And: clicks on login button 
//	Then: User logged into the application 
	
	@Given("launch the application")
	public void launch_the_application(){
		System.out.println("launch the application >>>>>>> ");
	}
	
	@When("^user enters ([a-zA-Z]{1,}) username and password$")
	public void user_enters_valid_username_and_password(String status, 
			DataTable data){
		System.out.println("user enters "+status +
					" username and password>>>>");
		
		
		List<Map<String, String>> list = 
				data.asMaps(String.class, String.class);
		
		System.out.println("*******Values coming from DATA TABLE *******");
		
		for(Map<String, String> temp : list){
		System.out.println("UserName: " + temp.get("userName"));
		System.out.println("Password: " + temp.get("password"));
		
		if(temp.get("level")!=null){
			System.out.println("Level :" + temp.get("level"));
		}
		}
	}
	
	@And("clicks on login button")
	public void clicks_on_login_button(){
		System.out.println("clicks on login button>>>> ");
	}
	
	@Then("User ([a-zA-Z]{1,}) into the application")
	public void user_logged_into_the_application(String loggedStatus){
		System.out.println("User " + loggedStatus +"into the application>>>>>");
	}
	
	// invalid case 
	
//	Then User shown error message
//  When user enters invalid username and password	
	
	
	@Then("User shown error message")
	public void user_shown_error_message(){
		System.out.println("User shown error message<<<<<<<<");
	}
	
	
	/*
	@When("user enters invalid username and password")
	public void user_enters_invalid_username_and_password(){
		System.out.println("user enters invalid username and password<<<<<");
	}
	*/
	
	
	
	
	
}
