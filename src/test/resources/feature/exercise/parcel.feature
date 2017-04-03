Feature: parcel tracking test 
	Description: This test is checking if the given consignment number returns valid information.


Scenario: Consignment number exists 
	Given user is on the main page 
	And parcel tracking system is on the main page 
	When user inputs number "00370716489535264169"
	And parcel submit button is pressed
	Then parcel sent "22.3." from "Helsinki" and arrived "24.3." to "Littoinen" will be displayed 
	
 