Feature: Calculator
	

	Background: 
		Given I am an initial interface to calculator

	Scenario Outline: Choose an option
		When I choice "<option>"
		Then I should see the respective "<operation>"

	Examples:
	| option | operation |
	|    1   |   sum     |
	|    2   | subtract  |
	|    3   | multiply  |
	|    4   | division  |

	Scenario: Choose an invalid option
	    When I choice an invalid option
	    Then I should see a message advising me about invalid operation

	Scenario Outline: Adding
		When I add "<input_sum>"
		Then the result should be "<output_sum>"

	Examples:
	| input_sum | output_sum |
	|	2 + 2   |     4      |
	| 100 + 200 |    300     |
	|-500 + 200 |   -300     |

	Scenario Outline: Subtract
		When I subtract "<input_subtract>"
		Then the result should be "<output_subtract>"

	Examples:
	| input_subtract | output_subtract |
	|    10 - 2   	 |     	  8        |
	|   50 - 30	 	 |        20       |
	|  -200 + 300 	 |       100       |

	Scenario Outline: Multiply
		When I multiply "<input_multiply>"
		Then the result should be "<output_multiply>"

	Examples: 
	| input_multiply | output_multiply |
	|    5 * 2   	 |     	  10       |
	|   50 * 30	 	 |       150       |
	|   0 * 600 	 |       0         |

	Scenario Outline: Division
		When I divide "<input_division>"
		Then the result should be "<output_division>"
	
	Examples:
	| input_division | output_division |
	|    10 / 2   	 |     	  5        |
	|   200 / 10	 |       20        |
	|  1000 / 50   	 |       20        |

	Scenario: Division by zero
		When I divide "10 / 0"
		Then I should see a message advising me that is impossible to division by zero