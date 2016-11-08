Given(/^I am on the Intranet page$/) do
  visit 'https://dev.control.eng.br/acessos'
end

When(/^I fill in "([^"]*)" and "([^"]*)" with SIGO user$/) do |arg1, arg2|
  fill_in 'usuario_login', :with => 'thiago.barbosa'
  fill_in 'usuario_senha', :with => ''
  click_button 'submit_login'
end

When(/^I go on Diario de Obra page$/) do
  click_link_or_button 'SIGO'
  click_on 'm_44'
end

Then(/^I should see all registers about Diario de Obra$/) do
  expect(page).to have_content 'Diarios de Obras'
end

When(/^I go on Transporte de Materiais page$/) do
  click_link_or_button 'SIGO'
  click_on 'm_45'
end

Then(/^I should see all registers about Transporte de Materiais$/) do
  expect(page).to have_content 'Transportes de Materiais'
end

When(/^I go on Obras de Contrato page$/) do
  click_link_or_button 'SIGO'
  click_link_or_button 'Obras'
  click_on 'm_46'
end

Then(/^I should see all registers about Obras de Contrato$/) do
  expect(page).to have_content 'Obras Cadastradas'
end

When(/^I go on Materiais de Contrato page$/) do
  click_link_or_button 'SIGO'
  click_link_or_button 'Obras'
  click_on 'm_47'
end

Then(/^I should see all registers about Materiais de Contrato$/) do
  expect(page).to have_content 'Materiais'
end

When(/^I go on Tipos de Estruturas page$/) do 
  click_link_or_button 'SIGO'
  click_link_or_button 'Obras'
  click_on 'm_48'
end

Then(/^I should see all registers about Tipos de Estruturas$/) do
  expect(page).to have_content 'Tipos de Estruturas'
end

When(/^I go on Estruturas de Obras page$/) do
  click_link_or_button 'SIGO'
  click_link_or_button 'Obras'
  click_on 'm_49'
end

Then(/^I should see all registers about Estruturas de Obras$/) do
  expect(page).to have_content 'Estrutura de Obras'
end

When(/^I go on Incidentes de Obras page$/) do
  click_link_or_button 'SIGO'
  click_link_or_button 'Obras'
  click_on 'm_50'
end

Then(/^I should see all registers about Incidentes de Obras$/) do
  expect(page).to have_content 'Todos Desvios'
end

When(/^I go on Grupos de Faturamento\/Serviços page$/) do
  click_link_or_button 'SIGO'
  click_link_or_button 'Serviços'
  click_on 'm_51'
end

Then(/^I should see all registers about Grupos de Faturamento\/Serviços$/) do
  expect(page).to have_content 'Todos Grupos de Faturamentos'
end

When(/^I go on Servicos de Faturamento page$/) do
  click_link_or_button 'SIGO'
  click_link_or_button 'Serviços'
  click_on 'm_52'
end

Then(/^I should see all registers about Servicos de Faturamento$/) do
  expect(page).to have_content 'Todos Serviços Faturamentos'
end

When(/^I go on Grupo de Mercadoria page$/) do
  click_link_or_button 'SIGO'
  click_link_or_button 'Serviços'
  click_on 'm_53'
end

Then(/^I should see all registers about Grupo de Mercadoria$/) do
  expect(page).to have_content 'Todos Grupo Mercadorias'
end

When(/^I go on Tipo de Servico page$/) do
  click_link_or_button 'SIGO'
  click_link_or_button 'Serviços'
  click_on 'm_54'
end

Then(/^I should see all registers about Tipo de Servico$/) do
  expect(page).to have_content 'Todos Tipos Ordens de Serviços'
end

When(/^I go on Tipo de Equipe page$/) do
  click_link_or_button 'SIGO'
  click_link_or_button 'Equipe'
  click_on 'm_55'
end

Then(/^I should see all registers about Tipo de Equipe$/) do
  expect(page).to have_content 'Tipos de Equipes'
end

When(/^I go on Equipe de Trabalho page$/) do
  click_link_or_button 'SIGO'
  click_link_or_button 'Equipe'
  click_on 'm_56'
end

Then(/^I should see all registers about Equipe de Trabalho$/) do
  expect(page).to have_content 'Todos Equipes'
end

When(/^I go on Horario page$/) do
  click_link_or_button 'SIGO'
  click_link_or_button 'Equipe'
  click_on 'm_57'
end

Then(/^I should see all registers about Horario$/) do
  expect(page).to have_content 'Todos Horarios'
end

When(/^I go on Relatorio page$/) do
  click_link_or_button 'SIGO'
  click_on 'm_58'
end

Then(/^I should see all registers about Relatorio$/) do
  expect(page).to have_content 'Relatório SIGO'
end
