package myPackage;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class TransferStep {

	
	/*
	 * Given "<src_status>" source account number
		And "<dest_status>" receipent account number 
		And with "<balance_status>" balance 
		Then "<transfer_status>"the amount

	 */
	@Given("^\"([a-zA-Z]{1,})\" source account number$")
	public void valid_source_account_number(String srcStatus) throws Throwable {
		System.out.println( srcStatus + " account number++++++");
	}

	@Given("^\"([a-zA-Z]{1,})\" receipent account number$")
	public void valid_receipent_account_number(String destStatus) throws Throwable {
		System.out.println(destStatus+ " receipent account number++++++");
	}

	@Given("^with \"([a-zA-Z]{1,})\" balance$")
	public void with_sufficient_balance(String balanceStatus) throws Throwable {
		System.out.println("with "+balanceStatus+" balance++++++");
	}

	@Then("^\"([a-zA-Z]{1,})\" the amount$")
	public void transfer_the_amount(String transferStatus) throws Throwable {
		System.out.println( transferStatus+ " the amount+++++++");
	}

}
