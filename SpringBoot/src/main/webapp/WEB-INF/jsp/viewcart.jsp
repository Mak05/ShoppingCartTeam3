<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%> 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>

<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
        <style>
.error {
color: red;
font-style: italic;
}
</style>
</head>
<body>

  <h1 class="jumbotron" HEIGHT=100>Order List</h1> 
  
  
 <table border="1" style="border-collapse: collapse">
		<tr>
			<th>BOOK NAME</th>
			<th>AMOUNT</th>
			<th>QUANITY</th>
			<th>EDIT</th>
			<th>DELETE</th>
		</tr>

		<c:forEach var="cartItem" items="${cartList}">
			<tr>
				<td><c:out value="${cartItem.book.bookName}"></c:out></td>
				<td><c:out value="${cartItem.price}"></c:out></td>
				<td><c:out value="${cartItem.quanity}"></c:out></td>
				<td><a href = "/editcart?id=${cartItem.orderId}">EDIT</a></td>
				<td><a href = "/deletecart?id=${cartItem.orderId}">DELETE</a></td>
				</tr>
		</c:forEach>
		</table>
		<a href="/payment" style="display:block">Payment</a>
		<a href="/home" style="display:block">Home</a>
  


</body>
</html>