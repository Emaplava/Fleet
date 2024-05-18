@login
Feature: Users should be able to login

  Background: User is already in the log in page
    Given the user is on the login page


  Scenario: Verify login with different user types
    Given the user logged in as "driver"
#    Given the user logged in with username as "driver_username" and password as "driver_password"



