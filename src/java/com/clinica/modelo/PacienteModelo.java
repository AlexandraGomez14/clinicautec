package com.clinica.modelo;

import com.clinica.conexion.Conexion;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.*;


public class PacienteModelo extends Conexion{
    PreparedStatement pre;
    ResultSet res;
    
    public void transaccionPaciente(Paciente p, TelefonoPaciente tp,DireccionPaciente dp) throws SQLException{
        String paciente ="";
        String telefono ="";
        String direccion ="";
        System.out.println("dj "+dp);
        try {
            this.conectar();
            paciente = "insert into paciente(codPaciente,primerNombre,segundoNombre,primerApellido,segundoApellido, "+
                       "apellidoCasada,codTipoCliente) values(?,?,?,?,?,?,?)";
            pre = this.getCon().prepareStatement(paciente);
            pre.setString(1, p.getCodPaciente());
            pre.setString(2, p.getPrimerNombre());
            pre.setString(3, p.getSegundoNombre());
            pre.setString(4, p.getPrimerApellido());
            pre.setString(5, p.getSegundoApellido());
            pre.setString(6, p.getApellidoCasada());
            pre.setString(7, p.getCodTipoCliente());
            
            pre.executeUpdate();
            
            telefono = "insert into telefono (codPaciente,telCasa,telPersonal,telAuxiliar) "+
                       "values(?,?,?,?)";
            pre = this.getCon().prepareStatement(telefono);
            pre.setString(1, p.getCodPaciente());
            pre.setString(2, tp.getTelCasa());
            pre.setString(3, tp.getTelPersonal());
            pre.setString(4, tp.getTelAuxiliar());
            pre.executeUpdate();
          
            direccion = "insert into direccion(codDireccion,colonia,pasaje,numeroCasa,codDepartamento,codPaciente) "+
                        "values(?,?,?,?,?,?)";
            pre = this.getCon().prepareStatement(direccion);
            pre.setString(1, dp.getCodDireccion());
            pre.setString(2, dp.getColonia());
            pre.setString(3, dp.getPasaje());
            pre.setString(4, dp.getNumCasa());
            pre.setString(5, dp.getCodDepartamento());
            pre.setString(6, p.getCodPaciente());
            pre.executeUpdate();
            
            this.getCon().commit();
            System.out.println("transaccion exitosa");
        } catch (Exception e) {
            this.getCon().rollback();
            System.out.println("error en transaccion "+e);
        }
    }
    
    public int contar(Object obj) throws Exception{
        int cont = 0;
        try {
            this.conectar();
            String sql = "select count(*) as cantidad from paciente";
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
    
     
     public List<Departamento>listaDepartamento(){
         List<Departamento> listaD = new ArrayList<>();
         try {
             this.conectar();
             String sql ="select codDepartamento,nombre from departamento";
             pre = this.getCon().prepareCall(sql);
             res = pre.executeQuery();
             while(res.next()){
                Departamento depa = new Departamento();
                depa.setCodDepartamento(res.getString("codDepartamento"));
                depa.setNombre(res.getString("nombre"));
                listaD.add(depa);
             }
         } catch (Exception e) {
         }
         return listaD;
     }
    
    
}
