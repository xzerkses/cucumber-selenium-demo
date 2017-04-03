Feature: parcel tracking test
Description: This test is checking if the given consignment number returns valid information.


Scenario: Consignment number exists
     Given parcel tracking system is on the main page
     When user inputs number 00370716489535264169
     Then a popup window should show a parcel tracking information table 
     And the table should contain 'sent 22.3. from Helsinki' and 'arrived 24.3. to Littoinen'
    
Scenario: Consignment number does not exist
     Given parcel tracking system is on the main page
     When user inputs wrong consignment number
     Then a popup window should appear with error message
 