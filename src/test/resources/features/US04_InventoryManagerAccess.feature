Feature: Login functionality for Inventory Manager

  Background: For all scenarios user is on the login page
    Given the user is on the login page

  Scenario Outline: User login with valid credential for Inventory manager
    When user login using "<email>" and "<password>"
    Then user should see the below modules
      | Discuss       |
      | Calendar      |
      | Notes         |
      | Contacts      |
      | Website       |
      | Inventory     |
      | Manufacturing |
      | Repairs       |
      | Invoicing     |
      | Email         |
      | Marketing     |
      | Employees     |
      | Leaves        |
      | Expenses      |
      | Lunch         |
      | Maintenance   |
      | Dashboard     |
    Examples:
      | email          | password         |
      | imm11@info.com | inventorymanager |
      | imm12@info.com | inventorymanager |
      | imm13@info.com | inventorymanager |

