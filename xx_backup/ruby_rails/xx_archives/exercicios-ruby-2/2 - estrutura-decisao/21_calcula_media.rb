#2.22 Faça um Programa para leitura de três notas parciais de um aluno. O programa
#deve calcular a média alcançada por aluno e presentar:
#a. A mensagem "Aprovado", se a média for maior ou igual a 7, com a
#respectiva média alcançada;
#b. A mensagem "Reprovado", se a média for menor do que 7, com a
#respectiva média alcançada;
#c. A mensagem "Aprovado com Distinção", se a média for igual a 10.
def calcula_media(n1, n2, n3)

	media = (n1 + n2 + n3)/3

	case
	when (media >= 7) && (media < 10)
		puts "Aprovado"
	when media == 10
		puts "Aprovado com Distinção"		
	when media < 7
		puts "Reprovado"
	else
		puts "Nenhuma das opções listadas! Tente outra vez!"
	end
end

puts "Informe as três notas: "
nota1 = gets.to_i
nota2 = gets.to_i
nota3 = gets.to_i

calcula_media(nota1, nota2, nota3)