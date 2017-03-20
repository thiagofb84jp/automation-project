Given(/^I am the library home page$/) do
  visit 'http://localhost:3000/home/index'
end

When(/^I am the books home page$/) do
  click_link_or_button 'Books'
end

Then(/^I see the following fields: "([^"]*)", "([^"]*)", "([^"]*)", "([^"]*)"$/) do |title, subtitle, author, pages|
  @title = title
  @subtitle = subtitle
  @author = author
  @pages = pages

  expect(page).to have_content (@title)
  expect(page).to have_content (@subtitle)
  expect(page).to have_content (@author)
  expect(page).to have_content (@pages)
end