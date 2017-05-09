Feature: Cash Withdrawal

	Scenario: Sucessful withdrawal from an account in credit
		Given I have deposited $100 in my account
		When I withdrawal $20
		Then $20 should be dispensed