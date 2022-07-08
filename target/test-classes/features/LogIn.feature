Feature: LogIn Page

Scenario: Validating user cannot logIn with invalid credentials
Given User navigates to "https://www.phptravels.com/demo"
When User clicks on LogIn button
And Enters "email@email.com", "password"
And clicks LogInButton
Then User should receive error message