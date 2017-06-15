Given(/^I am on the book a ticket page$/) do
  visit 'http://thiagoferreira.marsair.tw/'
end

When(/^performing a search for tickets$/) do
  expect(page).to have_content 'Welcome to MarsAir!'
  expect(page).to have_content 'Book a ticket to the red planet now!'
end

Then(/^I should see "([^"]*)" somewhere on the page$/) do |arg1|
  expect(page).to have_content 'Book a ticket to the red planet now!'
end

When(/^performing a search for tickets and click on a specific description$/) do
  #Obs: Este passo resultará em falha porque ainda não foi implementado o link em cima da descrição
  click_link_or_button 'Book a ticket to the red planet now!'
end

Then(/^I should see a user home page$/) do
  expect(page).to have_content 'Welcome to MarsAir!'
end

When(/^I click on the logo of home page$/) do
  click_link_or_button 'MarsAir'
end