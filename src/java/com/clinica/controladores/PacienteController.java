package com.clinica.controladores;

import com.clinica.modelo.DireccionPaciente;
import com.clinica.modelo.Paciente;
import com.clinica.modelo.PacienteModelo;
import com.clinica.modelo.TelefonoPaciente;
import java.io.IOException;
import static java.lang.System.out;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class PacienteController extends HttpServlet {


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
        Paciente p = new Paciente();
        TelefonoPaciente tp = new TelefonoPaciente();
        PacienteModelo pm = new PacienteModelo();
        DireccionPaciente dp = new DireccionPaciente();
        String val = "";
        try {
            p.setCodPaciente(request.getParameter("codigoP"));
            p.setPrimerNombre(request.getParameter("pNombre"));
            p.setSegundoNombre(request.getParameter("sNombre"));
            p.setPrimerApellido(request.getParameter("pApellido"));
            p.setSegundoApellido(request.getParameter("sApellido"));
            p.setApellidoCasada("n");
            p.setCodTipoCliente("Paciente");
            
            tp.setCodPaciente(request.getParameter("codigoP"));
            tp.setTelPersonal(request.getParameter("telPersonal"));
            tp.setTelCasa(request.getParameter("telCasa"));
            tp.setTelAuxiliar("0");
            
            dp.setCodDireccion("DIR");
            dp.setColonia(request.getParameter("colonia"));
            dp.setPasaje(request.getParameter("pasaje"));
            dp.setNumCasa(request.getParameter("numCasa"));
            dp.setCodDepartamento(request.getParameter("departamento"));
            dp.setCodPaciente(request.getParameter("codigoP"));
            
            System.out.println("datos de paciente "+p);
            System.out.println("datos de telefono "+tp);
            System.out.println("datos de direccion "+dp);
            if (request.getParameter("agregarP") != null) {
                pm.transaccionPaciente(p,tp,dp);  
                 val ="Datos Guardados Correctamente";
                 System.out.println(val);
            }
        request.setAttribute("valor", val);
        request.getRequestDispatcher("paciente.jsp").forward(request, response);
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
