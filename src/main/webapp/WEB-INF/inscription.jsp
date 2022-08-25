<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Inscription</title>
</head>
<body>
	<h1>Inscription</h1>
	<form:form modelAttribute="client" action="inscription" method="post">
		<form:label path="nom">Nom : </form:label>
		<form:input path="nom" placeholder="Nom" required ="required" />
		<br>
		<form:label path="prenom">Prénom : </form:label>
		<form:input path="prenom" placeholder="Prénom" required ="required"/>
		<br>
		<form:label path="email">Email : </form:label>
		<form:input path="email" placeholder="Email" required ="required"/>
		<br>
		<form:label path="motDePasse">Mot de passe : </form:label>
		<form:input path="motDePasse" placeholder="Mot de Passe" required ="required"/>
		<br>
		<form:label path="numeroDeTelephone">Numéro de Téléphone : </form:label>
		<form:input path="numeroDeTelephone" placeholder="Numéro de Téléphone" required ="required"/>
		<br>
		<form:button>Inscription</form:button>
	</form:form>
</body>
</html>