package com.clinica.conexion;
/**
 * link para crear BD desde java 
 * https://es.stackoverflow.com/questions/40170/crear-base-de-datos-y-tablas-desde-java
 */
import java.sql.*;

public class Conexion {

//    private String user = "usuario_java";
//    private String contra = "Admin.123";
//    private String url = "jdbc:sqlserver://DESKTOP-4QMPSUH\\ALEGOMEZ\\localhost:1433;databaseName=base1";
//    private String driver = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
//    PreparedStatement pre;
    
    
    private String user = "root";
    private String contra = "";
    private String url = "jdbc:mysql://localhost:3306/base1";
    private String driver = "com.mysql.jdbc.Driver";
    PreparedStatement pre;
    
    private Connection con;

    public Connection getCon() {
        return con;
    }

    public void setCon(Connection con) {
        this.con = con;
    }

    public void conectar() {
        try {
            Class.forName(driver);
            con = DriverManager.getConnection(url, user, contra);
            System.out.println("Conexion Exitosa ");
            con.setAutoCommit(false);

        } catch (Exception e) {
            System.out.println("Error en la conexion " + e);
        }
    }

    public void desconectar() {
        try {
            if (con != null) {
                if (con.isClosed() == false) {
                    con.close();
                }
            }
        } catch (Exception e) {
            System.out.println("Error en desconectar " + e);
        }
    }

}
