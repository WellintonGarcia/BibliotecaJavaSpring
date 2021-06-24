<%@ page language="java" contentType="text/html ; charset=utf-8" pageEncoding="utf-8" %>

    <!DOCTYPE html>

    <html lang="pt-br">

    <head>
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-wEmeIV1mKuiNpC+IOBjI7aAzPcEZeedi5yW5f2yOq55WWLwNGmvvx4Um1vskeMj0" crossorigin="anonymous">
        <meta charset="utf-8" />
        <title> Novo Autor</title>
    </head>

    <body>
        <main class = "container" >
            <h1>Novo Autor</h1>
            <hr />
            <form action="insert" method="post">
                <div class="form-group">
                    <label for="nome">Nome</label>
                    <input type="text" name="nome" class="form-control" />
                </div>
                <a href="/autores/list" class= "btn btn-primary" >Voltar</a>
                <input type="submit" value="Salvar" class= "btn btn-success"/>
            </form>
        </main>

    </html>