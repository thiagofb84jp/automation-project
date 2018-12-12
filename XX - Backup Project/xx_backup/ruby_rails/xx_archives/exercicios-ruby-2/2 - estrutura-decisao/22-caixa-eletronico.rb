#2.23 Faça um Programa para um caixa eletrônico. O programa deverá perguntar ao
#usuário a valor do valor_saque e depois informar quantas notas de cada valor serão
#fornecidas. As notas disponíveis serão as de 1, 5, 10, 50 e 100 reais. O valor
#mínimo é de 10 reais e o máximo de 600 reais. O programa não deve se preocupar
#com a quantidade de notas existentes na máquina.

def caixa_eletronico(valor_saque)

	if (valor_saque < 10) && (valor_saque > 600)
		puts "Valor não permitido! Tente outra vez!"
	end

	notas = valor_saque/100;
	valor_saque = (valor_saque - (notas * 100));
	if(notas > 0)
		puts "Notas de R$ 100: #{notas} notas"
	end

	notas = valor_saque/50;
	valor_saque = (valor_saque - (notas * 50));
	if(notas > 0)
		puts "Notas de R$ 50: #{notas} notas"
	end

	notas = valor_saque/10;
	valor_saque = (valor_saque - (notas * 10));
	if(notas > 0)
		puts "Notas de R$ 10: #{notas} notas"
	end

	notas = valor_saque/5;
	valor_saque = (valor_saque - (notas * 5));
	if(notas > 0)
		puts "Notas de R$ 5: #{notas} notas"
	end

	notas = valor_saque/1;
	valor_saque = (valor_saque - (notas * 1));
	if(notas > 0)
		puts "Notas de R$ 1: #{notas} notas"
	end

end

puts "Informe o valor do saque (Mínimo: R$ 10 | Máximo: R$ 600):"
valor = gets.to_i

caixa_eletronico(valor)