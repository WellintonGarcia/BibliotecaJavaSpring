<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>

    <!DOCTYPE html>
    <html lang="pt-br">

    <head>

        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-wEmeIV1mKuiNpC+IOBjI7aAzPcEZeedi5yW5f2yOq55WWLwNGmvvx4Um1vskeMj0" crossorigin="anonymous">
        <meta charset="utf-8" />
        <title>Remover Autor</title>

    </head>

    <body>
        <h1>Remover Autor</h1>
        <hr />
        <p>Tem certeza que deseja remover o autor? <em>"${autores.nome}" </em></p>
        <form action="/autores/delete" method="POST">
            <input type="hidden" name="id" value="${autores.id}" />
            <a href="/autores/list" class="btn btn-primary">Voltar</a>
            <input type="submit" value="Remover" class="btn btn-danger" />
        </form>

    </body>
