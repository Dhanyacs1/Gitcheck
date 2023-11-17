<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<html>
<head>
</style>
<center>
</head>
<h1>Vizag Municipal Corporation</h1>
<body>
	<form:form method="post" modelAttribute="Corporation"
		action="${pageContext.request.contextPath}/addCorporation">
		<table>
			<tr>
				<th colspan="2">Add Complain</th>
			</tr>
			<tr>
				<form:hidden path="id" />
				<td><form:label path="Name"> Name:</form:label></td>
				<td><form:input path="Name" size="30" maxlength="30"></form:input></td>
			</tr>
			<tr>
				<td><form:label path="email">Email:</form:label></td>
				<td><form:input path="email" size="30" maxlength="30"></form:input></td>
			</tr>
			<tr>
				<td><form:label path="email">Register Complain</form:label></td>
				<td><form:input path="email" size="30" maxlength="30"></form:input></td>
			</tr>
			<tr>
				<td colspan="2"><input type="submit" class="black-button" /></td>
			</tr>
		</table>
	</form:form>
	</br>
	<h3>Complain List</h3>
	<c:if test="${!empty listOfComplains}">
		<table class="tg">
			<tr>
				<th width="80">Id</th>
				<th width="120">Name</th>
				<th width="120">Email</th>
				<th width="60">Edit</th>
				<th width="60">Delete</th>
			</tr>
			<c:forEach items="${listOfCorporation}" var="Corporation">
				<tr>
					<td>${Corporation.id}</td>
					<td>${Corporation.Name}</td>
					<td>${Corporation.email}</td>
					<td><a href="<c:url value='/updateCorporation/${Corporation.id}' />">Edit</a></td>
					<td><a href="<c:url value='/deleteCorporation/${Corporation.id}' />">Delete</a></td>
				</tr>
			</c:forEach>
		</table>
	</c:if>
	</center>
</body>
</html>