Feature: Test login using hooks
@smoke
Scenario: Test the login using given cradential

Given browser is opened now 
And user on login page
When user enter login_id
And press enter button
Then the user is able to login


@smoke1
Scenario: Test the home page

Given the page is open
When user enter login_id
And press enter button
Then the user is able login