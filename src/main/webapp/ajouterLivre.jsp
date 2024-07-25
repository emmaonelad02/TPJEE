<%--
  Created by IntelliJ IDEA.
  User: emma
  Date: 19-07-2024
  Time: 11:22
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Ajouter un livre</title>
</head>
<body>
<h2>Ajouter un nouveau livre</h2>
<form action="livres" method="post">
    <label for="titre">Titre:</label>
    <input type="text" id="titre" name="titre"><br><br>
    <label for="auteur">Auteur:</label>
    <input type="text" id="auteur" name="auteur"><br><br>
    <label for="anneePublication">Année de publication:</label>
    <input type="text" id="anneePublication" name="anneePublication"><br><br>
    <input type="submit" value="Ajouter Livre">
</form>
<a href="livres">Retour à la liste des livres</a>
</body>
</html>

