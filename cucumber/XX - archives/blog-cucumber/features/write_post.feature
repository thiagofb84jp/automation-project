Feature: Write Blog
		 As a blog owner
		 I can write new blog post

Scenario: Write Blog
	Given I am on the blog homepage
	When I click "New Post" link
	And I fill "Post Name" as Name
	And I fill "My First Blog" as Title
	And I fill "Test content" as content
	And I click "Post" button
	Then I should see the blog I just posted