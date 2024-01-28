<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
    <head>
        <title>Ejemplo HTML desde Servlet</title>
        <link rel="stylesheet" type="text/css" href="/resources/css/estilos.css">
    </head>
    <body>
        <h1>Ejemplo Servlet</h1>
        <p>Este es un ejemplo en el curso de Java para generar HTML desde un Servlet.</p>
        <form action="/myServlet2" method="get">
            <label for="name">Nombre:</label><br>
            <input type="text" id="name" name="name"><br>
            <label for="date">Fecha:</label><br>
            <input type="date" id="date" name="date"><br>
            <input type="submit" value="Enviar">
        </form>
    </body>
</html>