Feature: MainPageLayout

Scenario: Logo visibility
	Given the user opens the browser
	When the user navigates to matkahuolto.fi
	Then Logo becomes visible on the top left of the MainPage

Scenario: Ticket offer visibility
	Given the user opens the browser
	When the user navigates to matkahuolto.fi
	Then Ticket offers are visible
	
Scenario: consignment number input field
Given the user opens the browser
	When the user navigates to matkahuolto.fi
	Then the consignment number input field is visible