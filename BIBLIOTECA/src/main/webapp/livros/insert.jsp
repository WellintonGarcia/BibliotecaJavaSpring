<%@ page language="java" contentType="text/html ; charset=utf-8" pageEncoding="utf-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

    <!DOCTYPE html>

    <html lang="pt-br">

    <head>
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-wEmeIV1mKuiNpC+IOBjI7aAzPcEZeedi5yW5f2yOq55WWLwNGmvvx4Um1vskeMj0" crossorigin="anonymous">
        <meta charset="utf-8" />
        <title> Novo Livro</title>
    </head>

    <body>
        <main class="container">
            <h1>Novo Livro</h1>
            <hr />
            <form action="insert" method="post">
                <div class="form-group">
                    <label for="titulo">Título</label>
                    <input type="text" name="titulo" class="form-control" />
                </div>
                <div class="form-group">
                    <label for="genero">Gênero:</label>
                    <select name="genero" class="form-control">
                        <c:forEach var="g" items="${generos}">
                            <option value="${g.id}">${g.nome}</option>
                        </c:forEach>
                    </select>
                </div>
                <div class="form-group">
                    <label for="autor">Autor:</label>
                    <select name="autor" class="form-control">
                        <c:forEach var="a" items="${autores}">
                            <option value="${a.id}">${a.nome}</option>
                        </c:forEach>
                    </select>
                </div>
                <div class="form-group">
                    <label for="editora">Editora:</label>
                    <select name="editora" class="form-control">
                        <c:forEach var="e" items="${editoras}">
                            <option value="${e.id}">${e.nome}</option>
                        </c:forEach>
                    </select>
                </div>
                <a href="/livros/list" class="btn btn-primary">Voltar</a>
                <input type="submit" value="Salvar" class="btn btn-success" />
            </form>
        </main>

    </body>

    </html>