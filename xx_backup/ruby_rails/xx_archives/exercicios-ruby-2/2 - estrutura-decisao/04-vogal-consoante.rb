#2.4 Faça um Programa que verifique se uma letra digitada é vogal ou consoante.

def vogal_consoante(letra)
	if  (letra == "a") || (letra == "e") || (letra == "i") || (letra == "o") || (letra == "u")
		puts "A letra informada é VOGAL"
	else
		puts "A letra informada é CONSOANTE"
	end
end

puts "Informe uma letra: "
letra = gets.chomp

puts vogal_consoante(letra)