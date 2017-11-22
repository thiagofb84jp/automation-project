=begin
def meu_menu
	puts "xxxxxxxxxxxxxxxxxxxxxx"
	puts "|        MENU        |"
	puts "xxxxxxxxxxxxxxxxxxxxxx"
end

meu_menu
meu_menu
meu_menu
meu_menu

=end

def meu_menu(value) 
	puts "#{value}#{value}#{value}#{value}#{value}#{value}#{value}#{value}#{value}#{value}#{value}#{value}#{value}#{value}#{value}#{value}#{value}#{value}#{value}#{value}#{value}#{value}"
	puts "|        MENU        |"
	puts "#{value}#{value}#{value}#{value}#{value}#{value}#{value}#{value}#{value}#{value}#{value}#{value}#{value}#{value}#{value}#{value}#{value}#{value}#{value}#{value}#{value}#{value}"
end

def soma(a, b)
	resultado = a + b
	puts "A soma foi: #{resultado}"
end

meu_menu("-")
meu_menu("x")
meu_menu("c")
meu_menu("w")

soma(2,6)