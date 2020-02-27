<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%> 
 <%@taglib uri="http://www.springframework.org/tags" prefix="spring" %>
    <%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<!DOCTYPE html >
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Book Inventory</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta.2/css/bootstrap.min.css">
</head>
<body>

<h2>Book Search</h2>

<div class="container">
<form:form method="post" action="/findProduct" commandName="Search">
<input type="text" name="searchItem" class="form-control" placeholder="Search the products">
<button type="submit" name="save" class="btn btn-primary">Search</button>
</form:form>
</div>

	<table class="customerTable">
	
	<tr>
			<th width="130">Book Name</th>
			<th width="130">Description</th>
			<th width="130">Author</th>
			<th width="130">Price</th>
			<th width="130">Quantity</th>
			<th width="130">Add to Cart</th>
		</tr>
		<c:choose>
    <c:when test="${fn:length(bookList) > 0}">
		
		<c:forEach items="${bookList}" var="book">
			<tr>
				<td>${book.bookName}</td>
                <td>${book.bookDescription}</td>
                <td>${book.author}</td>
                <td>${book.price}</td>
                <td>${book.quantity}</td>
                <td><form:form action="addcart" method="GET">
	                <input name="quantity" type="number" min=1 max=${book.quantity}  pattern="[0-9]*" value="1" width=10/>
	                <input name="id" type="text" value = ${book.id} hidden/>
	                <input name="total" type="text" value = ${book.price} hidden/>
	                <input name="totalQuantity" type="text" value = ${book.quantity} hidden/>
	                <input name="bookName" type="text" value = ${book.bookName} hidden/>
                <input type="submit" value="addtocart"></form:form>
				</td>
			</tr> 
		</c:forEach>
		    </c:when>

    <c:otherwise>

        <tr>

            <td colspan="8">No Books Found</td>



        </tr>

    </c:otherwise>

</c:choose>
		
	</table>
	 <p align="center">${msg}</p>
<center> <a href="/logout" style="display:block">logout</a></center>
</body>
</html>