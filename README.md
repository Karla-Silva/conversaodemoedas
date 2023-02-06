<p align="center">
  <img width="1000" height="300" src="http://conteudo.imguol.com.br/c/noticias/f3/2022/07/13/euro-dolar-1657735597311_v2_1183x887.jpg">
</p>

# API de Ordem de Compra - \<Dev>ª - B³/Let's Code (Ada) - Projeto Final (Módulo 06 - Arquitetura de Software e Ágil I)
 
## 💻 Sobre
Esta etapa do curso BackEnd Java do programa \<Dev>ª - B³/Let's Code (Ada) consiste da partipação do Módulo 06 - ARQUITETURA DE SOFTWARE I e entrega do projeto API de Ordem de Compra. Este repositório contém o projeto final.

## 📋Tabela de conteúdos
<!--ts-->
   * [Sobre](https://github.com/Karla-Silva/conversaodemoedas#-sobre)
   * [Tabela de Conteudo](https://github.com/Karla-Silva/conversaodemoedas#tabela-de-conte%C3%BAdos)
   * [Descrição do Projeto](https://github.com/Karla-Silva/conversaodemoedas#-descri%C3%A7%C3%A3o-do-projeto)
   * [Background](https://github.com/Karla-Silva/conversaodemoedas#-background)
   * [Desenvolvimento](https://github.com/Karla-Silva/conversaodemoedas#desenvolvimento)
   * [Tecnologias](https://github.com/Karla-Silva/conversaodemoedas#-tecnologias)
   * [Ass](https://github.com/Karla-Silva/conversaodemoedas#-ass)
<!--te-->

## 🧾 Descrição do Projeto
  
  <p align="center">
  <img width="1200" height="200" src="https://ada-site-frontend.s3.sa-east-1.amazonaws.com/home/header-logo.svg">
</p>
  Realizar a implementação de uma API que gera uma ordem de compra das moedas estrangeiras 💵USD (dólar) e 💶EUR (euro).
  
  Para que o cliente realize a compra, primeiro ele deve se cadastrar no sistema informando o nome, cpf, data de nascimento, estado civil e sexo. Para tanto, um microsserviço de cadastro deve ser criado, gerando um id de cliente ao final de um processamento bem sucedido. Também deverá ser criado um endpoint de consulta do cliente pelo seu cpf.

Após efetuar o cadastro, o cliente pode registrar a ordem de compra, que consiste em informar seu cpf, o tipo de moeda (USD ou EUR), o valor em moeda estrangeira e o número da agência (4 dígitos) que ocorrerá a retirada.

Também deverá ser criada uma API para calcular a cotação da moeda, a qual deve chamar a API externa https://economia.awesomeapi.com.br/ informando a sigla da moeda desejada (https://economia.awesomeapi.com.br/USD/ ou https://economia.awesomeapi.com.br/EUR/). Se o cliente tentar comprar outra moeda que não USD ou EUR, deverá ser lançada uma exceção.

A API irá calcular o valor total com base na cotação da moeda multiplicada pelo valor desejado de compra. Ao final de uma requisição bem sucedida, deverá ser retornado um request body similiar ao abaixo:

{
    "id_compra": 1,
    "id_cliente": 1,
    "cpf_cliente": "43488428095",
    "dataSolicitacao": "2021-08-27T16:11:23.866",
    "tipo_moeda": "EUR",
    "valor_moeda_estrangeira": 100.0,
    "valor_cotacao": 6.5857,
    "valor_total_operacao": 658.57,
    "numero_agencia_retirada": "7057"
}

A escolha do banco de dados é livre, ficando a seu critério a utilização de banco de dados em memória ou algum outro SGBD. Utilize os conceitos de arquitetura, SOLID e Design Patterns apresentados no módulo.

Utilize as ferramentas de gerenciamento apresentadas no módulo, como Kanban e controle por Sprints.

O Projeto será desenvolvido em Squads formados por 3 membros. Sequindo a metodologia Scrum deve ser organizado em Sprints de 5 dias corridos:

Será necessário coletar evidências da realização das cerimônias de Sprint Planning (mínimo de um print do board com as tarefas planejadas para a Sprint);
Será necessário coletar evidências da realização das cerimônias de Sprint Review (mínimo de um print do board com as tarefas efetivamente completadas na Sprint);
No board usado para gestão da Sprint deve ser possível identificar o membro responsável por cada tarefa;
O projeto será desenvolvido usando Git com o padrão GitFlow, com no mínimo uma branch para cada funcionalidade (feature) e uma branch release para cada Sprint.


## 👩‍🏫 Background
  * 🗃Banco de dados: H2
  * 📃Princípios do SOLID
  * 🤏Design Patterns: Microsserviços
  * 🏃‍♀️Sprint planning e review
 
## 👩‍💻Desenvolvimento
   
 Subdividimos o projeto nas seguintes etapas:
  * Criar projeto base;
  * Criar microsserviço de pessoa;
  * Criar microsserviço de cotação de moeda;
  * Criar microsserviço de registro da ordem de compra;
 
## 🛠 Tecnologias
As seguintes ferramentas foram usadas na construção do projeto:
* **[Java](https://www.java.com/pt-BR/)**
* **[IntelliJ](https://www.jetbrains.com/pt-br/idea/download/#section=windows)**
* **[Trello](https://trello.com/b/Xk50BrK2/projeto-java)**

## 📝 Ass
Feito com ❤️ por: <br>
 * Fernanda Savatin [Entre em contato!](https://www.linkedin.com/in/fernanda-savatin/)
 * Karla Silva [Entre em contato!](https://www.linkedin.com/in/karla-de-morais-silva-821296165/)
 * Mayara Carvalho [Entre em contato!](https://www.linkedin.com/in/mayara-carvalho-a68988250/)
