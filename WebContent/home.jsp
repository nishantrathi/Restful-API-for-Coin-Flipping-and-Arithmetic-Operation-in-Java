<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Flip Coins</title>
<script src="http://code.jquery.com/jquery-1.10.2.js"
	type="text/javascript"></script>
<script src="js/ajaxCalling.js" type="text/javascript"></script>
</head>
<body>
	<table>
		<tr>
			<td>Number of Coins</td>
			<td><input type="text" name="coinValue" id="coinValueId"
				size="20px" /></td>
			<td>Get/Post Method</td>
			<td><select id="methodId">
					<option value="0">--Select--</option>
					<option value="GET">Get</option>
					<option value="POST">Post</option>
			</select></td>
			<td><button type="button" id="coinButton">Flip Coins</button></td>
		</tr>
		<tr>
			<td>Output</td>
			<td><label id="flipId"></label></td>
		</tr>
	</table>
</body>
</html>