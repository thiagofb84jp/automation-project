#Condicionais

a = 3
b = 5

if a < b
	puts "a é menor"
else
	puts "a é maior"
end

unless a < b
	puts "b é menor"
else
	puts "a é menor"
end

#case condicional
case a
when 3
	puts "é três"
when 4
	puts "é quatro"
end	

#condicional ternário
(a == 3) ? (puts "é igual a 3") : (puts "é diferente!")

#operadores aritméticos
puts 1 + 2
puts 2 * 2
puts 5 - 3
puts 4 / 4
puts 2**3
puts 5%1

#Enquanto que
while a < 10
	a += 1
	puts a
end

#Até que
until a == 0
	a-=1
	puts a
end

#For
for i in 0..5
	puts i
end

#Pegue cada elemento da lista e imprima
[1,2,3,4].each do |j|
	puts j
end