#Initial page acess
Given(/^I am on the Intranet page$/) do
  visit 'https://dev.control.eng.br/acessos'
end

When(/^I fill in "([^"]*)" and "([^"]*)" with valid user$/) do |usuario_login, usuario_senha|
  fill_in 'usuario_login', :with => 'thiago.barbosa'
  fill_in 'usuario_senha', :with => ''
  click_button 'submit_login'
end

Then(/^I should see initial page the user$/) do
  expect(page).to have_content 'thiago.barbosa'
end

When(/^I fill in "([^"]*)" and "([^"]*)" with invalid user$/) do |usuario_login, usuario_senha|
  fill_in 'usuario_login', :with => 'maria.antonia'
  fill_in 'usuario_senha', :with => ''
  click_button 'submit_login'
end

Then(/^I should see fail message$/) do
  expect(page).to have_content 'LOGIN E/OU SENHAS INVÁLIDO(S)'
end

When(/^I fill in "([^"]*)" and "([^"]*)" with empty fields$/) do |usuario_login, usuario_senha|
  fill_in 'usuario_login', :with => ''
  fill_in 'usuario_senha', :with => ''
  click_button 'submit_login'
end

Then(/^I should see fail message about the fill with empty fields$/) do
  expect(page).to have_content 'LOGIN E/OU SENHAS INVÁLIDO(S)'
end

When(/^I fill "([^"]*)" without login user$/) do |usuario_senha|
  fill_in 'usuario_login', :with => ''
  fill_in 'usuario_senha', :with => '12345'
  click_button 'submit_login'
end

Then(/^I should see fail message the fill senha without login$/) do
  expect(page).to have_content 'LOGIN E/OU SENHAS INVÁLIDO(S)'
end
