Feature: Robot Emotions


	Scenario: Tickle a grumpy robot
		Given I am in a bad mood
		When you tickle me
		Then I will grumpy

	Scenario: Tickle a happy robot
		Given I am in a good mood
		When you tickle me
		Then I will giggle

	Scenario: Attack a happy robot
		Given I am in a good mood
		When you kick me in the shins
		Then I will angry