Given(/^I am on the book a ticket page$/) do
  visit 'http://thiagoferreira.marsair.tw/'  
end

When(/^I am looking for tickets$/) do
  select 'July', :from => 'departing'
  select 'December (two years from now)', :from => 'returning'
end