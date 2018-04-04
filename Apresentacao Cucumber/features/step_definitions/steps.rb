Dado(/^que estou na página inicial do Seu Barriga$/) do
  visit 'https://srbarriga.herokuapp.com/login'
end

Quando(/^cadastrar um novo usuário$/) do
  click_link_or_button 'Novo usuário?'
end

Quando(/^informar todos os campos obrigatórios e confirmar os dados$/) do
  fill_in 'nome', :with => 'Joseana Lima Dias Duarte Paiva'
  fill_in 'email', :with => 'joseana_paiva@gmail.com'
  fill_in 'senha', :with => 'abcd_123'
  click_on 'Cadastrar'
end

Então(/^vejo uma mensagem informando que o usuário foi cadastrado com sucesso$/) do
  expect(page).to have_content 'Usuário inserido com sucesso'
end

Quando(/^informar um usuário e senha válidos$/) do
  fill_in 'email', :with => 'joseana_paiva@gmail.com'
  fill_in 'senha', :with => 'abcd_123'
  click_on 'Entrar'
end

Então(/^o sistema deve permitir a autenticação do usuário$/) do
  expect(page).to have_content 'Bem vindo, Joseana Lima Dias Duarte Paiva!'
end