@us003
Feature: Default

  Background: User is already in the log in page
    Given the user is on the login page

  @B33G12-100 @us003
  Scenario: Verify that when users click the “Learn how to use this space” link
    Given the user is on the login page
    When the user logged in as "driver"
    When the user clicks to "Learn how to use this space"
    Then the user should see "How To Use Pinbar" and "Use pin icon on the right top corner of page to create fast access link in the pinbar."

  @B33G12-101 @us003
  Scenario: Verify that  users see an image on the page.
    Given the user is on the login page
    When the user logged in as "driver"
    When the user clicks to "Learn how to use this space"
    Then  users see an image on the page.