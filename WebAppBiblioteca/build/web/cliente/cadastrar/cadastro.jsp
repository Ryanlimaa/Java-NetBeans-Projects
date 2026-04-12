<%-- 
    Document   : cadastro
    Created on : 5 de abr. de 2026, 11:30:20
    Author     : Ryan Lima
--%>

<%@page import="model.dao.CadastroDAO"%>
<%@page import="model.Cadastro"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Cadastro</title>
    </head>
    <body>
        <%
            Cadastro cad = new Cadastro(
                    Integer.parseInt(request.getParameter("id")),
                    request.getParameter("nome"),
                    request.getParameter("cpf"),
                    request.getParameter("email"),
                    request.getParameter("cell"),
                    request.getParameter("livro")
            );
            
            out.println("<br> <b>Id: " + cad.getId());
            out.println("<br> <b>Nome: " + cad.getNome());
            out.println("<br> <b>CPF: " + cad.getCPF());
            out.println("<br> <b>E-mail: " + cad.getEmail());
            out.println("<br> <b>Celular: " + cad.getCell());
            out.println("<br> <b>Livro: " + cad.getLivro());
            
            CadastroDAO cadDAO = new CadastroDAO();
            if (cadDAO.cadastrar(cad) == true){
                out.println("<br><br> Cadastro realizado com sucesso!");
            }else{
                out.println("<br><br> Cadastro Não inserido!");
            }
        %><p>
        <form method="POST" action="../../index.html">
            <input type="submit" value="Voltar">
        </form>
    </body>
</html>
