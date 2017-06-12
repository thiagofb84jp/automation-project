# 2.12. Faça um programa para o cálculo de uma folha de pagamento, sabendo que os descontos são o Imposto de Renda, que depende do salário bruto (conforme tabela abaixo) e 3% para o Sindicato   que o FGTS corresponde a 11% do Salário Bruto, mas não é descontado (é a empresa que deposita). O Salário Líquido corresponde ao Salário Bruto menos os descontos. O programa deverá  pedir ao usuário o valor da sua hora e a quantidade de horas trabalhadas no mês.

def calcula_valor_hora(vlr_hora, qtd_horas_trabalhadas_mes)

	sal_bruto = vlr_hora * qtd_horas_trabalhadas_mes

	case
	when sal_bruto <= 900.00
		 IMP_RENDA = 0
		 PERC_INSS = 0.10
		 PERC_FGTS = 0.11

		 desc_inss = sal_bruto * PERC_INSS
		 inss = sal_bruto - desc_inss