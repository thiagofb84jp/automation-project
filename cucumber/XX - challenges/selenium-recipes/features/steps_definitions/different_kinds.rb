When(/^I click in Full Link$/) do
  click_link_or_button 'Full link'
end

Then(/^I see the message informing that it is a Full Link Page$/) do
  expect(page).to have_title("Full Link Page")
end

When(/^I click in Partial Link$/) do
  click_link_or_button 'Partial link'
end

Then(/^I see the message informing that it is a Partial Link Page$/) do
  expect(page).to have_title("Partial Link Page")
end

When(/^I click in Another Partial Link$/) do
  click_link_or_button 'Another Partial link Text'
end

Then(/^I see the message informing that it is a Another Partial Link$/) do
  expect(page).to have_title("Another Partial Link")
end

When(/^I click in Link New Other Door Page$/) do
  click_link_or_button 'Link New Other Door'
end

Then(/^I see the message informing that it is a Link New Other Door Page$/) do
  expect(page).to have_title("Link New Other Door Page")
end