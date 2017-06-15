When(/^I have a valid promotional code$/) do
  fill_in 'promotional_code', :with => 'AB7-CDE-119'
  click_button 'Search'
end

Then(/^I should see a discount in final value of my plane tickets$/) do
  page.save_screenshot ('/home/thiago/Dropbox/desafio-thoughtworks/marsair/promotional_codes/screenshot/valid_promo_png')

  msg_valid_promo_code = 'Promotional code AB7-CDE-119 used: 70% discount!'
  expect(page).to have_content msg_valid_promo_code

  #sleep 5

  #save_and_open_page
  Launchy.open ('/home/thiago/Dropbox/desafio-thoughtworks/marsair/promotional_codes/screenshot/valid_promo_png')
end
