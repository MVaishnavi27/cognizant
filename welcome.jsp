<html>
<body>
<form action="index.jsp">
<%
String name=request.getParameter("uname");
out.print("welcome "+name);
%></form></body></html>