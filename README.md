# Projeto ponto eletrônico

Este projeto foi desenvolvido com o principal intuito de de aprender os principais conceitos do Spring Boot,
como por exemplo: 

- Injeção de dependências
- Arquitetura MVC

Para isso foi desenvovido um CRUD básico de um sistema de ponto eletrônico que utiliza dos conceitos acima citados 
no desenvolvimento de uma RestAPI utilizando das boas práticas do desenvolvimento JAVA, como o uso de orientação
a objetos, criação de classes anêmicas(DTO's) somente para comunicação entre cliente e servidor e a criação de 
interfaces para a implementação de classes.

## Desenvolvimento

Para o armazenamento das informações foi utilizado o MySQL em sua versão 8.0. A comunicação entre a aplicação 
e o banco de dados é feita por meio do repositório `mysql-connector-java`. Para o gerenciamento das informações
foi utilizado o repositório `spring-boot-starter-data-jpa`.

## Testes

Para o desenvolvimento dos testes foi criada um novo arquivo `application-test.properties`. Nos testes a comunicação
da aplicação foi feita através do banco de dados em memória H2.

## Documentação 

A documentação da API foi criada utilizando o Swagger. Link abaixo

http://localhost:8080/swagger-ui/

## Modelagem entidade relacional (MER)

O diagram entidade relacional pode visualizado por meio do link abaixo.

https://prnt.sc/pTpBO5NUMfq5

## Cacheamento

Para o cacheamento foi utilizado o ehcache `ehcache`
