@B33G12-66
Feature: Users should be able to login

  Background: User is already in the log in page
    Given the user is on the login page

  @B33G12-66
  Scenario: Verify Drivers see 4 module names.
    When the user logged in as "driver"
    Then User sees moduleNames
      | Fleet      |
      | Customers  |
      | Activities |
      | System     |

  @B33G12-66
  Scenario: Store and Sales managers see 8 module names
    When the user logged in as "sales manager"
    Then User sees eightmoduleNames
      | Dashboards         |
      | Fleet              |
      | Customers          |
      | Sales              |
      | Activities         |
      | Marketing          |
      | Reports & Segments |
      | System             |

  @B33G12-66
  Scenario: Store and Sales managers see 8 module names
    When the user logged in as "store manager"
    Then User sees eightmoduleNames
      | Dashboards         |
      | Fleet              |
      | Customers          |
      | Sales              |
      | Activities         |
      | Marketing          |
      | Reports & Segments |
      | System             |



