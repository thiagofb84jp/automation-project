#1. Estrutura Sequencial;
#1.9. Faça um Programa que peça a temperatura em graus Farenheit, transforme e mostre a temperatura em graus Celsius.

puts "Informe a temperatura (ºF): "
fahr = gets.to_f

celsius = (5 * (fahr - 32) / 9)

puts "Temperatura em Celsius: #{celsius}"