Then(/^I should see a description 'Book a ticket to the red planet now!' somewhere on the page$/) do
  expect(page).to have_content 'Book a ticket to the red planet now!'
end