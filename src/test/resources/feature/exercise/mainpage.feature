Feature: mainPage test
Description: Testing the visibility of the ticket offers and links on the main page,
and it works properly.

Scenario: Ticket offers and the link to online ticket sales -page are visible
     Given user is on the main page
     Then ticket offers are displayed
     And the link is displayed
     
Scenario: The link is redirecting to online tickets sales -page
     Given the user is on the main page
     And the link is displayed
     When user clicks the link
     Then Online ticket sales page is loaded
     
