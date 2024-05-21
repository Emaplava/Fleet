@B33G12-107
Feature: Edit Car Info Icons on Vehicles Page

  @B33G12-98
  Scenario Outline: User sees "view, edit, delete" options when hovering over the 3 dots
    Given the user logged in as "<userType>"
    When I navigate to the Vehicles page
    When I hover my mouse over the three-dot icon of a car
    Then I should see the options "View", "Edit", and "Delete" appear
    Examples:
      | userType      |
      | Driver        |
     | Store Manager |
      | Sales Manager |
