class Pessoa

	attr_accessor :nome

	#Este método recebe uma variável chamada 'nome' que receberá o que for enviado no momento da inicialização da classe
	def initialize(str)
		@nome = str		
	end

	def imprimir_nome
		@nome
	end

	def guardar_nome(novo_nome)
		@nome = novo_nome	
	end

	#def nome=(novo_nome)
	#	@nome = novo_nome
	#end

	def apresente_se
		puts "Olá, eu nasci de uma classe Pessoa!" 
	end

	#Neste método, a própria instância informa qual o ID do objeto dela
	def qual_o_seu_numero?
		puts self.object_id
	end
end