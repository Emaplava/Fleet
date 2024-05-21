Feature: Oroinc Documentation Page verification
  Agile Story:  As a user, I should be access to the
                Oroinc Documentation page.
  @B33G12-105
  Scenario Outline:
    Given the user is on the login page
    Given the user logged in as "<userType>"
    Then user clicks on the question mark icon.
    Then user switch to the new window
    And user verifies the URL

    Examples:
      | userType      |
      | driver        |
      | store manager |
      | sales manager |

