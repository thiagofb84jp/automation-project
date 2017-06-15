When(/^I select the fields departure and return in a specific period$/) do
  select 'July', :from => 'departing'
  select 'July (next year)', :from => 'returning'
  click_button 'Search'

  expect(page).to have_content 'Sorry, there are no more seats available.'

  click_link_or_button 'Back'

  #July -> December (next year)
  select 'July', :from => 'departing'
  select 'December (next year)', :from => 'returning'
  click_button 'Search'

  expect(page).to have_content 'Sorry, there are no more seats available.'

  click_link_or_button 'Back' 

  #July -> July (two years from now)
  select 'July', :from => 'departing'
  select 'July (two years from now)', :from => 'returning'
  click_button 'Search'

  expect(page).to have_content 'Sorry, there are no more seats available.'

  click_link_or_button 'Back'

  #July -> December (two years from now)
  select 'July', :from => 'departing'
  select 'December (two years from now)', :from => 'returning'
  click_button 'Search'

  expect(page).to have_content 'Seats available!'
  expect(page).to have_content 'Call now on 0800 MARSAIR to book!'

  click_link_or_button 'Back'
end

Then(/^I should see the results of my search informing if there are seats avaliable or not$/) do
  expect(page).to have_content 'Welcome to MarsAir!'
  expect(page).to have_content 'Book a ticket to the red planet now!'
end
