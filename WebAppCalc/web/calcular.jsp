<%-- 
    Document   : calcular
    Created on : 9 de mar. de 2026, 20:00:49
    Author     : Ryan Lima
--%>

<%@page import="calc.Calculadora"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Calculadora</title>
    </head>
    <body>
        <h1>Calculos (JSP)</h1>
        <%
            // Entrada
            double v1 = Double.parseDouble(request.getParameter("valor1"));
            double v2 = Double.parseDouble(request.getParameter("valor2"));
            
            Calculadora calc = new Calculadora();
            // Saida
            out.print("<b> 1° valor </b>");
            out.print("<br><b> 2° valor </b>");
            out.print("<br><br> <b> Resultados: </b>");
            out.print("<br> Soma: " + calc.Somar(v1, v2) );
            out.print("<br> Subtração: " + calc.Subtrair(v1, v2) );
            out.print("<br> Multiplicação: " + calc.Multiplicar(v1, v2) );
            out.print("<br> Divisão: " + String.format("%.3f", calc.Dividir(v1, v2)) );
            out.print("<br> Dobro: " + calc.Dobro(v1) );
            out.print("<br> Triplo " + calc.Triplo(v1) );
            out.print("<br> Raiz " + String.format("%.3f", calc.Raiz(v1)) );
            out.print("<br> Cubo " + calc.Cubo(v1) );
            out.print("<br> Resto Divisão " + calc.RestoDivisao(v1, v2) );
        %>
    </body>
</html>
