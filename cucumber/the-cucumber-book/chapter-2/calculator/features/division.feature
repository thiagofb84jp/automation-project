Feature: Dividing


#Scenario: Division by two numbers
#	Given the input "10/2"
#	When the calculator is run
#	Then the output should be "5"

Scenario Outline: Division by two numbers
	Given the input "<input>"
	When the calculator is run
	Then the output should be "<output>"

Examples:
| input | output |
| 10/2	|	5	 |
| 2/2	|   1	 |
| 0/2	|   0	 |