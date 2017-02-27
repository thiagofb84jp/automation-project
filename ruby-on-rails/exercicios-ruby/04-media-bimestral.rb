#1. Estrutura Sequencial;
#1.4. Faça um Programa que peça as 4 notas bimestrais e mostre a média.

puts "Informe 4 notas: "
x1 = gets.to_i
x2 = gets.to_i
x3 = gets.to_i
x4 = gets.to_i

media = (x1 + x2 + x3 + x4) / 4

puts "Média Final = #{media}"