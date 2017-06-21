When(/^I see the Recommend Selenium home page$/) do
  click_link_or_button 'Recommend Selenium'
end

Then(/^I see the message informing that This is Selenium Page$/) do
  expect(page).to have_content("This is Selenium Page")
end

When(/^I see the Recommend Cucumber home page$/) do
  click_link_or_button 'Recommend Cucumber'
end

Then(/^I see the message informing that This is Cucumber Page$/) do
  expect(page).to have_content("This is Cucumber Page")
end

When(/^I see the Recommend Ruby on Rails home page$/) do
  click_link_or_button 'Recommend Ruby on Rails'
end

Then(/^I see the message informing that This is Ruby on Rails Page$/) do
  expect(page).to have_content("This is Ruby on Rails Page")
end

When(/^I see the Recommend Java home page$/) do
  click_link_or_button 'Recommend Java'
end

Then(/^I see the message informing that This is Java Page$/) do
  expect(page).to have_content("This is Java Page")
end

When(/^I see the Recommend C\# home page$/) do
  click_link_or_button 'Recommend C#'
end

Then(/^I see the message informing that This is C\# Page$/) do
  expect(page).to have_content("This is C# Page")
end