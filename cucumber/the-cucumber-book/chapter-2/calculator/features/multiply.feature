Feature: Multiplying


#Scenario: Multiply by two numbers
#	Given the input "10/2"
#	When the calculator is run
#	Then the output should be "5"

Scenario Outline: Multiply by two numbers
	Given the input "<input>"
	When the calculator is run
	Then the output should be "<output>"

Examples:
| input | output |
| 10*2	|	20	 |
| 2*2	|   4	 |
| 0*2	|   0	 |