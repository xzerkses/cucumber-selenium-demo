Feature: timeTable test
Description: This tests checks functionality of timetable search and that bus connection appear

Scenario: The timetable input fields are visible
     Given user is on the main page
     Then user can see the timetable input fields
   
Scenario: The timetable data retrieval
     Given user is on the main page
     When from field is 'Kuopio' and to field is 'Helsinki' and depature date is '31.12.2016' and time is '14.00'.
     Then result contains only 'Onnibus' route
     
Scenario Outline:
     Given user is on the main page
     When from field is <From> and to field is <To> and depature date is <Departures>
     Then <Operator1>, <Operator2>, <Operator3> are returned
     
     Examples:
     | From 	  | To    | Departures  | Operator1 | Operator2 			| Operator3		|
     | Helsinki | Turku | 28.3. 14.00 | Onnibus		| Vainionliikenne	| Launokorpi 	|
     | Kuopio	  | Turku | 22.3. 8.00  | TVO				| Vainionliikenne	| Launokorpi |
   