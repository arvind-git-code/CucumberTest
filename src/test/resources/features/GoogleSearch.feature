Feature: Google search test

  Scenario: To test the google search in chrome browser
    Given Browser is open
    And User is goging to search page
    When User enter text in Search box
    And hit enter button
    Then User is navigated to search result
