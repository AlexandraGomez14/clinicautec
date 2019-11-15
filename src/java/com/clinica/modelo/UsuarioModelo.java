package com.clinica.modelo;

import java.sql.*;
import java.util.*;

import com.clinica.conexion.Conexion;

public class UsuarioModelo extends Conexion {

    PreparedStatement pre;
    ResultSet res;

    public List<Usuarios> mostrarUsuario() {
        List<Usuarios> listaUs = new ArrayList<Usuarios>();
        try {
            this.conectar();
            String sql = "select * from usuarios";
            pre = this.getCon().prepareStatement(sql);
            res = pre.executeQuery();
            while (res.next()) {
                Usuarios us = new Usuarios();
                us.setUsuario(res.getString("usuario"));
                us.setCodigoRol(res.getString("codigoRol"));
                us.setContra(res.getString("contra"));
                listaUs.add(us);
            }
        } catch (Exception e) {
            System.out.println("error en usuario " + e);
        }
        return listaUs;
    }

    public void agregar(Usuarios us) {
        try {
            this.conectar();
            String sql = "insert into usuarios(usuario,contra,codigoRol) values(?,?,?)";
            pre = this.getCon().prepareStatement(sql);
            pre.setString(1, us.getUsuario());
            pre.setString(2, us.getContra());
            pre.setString(3, us.getCodigoRol());
            pre.executeUpdate();
        } catch (Exception e) {
            System.out.println("error en guardar modelo " + e);
        }
    }
}
