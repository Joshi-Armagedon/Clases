<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%@page import="java.sql.*" %>
        <%
            String clave;
            Connection conexion = null;
            Statement comandito = null;
            ResultSet resultado;
            try {
                Class.forName("com.mysql.cj.jdbc.Driver");
                conexion = DriverManager.getConnection("jdbc:mysql://localhost/emps?autoReconnect=true&userSSL=false", "root", "n0m3l0");
                comandito = conexion.createStatement();
                out.println("<script>console.log('Conexion exitosa');</script>");
            } catch (SQLException e) {
                out.println("Error al ingresar datos");
            }

            try {
                clave = request.getParameter("clave");
                resultado = comandito.executeQuery(String.format("Select * from datos where contrasenia = '%s';", clave));
                String contrasenia = resultado.getString("contrasenia");
                String nombre = resultado.getString("nombre");
                String estado = resultado.getString("estado");
                String sexo = resultado.getString("sexo");
                out.println("<table border=1>");
                out.println("<tr>");
                out.println("<td>" + nombre + "</td>");
                out.println("<td>" + estado + "</td>");
                out.println("<td>" + sexo + "</td>");
                out.println("<td>" + contrasenia + "</td>");
                out.println("</tr>");
                out.println("</table>");
                out.println("<script>alert(\"La persona no existe\");</script>");
            } catch (SQLException e) {
                out.println("Hola");
                e.toString();
                out.println("Error revisa tus datos");
            } catch (Exception error) {
                out.print(error.getMessage());
            }
        %>
    </body>
</html>
