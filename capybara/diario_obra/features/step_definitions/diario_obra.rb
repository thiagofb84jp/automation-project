Given(/^I am on the Intranet page$/) do
  visit 'https://dev.control.eng.br/acessos'
end

When(/^I fill in "([^"]*)" and "([^"]*)" with assistent user$/) do |usuario_login, usuario_senha|
  fill_in 'usuario_login', :with => 'poliana.monte'
  fill_in 'usuario_senha', :with => ''
  click_button 'submit_login'
end

When(/^I am on the Desvio de Obra and add new Desvio without Concessionaria$/) do
  visit 'https://dev.control.eng.br/desvios/new'
end

When(/^I fill in "([^"]*)" and "([^"]*)"$/) do |desvio_descricao, desvio_contrato_id|
  fill_in 'desvio_descricao', :with => 'DESVIO DE OBRA PARA CEPISA'
  select 'CEPISA', :from => 'desvio_contrato_id'
  find(:xpath, '//*[@id="main"]/div[1]/div[2]/div/form/div[4]/button').click
end

Then(/^I should see sucess page with register Desvio without Concessionaria$/) do
  expect(page).to have_content 'Desvio criado com sucesso.'  
end
