<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<style>
.error {
	color: red;
	font-style: italic;
}
</style>
<center>
	<form:form method="post" action="savecart" modelAttribute="order">
		<h1 class="jumbotron" HEIGHT=100>Quantity Update</h1>
		<table>
			<tr>
				<td><input name="id" type="text"
					value="${editedProduct.orderId}" hidden /></td>
				<td>Quantity :</td>
				<td><form:input path="quanity" id="quanity" value="1" /></td>
				<td><form:errors path="quanity" cssClass="error" /></td>
			</tr>
			<tr>
				<td><br /></td>
				<td><input type="submit" value="Update" /></td>
			</tr>
		</table>
	</form:form>
</center>