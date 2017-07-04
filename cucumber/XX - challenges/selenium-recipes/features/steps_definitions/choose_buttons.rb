When(/^I choose the Choose Firefox$/) do
  click_button 'choose_firefox_btn'
end

Then(/^I see the following message: You choose a Firefox Browser! Congratulations!$/) do
  expect(page).to have_content ("You choose a Firefox Browser! Congratulations!")
end

When(/^I choose the Choose Chrome$/) do
  click_button 'choose_chrome_btn'
end

Then(/^I see the following message: You choose a Chrome Browser! Congratulations!$/) do
  expect(page).to have_content ("You choose a Chrome Browser! Congratulations!")
end

When(/^I choose the Choose Internet Explorer$/) do
  click_button 'choose_ie_btn'
end

Then(/^I see the following message: You choose a IE Browser! Congratulations!$/) do
  expect(page).to have_content ("You choose a IE Browser! Congratulations!")
end

When(/^I choose the Choose Opera$/) do
  click_button 'choose_opera_btn'
end

Then(/^I see the following message: You choose a Opera Browser! Congratulations!$/) do
  expect(page).to have_content ("You choose a Opera Browser! Congratulations!")
end

When(/^I choose the Choose Safari$/) do
  click_button 'choose_safari_btn'
end

Then(/^I see the following message: You choose a Safari Browser! Congratulations!$/) do
  expect(page).to have_content ("You choose a Safari Browser! Congratulations!")
end