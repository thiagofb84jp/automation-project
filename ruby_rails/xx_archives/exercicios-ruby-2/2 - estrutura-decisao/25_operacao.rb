#2.26 Faça um Programa que leia 2 números e em seguida pergunte ao usuário qual
#operação ele deseja realizar. O resultado da operação deve ser acompanhado de
#uma frase que diga se o número é:

def operacoes(x, y)
	case 
	when operacao == "1"
		total = x + y
		puts "Valor: #{total}"
	when operacao == "2"
		total = x - y
		puts "Valor: #{total}"
	when operacao == "3"
		total = x * y
		puts "Valor: #{total}"		
	when operacao == "4"
		total = x / y
		puts "Valor: #{total}"		
	else
		puts "Opção INVÁLIDA! Tente novamente mais tarde."
	end
	#Continuar as operações!
end