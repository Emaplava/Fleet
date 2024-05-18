@B33G12-96
Feature: Repetitive Calendar Event verification
  Agile story: As a user, I want to create a recurring
  (repetitive) calendar event
  @B33G12-94
  Scenario Outline:Verify that users see the number “1” by default
  in the Repeat Every input option.
    Given the user is on the login page
    Given the user logged in as "<userType>"
    Then user hover over the Activities dropdown
    Then user clicks on Calendar Events
    Then user clicks on Create Calendar Event
    And user select repeat checkbox
    Then user verifies that they see the number 1 in the box by default in the repeat in every input
    Examples:
      | userType      |
      | driver        |
      | store manager |
      | sales manager |

  @B33G12-95
  Scenario Outline: Verify that users see the error message “This value should not be blank.” when the Calendar event Repeat Every field is cleared (delete the number 1).
    Given the user is on the login page
    Given the user logged in as "<userType>"
    Then user hover over the Activities dropdown
    Then user clicks on Calendar Events
    Then user clicks on Create Calendar Event
    And user select repeat checkbox
    Then user verifies that they see the number 1 in the box by default in the repeat in every input
    Then user clear the box by deleting the number
    And user verifies the error message "This value should not be blank.”.
    Examples:
      | userType      |
      | driver        |
      | store manager |
      | sales manager |