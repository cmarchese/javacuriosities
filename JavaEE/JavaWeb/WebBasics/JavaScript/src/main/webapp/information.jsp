<%@page contentType="text/html" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
    <title>Información</title>
</head>
<body>
Nombre: <%= request.getParameter("name") %> <BR>
Edad: <%= request.getParameter("age") %> <BR>
Mail: <%= request.getParameter("email") %> <BR>
</body>
</html>
