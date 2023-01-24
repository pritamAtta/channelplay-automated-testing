@currentFile
Feature: crm automation demo

	Background: 
	Given user open CRM project
		
	Scenario: Do login and entered value
		When user enter email
		And user enter password
		And select signin button
		And user select crm
		And user select customer
		And user selects add button
		And user enter customer name
		
		