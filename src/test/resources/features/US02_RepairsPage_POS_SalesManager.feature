Feature: Repairs page functionality

  US2 : As a POS  & sales manager, I want to access the Repairs page.

  Background: For all scenarios users are on the login page
    Given the user is on the login page

  Scenario Outline: POS and Sales managers are able to see repairs orders
    When user login using "<email>" and "<password>"
    And user clicks on the Repairs page
    Then user should see these six columns with text
      | Repair Reference    |
      | Product to Repair   |
      | Customer            |
      | Delivery Address    |
      | Warranty Expiration |
      | Status              |

  Examples:
    | email                    | password     |
    | posmanager7@info.com     | posmanager   |
    | posmanager8@info.com     | posmanager   |
    | salesmanager105@info.com | salesmanager |
    | salesmanager104@info.com | salesmanager |


