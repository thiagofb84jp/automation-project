Feature: Subtracting


#Scenario: Subtraction by two numbers
#	Given the input "10/2"
#	When the calculator is run
#	Then the output should be "5"

Scenario Outline: Subtraction by two numbers
	Given the input "<input>"
	When the calculator is run
	Then the output should be "<output>"

Examples:
| input | output |
| 10-2	|	8	 |
| 2-2	|   0	 |