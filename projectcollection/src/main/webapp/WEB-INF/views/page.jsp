<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="sf"%>

<sf:url var="css" value="/resources/css"/>
<sf:url var="js" value="/resources/js"/>
<sf:url var="images" value="/resources/images"/>

<c:set var="contextRoot" value="${pageContext.request.contextPath}"></c:set>

<!DOCTYPE html>
<html lang="en">

  <head>

    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <meta name="description" content="">
    <meta name="author" content="">

    <title>Shop Homepage - Start Bootstrap Template</title>

    <!-- Bootstrap core CSS -->
    <link href="${css}/bootstrap.min.css" rel="stylesheet">

    <!-- Custom styles for this template -->
    <link href="${css}/shop-homepage.css" rel="stylesheet">
    
    <link href="${css}/bootstarp_swatch.css" rel="stylesheet">
    
    <script type="text/javascript">
	window.menu = '${title}';
	window.contextRoot='${contextRoot}'
</script>
    

  </head>

  <body>
<div class="wrapper">
    <%@include file="./shared/navbar.jsp"%>
    
    <!-- Page Content -->
    <div class="content">
    
    <c:if test="${userClickAllProducts==true or userClickCategoryProducts==true}">
				<%@include file="listProduct.jsp"%>
			</c:if>
    
    <c:if test="${userClickHome==true}">
    <%@include file="home.jsp"%>
    </c:if>
    
    <c:if test="${userClickAbout==true}">
    <%@include file="about.jsp"%>
    </c:if> 
    
    <c:if test="${userClickProduct==true}">
    <%@include file="product.jsp"%>
    </c:if> 
    
    <c:if test="${userClickWishlist==true}">
    <%@include file="wishlist.jsp"%>
    </c:if> 
    
    
    <c:if test="${userClickContact==true}">
    <%@include file="contact.jsp"%>
    </c:if>
   
     <c:if test="${userClickMangeProducts==true}">
    <%@include file="manageProduct.jsp"%>
    </c:if>
   
    
    </div>
    <!-- /.container -->
<%@include file="./shared/footer.jsp"%>
    </div>
    <!-- Bootstrap core JavaScript -->
    <script src="${js}/jquery.min.js"></script>
    <script src="${js}/popper.min.js"></script>
    <script src="${js}/bootstrap.min.js"></script>
    <script src="${js}/jquery.dataTables.js"></script>
    <script src="${js}/myapp.js"></script>

  </body>

</html>
