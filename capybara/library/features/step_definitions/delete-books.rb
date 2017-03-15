Given(/^I am the books home page and there is book titled with "([^"]*)" and subtitle with "([^"]*)"$/) do |title, subtitle|
  visit 'http://localhost:3000/home/index'
  click_link_or_button 'Books'

When(/^I select a book titled "([^"]*)" and subtitle with "([^"]*)" and click "([^"]*)"$/) do |title, subtitle, destroy|
  @title = title
  @subtitle = subtitle
  @destroy = destroy

  click_on 'Destroy'
end

Then(/^I should be the register deleted$/) do
  pending # Write code here that turns the phrase above into concrete actions
end
