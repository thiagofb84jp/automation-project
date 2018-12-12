# 2.11 Faça um programa que recebe o salário de um colaborador e o reajuste segundo o seguinte critério, baseado no salário atual:
def reajuste_salarial(salario)
	case
	when salario <= 280.00
		percentual = 0.20

		valor_aumento = salario * percentual
		novo_salario = salario + valor_aumento

		puts "***** Informações Adicionais *****"
		puts "Salario antes do reajuste: #{salario}"
		puts "Percentual do aumento: #{percentual * 100}%"
		puts "Valor do aumento: #{valor_aumento.round(2)}"
		puts "Novo salário: #{novo_salario}"
	when (salario > 280.00) && (salario <= 700.00)
		percentual = 0.15

		valor_aumento = salario * percentual
		novo_salario = salario + valor_aumento

		puts "***** Informações Adicionais *****"
		puts "Salario antes do reajuste: #{salario}"
		puts "Percentual do aumento: #{percentual * 100}%"
		puts "Valor do aumento: #{valor_aumento.round(2)}"
		puts "Novo salário: #{novo_salario}"
	when (salario > 700.00) && (salario <= 1500.00)
		percentual = 0.10

		valor_aumento = salario * percentual
		novo_salario = salario + valor_aumento

		puts "***** Informações Adicionais *****"
		puts "Salario antes do reajuste: #{salario}"
		puts "Percentual do aumento: #{percentual * 100}%"
		puts "Valor do aumento: #{valor_aumento.round(2)}"
		puts "Novo salário: #{novo_salario}"
	else
		percentual = 0.05

		valor_aumento = salario * percentual
		novo_salario = salario + valor_aumento

		puts "***** Informações Adicionais *****"
		puts "Salario antes do reajuste: #{salario}"
		puts "Percentual do aumento: #{percentual * 100}%"
		puts "Valor do aumento: #{valor_aumento.round(2)}"
		puts "Novo salário: #{novo_salario}"
	end
end

puts "Qual o seu salario? "
salario = gets.to_f

reajuste_salarial(salario)