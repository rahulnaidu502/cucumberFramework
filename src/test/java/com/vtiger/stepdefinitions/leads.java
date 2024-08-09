package com.vtiger.stepdefinitions;

import java.util.List;

import org.openqa.selenium.By;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class leads extends basesteps{    /* have used extend as we have 2 files in same package using 
                                            inheritance have extended. */
	
	@When("user fills the mandatory fields as {string} and {string}")
	public void user_fills_the_mandatory_fields_as_and(String string, String string2, io.cucumber.datatable.DataTable dataTable) {
	
	List<List<String>> ls = dataTable.asLists();  
	for(List<String> s: ls)
	{

	ldp.clickNewLead1();
	ldp.createlead(s.get(0), s.get(1));
	}

	}
	
	@Then("leads should be created successfully")
	public void leads_should_be_created_successfully() {
	}
	
	@Then("click on logout")
	public void click_on_logout() {
	//driver.findElement(By.linkText("Logout")).click();
	hp.click_logout();
	}


}
