def soma(x1, x2)
	total = x1 + x2
	return "Soma: #{total}"
end

def subtracao(x1, x2)
	total = x1 - x2
	return "Subtracao: #{total}"
end

def multiplicacao(x1, x2)
	total = x1 * x2
	return "Multiplicação: #{total}"
end

def divisao(x1, x2)
	total = x1 / x2
	return "divisão: #{total}"
end

puts "O que você deseja (Soma (1), Subtração (2), Multiplicação (3) ou Divisão (4))?"
calc = gets.chomp

case calc
	when '1'
		puts "Digite dois números: "
		a = gets.to_i
		b = gets.to_i
		puts soma(a,b)
	when '2'
		puts "Digite dois números: "
		a = gets.to_i
		b = gets.to_i
		puts subtracao(a,b)
	when '3'
		puts "Digite dois números: "
		a = gets.to_i
		b = gets.to_i
		puts multiplicacao(a,b)
	when '4'
		puts "Digite dois números: "
		a = gets.to_i
		b = gets.to_i
		puts divisao(a,b)
	else
		puts "Opção inválida."
end