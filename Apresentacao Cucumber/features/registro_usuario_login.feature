#language:pt

Funcionalidade: registro de novo usuário e login
	Como usuário do sistema
	Eu quero me registrar e logar
	Para que eu possa gerenciar minhas contas e não esquecer de pagar o aluguel

	Contexto: possibilidade de acessar o sistema
		Dado que estou na página inicial do Seu Barriga
	
	@registro_sucesso
	Cenário: registro de usuário
		Quando cadastrar um novo usuário
		E informar todos os campos obrigatórios e confirmar os dados
		Então vejo uma mensagem informando que o usuário foi cadastrado com sucesso

	@registro_falha
	Cenário: falha no registro do novo usuário
		Quando cadastrar um novo usuário sem informar os campos obrigatórios e confirmar os dados
		Então vejo uma mensagem destacando todos os campos obrigatórios para preenchimento

	@login_usuario_valido
	Cenário: logar com usuário ja cadastrado
		Quando informar um usuário e senha válidos
		Então o sistema deve permitir a autenticação do usuário

	@login_usuario_invalido
	Cenário: logar com usuário inválido
		Quando informar um usuário e senha inválidos
		Então o sistema não deve permitir a autenticação exibindo os campos obrigatórios para preenchimento