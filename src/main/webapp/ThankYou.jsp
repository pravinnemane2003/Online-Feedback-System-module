<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Thank you</title>
</head>
<body>
<%String s1=request.getParameter("name"); %>

	<h2>Thank you,<%=s1%>!!</h2>
	<p>Your feedback is Successfully submitted</p>

</body>
</html>