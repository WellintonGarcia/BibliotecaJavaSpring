<%@ page language="java" contentType="text/html ; charset=utf-8" pageEncoding="utf-8" %>

    <!DOCTYPE html>

    <html lang="pt-br">

    <head>
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-wEmeIV1mKuiNpC+IOBjI7aAzPcEZeedi5yW5f2yOq55WWLwNGmvvx4Um1vskeMj0" crossorigin="anonymous">
        <meta charset="utf-8" />
        <title> Nova Editora</title>
    </head>

    <body>
        <main class="container">
            <h1>Nova Editora</h1>
            <hr />
            <form action="insert" method="post">
                <div class="form-group">
                    <label for="nome">Nome</label>
                    <input type="text" name="nome" class="form-control" />
                    <label for="nome">Ano</label>
                    <input type="text" name="ano" class="form-control" />
                    <label for="nome">Cidade</label>
                    <input type="text" name="cidade" class="form-control" />
                </div>
                <a href="/editoras/list" class="btn btn-primary">Voltar</a>
                <input type="submit" value="Salvar" class="btn btn-success" />
            </form>
        </main>

        <script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.9.1/dist/umd/popper.min.js" integrity="sha384-SR1sx49pcuLnqZUnnPwx6FCym0wLsk5JZuNx2bPPENzswTNFaQU1RDvt3wT4gWFG" crossorigin="anonymous"></script>
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta3/dist/js/bootstrap.min.js" integrity="sha384-j0CNLUeiqtyaRmlzUHCPZ+Gy5fQu0dQ6eZ/xAww941Ai1SxSY+0EQqNXNE6DZiVc" crossorigin="anonymous"></script>

    </body>

    </html>