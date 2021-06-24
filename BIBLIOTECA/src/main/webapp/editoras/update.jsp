<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
    <!DOCTYPE html>
    <html lang="pt-br">

    <head>

        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-wEmeIV1mKuiNpC+IOBjI7aAzPcEZeedi5yW5f2yOq55WWLwNGmvvx4Um1vskeMj0" crossorigin="anonymous">
        <meta charset="utf-8" />
        <title>Editar Editora</title>

    </head>


    <body>
        <h1>Editar Editora</h1>
        <hr />
        <form action="/editoras/update" method="POST">
            <input type="hidden" name="id" value="${editoras.id}" />
            <label for="nome">Nome:</label>
            <input type="text" name="nome" value="${editoras.nome}" />
            <label for="ano">Ano:</label>
            <input type="text" name="ano" value="${editoras.ano}" />
            <label for="cidade">Cidade:</label>
            <input type="text" name="cidade" value="${editoras.cidade}" />

            <a href="/editoras/list" class="btn btn-primary">Voltar</a>
            <input type="submit" value="Salvar" class="btn btn-success" />
        </form>

        

    </body>

    </html>