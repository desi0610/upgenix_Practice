Feature: User logs in as POS manager to access modules

  US3:  As a POS manager,  I should be able to access to the main modules.

  Scenario: Valid login as POS manager
    Given the user logged in with username as "posmanager6@info.com" and password as "posmanager"
    Then user should see these menus options
      | Discuss       |
      | Calendar      |
      | Notes         |
      | Contacts      |
      | CRM           |
      | Sales         |
      | Website       |
      | Point of Sale |
      | Purchases     |
      | Inventory     |
      | Manufacturing |
      | Repairs       |
      | Project       |
      | Events        |
      | Surveys       |
      | Employees     |
      | Attendances   |
      | Leaves        |
      | Expenses      |
      | Maintenance   |
      | Fleet         |
      | Dashboard     |





