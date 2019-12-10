<!DOCTYPE html>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<html lang="en">
<body>
	<div>
		<div>
			<h2>Hello ${message}</h2>
			<form:form action="addNew" method="post" modelAttribute="accountForm">
			Username:<form:input path="username"></form:input><br><br>
			NotifyType:<form:select path="notifyType">
			<form:option value="">Choose</form:option>
			<form:option value="EMAIL">EMAIL</form:option>
			<form:option value="FAX">FAX</form:option>
			</form:select>
			<br><br>
			<form:button value="ADD">ADD</form:button>
			</form:form>
		</div>
	</div>
</body>
</html>
