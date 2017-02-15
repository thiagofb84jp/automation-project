Feature: Edit Blog
As a blog owner
I can edit my blog posts

Scenario: Edit Blog
Given there is a post with title "Dummy Post" and content "Dummy Content"
And I am on the blog homepage
When I edit this post
And I update title to "Updated Title" and content to "Update Content"
Then I can see it has been updated