#1. Estrutura Sequencial;
#1.6. Faça um Programa que peça o raio de um círculo, calcule e mostre sua área.

PI = 3.1415

puts "Informe o raio do círculo: "
raio = gets.to_f

area = PI * (raio**2)

puts "A área do círculo é de = #{area}"
puts "O raio é de #{raio}"