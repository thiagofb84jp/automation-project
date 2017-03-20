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

When(/^I click create book button$/) do
  click_button 'Create Book'
end

Then(/^I should see the book that I just added$/) do
  expect(page).to have_content (@title)
  expect(page).to have_content (@subtitle)
  expect(page).to have_content (@author)
  expect(page).to have_content (@pages)
end

Given(/^I am on the add genre page$/) do
  visit 'http://localhost:3000/home/index'
  click_link_or_button 'Genres'
end

Given(/^I click on new genre button$/) do
  click_link_or_button 'New Genre'
end

When(/^I fill "([^"]*)" as Genre$/) do |genre|
  @genre = genre
  fill_in 'genre_name', :with => genre
end

When(/^I click create genre button$/) do
  click_link_or_button 'Create Genre'
end

Then(/^I should see the genre that I just added$/) do
  expect(page).to have_content (@genre)
end

Given(/^I am on the add kind page$/) do
  visit 'http://localhost:3000/home/index'
  click_link_or_button 'Kinds'
end

Given(/^I click on new kind button$/) do
  click_link_or_button 'New Kind'
end

When(/^I fill "([^"]*)" as Kind$/) do |kind|
  @kind = kind
  fill_in 'kind_name', :with => kind
end

When(/^I click create kind button$/) do
  click_link_or_button 'Create Kind'
end

Then(/^I should see the kind that I just added$/) do
  expect(page).to have_content (@kind)
end

Given(/^I am on the add publishing page$/) do
  visit 'http://localhost:3000/home/index'
  click_link_or_button 'Publishings'
end

Given(/^I click on new publishing button$/) do
  click_link_or_button 'New Publishing'
end

When(/^I fill "([^"]*)" as Publishing$/) do |publishing|
  @publishing = publishing
  fill_in 'publishing_name', :with => publishing
end

When(/^I click create publishing button$/) do
  click_link_or_button 'Create Publishing'
end

Then(/^I should see the publishing that I just added$/) do
  expect(page).to have_content (@publishing)
end