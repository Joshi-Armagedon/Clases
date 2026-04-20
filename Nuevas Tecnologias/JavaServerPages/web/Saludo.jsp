
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%@page import="saluditos.Saludo" %>
        <% 
          String saluditoJSP = request.getParameter("saludito");
          String datitoJSP = request.getParameter("datito");
          if(saluditoJSP != null){
              Saludo hola = new Saludo();
              out.println(hola.mensaje() + datitoJSP);
          }
        %>
    </body>
</html>
