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
	peso_ideal = (72.7 * altura) - 58
end

if sexo == "F" then
	peso_ideal = (62.1 * altura) - 44.7	
end

puts "Seu peso ideal: #{peso_ideal.round(2)}"

puts "Qual o seu peso? "
peso_imc = gets.to_f

imc = (peso_imc) / altura**2

puts "Seu IMC: #{imc.round(2)}"

if imc < 18.5
	puts "Você está abaixo do peso"
elsif (18.5 <= imc) && (imc <= 24.9)
	puts "Você está dentro do peso"
else
	puts "Você está acima do peso"
end