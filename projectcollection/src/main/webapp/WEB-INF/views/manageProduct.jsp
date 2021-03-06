<%@taglib prefix="sf" uri="http://www.springframework.org/tags/form"%>

<div class="container">

	<div class="row">
		<c:if test="${not empty message}">
			<div class="col-xs-12">

				<div class="alert alert-success alert-dismissible">
					<button type="button" class="close" data-dismiss="alert">&times
					</button>
					${message}
				</div>
			</div>
		</c:if>
	
		<div class="col-md-offset-2 col-md-8">
			<div class="panel panel-primary">
				<div class="panel-heading">

					<h4>Product Management</h4>
				</div>
				<div class="panel-body">
					<!-- Form Elements  -->
					<sf:form class="form-horizontal" modelAttribute="product"
						action="${contextRoot}/manage/products"
						enctype="multipart/form-data" method="post">
						<div class="form-group">

							<label class="control-label col-md-4" for="name">Enter
								Product Name </label>
							<div class="col-md-8">

								<sf:input type="text" path="name" id="name"
									placeholder="product name" class="form-control" />
								<sf:errors path="name" cssClass="help-block" element="em">Please enter product name !</sf:errors>
							</div>
						</div>
						<div class="form-group">
							<label class="control-label col-md-4" for="brand"> Enter
								Brand Name </label>
							<div class="col-md-8">
								<sf:input type="text" path="brand" id="brand"
									placeholder="brand name" class="form-control" />
								<sf:errors path="brand" cssClass="help-block" element="em">Please enter brand name !</sf:errors>

							</div>
						</div>


						<div class="form-group">
							<label class="control-label col-md-4" for="description">
								Enter Description </label>
							<div class="col-md-8">
								<sf:textarea type="text" path="description" id="description"
									placeholder="enter description" class="form-control"></sf:textarea>
								<sf:errors path="description" cssClass="help-block" element="em">Please enter product description!</sf:errors>

							</div>
						</div>

						<div class="form-group">
							<label class="control-label col-md-4" for="unitPrice">
								Enter Unit Price </label>
							<div class="col-md-8">
								<sf:input type="text" path="unitPrice" id="unitPrice"
									placeholder="Enter Unit Price" class="form-control" />
								<sf:errors path="unitPrice" cssClass="help-block" element="em">Please enter Unit price !</sf:errors>
							</div>
						</div>


						<div class="form-group">
							<label class="control-label col-md-4" for="quantity">
								Enter Quantity </label>
							<div class="col-md-8">
								<sf:input type="text" path="quantity" id="quantity"
									placeholder="Enter Quantity" class="form-control" />
								<em class="help-block">Please enter Quantity !</em>
							</div>
						</div>

						<div class="form-group">
							<label class="control-label col-md-4" for="CategoryId">
								Select Category </label>
							<div class="col-md-8">
								<sf:select class="form-control" id="categoryId"
									path="categoryId" items="${categories}" itemLabel="name"
									itemValue="id" />
								<c:if test="${product.id==0}">
									<div class="text-right">
										<br>

										<button type="button" data-toggle="modal"
											data-target="#myCategoryModal" class="btn btn-warning btn-xs">
											Add Category</button>
									</div>
								</c:if>
							</div>
						</div>

						<!-- File Element  -->
						<%-- <div class="form-group">
							<label class="control-label col-md-4" for="file"> select
								n image </label>
							<div class="col-md-8">
								<sf:input type="file" path="file" id="file" class="form-control" />
								<sf:errors path="file" cssClass="help-block" element="em" />
							</div>
						</div>
 --%>

						<div class="form-group">
							<div class="col-md-offset-4 col-md-8">
								<input type="submit" name="submit" id="submit"
									class="btn btn-primary" />

								<!-- hidden fields are  -->
								<sf:hidden path="id" />
								<sf:hidden path="code" />
								<sf:hidden path="supplierId" />
								<sf:hidden path="active" />
								<sf:hidden path="purchase" />
								<sf:hidden path="views" />
							</div>
						</div>
					</sf:form>
				</div>
			</div>
		</div>
	</div>