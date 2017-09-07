#2.16. Faça um Programa que peça os 3 lados de um triângulo. O programa deverá
#informar se os valores podem ser um triângulo. Indique, caso os lados formem um
#triângulo, se o mesmo é: equilátero, isósceles ou escaleno.

def tipo_triangulo(l1, l2, l3)
	case
	when l1 > (l2 + l3) || l2 > (l1 + l3) || l3 > (l1 + l2)
		puts "Não pode ser um triângulo"
	when (l1 == l2) && (l1 == l3)
		puts "Triângulo Equilátero"
	when (l1 == l2) || (l1 == l3) || (l2 == l3)
		puts "Triângulo Isóceles"
	else
		puts "Triângulo Ecaleno"
	end
end

puts "Digite o tamanho do primeiro lado: "
x1 = gets.to_i

puts "Digite o segundo lado: "
x2 = gets.to_i

puts "Digite o terceiro lado: "
x3 = gets.to_i

tipo_triangulo(x1, x2, x3)