Given(/^I am on the Intranet page$/) do
  visit 'https://dev.control.eng.br/acessos'
end

When(/^I fill in "([^"]*)" and "([^"]*)" with SIGO user$/) do |arg1, arg2|
  fill_in 'usuario_login', :with => 'thiago.barbosa'
  fill_in 'usuario_senha', :with => ''
  click_button 'submit_login'
end

When(/^I go on Ordem de Serviço page$/) do
  click_link_or_button 'SIGEC'
  click_on 'm_10'
end

Then(/^I should see all registers about Ordem de Serviço$/) do
  expect(page).to have_content 'Registrar Ordem de Serviço'
end

When(/^I go on Desvios de Equipe page$/) do
  click_link_or_button 'SIGEC'
  click_on 'm_11'
end

Then(/^I should see all registers about Desvios de Equipe$/) do
  expect(page).to have_content 'Todos Desvios de Equipe'
end

When(/^I go on Glosa e Crédito page$/) do
  click_link_or_button 'SIGEC'
  click_on 'm_12'
end

Then(/^I should see all registers about Glosa e Crédito$/) do
  expect(page).to have_content 'Todos Glosas e Crédito'
end

When(/^I go on Contratos page$/) do
  click_link_or_button 'SIGEC'
  click_link_or_button 'Contratos'
  click_on 'm_13'
end

Then(/^I should see all registers about Contratos$/) do
  expect(page).to have_content 'Centro de Custos (Tomador)'
end

When(/^I go on Regional page$/) do
  click_link_or_button 'SIGEC'
  click_link_or_button 'Contratos'
  click_on 'm_14'
end

Then(/^I should see all registers about Regional$/) do
  expect(page).to have_content 'Todos Regionais'
end

When(/^I go on Polo page$/) do
  click_link_or_button 'SIGEC'
  click_link_or_button 'Contratos'
  click_on 'm_15'
end

Then(/^I should see all registers about Polo$/) do
  expect(page).to have_content 'Todos Polos'
end

When(/^I go on Cidade page$/) do
  click_link_or_button 'SIGEC'
  click_link_or_button 'Contratos'
  click_on 'm_16'
end

Then(/^I should see all registers about Cidade$/) do
  expect(page).to have_content 'Todas as Cidades'
end

When(/^I go on Horário page$/) do
  click_link_or_button 'SIGEC'
  click_link_or_button 'Equipes'
  click_on 'm_17'
end

Then(/^I should see all registers about Horário$/) do
  expect(page).to have_content 'Todos Horarios'
end

When(/^I go on Sobreaviso\/Emerg\.\/H page$/) do
  click_link_or_button 'SIGEC'
  click_link_or_button 'Equipes'
  click_on 'm_18'
end

Then(/^I should see all registers about Sobreaviso\/Emerg\.\/HH$/) do
  pending # Write code here that turns the phrase above into concrete actions
end

When(/^I go on Tipo de Serviço de Equipe page$/) do
  click_link_or_button 'SIGEC'
  click_link_or_button 'Equipes'
  click_on 'm_19'
end

Then(/^I should see all registers about Tipo de Serviço de Equipe$/) do
  pending # Write code here that turns the phrase above into concrete actions
end

When(/^I go on Tipo de Equipe page$/) do
  click_link_or_button 'SIGEC'
  click_link_or_button 'Equipes'
  click_on 'm_20'
end

Then(/^I should see all registers about Tipo de Equipe$/) do
  pending # Write code here that turns the phrase above into concrete actions
end

When(/^I go on Equipes de Trabalho page$/) do
  click_link_or_button 'SIGEC'
  click_link_or_button 'Equipes'
  click_on 'm_21'
end

Then(/^I should see all registers about Equipes de Trabalho$/) do
  pending # Write code here that turns the phrase above into concrete actions
end

When(/^I go on Serviços de Contrato page$/) do
  click_link_or_button 'SIGEC'
  click_link_or_button 'Serviços'
  click_on 'm_22'
end

Then(/^I should see all registers about Serviços de Contrato$/) do
  pending # Write code here that turns the phrase above into concrete actions
end

When(/^I go on Grupo Faturamento page$/) do
  click_link_or_button 'SIGEC'
  click_link_or_button 'Serviços'
  click_on 'm_23'
end

Then(/^I should see all registers about Grupo Faturamento$/) do
  pending # Write code here that turns the phrase above into concrete actions
end

When(/^I go on Tipo de OS page$/) do
  click_link_or_button 'SIGEC'
  click_link_or_button 'Serviços'
  click_on 'm_24'
end

Then(/^I should see all registers about Tipo de OS$/) do
  pending # Write code here that turns the phrase above into concrete actions
end

When(/^I go on Serviços Faturamento page$/) do
  click_link_or_button 'SIGEC'
  click_link_or_button 'Serviços'
  click_on 'm_25'
end

Then(/^I should see all registers about Serviços Faturamento$/) do
  pending # Write code here that turns the phrase above into concrete actions
end

When(/^I go on Motivos de Desvio page$/) do
  click_link_or_button 'SIGEC'
  click_link_or_button 'Serviços'
  click_on 'm_26'
end

Then(/^I should see all registers about Motivos de Desvio$/) do
  pending # Write code here that turns the phrase above into concrete actions
end

When(/^I go on Grupos de Mercadoria page$/) do
  click_link_or_button 'SIGEC'
  click_link_or_button 'Serviços'
  click_on 'm_27'
end

Then(/^I should see all registers about Grupos de Mercadoria$/) do
  pending # Write code here that turns the phrase above into concrete actions
end

When(/^I go on Grupos de APR page$/) do
  click_link_or_button 'SIGEC'
  click_link_or_button 'Serviços'
  click_on 'm_28'
end

Then(/^I should see all registers about Grupos de APR$/) do
  pending # Write code here that turns the phrase above into concrete actions
end

When(/^I go on Atividades de APR page$/) do
  click_link_or_button 'SIGEC'
  click_link_or_button 'Serviços'
  click_on 'm_29'
end

Then(/^I should see all registers about Atividades de APR$/) do
  pending # Write code here that turns the phrase above into concrete actions
end

When(/^I go on Medidas de APR page$/) do
  click_link_or_button 'SIGEC'
  click_link_or_button 'Serviços'
  click_on 'm_30'
end

Then(/^I should see all registers about Medidas de APR$/) do
  pending # Write code here that turns the phrase above into concrete actions
end

When(/^I go on Grupos de EPI\/EPC page$/) do
  click_link_or_button 'SIGEC'
  click_link_or_button 'Serviços'
  click_on 'm_31'
end

Then(/^I should see all registers about Grupos de EPI\/EPC$/) do
  pending # Write code here that turns the phrase above into concrete actions
end

When(/^I go on Grupo de Faturamento Opcional page$/) do
  click_link_or_button 'SIGEC'
  click_link_or_button 'Serviços'
  click_on 'm_31'
end

Then(/^I should see all registers about Grupo de Faturamento Opcional$/) do
  pending # Write code here that turns the phrase above into concrete actions
end

When(/^I go on Relatório page$/) do
  click_link_or_button 'SIGEC'
  click_link_or_button 'Serviços'
  click_on 'm_32'
end

Then(/^I should see all registers about Relatório$/) do
'Relatório SIGEC'
end

When(/^I go on Ordem Serviço Despacho page$/) do
  click_link_or_button 'SIGEC'
  click_link_or_button 'Mobile'
  click_on 'm_33'
end

Then(/^I should see all registers about Ordem Serviço Despacho$/) do
'Ordens de Serviços para Despacho'
end

When(/^I go on Programar OS page$/) do
  click_link_or_button 'SIGEC'
  click_link_or_button 'Mobile'
  click_on 'm_34'
end

Then(/^I should see all registers about Programar OS$/) do
  pending # Write code here that turns the phrase above into concrete actions
end

When(/^I go on Priorizar OS page$/) do
  click_link_or_button 'SIGEC'
  click_link_or_button 'Mobile'
  click_on 'm_35'
end

Then(/^I should see all registers about Priorizar OS$/) do
  expect(page).to have_content 'Priorizar Ordem de Serviço'
end

When(/^I go on Dispositivos page$/) do
  click_link_or_button 'SIGEC'
  click_link_or_button 'Mobile'
  click_on 'm_36'
end

Then(/^I should see all registers about Dispositivos$/) do
  expect(page).to have_content 'Todos Dispositivos'
end

When(/^I go on Localização page$/) do
  click_link_or_button 'SIGEC'
  click_link_or_button 'Mobile'
  click_on 'm_37'
end

Then(/^I should see all registers about Localização$/) do
  expect(page).to have_content 'Status GPS'
end

When(/^I go on Upload de Serviços page$/) do
  click_link_or_button 'SIGEC'
  click_link_or_button 'Mobile'
  click_on 'm_38'
end

Then(/^I should see all registers about Upload de Serviços$/) do
  expect(page).to have_content 'Arquivos Ordem de Serviços'
end

When(/^I go on Programação em Lote page$/) do
  click_link_or_button 'SIGEC'
  click_link_or_button 'Mobile'
  click_on 'm_39'
end

Then(/^I should see all registers about Programação em Lote$/) do
  expect(page).to have_content 'Arquivos Programação Lote'
end

When(/^I go on Importar OS's Concluídas page$/) do
  click_link_or_button 'SIGEC'
  click_link_or_button 'Mobile'
  click_on 'm_40'
end

Then(/^I should see all registers about Importar OS's Concluídas$/) do
  expect(page).to have_content 'Arquivos OS Concluídas'
end