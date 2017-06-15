def celsius_fahrenheit(celsius)
	fahrenheit = (celsius * 9/5) + 32
	return "Temperatura (ºC -> ºF): #{fahrenheit}"
end

def fahrenheit_celsius(fahrenheit)
	celsius = (fahrenheit - 32) * 5/9
	return "Temperatura (ºF -> ºC): #{celsius}"
end

def kelvin_fahrenheit(kelvin)
	fahrenheit = (kelvin - 273.15) * 9/5 + 32
	return "Tempetura (Kelvin -> ºF): #{fahrenheit}"
end

def kelvin_celsius(kelvin)
	celsius = kelvin - 273.15
	return "Tempetura (Kelvin -> ºC): #{celsius}"
end

p celsius_fahrenheit(50)
p fahrenheit_celsius(212)
#p kelvin_fahrenheit(212)
#p kelvin_celsius(100)