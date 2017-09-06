#2.25 Faça um Programa que peça um número e informe se o número é inteiro ou
#decimal. Dica: utilize uma função de arredondamento.

def inteiro_decimal(num)

	aux = num - (num.to_i)

	if aux == 0
		puts "#{num} é um INTEIRO!"
	else
		puts "#{num} é um FLOAT!"
	end
end

puts "Informe o número: "
num = gets.to_f

inteiro_decimal(num)