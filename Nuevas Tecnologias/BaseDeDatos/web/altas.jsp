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
            String contra = request.getParameter("contrasenia");
            String nombre = request.getParameter("nombre");
            String estado = request.getParameter("estado");
            String sexo = request.getParameter("sexo");

            Connection con = null;
            Statement comandito;

            try {
                Class.forName("com.mysql.cj.jdbc.Driver");
                con = DriverManager.getConnection("jdbc:mysql://localhost/emps?autoReconnect=true&userSSL=false", "root", "n0m3l0");
                comandito = con.createStatement();
                comandito.executeUpdate(String.format("Insert into datos values('%s','%s','%s','%s')", contra, nombre, estado, sexo));
                comandito.close();
                con.close();
            }catch(SQLException e){
                out.println("Error al ingresar datos");
            } 
            catch (Exception e) {
                out.println(e.getMessage());
            }
            
        %>
        <a href="index.html" target="todos">Regresar</a>

    </body>
</html>
