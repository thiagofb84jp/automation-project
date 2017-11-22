# 2.12. Faça um programa para o cálculo de uma folha de pagamento, sabendo que os descontos são o Imposto de Renda, que depende do salário bruto (conforme tabela abaixo) e 3% para o SINDICATO   que o FGTS corresponde a 11% do Salário Bruto, mas não é descontado (é a empresa que deposita). O Salário Líquido corresponde ao Salário Bruto menos os descontos. O programa deverá  pedir ao usuário o valor da sua hora e a quantidade de horas trabalhadas no mês.
def calcula_valor_hora(vlr_hora, qtd_horas_trabalhadas_mes)

	sal_bruto = vlr_hora * qtd_horas_trabalhadas_mes

	case
	when sal_bruto <= 900.00
		 perc_imp_renda = 0.0
		 perc_inss = 0.10
		 perc_fgts = 0.11
		 perc_sindic = 0.03

		 desc_IR = sal_bruto * perc_imp_renda
		 ir = sal_bruto - desc_IR

		 desc_INSS = sal_bruto * perc_inss
		 inss = sal_bruto - desc_INSS

		 desc_FGTS = sal_bruto * perc_fgts
		 fgts = sal_bruto - desc_FGTS

		 desc_SINDIC = sal_bruto * perc_sindic
		 sindic = sal_bruto - desc_SINDIC

		 total_desc = desc_IR + desc_INSS + desc_SINDIC
		 sal_liquido = sal_bruto - total_desc

		 puts "***** Folha de Pagamento (Salario Bruto <= 900.00) *****"
		 puts "Salario Bruto: #{sal_bruto}"
		 puts "(-) IR (ISENTO) #{desc_IR}"
		 puts "(-) INSS (10%) #{desc_INSS}"
		 puts "(-) SINDICATO (3%) #{desc_SINDIC}"
		 puts "FGTS (11%) #{desc_FGTS}"
		 puts "Total de Descontos: #{total_desc}"
		 puts "Salario Liquido: #{sal_liquido}"
	when (sal_bruto > 900.00) && (sal_bruto <= 1500.00)
		 perc_imp_renda = 0.05
		 perc_inss = 0.10
		 perc_fgts = 0.11
		 perc_sindic = 0.03 

		 desc_IR = sal_bruto * perc_imp_renda
		 ir = sal_bruto - desc_IR

		 desc_INSS = sal_bruto * perc_inss
		 inss = sal_bruto - desc_INSS

		 desc_FGTS = sal_bruto * perc_fgts
		 fgts = sal_bruto - desc_FGTS

		 desc_SINDIC = sal_bruto * perc_sindic
		 sindic = sal_bruto - desc_SINDIC

		 total_desc = desc_IR + desc_INSS + desc_SINDIC
		 sal_liquido = sal_bruto - total_desc

		 puts "***** Folha de Pagamento (Salario Bruto <= 1500.00) *****"
		 puts "Salario Bruto: #{sal_bruto}"
		 puts "(-) IR (5%) #{desc_IR}"
		 puts "(-) INSS (10%) #{desc_INSS}"
		 puts "(-) SINDICATO (3%) #{desc_SINDIC}"
		 puts "FGTS (11%) #{desc_FGTS}"
		 puts "Total de Descontos: #{total_desc}"
		 puts "Salario Liquido: #{sal_liquido}"
	when (sal_bruto > 1500.00) && (sal_bruto <= 2500.00)
		 perc_imp_renda = 0.10
		 perc_inss = 0.10
		 perc_fgts = 0.11
		 perc_sindic = 0.03		 

		 desc_IR = sal_bruto * perc_imp_renda
		 ir = sal_bruto - desc_IR

		 desc_INSS = sal_bruto * perc_inss
		 inss = sal_bruto - desc_INSS

		 desc_FGTS = sal_bruto * perc_fgts
		 fgts = sal_bruto - desc_FGTS

		 desc_SINDIC = sal_bruto * perc_sindic
		 sindic = sal_bruto - desc_SINDIC

		 total_desc = desc_IR + desc_INSS + desc_SINDIC
		 sal_liquido = sal_bruto - total_desc

		 puts "***** Folha de Pagamento (Salario Bruto <= 2500.00) *****"
		 puts "Salario Bruto: #{sal_bruto}"
		 puts "(-) IR (10%) #{desc_IR}"
		 puts "(-) INSS (10%) #{desc_INSS}"
		 puts "(-) SINDICATO (3%) #{desc_SINDIC}"
		 puts "FGTS (11%) #{desc_FGTS}"
		 puts "Total de Descontos: #{total_desc}"
		 puts "Salario Liquido: #{sal_liquido}"
	else
		 perc_imp_renda = 0.20
		 perc_inss = 0.10
		 perc_fgts = 0.11
		 perc_sindic = 0.03		 

		 desc_IR = sal_bruto * perc_imp_renda
		 ir = sal_bruto - desc_IR

		 desc_INSS = sal_bruto * perc_inss
		 inss = sal_bruto - desc_INSS

		 desc_FGTS = sal_bruto * perc_fgts
		 fgts = sal_bruto - desc_FGTS

		 desc_SINDIC = sal_bruto * perc_sindic
		 sindic = sal_bruto - desc_SINDIC

		 total_desc = desc_IR + desc_INSS + desc_SINDIC
		 sal_liquido = sal_bruto - total_desc

		 puts "***** Folha de Pagamento (Salario Bruto > 2500.00) *****"
		 puts "Salario Bruto: #{sal_bruto}"
		 puts "(-) IR (20%) #{desc_IR}"
		 puts "(-) INSS (10%) #{desc_INSS}"
		 puts "(-) SINDICATO (3%) #{desc_SINDIC}"
		 puts "FGTS (11%) #{desc_FGTS}"		 
		 puts "Total de Descontos: #{total_desc}"
		 puts "Salario Liquido: #{sal_liquido}"
	end
end

puts "Qual o valor da hora? "
valor_hora = gets.to_f

puts "Qual a quantidade de horas? "
quantidade_hora = gets.to_f

calcula_valor_hora(valor_hora, quantidade_hora)