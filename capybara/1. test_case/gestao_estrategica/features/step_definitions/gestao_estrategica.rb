Given(/^I am on the Intranet page$/) do
  visit 'https://dev.control.eng.br/acessos'
end

When(/^I fill in "([^"]*)" and "([^"]*)" with GESTAO ESTRATEGICA user$/) do |usuario_login, usuario_senha|
  fill_in 'usuario_login', :with => 'thiago.barbosa'
  fill_in 'usuario_senha', :with => ''
  click_button 'submit_login'
end

When(/^I go on Gestao Estrategica page$/) do
  visit 'https://dev.control.eng.br/bi/por_mes'
end

When(/^I go on Analitico Produtividade Equipe$/) do
  visit 'https://dev.control.eng.br/bi/por_analitico_produtuvidade_equipe'
end

When(/^I fill in (\d+)\-MANUTENCAO\-MANAUS, (\d+)\-(\d+) and MANUTENCAO PESADA$/) do |filtro_sub_contrato, filtro_mes, filtro_tipo_equipe|
  #find('#id_componente').find(:xpath, 'valor_xpath').select_option
  find('#filtro_sub_contrato').find(:xpath, '//*[@id="filtro_sub_contrato"]/option[3]').select_option
  find('#filtro_mes').find(:xpath, '//*[@id="filtro_mes"]/option[8]').select_option
  find('#filtro_tipo_equipe').find(:xpath, '//*[@id="filtro_tipo_equipe"]/option[5]').select_option
end

Then(/^I should see all registers about team productivity$/) do
  expect(page).to have_content '011'
  expect(page).to have_content 'MANUTENÇÃO PESADA'
  sleep 10
end