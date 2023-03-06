Feature: Sales page functionality

  US1  As a manager, I should be able to get correct information on the Sales page.

  Background: For all scenarios user is on the login page
    Given the user is on the login page


  Scenario Outline: Sales page verification for the quotations for POS manager

    When user login using "<email>" and "<password>"
    And user clicks on the Sales page
    Then user should see these six columns with below info

      | Quotation Number |
      | Quotation Date   |
      | Customer         |
      | Salesperson      |
      | Total            |
      | Status           |

    Examples:
      | email                    | password     |
      | posmanager7@info.com     | posmanager   |
      | posmanager8@info.com     | posmanager   |
      | salesmanager105@info.com | salesmanager |
      | salesmanager104@info.com | salesmanager |














