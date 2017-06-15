Given(/^I am on the book a ticket page$/) do
  visit 'http://thiagoferreira.marsair.tw/'
end

When(/^I am looking for tickets$/) do
  expect(page).to have_content 'Welcome to MarsAir!'
end