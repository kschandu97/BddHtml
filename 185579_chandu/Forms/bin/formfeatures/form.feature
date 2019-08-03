Feature: Form
Scenario: Filling a form
Given A user filling a form
When user clicks on Submit
Then Details should be seen on URL
When user clicks on Reset
Then Fields will be reset to blank
 
