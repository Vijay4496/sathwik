Feature: feature to test login functionality
Scenario: verify feature to test login functionality
	Given broweser is open
	When user enter username and password
	And hits login button
	Then user is navigated to home page