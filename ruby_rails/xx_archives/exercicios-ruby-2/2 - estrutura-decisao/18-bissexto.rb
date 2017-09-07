#2.19 Faça um Programa que peça um número correspondente a um determinado ano e
#em seguida informe se este ano é ou não bissexto.

def bissexto(ano)
	if ((ano % 4) == 0) && ((ano % 100) != 0 ) || ((ano % 400) == 0)
		puts "O ano informado (#{ano}) é bissexto!"
	else
		puts "O ano informado (#{ano}) NÃO é bissexto!"
	end
end

puts "Informe o ano: "
ano = gets.to_i

bissexto(ano)