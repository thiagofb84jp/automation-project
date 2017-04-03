Given(/^I am on the blog homepage$/) do
  visit ("/posts")
end

When(/^I click "([^"]*)" link$/) do |arg1|
  click_on "New Post"
end

When(/^I fill "([^"]*)" as Title$/) do |title|
  @title = title
  fill_in "Title", :with => title
end

When(/^I fill "([^"]*)" as content$/) do |content|
  fill_in "Content", :with => content
end

When(/^I click "([^"]*)" button$/) do |arg1|
  click_on "Create Post"
end

Then(/^I should see the blog I just posted$/) do
  #page.save_screenshot ('/media/thiagofb84jp/C65A52FB5A52E827/projetos-automacao/cucumber/blog/screenshots/sucess_page_png')
  expect(page).to have_content(@title)
  #Launchy.open ('/media/thiagofb84jp/C65A52FB5A52E827/projetos-automacao/cucumber/blog/screenshots/sucess_page_png')
end