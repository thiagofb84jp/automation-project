#2.18. Faça um programa que calcule as raízes de uma equação do segundo grau, na
#forma ax2 + bx + c. O programa deverá pedir os valores de a, b e c e fazer as
#consistências, informando ao usuário nas seguintes situações:

def calcula_raiz_equacao(a, b, c)
	if a == 0
		puts "Esta não é uma equação do segundo grau."
		break
	else
		delta1 = (b * b) - 4 * a * c
		delta2
		
