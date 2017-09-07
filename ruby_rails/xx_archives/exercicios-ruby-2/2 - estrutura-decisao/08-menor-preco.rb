# 2.8. Faça um programa que pergunte o preço de três produtos e informe qual produto você deve  comprar, sabendo que a decisão é sempre pelo mais barato.

def preco_mais_barato(val1, val2, val3)
	if (val1 < val2) && (val1 < val3)
		puts "De todos os produtos, o valor deste (#{val1}) eh mais barato. Recomendamos a compra deste."
	elsif (val2 < val1) && (val2 < val3)
		puts "De todos os produtos, o valor deste (#{val2}) eh mais barato. Recomendamos a compra deste."
	else
		puts "De todos os produtos, o valor deste (#{val3}) eh mais barato. Recomendamos a compra deste."
	end
end

puts "Informe o valor de 3 (tres) produtos: "
prod1 = gets.to_f
prod2 = gets.to_f
prod3 = gets.to_f

puts preco_mais_barato(prod1, prod2, prod3)