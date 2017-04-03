Given(/^I am on Amazon Homepage$/) do
 	visit 'http://www.amazon.com'
end

When(/^I enter "([^"]*)" in the search box$/) do |keywords|
 	fill_in "twotabsearchtextbox", :with => 'Baseball Gloves'
 	page.save_screenshot '/home/thiago/screenshot/screenshot.png'
 	Launchy.open '/home/thiago/screenshot/screenshot.png'
end

When(/^I click "([^"]*)" button$/) do |arg1|
  	click_button "Go"
end

Then(/^I should see a list of results related with Baseball Gloves$/) do
  	#page.should have_content ("#centerBelow")
  	page.save_screenshot('/home/thiago/screenshot/search_result.png')
  	Launchy.open '/home/thiago/screenshot/search_result.png'
end