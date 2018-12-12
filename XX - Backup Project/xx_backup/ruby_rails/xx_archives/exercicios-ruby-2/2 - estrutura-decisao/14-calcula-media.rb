#2.15 Faça um programa que lê as duas notas parciais obtidas por um aluno numa
#disciplina ao longo de um semestre, e calcule a sua média. A atribuição de
#conceitos obedece à tabela abaixo:

def media_notas(nota1, nota2)
	media_total = (nota1 + nota2) / 2

	case
	when (media_total >= 9.0) && (media_total <= 10.0)
		puts "Média de Aproveitamento: #{media_total}"
		puts "Conceito: A"
	when (media_total >= 7.5) && (media_total <= 9.0)
		puts "Média de Aproveitamento: #{media_total}"
		puts "Conceito: B"
	when (media_total >= 6.0) && (media_total <= 7.5)
		puts "Média de Aproveitamento: #{media_total}"
		puts "Conceito: C"
	when (media_total >= 4.0) && (media_total <= 6.0)
		puts "Média de Aproveitamento: #{media_total}"
		puts "Conceito: D"
	else
		puts "Média de Aproveitamento: #{media_total}"
		puts "Conceito: E"
	end

end

puts "Informe as duas notas parciais: "
nota1 = gets.to_f
nota2 = gets.to_f

media_notas(nota1, nota2)