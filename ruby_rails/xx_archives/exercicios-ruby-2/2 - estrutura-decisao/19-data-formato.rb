#2.20 Faça um Programa que peça uma data no formato dd/mm/aaaa e determine se a
#mesma é uma data válida.

def valida_formato_data(dia, mes, ano)
	if (dia > 0) && (dia <= 31)
		if (mes > 0 ) && (mes <= 12)
			puts "#{dia} / #{mes} / #{ano}"
		else
			puts "O mês (#{mes}) informado é inválido!"
		end
	else
		puts "O dia (#{dia}) informado é inválido!"
	end
end

puts "Informe o dia: "
dia = gets.to_i

puts "Informe o mês: "
mes = gets.to_i

puts "Informe o ano: "
ano = gets.to_i

valida_formato_data(dia, mes, ano)