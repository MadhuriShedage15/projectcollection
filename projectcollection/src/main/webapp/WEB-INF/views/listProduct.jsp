<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<div class="container">
	<div class="row">
		<!-- side bar will display here which display category menu -->
		<div class="col-md-3">
			<%@include file="./shared/sidebar.jsp"%>
		</div>

		<!-- This will Display Table of Product -->
		<div class="col-md-9">
			<!-- added the breadcrumb class -->
			<div class="row">
				<div class="col-lg-12">
					<c:if test="${userClickAllProducts}">

						<script>
							window.categoryId = '';
						</script>

						<ol class="breadcrumb">
							<li><a href="${contextRoot}/home">Home</a></li>
							<li class="active">All products</li>
						</ol>
					</c:if>

					<c:if test="${userClickCategoryProducts}">

						<script>
							window.categoryId = '${category.id}';
						</script>
						<ol class="breadcrumb">
							<li><a href="${contextRoot}/home">Home</a></li>
							<li class="active">Category products</li>
							<li class="active">${category.name}</li>


						</ol>
					</c:if>
				</div>
			</div>

</body>
</html>