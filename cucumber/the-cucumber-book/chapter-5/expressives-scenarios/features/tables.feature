Feature: Tables

	Scenario: Born Date
	#	Given a User "Michael Jackson" born on August 29, 1958
	#	And a User "Elvis" born on January 8, 1935
	#	And a User "John Lennon" born on October 9, 1940

	Scenario: Born Date
		Given these Users:
			|	name  		  | date of birth   |
			| Michael Jackson | August 29, 1958 |
			| Elvis           | January 8, 1935 |
			| John Lennon     | October 9, 1940 |

	#Just an example!
	Then I should see a vehicle that matches the following description:
			| Wheels     | 2      				   |
			| Max Speed  | 60 mph 				   |
			| Accessories| Lights, shopping basket |

	#Another example!
	Then my shopping list should contain:
		| Onions   |
		| Potatoes |
		| Sausages |
		| Apples   |
		| Relish   |