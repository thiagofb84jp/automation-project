#2.3 Faça um Programa que verifique se uma letra digitada é "F" ou "M". Conforme a 
#letra escrever: F - Feminino, M - Masculino, Sexo Inválido.

def feminino_masculino(sexo)
	if sexo == "F"
		puts "Sexo = Feminino"
	elsif sexo == "M"
		puts "Sexo = Masculino"
	else
		puts "Sexo Inválido"
	end
end

puts "Digite o sexo: "
sexo = gets.chomp
sexo.upcase! #De certa forma, ao colcar a exclamação(!), o programa converteu para 

puts feminino_masculino(sexo)