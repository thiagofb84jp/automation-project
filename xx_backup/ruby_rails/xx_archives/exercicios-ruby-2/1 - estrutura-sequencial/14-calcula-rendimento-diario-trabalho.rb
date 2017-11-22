#1.14 João Papo-de-Pescador, homem de bem, comprou um microcomputador para
#controlar o rendimento diário de seu trabalho. Toda vez que ele traz um peso de
#peixes maior que o estabelecido pelo regulamento de pesca do estado de São
#Paulo (50 quilos) deve pagar uma multa de R$ 4,00 por quilo excedente. João
#precisa que você faça um programa que leia a variável peso (peso de peixes) e
#verifique se há excesso. Se houver, gravar na variável excesso e na variável multa
#o valor da multa que João deverá pagar. Caso contrário mostrar tais variáveis com
#o conteúdo ZERO.

puts "Informe o peso dos peixes: "
peso_peixes = gets.to_i

if peso_peixes > 50
	excesso = peso_peixes - 50
	multa = excesso * 4
	puts "Deu excesso de #{excesso} peixes. Você deverá pagar a multa de #{multa}."
else
	excesso = "ZERO"
	multa = "ZERO"
	puts "Não deu excesso de peixes (#{excesso}). Você não deverá pagar nada (#{multa})."
end