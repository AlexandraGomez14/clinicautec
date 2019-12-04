package com.clinica.modelo;

import com.clinica.conexion.Conexion;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Gabriela Alexandra Gomez
 */
public class ServiciosModelo extends Conexion{
    PreparedStatement pre;
    ResultSet res;
    
    public void agregar(Servicios se) throws SQLException{
        try {
            this.conectar();
            String sql ="insert into servicios(codServicio,nombreServicio,precio,costo) values(?,?,?,?)";
            pre =this.getCon().prepareStatement(sql);
            pre.setString(1, se.getCodServicio());
            pre.setString(2, se.getNombreServicio());
            pre.setDouble(3, se.getPrecio());
            pre.setDouble(4, se.getCosto());
            pre.executeUpdate();
            this.getCon().commit();
        } catch (Exception e) {
            this.getCon().rollback();
            System.out.println("Error en agregar en servicios"+e);
        }
    }
    
    public int contar(Object obj) throws Exception {
        int cont = 0;
        try {
            this.conectar();
            String sql = "select count(*) as cantidad from servicios";
            pre = this.getCon().prepareStatement(sql);
            res = pre.executeQuery();
            while (res.next()) {
                cont = res.getInt("cantidad") + 1;
            }
        } catch (Exception e) {
            throw e;
        }
        return cont;
    }
}
