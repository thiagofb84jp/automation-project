#1.13 Tendo como dados de entrada a altura e o sexo de uma pessoa, construa um
#algoritmo que calcule seu peso ideal, utilizando as seguintes fórmulas:
#a. Para homens: (72.7*h) - 58
#b. Para mulheres: (62.1*h) - 44.7 (h = altura)
#c. Peça o peso da pessoa e informe se ela está dentro, acima ou abaixo do peso

puts "Altura: "
altura = gets.to_f

puts "Sexo: "
sexo = gets.chomp

if sexo == "M" then
	peso = (72.7 * altura) - 58
end

if sexo == "F" then
	peso = (62.1 * altura) - 44.7	
end

puts "Seu peso ideal: #{peso}"

#if peso <= 17.1
#	puts "Seu peso: #{peso}, você está abaixo do peso"
#elsif 18.49 <= peso >= 24.99
#	puts "Seu peso: #{peso}, você está dentro do peso"
#elsif 25 <= peso >= 29.99
#	puts "Seu peso: #{peso}, você está acima do peso"
#else
#	puts "Seu peso: #{peso}, você está com obesidade mórbida"
#end