Given(/^I am on the book a ticket page$/) do
  visit 'http://thiagoferreira.marsair.tw/'  
end

When(/^I search for tickets and I have a valid promotional code$/) do
  select 'July', :from => 'departing'
  select 'December (two years from now)', :from => 'returning'
  fill_in 'promotional_code', :with => 'AB7-CDE-119'
  click_button 'Search'
end

Then(/^I should see the message informing that promotional code is valid and make discount$/) do
  page.save_screenshot ('/home/thiago/Dropbox/desafio-thoughtworks/marsair/promotional_codes/screenshot/valid_promo_png')

  msg_valid_promo_code = 'Promotional code AB7-CDE-119 used: 70% discount!'
  expect(page).to have_content msg_valid_promo_code

  #sleep 5

  #save_and_open_page
  Launchy.open ('/home/thiago/Dropbox/desafio-thoughtworks/marsair/promotional_codes/screenshot/valid_promo_png')
end

When(/^I search for tickets and I have a invalid promotional code$/) do
  select 'July', :from => 'departing'
  select 'December (two years from now)', :from => 'returning'
  fill_in 'promotional_code', :with => 'AF3-FJK-415'
  click_button 'Search'
end

Then(/^I should see the message informing that promotional code is invalid and do not make a discount$/) do
  page.save_screenshot ('/home/thiago/Dropbox/desafio-thoughtworks/marsair/promotional_codes/screenshot/invalid_promo_png')

  msg_invalid_promo_code = 'Sorry, code AF3-FJK-415 is not valid'
  expect(page).to have_content msg_invalid_promo_code

  #sleep 5

  #save_and_open_page
  Launchy.open ('/home/thiago/Dropbox/desafio-thoughtworks/marsair/promotional_codes/screenshot/invalid_promo_png')
end