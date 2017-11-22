# 2.6. Faça um Programa que leia três números e mostre o maior deles.

def maior_numero(x, y, z)
	if (x > y) && (x > z)
		puts "#{x} eh o maior numero."
	elsif (y > x) && (y > z)
		puts "#{y} eh o maior numero."
	else
		puts "#{z} eh o maior numero."
	end
end

puts "Informe 3 (três) números: "
num1 = gets.to_i
num2 = gets.to_i
num3 = gets.to_i

puts maior_numero(num1, num2, num3)