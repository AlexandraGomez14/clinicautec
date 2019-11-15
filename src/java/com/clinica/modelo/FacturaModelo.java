package com.clinica.modelo;

import com.clinica.conexion.Conexion;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class FacturaModelo extends Conexion{
    
    PreparedStatement pre;
    ResultSet res;
    
    public int contar(Object obj) throws Exception {
        int cont = 0;
        try {
            this.conectar();
            String sql = "select count(*) as cantidad from encabezadoFactura";
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
