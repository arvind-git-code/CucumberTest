Feature: Check home page functionality

  Background: User is loged in
    Given user is on login page
    When user enter the username and password
    And click on enter buttton
    Then user is navigated to home page

  Scenario: Check logout link
    #Given User is loged in
    When User click on welcome link
    Then logout link will display

  Scenario: Verify quick launch toolbar present
    #  Given User is loged in
    When user click on dashboard link
    Then quick launch toolbar is displayed
#in thease scenarios the user is loged in is common
#https://opensource-demo.orangehrmlive.com/web/index.php/auth/login
