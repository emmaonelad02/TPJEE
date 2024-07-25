

<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>

<!DOCTYPE html>
<html>
<head>
  <title>LA liste des livres</title>
</head>
<body>
<h2>Liste des livres</h2>
<table border="1">
  <tr>
    <th>ID</th>
    <th>Titre</th>
    <th>Auteur</th>
    <th>Année de publication</th>
  </tr>
  <c:forEach var="livre" items="${livres}">
    <tr>
      <td>${livre.id}</td>
      <td>${livre.titre}</td>
      <td>${livre.auteur}</td>
      <td>${livre.anneePublication}</td>
    </tr>
  </c:forEach>
</table>
<a href="ajouterLivre.jsp">Ajouter un nouveau livre</a>
</body>
</html>


