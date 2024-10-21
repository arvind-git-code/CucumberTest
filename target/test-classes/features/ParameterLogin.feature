Feature: feature to test login functionality

  Scenario Outline: Check login is sucessful with valid credentials
    Given user is on login page
    When user enter <username> and <password>
    And click on the login button
    Then user id navigate to home page

    Examples: 
      | username        | password     |
      | standard_user   | secret_sauce |
      | locked_out_user | secret_sauce |
      | problem_user    | secret_sauce |
      | visual_user     | secret_sauce |

      
#step definition for this are -ParameterLoginTest , ParameterLoginTestPOM


# for ParameterLoginTestPOM the implimentation class is - ParameterloginaPOM