@US13
Feature: manage filters on vehicles costs
  Background:  User is already on the login page
    Given the user is on the login page


 Scenario Outline: as a user, (Store and Sales managers) I want to manage filters on the Vehicle costs
   Given the user logged in as "<userType>"
   And users should hover over on fleet to be able to see vehicle costs
   And users should click on vehicle costs
   Then users should see 3 columns on the vehicle costs
   Examples:
   | userType |
   | store manager |
   | sales manager |

  Scenario Outline: as a user, (Store and Sales managers) I want to manage filters on the Vehicle costs
    Given the user logged in as "<userType>"
    And users should hover over on fleet to be able to see vehicle costs
    And users should click on vehicle costs
    And users should see 3 columns on the vehicle costs
    Then user should click on first check box button

    Examples:
      | userType |
      | store manager |
      | sales manager |

