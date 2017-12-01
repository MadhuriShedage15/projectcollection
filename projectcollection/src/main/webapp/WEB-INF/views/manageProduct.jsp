<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>

    <%@taglib prefix="ss" uri="http://www.springframework.org/tags/form" %>

    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>

<head>

<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">

<title>Insert title here</title>

</head>

<body>



<div class="container">

<div class="row">

<h1>This is Manage Product Page</h1>



<div class="col-md-offset-2 col-md-8">

<div class="panel panel-primary">

<div class="panel-heading">

<h4>Product Management</h4>

</div>

<div class="panel-body">

<!-- Form Elements -->

<ss:form class="form-horizontal" 

 modelAttribute="product"  
  method="post"
  action="${contextRoot }/manage/products"
  
  >



<div class="form-group">

<label class="control-label col-md-4" for="name">Enter Product Name</label>

<div class="col-md-8">

<ss:input type="text" path="name" id="name"  placeholder="Product Name" class="form-control" />

</div>

</div>



<div class="form-group">

<label class="control-label col-md-4" for="brand">Enter Brand Name</label>

<div class="col-md-8">

<ss:input type="text" path="brand" id="brand" placeholder="Product Brand" class="form-control" />

</div>

</div>



<div class="form-group">

<label class="control-label col-md-4" for="description">Enter Description</label>

<div class="col-md-8">

<ss:textarea type="text" path="description" id="description" placeholder="Enter Description" class="form-control" ></ss:textarea>

</div>

</div>



<div class="form-group">

<label class="control-label col-md-4" for="unitPrice">Enter Unit Price</label>

<div class="col-md-8">

<ss:input type="text" path="unitPrice" id="unitPrice" placeholder="Enter Unit Price" class="form-control" />

</div>

</div>



<div class="form-group">

<label class="control-label col-md-4" for="quantity">Enter Quantity</label>

<div class="col-md-8">

<ss:input type="text" path="quantity" id="quantity" placeholder="Enter Quantity" class="form-control" />

<em class="help-block">Please enter Quantity !</em>

</div>

</div>



<div class="form-group">

<label class="control-label col-md-4" for="CategoryId">Select Category </label>

<div class="col-md-8">

<ss:select class="form-control" id="categoryId" path="categoryId" items="${categories}" itemLabel="name" itemValue="id">

<c:if test="${product.id==0}">

<div class="text-right">

<br />

<button type="button" data-toggle="model" data-target="#myCategoryModal" class="btn btn-warning btn-xs">Add Category</button>

</div>

</c:if>

</ss:select>

</div>

</div>



<!-- File Element -->



<div class="form-group">

<div class="col-md-offset-4 col-md-8">

<input type="submit" name="submit" id="submit" class="btn btn-primary" /> 

</div>

</div>

<c:if test="${not empty message}">

<div class="col-xs-12">
<div class="alert alert-success alert-dismissible">
<button type="button" class="close" data-dismiss="alert">$times</button>
${message}
</div>

</div>
</c:if>

<!-- hidden fields are -->

<ss:hidden path="id" />

<ss:hidden path="code" />

<ss:hidden path="supplierId"/>

<ss:hidden path="active" />

<ss:hidden path="purchase" />

<ss:hidden path="views" />



</ss:form>



</div>

</div>





</div>

</div>

</div>



</body>

</html>