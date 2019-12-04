/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.clinica.controladores;

import com.clinica.modelo.Cita;
import com.clinica.modelo.CitaModelo;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Familia Gomez
 */
public class CitaController extends HttpServlet {

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

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
        Cita ci = new Cita();
        CitaModelo cm = new CitaModelo();
        String val ="";
        try {
            
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
            ci.setCodCita(request.getParameter("codigoC"));
            ci.setEstado(request.getParameter("estado"));
            ci.setFechaCita(request.getParameter("fCita"));
            ci.setFechaActual(sdf.format(new Date()));
            ci.setHora(request.getParameter("horaCita"));
            ci.setConsultorio(request.getParameter("consultorio"));
            ci.setCodDoctor(request.getParameter("medico"));
            ci.setCodPaciente(request.getParameter("paci"));
            System.out.println("cita "+ci);
            if (request.getParameter("guardarCita") != null) {
                cm.agregarCita(ci);
                val="Cita Registrada";
            }
            request.setAttribute("valor", val);
            request.getRequestDispatcher("citas.jsp").forward(request, response);
        } catch (Exception e) {
        }
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
