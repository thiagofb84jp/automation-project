#2.18. Faça um programa que calcule as raízes de uma equação do segundo grau, na
#forma ax2 + bx + c. O programa deverá pedir os valores de a, b e c e fazer as
#consistências, informando ao usuário nas seguintes situações:
require 'mathn'

def calcula_raiz_equacao(a)
	if a == 0
		puts "Esta não é uma equação do segundo grau."
		exit!
	else
		puts "Qual o valor de B?"
		b = gets.to_f
		puts "Qual o valor de C?"
		c = gets.to_f
	end		
	
	delta1 = (b * b) - 4 * a * c
	delta2 = Math.sqrt(delta1)

	x1 = (- b + delta2) / (2 * a)
	x2 = (- b - delta2) / (2 * a)

	if delta1 < 0
		puts "O valor de delta é #{delta1}"
		puts "Esta equação não possui raízes reais"
	elsif delta1 == 0
		puts "O valor de delta é #{delta1}"
		puts "Esta equação possui duas raízes reais e iguais"
		puts "A primeira é: #{x1}"
		puts "A segunda é: #{x2}"
	else
		puts "O valor de delta é #{delta1}"
		puts "Esta equação possui duas raízes reais e diferentes"
		puts "A primeira é: #{x1}"
		puts "A segunda é: #{x2}"
	end
end

puts "Qual o valor de 'a'?"
valor = gets.to_f

calcula_raiz_equacao(valor)