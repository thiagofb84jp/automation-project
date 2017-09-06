nomes = %w(Jackson José Maria)

nomes.each do |nome|
	puts "Olá, #{nome}"
end

puts "Ruby " + "on " + "Rails " + nomes[0]
texto = "Ruby " << "on " << "Rails " << nomes[0]

puts texto.gsub("Jackson", "O melhor curso!")
puts texto

puts texto.gsub!("Jackson", "O melhor curso!")
puts texto

txt = "Jackon Pires"
puts txt.object_id

txt = txt + " Jr"
puts txt.object_id

#Utilize com maior frequência para concatenar strings o <<
txt = txt << " Rails"
puts txt.object_id

#Ambas as notações informadas nesse bloco de código são iguais
h = {:a => 123, :b => "José"}
puts h

h1 = {a: 123, b: "José"}
puts h1