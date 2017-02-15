Feature: Input Comment
As a blog visitor
I can input comment onto blog

Scenario: Input Comment
	Given there is a post titled with "Dummy post" and content with "Dummy content"
	And I am on the post page
	When I add a comment with the following information
		| Name  |  		Email 	   |    Content   |
		| Wayne |  admin@wayne.com | Test Comment |
    Then I can see the comment has been added onto the post		