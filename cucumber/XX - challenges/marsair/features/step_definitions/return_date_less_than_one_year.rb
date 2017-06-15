When(/^I search for dates when return is less than one year$/) do
  select 'July', :from => 'departing'
  select 'December', :from => 'returning'
  click_button 'Search'
end

Then(/^I should see a message informing this schedule is not possible$/) do
  expect(page).to have_content 'Unfortunately, this schedule is not possible. Please try again.'
  click_link_or_button 'Back'
end