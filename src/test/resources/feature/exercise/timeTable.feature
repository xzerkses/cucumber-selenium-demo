Feature: Searching for all operators on a certain connection

	Scenario: Enter timetable query data
		Given (from, to, departuretime) information in the search field 
		When (from, to, departuretime) information is entered
		And Search button is pressed
		Then search results for connections of all bus operators are displayed
		
	Scenario: Enter timetable query data
		Given (from, to) information in the search field 
		When  "Turku", "Helsinki" information is entered
		And Search button is pressed
		Then search results for connections of "Onnibus", "Vainion liikenne", "Pohjolan liikenne"
	
	
	Scenario Outline: Enter timetable query data
		Given (from, to) information in the search field 
		When <from> <to> information is entered
		And Search button is pressed
		Then search results for connections of <operators>
		
		Examples:
		| from | to | operators |
		| Turku | Helsinki | "Onnibus", "Vainion liikenne", "Pohjolan liikenne"  |
		| Turku | Tampere | "Onnibus", "Pohjolan liikenne", "Savonlinja" |
		