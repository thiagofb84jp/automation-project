Given(/^I am on the Youtube home page$/) do
   visit 'http://www.youtube.com'
end

When(/^I search for "(.*?)"$/) do |search_term|
   fill_in 'search_query', :with => search_term
   click_on 'search-btn'
   sleep 5
end

Then(/^videos of capybaras are returned$/) do
   expect(page).to have_content 'Making Friends'
end
