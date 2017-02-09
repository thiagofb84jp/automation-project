Feature: Edit Blog
		 As a blog owner
		 I can edit my blog posts

#Scenario: Edit Blog
#	Given a post exists with title: "Dummy post", content: "Dummy content"
#   When I am on the post's page
#   And I update title to "Updated title" and content to "Updated content"
#   Then I can see it has been updated

Scenario: Edit Blog
	Given there is a post with title "Dummy post" and content "Dummy content"
	And I am on the blog homepage
	When I edit this post
	And I update title to "Updated title" and content to "Updated content"
	Then I can see it has been updated