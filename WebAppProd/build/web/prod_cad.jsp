<%-- 
    Document   : prod_cad
    Created on : 16 de mar. de 2026, 20:16:41
    Author     : Ryan Lima
--%>

<%@page import="model.Produtos"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Sistema de Vendas</title>
    </head>
    <body>
        <h2>Controle de Vendas</h2>
        <%
            // Instancia do Objeto com Entrada
            Produtos prod = new Produtos(Integer.parseInt(request.getParameter("id")),
                                        request.getParameter("prod"),
                                        Float.parseFloat(request.getParameter("vr")),
                                        Integer.parseInt(request.getParameter("qtd")));
            
            int perc = Integer.parseInt(request.getParameter("perc"));
            // Saida com Processamento
            
            out.println("<br><b>Identificadoos: </b>" + prod.getCod());
            out.println("<br><b>Nome do produto: </b>" + prod.getNome());
            out.println("<br><b>Valor: </b>" + prod.getValor());
            out.println("<br><b>Quantidade: </b>" + prod.getQtd());
            out.println("<br><b>Precentual de desconto: </b>" + perc);
            out.println("<br><b>Valor total com desconto: </b>" + prod.CalcProdValorFinal(prod.getValor(), prod.getQtd(), perc));
        %>
    </body>
</html>
