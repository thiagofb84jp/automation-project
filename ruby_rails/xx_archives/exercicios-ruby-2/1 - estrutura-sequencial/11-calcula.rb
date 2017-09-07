#1.11 Faça um Programa que peça 2 números inteiros e um número real. Calcule e
#mostre:
#a. o produto do dobro do primeiro com metade do segundo .
#b. a soma do triplo do primeiro com o terceiro.
#c. o terceiro elevado ao cubo.

puts "Números Inteiros: "
num1 = gets.to_i
num2 = gets.to_i

puts "Número Real: "
num3 = gets.to_f

prodDobro = (num1 * 2)
metSegundo = (num2 / 2)

valTotalA = prodDobro * metSegundo

puts "Produto do dobro do primeiro com a metade do segundo: #{valTotalA}"

valTriplo = (num1 * 3)
valTotalB =  valTriplo + num3

puts "A soma do triplo do primeiro com o terceiro: #{valTotalB}"

valTotalC = num3**3

puts "O terceiro elevado ao cubo: #{valTotalC}"