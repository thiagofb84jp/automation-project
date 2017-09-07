#1.18 Faça um programa que peça o tamanho de um arquivo para download (em MB) e
#a velocidade de um link de Internet (em Mbps), calcule e informe o tempo
#aproximado de download do arquivo usando este link (em minutos).

puts "Qual o tamanho do arquivo para download (em MB)?"
tamArquivo = gets.to_i

puts "Qual a velocidade do link de internet (em MPBS)?"
velLink = gets.to_i

tempoDownload = tamArquivo * velLink

tempMinutos = tempoDownload / 60.0

puts "O tempo aproximado para download é de #{tempMinutos.round(2)} minutos."