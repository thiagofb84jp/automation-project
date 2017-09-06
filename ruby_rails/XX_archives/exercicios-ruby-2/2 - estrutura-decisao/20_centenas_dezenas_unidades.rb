#2.21. Faça um Programa que leia um número inteiro menor que 1000 e imprima a
#quantidade de centenas, dezenas e unidades do mesmo.

def imprime_quantidade(num)
	if num >= 1000
		puts "Maior ou igual a 1000! Não pode!"
		exit!
	else
		cen = (num / 100)
		dez = (num - (cen * 100)) / 10
		uni = (num - (cen * 100 + dez * 10))

		case 
		when (cen > 1) || (dez > 1) || (uni > 1)
			puts "#{cen} centenas, #{dez} dezenas e #{uni} unidades"
		when (cen == 1) || (dez == 1) || (uni == 1)
			puts "#{cen} centena, #{dez} dezena e #{uni} unidade"
		else
			puts "Nenhuma das opções listadas!"
		end
	end
end

puts "Informe o número (Menor que 1000): "
num = gets.to_i

imprime_quantidade(num)