#1.12 Tendo como dados de entrada a altura de uma pessoa, construa um algoritmo que
#calcule seu peso ideal, usando a seguinte fórmula: (72.7*altura) - 58

puts "Altura: "
altura = gets.to_f

peso = (72.7 * altura) - 58

puts "O seu peso ideal é de: #{peso.round(2)}"