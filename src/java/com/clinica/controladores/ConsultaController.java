/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.clinica.controladores;

import com.clinica.modelo.Consulta;
import com.clinica.modelo.ConsultaModelo;
import com.clinica.modelo.Datos;
import com.clinica.modelo.DetalleConsulta;
import java.io.IOException;
import java.text.SimpleDateFormat;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Familia Gomez
 */
public class ConsultaController extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

 
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
        ConsultaModelo cm = new ConsultaModelo();
        Consulta c = new Consulta();
        DetalleConsulta dc = new DetalleConsulta();
        try {
            
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
            String[] servi = request.getParameterValues("servicios");
            String ServiciosBD="";
            
            c.setCodConsulta(request.getParameter("codConsulta"));
            c.setCodPaciente(request.getParameter("codPaciente"));
            c.setFechaConsulta(request.getParameter("fechaCita"));
            c.setFechaInicioServicio(request.getParameter("fechaInicioServicio"));
            c.setFechaFinServicio(request.getParameter("fechaFinServicio"));
            c.setHora(request.getParameter("8:10"));
            c.setObservacion(request.getParameter("observacion"));
            c.setCodDoctor(request.getParameter("medico"));
            
            dc.setCodCosulta(request.getParameter("codConsulta"));
            dc.setCodServicio(servi);
            System.out.println("c "+c+" dc"+dc);
            if (request.getParameter("guardarC") != null) {
                cm.agregar(c,dc);    
            }
            request.getRequestDispatcher("consulta.jsp").forward(request, response);
        } catch (Exception e) {
        }
        
    }

    
    @Override
    public String getServletInfo() {
        return "Short description";
    }

}
