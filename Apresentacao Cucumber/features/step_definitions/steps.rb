Dado(/^que estou na página inicial do Seu Barriga$/) do
  visit 'https://srbarriga.herokuapp.com/login'
end

Quando(/^cadastrar um novo usuário$/) do
  click_link_or_button 'Novo usuário?'
end

Quando(/^informar todos os campos obrigatórios e confirmar os dados$/) do
  fill_in 'nome', :with => 'Joana Andrade Silva'
  fill_in 'email', :with => 'joana_silva@gmail.com'
  fill_in 'senha', :with => 'abcd_123'
  click_on 'Cadastrar'
end

Então(/^vejo uma mensagem informando que o usuário foi cadastrado com sucesso$/) do
  expect(page).to have_content 'Usuário inserido com sucesso'
end

Quando(/^cadastrar um novo usuário sem informar os campos obrigatórios e confirmar os dados$/) do
  click_link_or_button 'Novo usuário?'
  click_on 'Cadastrar'
end

Então(/^vejo uma mensagem destacando todos os campos obrigatórios para preenchimento$/) do
  expect(page).to have_content 'Nome é um campo obrigatório'
  expect(page).to have_content 'Email é um campo obrigatório'
  expect(page).to have_content 'Senha é um campo obrigatório'
end

Quando(/^informar um usuário e senha válidos$/) do
  fill_in 'email', :with => 'joana_silva@gmail.com'
  fill_in 'senha', :with => 'abcd_123'
  click_on 'Entrar'
end

Então(/^o sistema deve permitir a autenticação do usuário$/) do
  expect(page).to have_content 'Bem vindo, Joana Andrade Silva!'
end

Quando(/^informar um usuário e senha inválidos$/) do
  fill_in 'email', :with => 'carla_lima@gmail.com'
  fill_in 'senha', :with => 'abcd_888'
  click_on 'Entrar'
end

Então(/^o sistema não deve permitir a autenticação exibindo os campos obrigatórios para preenchimento$/) do
  expect(page).to have_content 'Problemas com o login do usuário'
end