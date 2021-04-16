<%-- 
    Document   : Tabela
    Created on : 15/04/2021, 22:56:13
    Author     : luanc
--%>

<%@page import="java.util.ArrayList"%>
<%@page import="model.Valores"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Percurso Combustivel</title>
        <link rel="stylesheet" href="style.css">    
        <link href="https://fonts.googleapis.com/css2?family=Merriweather:wght@300&display=swap" rel="stylesheet">
    </head>
    <body>
        
        
        <% 
            Valores Tipos = (Valores)request.getAttribute("tipos");
            ArrayList<Integer> tabela = (ArrayList<Integer>) request.getAttribute("resultados");
            String percurso, combustivel;
        %>
        
        <%
            if(Tipos.getPercurso() == "1"){
                percurso = "Urbano";
            }else{
                percurso = "de Estrada";
            }
            
            if(Tipos.getCombustivel() == "1"){
                combustivel = "Álcool";
            }else{
                combustivel = "Gasolina";
            }
        %>
        
        <h3>Tabela para combustível tipo <%= combustivel %> em um percurso <%= percurso %> </h3>
        
         <table border="1">
            <thead>
                <tr>
                    <th>Percorrido em transito <%= percurso %></th>
                    <th>Quantidade de <%= combustivel %> consumido</th>
                </tr>
            </thead>
            
            <tbody>
                
                <%
                    int i = 5;
                    for(Integer o : tabela){
                %>
                
                <tr>
                    <td><%out.print(o + "Km");%></td>
                    <td><%out.print(i + "Litros");%></td>
                </tr>
                
                
                <%
                    i+=5;
                    }
                %>
                
            </tbody>
            
        </table>
    </body>
</html>
