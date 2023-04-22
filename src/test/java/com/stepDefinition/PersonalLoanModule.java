package com.stepDefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class PersonalLoanModule {

	@Given("Customer can open the ICICI Bank Webpage")
	public void customer_can_open_the_ICICI_Bank_Webpage() {

	    
	    
	    System.out.println("Customer can open the ICICI Bank Webpage");
	}

	@Given("Customer can check the List of Loan Options and click Personal Loan")
	public void customer_can_check_the_List_of_Loan_Options_and_click_Personal_Loan() {
		
	    System.out.println("Customer can check the List of Loan Options and click Personal Loan");
	}

	@When("Customer can click the apply loan")
	public void customer_can_click_the_apply_loan() {
	    
		System.out.println("Customer can click the apply loan");
	}

	@Then("Customer read the documents to apply loan")
	public void customer_read_the_documents_to_apply_loan() {
	    
		System.out.println("Customer read the documents to apply loan");
	}

	@Then("Customer enter the require amount and fill tenure period to repay loan amount")
	public void customer_enter_the_require_amount_and_fill_tenure_period_to_repay_loan_amount() {
	    
		System.out.println("Customer enter the require amount and fill tenure period to repay loan amount");
	}

	@Then("Customer fill the necessary information")
	public void customer_fill_the_necessary_information() {
	    
		System.out.println("Customer fill the necessary information");
	}

	@Then("Customer click the checkbox")
	public void customer_click_the_checkbox() {
	    
		System.out.println("Customer click the checkbox");
	}

}
