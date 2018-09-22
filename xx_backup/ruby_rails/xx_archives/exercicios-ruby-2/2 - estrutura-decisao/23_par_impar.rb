#2.24. Faça um Programa que peça um número inteiro e determine se ele é par ou impar.
#Dica: utilize o operador módulo (resto da divisão).

def par_impar(num)

	if ((num % 2) == 0)
		puts "O número é PAR"
	else
		puts "O número é ÍMPAR"
	end
end

puts "Informe um número (inteiro): "
num = gets.to_i

par_impar(num)