Feature: smoketest 

Scenario: test the search 
	Given user is on front page 
	When "helsinki"  is written to from field 
	Then "helsinki" should be visible