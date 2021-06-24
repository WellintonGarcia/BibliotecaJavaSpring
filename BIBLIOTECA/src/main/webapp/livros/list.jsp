<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

    <!DOCTYPE html>
    <html>

    <head>

        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-wEmeIV1mKuiNpC+IOBjI7aAzPcEZeedi5yW5f2yOq55WWLwNGmvvx4Um1vskeMj0" crossorigin="anonymous">
        <meta charset="utf-8" />
        <title>Livros</title>

    </head>

    <body>

        <main class = "container">

            <h1>Livros</h1>

            <a href = "/livros/insert" class = "btn btn-success">Inserir</a>

            <table class = "table">

                <tr>

                    <th>ID</th>
                    <th>Título</th>

                </tr>

                <c:forEach var="L" items="${livros}">

                    <tr>

                        <td>${L.id}</td>
                        <td>${L.titulo}</td>
                        <td><a href = "/livros/update/${L.id}" class = "btn btn-primary">Editar</a></td>
                        <td><a href = "/livros/delete/${L.id}" class = "btn btn-danger">Remover</a></td>

                    </tr>   

                </c:forEach>

            </table>

        </main>

        <script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.9.2/dist/umd/popper.min.js" integrity="sha384-IQsoLXl5PILFhosVNubq5LC7Qb9DXgDA9i+tQ8Zj3iwWAwPtgFTxbJ8NT4GN1R8p" crossorigin="anonymous"></script>
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0/dist/js/bootstrap.min.js" integrity="sha384-lpyLfhYuitXl2zRZ5Bn2fqnhNAKOAaM/0Kr9laMspuaMiZfGmfwRNFh8HlMy49eQ" crossorigin="anonymous"></script>

    </body>

    </html>