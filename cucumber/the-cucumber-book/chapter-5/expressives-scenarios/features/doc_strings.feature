Feature: Doc Strings

	Scenario: Ban Unscrupulous Users
		When I behave unscrupulous
		Then I should receive an email containing:
			"""
			Dear Sir,

			Your account privileges have been revoked due to your unscrupulous behavior.

			Sincerely,
			The Manager.
			"""
		And my account should be locked