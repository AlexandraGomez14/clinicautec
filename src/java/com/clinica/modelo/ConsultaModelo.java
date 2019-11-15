package com.clinica.modelo;
/*
 <select name="medico" class="form-control">
    <%
        List<Servicios> listS = cmm.listaServicio();
        for (Servicios se : listS) {%>
    <option value="<%=se.getCodServicio() %>"><%=se.getNombreServicio()%></option>
    <%}
    %>
</select>
*/
import com.clinica.conexion.Conexion;
import java.sql.*;
import java.util.*;
public class ConsultaModelo extends Conexion{
    PreparedStatement pre;
    ResultSet res;
    
    public List<Datos>buscarDatos(Datos con){
        List<Datos> datos = new ArrayList<>();
        try {
            this.conectar();
            String sql = "select p.codPaciente, p.primerNombre,p.primerApellido,c.codDoctor as codDoctor "+
                         "from citas c "+
                         "inner join paciente p "+
                         "on c.codPaciente = p.codPaciente "+
                         "where p.codPaciente='"+con.getCodPaciente()+"' and c.fechaCita='"+con.getFechaCita()+"'";
            pre = this.getCon().prepareStatement(sql);
            res = pre.executeQuery();
            System.out.println("res "+res);
            while (res.next()) {                
                Datos c = new Datos();
                c.setDoctor("doctor");
                datos.add(c);
            }
        } catch (Exception e) {
            System.out.println("error en mostrar los datos");
        }
        return datos;
    }
    
    public List<Servicios> listaServicio(){
        List<Servicios> listServi = new ArrayList<>();
        try {
            this.conectar();
            String sql ="select * from servicios ";
            pre = this.getCon().prepareStatement(sql);
            res = pre.executeQuery();
            while (res.next()) {                
                Servicios sr = new Servicios();
                sr.setCodServicio(res.getString("codServicio"));
                sr.setNombreServicio(res.getString("nombreServicio"));
                
                listServi.add(sr);
            }
                    
        } catch (Exception e) {
            System.out.println("errro en mostrar servicios"+e);
        }
        return listServi;
    }
    
    public void agregar(Consulta con,DetalleConsulta dc) throws SQLException{
        try {
            this.conectar();
            String consulta = "insert into consulta(codConsulta,codPaciente,fechaConsulta,fechaInicioServicio,fechaFinServicio,hora,observacion,codDoctor) "+
                         " values (?,?,?,?,?,?,?,?)";
            pre = this.getCon().prepareStatement(consulta);
            pre.setString(1, con.getCodConsulta());
            pre.setString(2, con.getCodPaciente());
            pre.setString(3, con.getFechaConsulta());
            pre.setString(4, con.getFechaInicioServicio());
            pre.setString(5, con.getFechaFinServicio());
            pre.setString(6, con.getHora());
            pre.setString(7, con.getObservacion());
            pre.setString(8, con.getCodDoctor());
            pre.executeUpdate();
            pre.executeUpdate();
            this.getCon().commit();
            
            for (int i = 0; i < dc.getCodServicio().length; i++) {
                PreparedStatement pred;
                String detalleConsulta = "insert into detalleConsulta(codConsulta,codServicio) values(?,?) ";
                pred = this.getCon().prepareStatement(detalleConsulta);
                pred.setString(1, con.getCodConsulta());
                Object object = dc.getCodServicio()[i];
                pred.setObject(2, object);
                pred.executeUpdate();

                this.getCon().commit();
            }
        } catch (Exception e) {
            this.getCon().rollback();
            System.out.println("error en transaccion "+e);
        }
    }
    
     public int contar(Object obj) throws Exception{
        int cont = 0;
        try {
            this.conectar();
            String sql = "select count(*) as cantidad from consulta";
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
