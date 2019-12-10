<!DOCTYPE html>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<html lang="en">
<body>
	<div>
		<div>
			<h2>Hello ${message}</h2>
			<form action="add" method="post">
			Username:<input name="username"><br><br>
			NotifyType:<select name="notifyType">
			<option>Choose</option>
			<option value="EMAIL">EMAIL</option>
			<option value="FAX">FAX</option>
			</select>
			<br><br>
			<input type="submit" value="ADD">
			</form>
		</div>
	</div>
</body>
</html>
