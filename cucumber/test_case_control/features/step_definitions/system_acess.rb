Given(/^user acess initial page$/) do
  visit "https://intranet.control.eng.br/acessos"
end

When(/^insert valid "([^"]*)" and "([^"]*)"$/) do |usuario_login, usuario_senha|
  fill_in 'usuario_login', :with => 'thiago.barbosa'
  fill_in 'usuario_senha', :with => 'indra333'
  click_button 'submit_login'
end

Then(/^the user home page is displayed$/) do
  expect(page).to have_content 'thiago.barbosa'
end

When(/^insert wrong "([^"]*)" and "([^"]*)"$/) do |usuario_login, usuario_senha|
  fill_in 'usuario_login', :with => 'maria.antonia'
  fill_in 'usuario_senha', :with => '12345'
  click_button 'submit_login'
end

Then(/^the page show warning message$/) do
  expect(page).to have_content 'LOGIN E/OU SENHAS INVÁLIDO(S)'
end

When(/^insert valid "([^"]*)" and wrong "([^"]*)"$/) do |usuario_login, usuario_senha|
  fill_in 'usuario_login', :with => 'thiago.barbosa'
  fill_in 'usuario_senha', :with => '12345'
  click_button 'submit_login'
end

When(/^the fields "([^"]*)" and "([^"]*)" are empty$/) do |usuario_login, usuario_senha|
  fill_in 'usuario_login', :with => ''
  fill_in 'usuario_senha', :with => ''
  click_button 'submit_login'
end

When(/^not to insert "([^"]*)"$/) do |usuario_login|
  fill_in 'usuario_login', :with => 'thiago.barbosa'
  click_button 'submit_login'
end

Then(/^the page show warning page$/) do
  expect(page).to have_content 'LOGIN E/OU SENHAS INVÁLIDO(S)'
end

