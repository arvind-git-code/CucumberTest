Feature: test the multiple user login

  Scenario Outline: Check if login is heappening with gievn data
    Given browser is open
    And Login page is open
    When user enters <user_name> and <passwd>
    And click on login button
    Then user is navidate to home page

    Examples: 
      | user_name       | passwd       |
      | standard_user   | secret_sauce |
      | locked_out_user | secret_sauce |
      | problem_user    | secret_sauce |
      | visual_user     | secret_sauce |
#stepdefinition is - PageFactoryLogin and implimentation class is - UserLogin_PF
