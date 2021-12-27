<!DOCTYPE html>
<html>
 <head>
  <%@ page language="java" contentType="text/html; charset=ISO-8859-1"
      pageEncoding="ISO-8859-1"%>
  <%@ page isELIgnored="false" %>
  <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
 </head>
 <body>
	<jsp:include page="heading.jsp"></jsp:include>
	<b><h4 style="text-align:right; color:blue; margin-right: 20px;">welcome ${sessionScope.user.userName}</h4></b>
  	<jsp:include page="pmenu.jsp"></jsp:include>
  	<div class="container">
   	<div class="row">
	<table class="table table-striped table-condensed">
	 <thead>
	  <tr>
	   <th>Product Id</th>
	   <th>Product Name</th>
	   <th>Price</th>
	   <th>Quantity</th>
	   <th>Vendor</th>
	   <th>Warranty</th>
	   <th>Operations</th>
	  </tr>
	 </thead>
	 <c:forEach var="product" items="${sessionScope.productList}" varStatus="c">
	 <tbody>
	  <tr>
	   <td>${product.pid}</td>
	   <td>${product.pName}</td>
	   <td>${product.price}</td>
	   <td>${product.quantity}</td>
	   <td>${product.vendor}</td>
	   <td>${product.warranty}</td>
	   <td>
	    <a href="${pageContext.request.contextPath}/select?id=${product.pid}"><i class="fa fa-edit">Edit</i></a> |
		<a href="${pageContext.request.contextPath}/delete?id=${product.pid}"><i class="fa fa-remove">Delete</i></a>
	    </td>
	   </tr>
	  </tbody>
	 </c:forEach>
    </table>
   </div>
  </div>
 </body>
</html>