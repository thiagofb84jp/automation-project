# 2.9. Faça um Programa que leia três números e mostre-os em ordem decrescente.

def ordem_decrescente(x, y, z)
	if (x > y) && (x > z) && (y > z)
		puts "Ordem crescente: #{x}, #{y} e #{z}"
	elsif (x > y) && (x > z) && (z > y)
		puts "Ordem crescente: #{x}, #{z} e #{y}"
	elsif (y > x) && (y > z) && (x > z)
		puts "Ordem crescente: #{y}, #{x} e #{z}"
	elsif (y > x) && (y > z) && (z > x)
		puts "Ordem crescente: #{y}, #{z} e #{x}"
	elsif (z > x) && (z > y) && (y > x)
		puts "Ordem crescente: #{z}, #{y} e #{x}"
	elsif (z > x) && (z > y) && (x > y)
		puts "Ordem crescente: #{z}, #{x} e #{y}"
	end
end

puts "Informe 3 (tres) numeros: "
num1 = gets.to_i
num2 = gets.to_i
num3 = gets.to_i

puts ordem_decrescente(num1, num2, num3)