#1.16 Faça um programa para uma loja de tintas. O programa deverá pedir o tamanho
#em metros quadrados da área a ser pintada. Considere que a cobertura da tinta é
#de 1 litro para cada 3 metros quadrados e que a tinta é vendida em latas de 18
#litros, que custam R$ 80,00. Informe ao usuário a quantidades de latas de tinta a
#serem compradas e o preço total.

puts "Qual o tamanho da área a ser pintada?"
tamArea = gets.to_i

litros = tamArea / 3

precoLitro = 80
capacidade = 18

latas = litros / capacidade

valorTotal = latas * precoLitro

puts "Você precisa usar #{latas} latas de tinta para pintar #{tamArea} metros quadrados"
puts "O preço total é de: R$ #{valorTotal}"