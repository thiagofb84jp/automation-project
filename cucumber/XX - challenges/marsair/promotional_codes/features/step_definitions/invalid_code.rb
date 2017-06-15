When(/^I have a invalid promotional code$/) do
  fill_in 'promotional_code', :with => 'AF3-FJK-415'
  click_button 'Search'
end

Then(/^I should see a message informing that promotional code is invalid and will not be made a discount$/) do
  page.save_screenshot ('/home/thiago/Dropbox/desafio-thoughtworks/marsair/promotional_codes/screenshot/invalid_promo_png')

  msg_invalid_promo_code = 'Sorry, code AF3-FJK-415 is not valid'
  expect(page).to have_content msg_invalid_promo_code

  #sleep 5

  #save_and_open_page
  Launchy.open ('/home/thiago/Dropbox/desafio-thoughtworks/marsair/promotional_codes/screenshot/invalid_promo_png')
end