package com.clinica.modelo;

import com.clinica.conexion.Conexion;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.*;
public class CitaModelo extends Conexion{
    PreparedStatement pre;
    ResultSet res;
    
    public List<Doctores>listaDoctores(){
        List<Doctores> listaDoc = new ArrayList<>();
        try {
            this.conectar();
            String sql = "select codDoctor,primerNombre,primerApellido from doctor";
            pre = this.getCon().prepareStatement(sql);
            res = pre.executeQuery();
            while(res.next()){
                Doctores doc = new Doctores();
                doc.setCodDoctor(res.getString("codDoctor"));
                doc.setPrimerNombre(res.getString("primerNombre"));
                doc.setPrimerApellido(res.getString("primerApellido"));
                listaDoc.add(doc);
            }
        } catch (Exception e) {
            System.out.println("error en mostrar"+e);
        }
        return listaDoc;
    }
    
        public List<Paciente>listaPaciente(){
        List<Paciente> listaPac = new ArrayList<>();
        try {
            this.conectar();
            String sql = "select codPaciente,primerNombre,primerApellido from paciente";
            pre = this.getCon().prepareStatement(sql);
            res = pre.executeQuery();
            while(res.next()){
                Paciente p = new Paciente();
                p.setCodPaciente(res.getString("codPaciente"));
                p.setPrimerNombre(res.getString("primerNombre"));
                p.setPrimerApellido(res.getString("primerApellido"));
                listaPac.add(p);
            }
        } catch (Exception e) {
            System.out.println("error en mostrar"+e);
        }
        return listaPac;
    }
        
    public int contar(Object obj) throws Exception{
        int cont = 0;
        try {
            this.conectar();
            String sql = "select count(*) as cantidad from citas";
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
    
    public void agregarCita(Cita ci) throws SQLException{
        
        try {
            this.conectar();
            String sqls = "insert into citas (codCita,estado,fechaCita,fechaActual,hora,consultorio,codDoctor,codPaciente) values(?,?,?,?,?,?,?,?) ";
            pre = this.getCon().prepareStatement(sqls);
            pre.setString(1, ci.getCodCita());
            pre.setString(2, ci.getEstado());
            pre.setString(3, ci.getFechaCita());
            pre.setString(4, ci.getFechaActual());
            pre.setString(5, ci.getHora());
            pre.setString(6, ci.getConsultorio());
            pre.setString(7, ci.getCodDoctor());
            pre.setString(8, ci.getCodPaciente());
            pre.executeUpdate();
            this.getCon().commit();
            System.out.println("Exito en insertar");
        } catch (Exception e) {
            this.getCon().rollback();
            System.out.println("error en insercion de cita "+e);
        }
    }
    
//    public List<Cita> allCitas(){
//        try {
//            String sql ="select c.codCita,c.estado,c.fechaCita,c.hora, "+
//                        "c.consultorio,p.primerNombre,p.primerApellido,d.primerNombre,d.primerApellido " +
//                        "from citas c " +
//                        "inner join paciente p " +
//                        "on c.codPaciente = p.codPaciente " +
//                        "inner join doctor d " +
//                        "on d.codDoctor = c.codDoctor";
//        } catch (Exception e) {
//        }
//    }
    
}
