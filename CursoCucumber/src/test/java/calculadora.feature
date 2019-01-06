#language: pt
Funcionalidade: Calcular valores
  						Como usuário da calculadora
  						Eu quero somar, subtrair, multiplicar e dividir valores
  						Para que eu possa calcular os valores apresentados

  Contexto: Calcular dois números
    Dado que eu tenho dois números

  Cenário: Somar
    Quando eu somar 2 mais 3
    Então o resultado será 4

  Cenário: Subtrair
    Quando eu subtrair 2 menos 2
    Então o resultado será 0

  Cenário: Multiplicar
    Quando eu multiplicar 2 vezes 2
    Então o resultado será 4

  Cenário: Dividir
    Quando eu dividir 2 dividido 2
    Então o resultado será 1