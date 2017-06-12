#2.5 Faça um programa para a leitura de duas notas parciais de um aluno. O programa deve #calcular a média alcançada por aluno e apresentar as seguintes mensagens:

#* A mensagem "Aprovado", se a média alcançada for maior ou igual a sete;
#* A mensagem "Reprovado", se a média for menor do que sete;
#* A mensagem "Aprovado com Distinção", se a média for igual a dez.

def calcular_media(x1, x2)
	media = (x1 + x2)/2

	if media < 7
		puts "Reprovado"
	elsif media == 10
		puts "Aprovado com Distinção"
	else
		puts "Aprovado"
	end
end

puts "Informe as duas notas: "
nota1 = gets.to_i
nota2 = gets.to_i

puts calcular_media(nota1, nota2)