#2.16 O algoritmo deve mostrar na tela as notas, a média, o conceito correspondente e
#a mensagem “APROVADO” se o conceito for A, B ou C ou “REPROVADO” se
#o conceito for D ou E.

def media_notas(nota1, nota2)
	media_total = (nota1 + nota2) / 2

	case
	when (media_total >= 9.0) && (media_total <= 10.0)
		puts "Média de Aproveitamento: #{media_total}"
		puts "Conceito: A"
		puts "APROVADO!"
	when (media_total >= 7.5) && (media_total <= 9.0)
		puts "Média de Aproveitamento: #{media_total}"
		puts "Conceito: B"
		puts "APROVADO!"		
	when (media_total >= 6.0) && (media_total <= 7.5)
		puts "Média de Aproveitamento: #{media_total}"
		puts "Conceito: C"
		puts "APROVADO!"		
	when (media_total >= 4.0) && (media_total <= 6.0)
		puts "Média de Aproveitamento: #{media_total}"
		puts "Conceito: D"
		puts "REPROVADO!"
	else
		puts "Média de Aproveitamento: #{media_total}"
		puts "Conceito: E"
		puts "REPROVADO!"		
	end

end

puts "Informe as duas notas parciais: "
nota1 = gets.to_f
nota2 = gets.to_f

media_notas(nota1, nota2)