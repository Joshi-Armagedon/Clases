<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link rel="stylesheet" href="CascadingStyleSheets/tablaJSP.css"/>
    </head>
    <body>
        <%@page import="TablaHTML.Producto" %>
        <%
        int valor = Integer.parseInt(request.getParameter("numero"));    
        Producto calculo = new Producto(valor);
        out.println("<table>");
        for(int i = 0; i < 10; i++){
            if(i % 2 == 0){
                out.print("<tr bgcolor=red>");
            }else{
                out.print("<tr>");
            }
            out.print("<td>" + valor + " *" + (i+1) + " =</td>" );
            out.print("<td>" + calculo.retornar(i) + "</td>" );
            out.print("</tr>");
        }
        
        out.println("</table>");     
        out.println("<img src=\"https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcS8t5Qv9hoArKjwgA25zZgoNoKuhbVU2zc6-A&\">");     
        %>
    </body>
</html>
