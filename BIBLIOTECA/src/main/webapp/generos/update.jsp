<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
    <!DOCTYPE html>
    <html lang="pt-br">

    <head>

        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-wEmeIV1mKuiNpC+IOBjI7aAzPcEZeedi5yW5f2yOq55WWLwNGmvvx4Um1vskeMj0" crossorigin="anonymous">
        <meta charset="utf-8" />
        <title>Editar Gênero</title>

    </head>

    <body>
        <h1>Editar Gênero</h1>
        <hr />
        <form action="/generos/update" method="POST">
            <input type="hidden" name="id" value="${genero.id}" />
            <label for="titulo">Titulo:</label>
            <input type="text" name="nome" value="${genero.nome}" />

            <a href="/generos/list" class="btn btn-primary">Voltar</a>
            <input type="submit" value="Salvar" class="btn btn-success" />
        </form>

    </body>

    </html>