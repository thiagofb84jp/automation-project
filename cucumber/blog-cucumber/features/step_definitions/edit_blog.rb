When(/^I edit this post$/) do
  visit(path_to "the edit page for post")
end

When(/^I update title to "([^"]*)" and content to "([^"]*)"$/) do |title, content|
 @updated_title = title
 @updated_content = content
 model!("post").update_attributes!({ :title => @updated_title, :content => @updated_content })
end

Then(/^I can see it has been updated$/) do
 step %{I am on the blog homepage}
 find("table##posts-list>tr:eq(2) >td:eq(1)").expect(page).to have_selector(@updated_title)
 find("table##posts-list>tr:eq(2) >td:eq(1)").expect(page).to have_selector(@updated_content)
end