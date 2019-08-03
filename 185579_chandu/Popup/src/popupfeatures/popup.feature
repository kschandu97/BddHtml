Feature: Popup
Scenario: Click on a button and a window pops up
Given A button saying "Open Window"
When User clicks on the button 
Then The new window should open having "www.google.com"