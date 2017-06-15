Then(/^I should see a user home page$/) do
  expect(page).to have_content 'Welcome to MarsAir!'
end