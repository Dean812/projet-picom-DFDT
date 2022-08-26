<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Insert title here</title>
	<script src='/tinymce/tinymce.js'></script>
	<script>
	  tinymce.init({
	    selector: '#textareaTiny'
	  });
  </script>
</head>
<body>
    <div>
        <h1>Ajout d'une annonce </h1>
    </div>
    <div>
		<form:form modelAttribute="annonce" action="ajoutAnnonce" method="POST">
	        <table>
	            <tbody>
	                <tr>
	                    <th scope="row">Contenu de l'annonce : </th>
	                    <td colspan="2"><form:textarea path="contenu" id="textareaTiny"></form:textarea></td>
	                </tr>
	                <tr>
	                    <th scope="row">Zone</th>
	                    <td colspan="2">
	                    <form:checkboxes items="${lstZones}" path="lstZones" itemLabel="nom"/>
                    	</td>
	                </tr>
	                <tr class="table-group-divider">
	                    <td>A => Nombre d'arrêt : 11 </td>
	                </tr>
	                <tr class="table-group-divider">
	                    <td>B => Nombre d'arrêt : 7 </td>	
	                </tr>
	                <tr class="table-group-divider">
	                    <td>C => Nombre d'arrêt : 19 </td>
	                </tr>	                
	                <tr class="table-group-divider">
	                    <td>D => Nombre d'arrêt : 7 </td>
	                </tr>
	                <tr class="table-group-divider">
	                    <td>E => Nombre d'arrêt : 8 </td>
	                    <th scope="row">Date de début</th>
	                    <th scope="row">Date de Fin</th>
	
	                </tr>
	                <tr>
	                    <td></td>
	                    <td><form:input path="dateHeureDebut" type="dateTime-local" /><form:errors path ="dateHeureDebut"></form:errors></td>
	                    <td><form:input path="dateHeureFin" type="dateTime-local" /><form:errors path ="dateHeureFin"></form:errors></td>
	                </tr>
	                <tr>
	                    <th scope="row">Tranche horaire</th>
	                    <td colspan="2">
	                       <form:checkboxes items="${lstTrancheHoraires}" path="lstTrancheHoraires" itemLabel="trancheHoraireFormatee"/>
	                    </td>
	                </tr>
	                <tr>
	                	<th scope="row">Moyen de paiement</th>
	                	<td colspan="2">
	                		<form:label path="numeroCarte" placeholder = "Numéro de carte" required ="required">Numéro de carte :</form:label>
	                		<form:input path="numeroCarte" /><form:errors path ="numeroCarte"></form:errors>
	                	
	                		<form:label path="anneeExpiration" placeholder = "Année d'expiration" required ="required">Année d'expiration :</form:label>
	                		<form:input path="anneeExpiration" /><form:errors path ="anneeExpiration"></form:errors>
	                	
	                		<form:label path="moisExpiration" placeholder = "Mois d'expiration" required ="required">Mois d'expiration :</form:label>
	                		<form:input path="moisExpiration" /><form:errors path ="moisExpiration"></form:errors>
	                	
	                		<form:label path="cryptogramme" placeholder = "Cryptogramme" required ="required">cryptogramme :</form:label>
	                		<form:input path="cryptogramme" /><form:errors path ="cryptogramme"></form:errors>
	                	</td>	                	
	                </tr>
	                <tr>
	                	<td><form:button type="submit">Publier l'annonce</form:button></td>
	                </tr>
	
	            </tbody>
	        </table>
        </form:form>
    </div>


</body>

</html>