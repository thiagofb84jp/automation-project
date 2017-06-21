Given(/^I acess a Test Site for Selenium Recipes home page$/) do
  visit 'file:///media/thiago/9414FF9714FF7B16/projetos-automacao/selenium-webdriver/site/index.html'
end

When(/^I click in Hyperlink home page$/) do
  click_link_or_button 'Hyperlink'
end