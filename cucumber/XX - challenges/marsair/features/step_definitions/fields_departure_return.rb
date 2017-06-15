Then(/^I should see the fields have related on a search form$/) do
  expect(page).to have_content 'Departing'
  expect(page).to have_content 'Returning'
  expect(page).to have_content 'Promotional Code'
end