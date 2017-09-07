# 2.7. Faça um Programa que leia três números e mostre o maior e o menor deles.

def maior_numero(x, y, z)
	if (x > y) && (x > z)
		puts "#{x} eh o maior numero."
	elsif (y > x) && (y > z)
		puts "#{y} eh o maior numero."
	else
		puts "#{z} eh o maior numero."
	end
end

def menor_numero(a, b, c)
	if (a < b) && (a < c)
		puts "#{a} eh o menor numero."
	elsif (b < a) && (b < c)
		puts "#{b} eh o menor numero."
	else
		puts "#{c} eh o menor numero."
	end
end

puts "Informe 3 (três) números: "
num1 = gets.to_i
num2 = gets.to_i
num3 = gets.to_i

puts maior_numero(num1, num2, num3)
puts menor_numero(num1, num2, num3)