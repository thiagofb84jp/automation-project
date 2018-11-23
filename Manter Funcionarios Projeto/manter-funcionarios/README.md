# Desafio cadastro de funcionários da empresa

## Oportunidade

Olá! Temos uma oportunidade para testador pleno na Novio e gostaríamos que você participasse do nosso processo seletivo. Ao fim do processo, você receberá um feedback do nosso time com o resultado do processo 😃.

## Detalhamento do desafio

O desafio será focado em criar testes de aceitação e de integração para o sistema ManterFuncionarios. Os testes de aceitação deverão ser automatizados e integrados ao build do projeto. Propositalmente o projeto tem erros que devem ser cobertos nos testes demonstrando quais cenários apresentam as falhas.

## Pré-requisitos para executar o projeto e logar no sistema

 - JDK 8+;
 - Maven 3.3+;
 - Dependências já estão declaradas no pom.xml (Driver H2, Spring Boot, Swagger)

O banco de dados é o h2, portanto não será necessário baixar e configurar um banco (Verificar o application.yml para mais detalhes).
Para iniciar o projeto basta executar ‘mvn spring-boot:run’ na raiz. A API está disponível através do ‘localhost:8080’.

## Serviços e funcionalidades a serem testadas

 - Manter usuário (Campos: nome, login e senha);
 - Manter funcionário (Campos: nome completo, matrícula, ocupação e setor);

## Regras específicas:

 - Todas as deleções são lógicas gerenciados por uma flag no código.
 - A senha será armazenada como um Hash;

## Tecnologias para os testes:

 - Java 8+;
 - Maven 3.3+;
 - Junit 5 e Rest assured (ou outros frameworks para automação);

## Instruções

1. Após o envio do desafio você terá 3 dias para desenvolver. Seja criativo! Utilize as ferramentas e frameworks ao seu favor.
2. Atualize o README.MD do projeto e detalhe as etapas para que os testes sejam executados.
3. Após finalizado envie o projeto zipado para o e-mail dangellys@novio.com.br.

------------------------------------------------------------

# Desafio: Cadastro de Funcionários de uma empresa
Feito por: Thiago Ferreira Barbosa

##Pontos importantes:
Conforme relatado, foram identificados defeitos no sistema 'Manter Funcionários' (como, por exemplo, o sistema está criando os usuários de forma inativa). Os mesmos estão pontuados na sessão 'Defeitos Identificados' e alguns deles já encontram-se mapeados nos testes para uma nova validação após correção.

## Quais as tecnologias utilizadas para este desafio?
- Java 8+;
- Maven 4+;
- JUnit 5+;
- Rest Assured 3+;
- JSON.Simple 1+;
- Postman 6+;
- Padrão de desenvolvimento Page Objects;

##Como as etapas de testes devem ser executadas?
Em cada classe, os métodos devem ser executados sequencialmente. Por exemplo, a sequência de execução dos casos de testes da classe UsuarioPostTeste.class deve ser a seguinte: cadastrarUsuarioComCamposVazios → cadastrarUsuarioComURLInvalida → validarUsuarioAtivo, entre outros. Em anexo, pode-se verificar uma planilha em anexo (Mapeameto dos Metodos de Teste [Funcionario].xlsx e Mapeameto dos Metodos de Teste [Usuarios].xlsx) associados às requisições (GET, POST, entre outros).

## Defeitos Identificados
1. Sistema adiciona novo usuário com status 'inativo';
   → Ao criar um novo usuário, pode-se verificar que o seu status encontra-se de forma inativa;
2. Sistema permite cadastrar o mesmo funcionário mais de uma vez;
   → Ao criar um novo funcionário, caso execute novamente o método POST, o sistema permite que seja realizado o cadastro de um usuário mais de uma vez;
3. Sistema permite criar usuários e funcionários com campos vazios;
   → Ao criar um novo usuário/funcionário, sistema permite cria-los sem o preenchimento de todos os campos (como o campo 'Nome', por exemplo);
4. Sistema não está permitindo atualizar os registros (com a execução das requisições PUT), informando no retorno que, para qualquer método, o login já encontra-se cadastrado.