<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>

    <!DOCTYPE html>
    <html lang="pt-br">

    <head>
        
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-wEmeIV1mKuiNpC+IOBjI7aAzPcEZeedi5yW5f2yOq55WWLwNGmvvx4Um1vskeMj0" crossorigin="anonymous">
        <meta charset="utf-8" />
        <title>Remover Editora</title>

    </head>

    <body>
        <h1>Remover Editora</h1>
        <hr />
        <p>Tem certeza que deseja remover a editora? <em>"${editoras.nome}" </em></p>
        <form action="/editoras/delete" method="POST">
            <input type="hidden" name="id" value="${editoras.id}" />
            <a href="/editoras/list" class="btn btn-primary">Voltar</a>
            <input type="submit" value="Remover" class="btn btn-danger" />
        </form>

    </body>
    </html>
