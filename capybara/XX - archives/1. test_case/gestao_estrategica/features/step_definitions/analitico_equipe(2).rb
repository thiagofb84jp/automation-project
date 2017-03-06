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

Then(/^I should see the following registers about QUATRO POR DOIS: (\d+)\.(\d+),(\d+), (\d+)\.(\d+),(\d+), (\d+)\.(\d+),(\d+), (\d+)\.(\d+),(\d+), (\d+), \-(\d+)\.(\d+),(\d+)$/) do |arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11, arg12, arg13, arg14, arg15, arg16|
  expect(page).to have_content 'R$ 73.230,46' #Valor Normal
  expect(page).to have_content 'R$ 15.269,17' #Valor Extra
  expect(page).to have_content 'R$ 1.748,56' #Valor Adicional Noturno
  expect(page).to have_content 'R$ 90.248,19' #Produtividade
  expect(page).to have_content '69%' #Prev x Real
  expect(page).to have_content 'R$ -40.751,81' #Dif Monet
  #sleep 10
end

When(/^I fill in (\d+)\-MANUTENCAO\-MANAUS, (\d+)\-(\d+) and QUATRO POR QUATRO$/) do |arg1, arg2, arg3|
  #find('#id_componente').find(:xpath, 'valor_xpath').select_option
  find('#filtro_sub_contrato').find(:xpath, '//*[@id="filtro_sub_contrato"]/option[2]').select_option
  find('#filtro_mes').find(:xpath, '//*[@id="filtro_mes"]/option[6]').select_option
  find('#filtro_tipo_equipe').find(:xpath, '//*[@id="filtro_tipo_equipe"]/option[3]').select_option
end

Then(/^I should see the following registers about QUATRO POR QUATRO: (\d+)\.(\d+),(\d+), (\d+)\.(\d+),(\d+), (\d+),(\d+), (\d+)\.(\d+),(\d+), (\d+), (\d+)\.(\d+),(\d+)$/) do |arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11, arg12, arg13, arg14, arg15|
  expect(page).to have_content 'R$ 73.230,46' #Valor Normal
  expect(page).to have_content 'R$ 15.269,17' #Valor Extra
  expect(page).to have_content 'R$ 1.748,56' #Valor Adicional Noturno
  expect(page).to have_content 'R$ 90.248,19' #Produtividade
  expect(page).to have_content '69%' #Prev x Real
  expect(page).to have_content 'R$ -40.751,81' #Dif Monet
  #sleep 10
end

When(/^I fill in (\d+)\-MANUTENCAO\-MANAUS, (\d+)\-(\d+) and TECNICOS DA QUALIDADE$/) do |arg1, arg2, arg3|
  #find('#id_componente').find(:xpath, 'valor_xpath').select_option
  find('#filtro_sub_contrato').find(:xpath, '//*[@id="filtro_sub_contrato"]/option[2]').select_option
  find('#filtro_mes').find(:xpath, '//*[@id="filtro_mes"]/option[6]').select_option
  find('#filtro_tipo_equipe').find(:xpath, '//*[@id="filtro_tipo_equipe"]/option[4]').select_option
end

Then(/^I should see the following registers about TECNICOS DA QUALIDADE: (\d+)\.(\d+),(\d+), (\d+),(\d+), (\d+),(\d+), R\$ (\d+)\.(\d+),(\d+), (\d+), (\d+)\.(\d+),(\d+)$/) do |arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11, arg12, arg13, arg14|
  expect(page).to have_content 'R$ 73.230,46' #Valor Normal
  expect(page).to have_content 'R$ 15.269,17' #Valor Extra
  expect(page).to have_content 'R$ 1.748,56' #Valor Adicional Noturno
  expect(page).to have_content 'R$ 90.248,19' #Produtividade
  expect(page).to have_content '69%' #Prev x Real
  expect(page).to have_content 'R$ -40.751,81' #Dif Monet
  #sleep 10
end

When(/^I fill in (\d+)\-MANUTENCAO\-MANAUS, (\d+)\-(\d+) and MANUTENCAO PESADA$/) do |arg1, arg2, arg3|
  #find('#id_componente').find(:xpath, 'valor_xpath').select_option
  find('#filtro_sub_contrato').find(:xpath, '//*[@id="filtro_sub_contrato"]/option[2]').select_option
  find('#filtro_mes').find(:xpath, '//*[@id="filtro_mes"]/option[6]').select_option
  find('#filtro_tipo_equipe').find(:xpath, '//*[@id="filtro_tipo_equipe"]/option[5]').select_option
end

Then(/^I should see the following registers about MANUTENCAO PESADA: (\d+)\.(\d+),(\d+), (\d+)\.(\d+),(\d+), (\d+)\.(\d+),(\d+), (\d+)\.(\d+),(\d+), (\d+), (\d+)\.(\d+),(\d+)$/) do |arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11, arg12, arg13, arg14, arg15, arg16|
  expect(page).to have_content 'R$ 73.230,46' #Valor Normal
  expect(page).to have_content 'R$ 15.269,17' #Valor Extra
  expect(page).to have_content 'R$ 1.748,56' #Valor Adicional Noturno
  expect(page).to have_content 'R$ 90.248,19' #Produtividade
  expect(page).to have_content '69%' #Prev x Real
  expect(page).to have_content 'R$ -40.751,81' #Dif Monet
  #sleep 10
end

When(/^I fill in (\d+)\-MANUTENCAO\-MANAUS, (\d+)\-(\d+) and FLUVIAL$/) do |arg1, arg2, arg3|
  #find('#id_componente').find(:xpath, 'valor_xpath').select_option
  find('#filtro_sub_contrato').find(:xpath, '//*[@id="filtro_sub_contrato"]/option[2]').select_option
  find('#filtro_mes').find(:xpath, '//*[@id="filtro_mes"]/option[6]').select_option
  find('#filtro_tipo_equipe').find(:xpath, '//*[@id="filtro_tipo_equipe"]/option[6]').select_option
end

Then(/^I should see the following registers about FLUVIAL: (\d+)\.(\d+),(\d+), (\d+)\.(\d+),(\d+), (\d+)\.(\d+),(\d+), (\d+)\.(\d+),(\d+), (\d+), (\d+)\.(\d+),(\d+)$/) do |arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11, arg12, arg13, arg14, arg15, arg16|
  expect(page).to have_content 'R$ 73.230,46' #Valor Normal
  expect(page).to have_content 'R$ 15.269,17' #Valor Extra
  expect(page).to have_content 'R$ 1.748,56' #Valor Adicional Noturno
  expect(page).to have_content 'R$ 90.248,19' #Produtividade
  expect(page).to have_content '69%' #Prev x Real
  expect(page).to have_content 'R$ -40.751,81' #Dif Monet
  #sleep 10
end