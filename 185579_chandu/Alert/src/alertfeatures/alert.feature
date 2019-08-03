Feature: Alert box
Scenario: On a page with a field and a button
Given A button saying "show alert box"
When User click on that button
Then Alert box will appear saying "Hello! I am an alert box!"