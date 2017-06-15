When(/^I select the field departure$/) do
  select 'July', :from => 'departing'
end

When(/^I select the field return in a period that there are seats$/) do
  select 'December (two years from now)', :from => 'returning'
end

When(/^I click in the button to make a search$/) do
  click_button 'Search'
end

Then(/^I should see a message informing seats are avaliable$/) do
  expect(page).to have_content 'Seats available!'
  expect(page).to have_content 'Call now on 0800 MARSAIR to book!'
end