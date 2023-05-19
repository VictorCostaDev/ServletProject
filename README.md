<h1>API de Cadastro de Usuarios e Livros</h1>

## Indice
- [Sobre](#sobre)
- [Tecnologias Utilizadas](#tecnologias-utilizadas)
- [Como a API Funciona](#como-a-api-funciona)
- [Como baixar o projeto](#como-baixar-o-projeto)

## Sobre
API de Cadastro de usuarios que foi criado no curso de **Java** da Daniele Leao, houve um incremento de uma nova rota na api, o cadastro de livros. O objetivo da construção API é aprender **Servlet** que é a base para aprender **Spring Boot**.

---

## Tecnologias Utilizadas
O projeto foi desenvolvido utilizando as seguintes tecnologias

- Java 17
- Servlet
- Gson
- Apache Tomcat

---

## Como a API Funciona
Obs: Ferramenta Insomnia utilizada para testar a API <br>
- Cadastro de Livro:
<img src="https://ik.imagekit.io/ydl7kadtk/bookPOST.png?updatedAt=1684523777412">

- Retorna Todos os livros cadastrados se o client tiver autorização:
<img src="https://ik.imagekit.io/ydl7kadtk/bookAuthorizedGET.png?updatedAt=1684523847295">

- Retorna 401 se o client não tiver autorização
<img src="https://ik.imagekit.io/ydl7kadtk/bookNotAuthorizedGET.png?updatedAt=1684523963436">

---
## Como Baixar o projeto
```bash
    # clonar o repositório
    $ git clone https://github.com/VictorCostaDev/ServletProject.git

    # Entrar no diretório
    $ cd ServletProject

    # Baixar as dependências
    $ mvn install

    # Startar o Servidor (Tomcat)
```
obs: É preciso ter o ***JRE17*** e o ***Tomcat*** para que a Aplicação possa funcionar.