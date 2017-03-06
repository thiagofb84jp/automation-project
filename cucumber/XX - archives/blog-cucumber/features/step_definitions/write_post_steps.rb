When(/^I click "([^"]*)" link$/) do |arg1|
	click_on "New Post"
end

#@name = função de capturar a descrição informada entre aspas ("") no corpo da feature
When(/^I fill "([^"]*)" as Name$/) do |name|
	@name = name
	fill_in "Name", :with => name
end

#@name = função de capturar a descrição informada entre aspas ("") no corpo da feature
When(/^I fill "([^"]*)" as Title$/) do |title|
  	@title = title
  	fill_in "Title", :with => title
end

When(/^I fill "([^"]*)" as content$/) do |content|
  	fill_in "Content", :with => content
end

When(/^I click "([^"]*)" button$/) do |btn|
  	click_button btn
end

#Ao final, verifique se as respectivas descrições (@name e @title) são encontradas no site
Then(/^I should see the blog I just posted$/) do
  	expect(page).to have_content (@name)
  	expect(page).to have_content (@title)
end