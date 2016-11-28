Given(/^I am on the Intranet page$/) do
  visit 'https://dev.control.eng.br/acessos'
end

When(/^I fill in "([^"]*)" and "([^"]*)" with GESTAO ESTRATEGICA user$/) do |arg1, arg2|
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

When(/^I fill in (\d+)\-MANUTENCAO\-MANAUS, (\d+)\-(\d+) and QUATRO POR DOIS$/) do |arg1, arg2, arg3|
  #find('#id_componente').find(:xpath, 'valor_xpath').select_option
  find('#filtro_sub_contrato').find(:xpath, '//*[@id="filtro_sub_contrato"]/option[2]').select_option
  find('#filtro_mes').find(:xpath, '//*[@id="filtro_mes"]/option[6]').select_option
  find('#filtro_tipo_equipe').find(:xpath, '//*[@id="filtro_tipo_equipe"]/option[2]').select_option
end

Then(/^I should see  the following registers about <time_equipe>: (\d+), monica\-santos, ALVARAES, (\d+)\.(\d+)$/) do |arg1, arg2, arg3|
  expect(page).to have_content '012' #Equipe
  expect(page).to have_content 'monica.santos' #Supervisor
  expect(page).to have_content 'ALVARAES' #Localidade
  expect(page).to have_content 'R$ 1.200,00' #Fat Previsto
end

When(/^I fill in (\d+)\-MANUTENCAO\-MANAUS, (\d+)\-(\d+) and QUATRO POR QUATRO$/) do |arg1, arg2, arg3|
  #find('#id_componente').find(:xpath, 'valor_xpath').select_option
  find('#filtro_sub_contrato').find(:xpath, '//*[@id="filtro_sub_contrato"]/option[2]').select_option
  find('#filtro_mes').find(:xpath, '//*[@id="filtro_mes"]/option[6]').select_option
  find('#filtro_tipo_equipe').find(:xpath, '//*[@id="filtro_tipo_equipe"]/option[3]').select_option
end

Then(/^I should see  the following registers about <time_equipe>: (\d+), \-, VILA AMAZONIA, (\d+)$/) do |arg1, arg2|
  expect(page).to have_content '104' #Equipe
  expect(page).to have_content '-' #Supervisor
  expect(page).to have_content 'NOVO AYRAO' #Localidade
  expect(page).to have_content 'R$ 0,00' #Fat Previsto
end

When(/^I fill in (\d+)\-MANUTENCAO\-MANAUS, (\d+)\-(\d+) and TECNICOS DA QUALIDADE$/) do |arg1, arg2, arg3|
  #find('#id_componente').find(:xpath, 'valor_xpath').select_option
  find('#filtro_sub_contrato').find(:xpath, '//*[@id="filtro_sub_contrato"]/option[2]').select_option
  find('#filtro_mes').find(:xpath, '//*[@id="filtro_mes"]/option[6]').select_option
  find('#filtro_tipo_equipe').find(:xpath, '//*[@id="filtro_tipo_equipe"]/option[4]').select_option
end

Then(/^I should see  the following registers about <time_equipe>: TECNICOS, \-, MANAUS, (\d+)$/) do |arg1|
  expect(page).to have_content 'TECNICOS' #Equipe
  expect(page).to have_content '-' #Supervisor
  expect(page).to have_content 'MANAUS' #Localidade
  expect(page).to have_content 'R$ 0,00' #Fat Previsto
end

When(/^I fill in (\d+)\-MANUTENCAO\-MANAUS, (\d+)\-(\d+) and MANUTENCAO PESADA$/) do |arg1, arg2, arg3|
  #find('#id_componente').find(:xpath, 'valor_xpath').select_option
  find('#filtro_sub_contrato').find(:xpath, '//*[@id="filtro_sub_contrato"]/option[2]').select_option
  find('#filtro_mes').find(:xpath, '//*[@id="filtro_mes"]/option[6]').select_option
  find('#filtro_tipo_equipe').find(:xpath, '//*[@id="filtro_tipo_equipe"]/option[5]').select_option
end

Then(/^I should see  the following registers about <time_equipe>: (\d+), emerson\.paiva, BOCA DO ACRE, (\d+)$/) do |arg1, arg2|
  expect(page).to have_content '007' #Equipe
  expect(page).to have_content 'emerson.paiva' #Supervisor
  expect(page).to have_content 'BOCA DO ACRE' #Localidade
  expect(page).to have_content 'R$ 0,00' #Fat Previsto
end

When(/^I fill in (\d+)\-MANUTENCAO\-MANAUS, (\d+)\-(\d+) and FLUVIAL$/) do |arg1, arg2, arg3|
  #find('#id_componente').find(:xpath, 'valor_xpath').select_option
  find('#filtro_sub_contrato').find(:xpath, '//*[@id="filtro_sub_contrato"]/option[2]').select_option
  find('#filtro_mes').find(:xpath, '//*[@id="filtro_mes"]/option[6]').select_option
  find('#filtro_tipo_equipe').find(:xpath, '//*[@id="filtro_tipo_equipe"]/option[6]').select_option
end

Then(/^I should see  the following registers about <time_equipe>: (\d+), \-, ANAMA, (\d+)$/) do |arg1, arg2|
  expect(page).to have_content '015' #Equipe
  expect(page).to have_content '-' #Supervisor
  expect(page).to have_content 'ANAMA' #Localidade
  expect(page).to have_content 'R$ 0,00' #Fat Previsto
end