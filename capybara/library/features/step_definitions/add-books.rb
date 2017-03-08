Given(/^I am on the add book page$/) do
  visit 'http://localhost:3000/home/index'
  click_link_or_button 'Books'
end

Given(/^I click on new book button$/) do
  click_link_or_button 'New Book'
end

When(/^I fill "([^"]*)" as Title$/) do |title|
  @title = title
  fill_in 'book_title', :with => title
end

When(/^I fill "([^"]*)" as Subtitle$/) do |subtitle|
  @subtitle = subtitle
  fill_in 'book_subtitle', :with => subtitle
end

When(/^I fill "([^"]*)" as Author$/) do |author|
  @author = author
  fill_in 'book_author', :with => author
end

When(/^I fill "([^"]*)" as Pages$/) do |pages|
  @pages = pages
  fill_in 'book_pages', :with => pages
end

When(/^I click "([^"]*)" button$/) do |arg1|
  click_button 'Create Book'
end

Then(/^I should see the book that I just added$/) do
  expect(page).to have_content (@title)
  expect(page).to have_content (@subtitle)
  expect(page).to have_content (@author)
  expect(page).to have_content (@pages)
end