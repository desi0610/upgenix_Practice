Feature: User login and account name

  User Story 13: As sales and expense manager, I want to Login with valid credentials and get my account name

  Background:
    Given the user is on the login page

  Scenario Outline: Verify user information <email>
    When user login using "<email>" and "<password>"
    Then account holder name should be "<name>"

    @salesManager
    Examples:

      | email                 | password   | name         |
      | posmanager55@info.com | posmanager | posmanager55 |
      | posmanager67@info.com | posmanager | posmanager77 |
      | posmanager89@info.com | posmanager | posmanager89 |


    @expenseManager
    Examples:
      | email                       | password         | name               |
      | eventscrmmanager55@info.com | eventscrmmanager | eventscrmmanager55 |
      | eventscrmmanager67@info.com | eventscrmmanager | eventscrmmanager67 |
      | eventscrmmanager89@info.com | eventscrmmanager | eventscrmmanager89 |

