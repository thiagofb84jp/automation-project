#2.2 Faça um Programa que peça um valor e mostre na tela se o valor é positivo ou negativo.
def positivo_negativo(x1)
	if x1 > 0
		puts "Número positivo"
	elsif x1 == 0
		puts "Este número é zero (0)"
	else
		puts "Número negativo"
	end
end

puts "Informe um número: "
num = gets.to_i

puts positivo_negativo(num)