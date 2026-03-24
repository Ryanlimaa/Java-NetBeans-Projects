<%-- 
    Document   : senha
    Created on : 11 de mar. de 2026, 18:38:52
    Author     : Ryan Lima
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>UMC - Acesso - Validador</title>
    </head>
    <body>
        <h2>Acesso - Valida</h2>
        
        <%
            String usu = request.getParameter("login");
            String pass = request.getParameter("pw");
            String acesso;
            if (usu.equals("admin") && pass.equals("1234")) {
                acesso = ("Acesso Permitido");
            }
            else {
                acesso = ("Acesso Negado");
            }
           
        %>
        
        <p><%=acesso%></p>
    </body>
</html>
