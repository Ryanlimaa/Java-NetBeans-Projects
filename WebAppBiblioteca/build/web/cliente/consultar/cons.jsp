<%-- 
    Document   : cons
    Created on : 5 de abr. de 2026, 12:13:15
    Author     : Ryan Lima
--%>

<%@page import="model.Cadastro"%>
<%@page import="java.util.List"%>
<%@page import="java.util.ArrayList"%>
<%@page import="model.dao.CadastroDAO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Biblioteca</title>
    </head>
    <body>
        <h1>Consulta Geral</h1>
        <%
            CadastroDAO cadDAO = new CadastroDAO();
            
            List<Cadastro> lista = new ArrayList();
            lista = cadDAO.consultaGeral();
            
            out.println("<br>Cadastros:");
            
            for (int i = 0; i <= lista.size() - 1; i ++) {
                out.println("<br><br><b>Id: </b>" + lista.get(i).getId());
                out.println("<br><b>Nome: </b>" + lista.get(i).getNome());
                out.println("<br><b>CPF: </b>" + lista.get(i).getCPF());
                out.println("<br><b>Email: </b>" + lista.get(i).getEmail());
                out.println("<br><b>Celular: </b>" + lista.get(i).getCell());
                out.println("<br><b>Livro: </b>" + lista.get(i).getLivro());
            }
        %><p>
        <form method="POST" action="../../index.html">
            <input type="submit" value="Voltar">
        </form>
    </body>
</html>
