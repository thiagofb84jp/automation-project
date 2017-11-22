# 2.10. Faça um Programa que pergunte em que turno você estuda. Peça para digitar M-matutino ou V-Vespertino ou N- Noturno. Imprima a mensagem "Bom Dia!","Boa Tarde!" ou "Boa Noite!" ou "Valor Inválido!", conforme o caso.
def msg_turno(turno)
	case turno
	when "M"
		puts "Bom dia!"
	when "V"
		puts "Boa tarde!"
	when "N"
		puts "Boa noite!"
	else
		puts "Valor inválido! Tente outra vez."
	end
end

puts "Qual turno voce estuda? "
periodo = gets.chomp

msg_turno(periodo)