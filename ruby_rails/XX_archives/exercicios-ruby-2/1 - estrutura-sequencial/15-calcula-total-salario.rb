#1.15 Faça um Programa que pergunte quanto você ganha por hora e o número de horas
#trabalhadas no mês. Calcule e mostre o total do seu salário no referido mês,
#sabendo-se que são descontados 11% para o Imposto de Renda, 8% para o INSS e
#5% para o sindicato, faça um programa que nos dê:
#a. salário bruto.
#b. quanto pagou ao INSS.
#c. quanto pagou ao sindicato.
#d. o salário líquido.
#e. calcule os descontos e o salário líquido, conforme a tabela
#abaixo:
#+
#-
#-
#-
#=
#Salário Bruto : R$
#IR (11%) : R$
#INSS (8%) : R$
#Sindicato ( 5%) : R$
#Salário Liquido : R$
#Obs.: Salário Bruto - Descontos = Salário Líquido.

puts "Quanto você ganha por hora? "
valorHora = gets.to_f

puts "Qual o número de horas trabalhadas? "
horaTrabalhada = gets.to_i

salBruto = valorHora * horaTrabalhada

ImpostoRenda = (salBruto * 11/100)
INSS = (salBruto * 8/100)
sindicato = (salBruto * 5/100)

valorDescontos = ImpostoRenda + INSS + sindicato
salLiquido = salBruto - valorDescontos

puts "VALORES A SEREM RECEBIDOS:\n"
puts "Salário Bruto: R$ #{salBruto}\n"
puts "Imposto de Renda: R$ #{ImpostoRenda}\n"
puts "INSS: R$ #{INSS}\n"
puts "Sindicato: R$ #{sindicato}\n"

puts "Seu salário líquido é de: R$ #{salLiquido}"