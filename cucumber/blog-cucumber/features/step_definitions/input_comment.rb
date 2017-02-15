Given(/^there is a post titled with "([^"]*)" and content with "([^"]*)"$/) do |arg1, arg2|
  visit (post_path @post)
end

Given(/^I am on the post page$/) do
  pending # Write code here that turns the phrase above into concrete actions
end

When(/^I add a comment with the following information$/) do |table|
  # table is a Cucumber::MultilineArgument::DataTable
  table.hashes.each do |comment_data|
  	@commenter = comment_data[:name]
  	@email = comment_data[:email]
  	@content = comment_data[:content]
  	@post.comments.create!({ :name => @commenter, :email => @email, :content => @content})
  end
end

Then(/^I can see the comment has been added onto the post$/) do
  comment_list = find("div#comments-list")
  comments-list.expect(page).to have_content(@commenter)
  comments-list.expect(page).to have_content(@email)
  comments-list.expect(page).to have_content(@content)
end