#1. Estrutura Sequencial;
#1.10 Faça um Programa que peça a temperatura em graus Celsius, transforme e mostre em graus Farenheit;

puts "Informe a temperatura (ºC): "
celsius = gets.to_f

farenheit = (celsius * 1.8) + 32

puts "Temperatura em Farenheit: #{farenheit}"