/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.clinica.controladores;

import com.clinica.modelo.UsuarioModelo;
import com.clinica.modelo.Usuarios;
import java.io.IOException;
import java.io.PrintWriter;
import static java.lang.System.out;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Familia Gomez
 */
public class UsuariosController extends HttpServlet {

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
        UsuarioModelo um = new UsuarioModelo();
        Usuarios us = new Usuarios();
        String val = "";
        try{
            us.setUsuario(request.getParameter("usuario"));
            us.setContra(request.getParameter("contra"));
            us.setCodigoRol(Integer.parseInt(request.getParameter("rol")));
            System.out.println(us);
            if (request.getParameter("agregar") != null) {
                um.agregar(us);
                val="Datos Guardados Correctamente";
            }
            if(request.getParameter("eliminar")!= null){
                um.eliminar(us);
                val="Datos Eliminados Correctamente";
            }
            request.setAttribute("valor", val);
            request.getRequestDispatcher("usuarios.jsp").forward(request, response);
        }catch(Exception e){
             out.print(e.toString());
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
        UsuarioModelo um = new UsuarioModelo();
        Usuarios us = new Usuarios();
        String val = "";
        try{
            us.setUsuario(request.getParameter("usuario"));
            us.setContra(request.getParameter("contra"));
            us.setCodigoRol(Integer.parseInt(request.getParameter("rol")));
            System.out.println(us);
            if (request.getParameter("agregar") != null) {
                um.agregar(us);
                val="Datos Guardados Correctamente";
            }
            if(request.getParameter("eliminar")!= null){
                um.eliminar(us);
                val="Datos Eliminados Correctamente";
            }
            request.setAttribute("valor", val);
            request.getRequestDispatcher("usuarios.jsp").forward(request, response);
        }catch(Exception e){
             out.print(e.toString());
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
