@PRG27-103
Feature: Default

	Background:
		#@PRG27-101
		Given the user is on the login page
		

	@PRG27-102
	Scenario Outline: US13AC1 Verify user information email
		When user login using "<email>" and "<password>"
		    Then account holder name should be "<name>"
		
		    @salesManager
		    Examples:
		
		      | email                   | password     | name           |
		      | salesmanager55@info.com | salesmanager | salesmanager55 |
		      | salesmanager67@info.com | salesmanager | salesmanager67 |
		      | salesmanager89@info.com | salesmanager | salesmanager89 |
		
		    @expenseManager
		    Examples:
		      | email                      | password        | name              |
		      | expensesmanager55@info.com | expensesmanager | expensesmanager55 |
		      | expensesmanager67@info.com | expensesmanager | expensesmanager67 |
		      | expensesmanager89@info.com | expensesmanager | expensesmanager89 |