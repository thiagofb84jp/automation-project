Given(/^I am on the Intranet page$/) do
  visit 'https://dev.control.eng.br/acessos'
end

When(/^I fill in "([^"]*)" and "([^"]*)" with SIGO user$/) do |arg1, arg2|
  fill_in 'usuario_login', :with => 'poliana.monte'
  fill_in 'usuario_senha', :with => ''
  click_button 'submit_login'
end

When(/^I am on the Diario de Obra page$/) do
  click_link_or_button 'SIGO'
  click_link_or_button 'Diário Obra'
end

Then(/^I should see all registers about Diario de Obra$/) do
  expect(page).to have_content 'Diarios de Obras'
end

When(/^I am on the Transporte de Materiais page$/) do
  click_link_or_button 'SIGO'
  click_link_or_button 'Transporte de Material'
end

Then(/^I should see all registers about Transporte de Materiais$/) do
  expect(page).to have_content 'Transportes de Materiais'
end

When(/^I am on the Obras de Contrato page$/) do
  pending # Write code here that turns the phrase above into concrete actions
end

Then(/^I should see all registers about Obras de Contrato$/) do
  pending # Write code here that turns the phrase above into concrete actions
end

When(/^I am on the Materiais de Contrato page$/) do
  pending # Write code here that turns the phrase above into concrete actions
end

Then(/^I should see all registers about Materiais de Contrato$/) do
  pending # Write code here that turns the phrase above into concrete actions
end
