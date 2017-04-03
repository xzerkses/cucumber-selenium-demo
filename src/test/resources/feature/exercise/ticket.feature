Feature: ticket buying 

Scenario Outline: buying one way ticket with departure time 
	Given Search results for a certain connection are displayed 
	When The user selects one of the tickets 
	Then  magic happens 
	
	Examples: 
		|a | a | d|
		
Scenario Outline: buying ticket 
	Given The user is on the main page 
	And there are from, to, departure input box 
	When <from> is entered to the from field 
	And <to> is entered to the to field 
	And <departure> is entered to the departure field 
	And submit button is pressed 
	Then information regarding 
	
	Examples: 
		| a | b | c |