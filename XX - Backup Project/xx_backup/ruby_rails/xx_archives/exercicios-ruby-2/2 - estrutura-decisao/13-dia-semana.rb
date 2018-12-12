#2.14 Faça um Programa que leia um número e exiba o dia correspondente da semana. (1-Domingo, 2- Segunda, etc.).
#Se digitar outro valor deve aparecer valor inválido.

def dia_semana(dia)
	case
	when dia == 1
		puts "Domingo"
	when dia == 2
		puts "Segunda-Feira"
	when dia == 3
		puts "Terça-Feira"
	when dia == 4
		puts "Quarta-Feira"
	when dia == 5
		puts "Quinta-Feira"
	when dia == 6
		puts "Sexta-Feira"
	when dia == 7
		puts "Sábado"
	else
		puts "Valor Inválido!"
	end
end

puts "Informe um número (de 1 a 7): "
num = gets.to_i

dia_semana(num)