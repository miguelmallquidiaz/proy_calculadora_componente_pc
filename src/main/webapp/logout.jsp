<%@page contentType="text/html" pageEncoding="UTF-8"%>
    <%
    // Invalidar la sesión actual para cerrar la sesión
    session.invalidate();
%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <meta http-equiv="refresh" content="3;url=login.jsp">
    <title>Cierre de Sesión</title>
</head>
<body>
    <p>Cierre de sesión exitoso. Redirigiendo a la página de inicio de sesión...</p>
</body>
</html>