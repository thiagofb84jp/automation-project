Given(/^I am on the Intranet page$/) do
  visit 'https://dev.control.eng.br/acessos'
end

When(/^I fill in "([^"]*)" and "([^"]*)" with SIGO user$/) do |arg1, arg2|
  fill_in 'usuario_login', :with => 'thiago.barbosa'
  fill_in 'usuario_senha', :with => ''
  click_button 'submit_login'
end

When(/^I go on Ordem de Serviço page$/) do
  visit 'https://dev.control.eng.br/ordem_servicos/new'
  #click_link_or_button 'SIGEC'
  #click_on 'm_10'
end

Then(/^I should see all registers about Ordem de Serviço$/) do
  expect(page).to have_content 'Registrar Ordem de Serviço'
end

When(/^I go on Desvios de Equipe page$/) do
  visit 'https://dev.control.eng.br/desvio_equipes'
  #click_link_or_button 'SIGEC'
  #click_on 'm_11'
end

Then(/^I should see all registers about Desvios de Equipe$/) do
  expect(page).to have_content 'Todos Desvios de Equipe'
end

When(/^I go on Glosa e Crédito page$/) do
  visit 'https://dev.control.eng.br/glosa_contratos'
  #click_link_or_button 'SIGEC'
  #click_on 'm_12'
end

Then(/^I should see all registers about Glosa e Crédito$/) do
  expect(page).to have_content 'Todos Glosas e Crédito'
end

When(/^I go on Contratos page$/) do
  visit 'https://dev.control.eng.br/contratos'
  #click_link_or_button 'SIGEC'
  #click_link_or_button 'Contratos'
  #click_on 'm_13'  
end

Then(/^I should see all registers about Contratos$/) do
  expect(page).to have_content 'Centro de Custos (Tomador)'
end

When(/^I go on Regional page$/) do
  visit 'https://dev.control.eng.br/regionals'
  #click_link_or_button 'SIGEC'
  #click_link_or_button 'Contratos'
  #click_on 'm_14'
end

Then(/^I should see all registers about Regional$/) do
  expect(page).to have_content 'Todos Regionais'
end

When(/^I go on Polo page$/) do
  visit 'https://dev.control.eng.br/polos'
  #click_link_or_button 'SIGEC'
  #click_link_or_button 'Contratos'
  #click_on 'm_15'
end

Then(/^I should see all registers about Polo$/) do
  expect(page).to have_content 'Todos Polos'
end

When(/^I go on Cidade page$/) do
  visit 'https://dev.control.eng.br/cidades'
  #click_link_or_button 'SIGEC'
  #click_link_or_button 'Contratos'
  #click_on 'm_16'
end

Then(/^I should see all registers about Cidade$/) do
  expect(page).to have_content 'Todas as Cidades'
end

When(/^I go on Horário page$/) do
  visit 'https://dev.control.eng.br/horarios'
  #click_link_or_button 'SIGEC'
  #click_link_or_button 'Equipes'
  #click_on 'm_17'
end

Then(/^I should see all registers about Horário$/) do
  expect(page).to have_content 'Todos Horarios'
end

When(/^I go on Sobreaviso\/Emerg\.\/H page$/) do
  visit 'https://dev.control.eng.br/sobre_avisos'
  #click_link_or_button 'SIGEC'
  #click_link_or_button 'Equipes'
  #click_on 'm_18'
end

Then(/^I should see all registers about Sobreaviso\/Emerg\.\/HH$/) do
  expect(page).to have_content 'Todos Sobreavisos'
end

When(/^I go on Tipo de Serviço de Equipe page$/) do
  visit 'https://dev.control.eng.br/tipo_servicos'
  #click_link_or_button 'SIGEC'
  #click_link_or_button 'Equipes'
  #click_on 'm_19'
end

Then(/^I should see all registers about Tipo de Serviço de Equipe$/) do
  expect(page).to have_content 'Todos Tipos Serviço'
end

When(/^I go on Tipo de Equipe page$/) do
  visit 'https://dev.control.eng.br/tipo_equipes'
  #click_link_or_button 'SIGEC'
  #click_link_or_button 'Equipes'
  #click_on 'm_20'
end

Then(/^I should see all registers about Tipo de Equipe$/) do
  expect(page).to have_content 'Tipos de Equipes'
end

When(/^I go on Equipes de Trabalho page$/) do
  visit 'https://dev.control.eng.br/equipes'
  #click_link_or_button 'SIGEC'
  #click_link_or_button 'Equipes'
  #click_on 'm_21'
end

Then(/^I should see all registers about Equipes de Trabalho$/) do
  expect(page).to have_content 'Todos Equipes'
end

When(/^I go on Serviços de Contrato page$/) do
  visit 'https://dev.control.eng.br/servico_comercials'
  #click_link_or_button 'SIGEC'
  #click_link_or_button 'Serviços'
  #click_on 'm_22'
end

Then(/^I should see all registers about Serviços de Contrato$/) do
  expect(page).to have_content 'Todos Serviços'
end

When(/^I go on Grupo Faturamento page$/) do
  visit 'https://dev.control.eng.br/grupo_faturamentos'
  #click_link_or_button 'SIGEC'
  #click_link_or_button 'Serviços'
  #click_on 'm_23'
end

Then(/^I should see all registers about Grupo Faturamento$/) do
  expect(page).to have_content 'Todos Grupos de Faturamentos'
end

When(/^I go on Tipo de OS page$/) do
  visit 'https://dev.control.eng.br/tipo_ordem_servicos'
  #click_link_or_button 'SIGEC'
  #click_link_or_button 'Serviços'
  #click_on 'm_24'
end

Then(/^I should see all registers about Tipo de OS$/) do
  expect(page).to have_content 'Todos Tipos Ordens de Serviços'
end

When(/^I go on Serviços Faturamento page$/) do
  visit 'https://dev.control.eng.br/servico_faturamentos'
  #click_link_or_button 'SIGEC'
  #click_link_or_button 'Serviços'
  #click_on 'm_25'
end

Then(/^I should see all registers about Serviços Faturamento$/) do
  expect(page).to have_content 'Todos Serviços Faturamentos'
end

When(/^I go on Motivos de Desvio page$/) do
  visit 'https://dev.control.eng.br/desvios'
  #click_link_or_button 'SIGEC'
  #click_link_or_button 'Serviços'
  #click_on 'm_26'
end

Then(/^I should see all registers about Motivos de Desvio$/) do
  expect(page).to have_content 'Todos Desvios'
end

When(/^I go on Grupos de Mercadoria page$/) do
  visit 'https://dev.control.eng.br/grupo_mercadoria'
  #click_link_or_button 'SIGEC'
  #click_link_or_button 'Serviços'
  #click_on 'm_27'
end

Then(/^I should see all registers about Grupos de Mercadoria$/) do
  expect(page).to have_content 'Todos Grupo Mercadorias'
end

When(/^I go on Grupos de EPI\/EPC page$/) do
  visit 'https://dev.control.eng.br/grupo_epi_epcs'
  #click_link_or_button 'SIGEC'
  #click_link_or_button 'Serviços'
  #click_on 'm_28'
end

Then(/^I should see all registers about Grupos de EPI\/EPC$/) do
  expect(page).to have_content 'Todos Grupo de EPI/EPC'
end

When(/^I go on Grupo de Faturamento Opcional page$/) do
  visit 'https://dev.control.eng.br/te_grupo_fat_servicos'
  #click_link_or_button 'SIGEC'
  #click_link_or_button 'Serviços'
  #click_on 'm_29'
end

Then(/^I should see all registers about Grupo de Faturamento Opcional$/) do
  expect(page).to have_content 'Grupo de Faturamento Opcional'
end

When(/^I go on Relatório page$/) do
  visit 'https://dev.control.eng.br/ordem_servicos/relatorio'
  #click_link_or_button 'SIGEC'
  #click_link_or_button 'Serviços'
  #click_on 'm_32'
end

Then(/^I should see all registers about Relatório$/) do
  expect(page).to have_content 'Relatório SIGEC'
end

When(/^I go on Ordem Serviço Despacho page$/) do
  visit 'https://dev.control.eng.br/ordem_servico_mobiles'
  #click_link_or_button 'SIGEC'
  #click_link_or_button 'Mobile'
  #click_on 'm_34'
end

Then(/^I should see all registers about Ordem Serviço Despacho$/) do
  expect(page).to have_content 'Ordens de Serviços para Despacho'
end

When(/^I go on Programar OS page$/) do
  visit 'https://dev.control.eng.br/ordem_servico_mobiles/index_programacao'
  #click_link_or_button 'SIGEC'
  #click_link_or_button 'Mobile'
  #click_on 'm_35'
end

Then(/^I should see all registers about Programar OS$/) do
  expect(page).to have_content 'Ordens de Serviço Pesquisadas'
end

When(/^I go on Priorizar OS page$/) do
  visit 'https://dev.control.eng.br/ordem_servico_mobiles/index_priorizar'
  #click_link_or_button 'SIGEC'
  #click_link_or_button 'Mobile'
  #click_on 'm_36'
end

Then(/^I should see all registers about Priorizar OS$/) do
  expect(page).to have_content 'Priorizar Ordem de Serviço'
end

When(/^I go on Dispositivos page$/) do
  visit 'https://dev.control.eng.br/sigec_mobile_intranets'
  #click_link_or_button 'SIGEC'
  #click_link_or_button 'Mobile'
  #click_on 'm_37'
end

Then(/^I should see all registers about Dispositivos$/) do
  expect(page).to have_content 'Todos Dispositivos'
end

When(/^I go on Localização page$/) do
  visit 'https://dev.control.eng.br/sigec_mobile_mapas'
  #click_link_or_button 'SIGEC'
  #click_link_or_button 'Mobile'
  #click_on 'm_38'
end

Then(/^I should see all registers about Localização$/) do
  expect(page).to have_content 'Total OS Programadas'
end

When(/^I go on Upload de Serviços page$/) do
  visit 'https://dev.control.eng.br/ordem_servico_mobiles/index_upload_sevico'
  #click_link_or_button 'SIGEC'
  #click_link_or_button 'Mobile'
  #click_on 'm_39'
end

Then(/^I should see all registers about Upload de Serviços$/) do
  expect(page).to have_content 'Arquivos Ordem de Serviços'
end

When(/^I go on Programação em Lote page$/) do
  visit 'https://dev.control.eng.br/ordem_servico_mobiles/index_programacao_lote'
  #click_link_or_button 'SIGEC'
  #click_link_or_button 'Mobile'
  #click_on 'm_40'
end

Then(/^I should see all registers about Programação em Lote$/) do
  expect(page).to have_content 'Arquivos Programação Lote'
end

When(/^I go on Importar OS's Concluídas page$/) do
  visit 'https://dev.control.eng.br/ordem_servico_mobiles/index_upload_bd'
  #click_link_or_button 'SIGEC'
  #click_link_or_button 'Mobile'
  #click_on 'm_41'
end

Then(/^I should see all registers about Importar OS's Concluídas$/) do
  expect(page).to have_content 'Arquivos OS Concluídas'
end