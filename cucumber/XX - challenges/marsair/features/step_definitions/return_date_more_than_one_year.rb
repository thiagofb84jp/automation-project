When(/^I search for dates when return is more than one year$/) do
  select 'July', :from => 'departing'
  select 'December (next year)', :from => 'returning'
  click_button 'Search'
end

Then(/^I should allow search returning a message informing seats avaliability$/) do
  expect(page).to have_content 'Sorry, there are no more seats available.'
  click_link_or_button 'Back'
end