#2.1 Faça um Programa que peça dois números e imprima o maior deles.
def maior_numero (x1, x2)
	if x1 > x2
		puts "Maior número: #{x1}"
	else
		puts "Maior número: #{x2}"
	end
end

puts "Insira dois números: "
a = gets.to_i
b = gets.to_i

puts maior_numero(a, b)