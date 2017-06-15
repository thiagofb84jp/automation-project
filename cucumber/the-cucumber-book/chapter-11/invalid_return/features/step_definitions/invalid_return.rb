Given(/^I am on the book a ticket page$/) do
  visit 'http://thiagoferreira.marsair.tw/'
end

When(/^I search for dates when return is less than (\d+) year$/) do |arg1|
  select 'July', :from => 'departing'
  select 'December', :from => 'returning'
  click_button 'Search'
  click_link_or_button 'Back'

  select 'December', :from => 'departing'
  select 'July (next year)', :from => 'returning'
  click_button 'Search'
  click_link_or_button 'Back'

  select 'July (next year)', :from => 'departing'
  select 'December (next year)', :from => 'returning'
  click_button 'Search'
  click_link_or_button 'Back'

  select 'December (next year)', :from => 'departing'
  select 'July (two years from now)', :from => 'returning'
  click_button 'Search'
  click_link_or_button 'Back'

  select 'July (two years from now)', :from => 'departing'
  select 'December (two years from now)', :from => 'returning'
  click_button 'Search'
  #click_link_or_button 'Back'
end

Then(/^I should see a message informing this schedule is not possible$/) do
  expect(page).to have_content 'Unfortunately, this schedule is not possible. Please try again.'
end

When(/^I search for dates when return is more than (\d+) year$/) do |arg1|
  select 'July', :from => 'departing'
  select 'July (next year)', :from => 'returning'
  click_button 'Search'
  click_link_or_button 'Back'

  select 'July', :from => 'departing'
  select 'December (next year)', :from => 'returning'
  click_button 'Search'
  click_link_or_button 'Back'

  select 'July', :from => 'departing'
  select 'July (two years from now)', :from => 'returning'
  click_button 'Search'
  click_link_or_button 'Back'

  select 'December', :from => 'departing'
  select 'December (next year)', :from => 'returning'
  click_button 'Search' 
  click_link_or_button 'Back'

  select 'December', :from => 'departing'
  select 'July (two years from now)', :from => 'returning'
  click_button 'Search'
  click_link_or_button 'Back'

  select 'December', :from => 'departing'
  select 'December (two years from now)', :from => 'returning'
  click_button 'Search'
  #click_link_or_button 'Back'
end

Then(/^I should allow search returning a message informing seats avaliability$/) do
  expect(page).to have_content 'Sorry, there are no more seats available.'
end