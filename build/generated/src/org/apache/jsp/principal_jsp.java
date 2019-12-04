package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.clinica.modelo.CitasAll;
import java.text.SimpleDateFormat;
import java.text.DateFormat;
import com.clinica.modelo.CitaModelo;
import com.clinica.modelo.Cita;
import com.clinica.modelo.Departamento;
import com.clinica.modelo.PacienteModelo;
import com.clinica.modelo.Usuarios;
import java.util.*;
import com.clinica.modelo.UsuarioModelo;

public final class principal_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "header.jsp", out, false);
      out.write("\n");
      out.write("<CENTER><h3>!!!CITAS RESERVADAS!!!</h3></CENTER>\n");
      out.write("<div class=\"row\" style=\"padding: 10px;\">\n");
      out.write("    ");

        DateFormat formatoHora = new SimpleDateFormat("HH:mm:ss");
        CitaModelo cm = new CitaModelo();
        List<CitasAll> lista = cm.allCitas();
        for (CitasAll c : lista) {
    
      out.write("\n");
      out.write("    <div class=\"col-xl-5 col-md-6 mb-4\">\n");
      out.write("        <div class=\"card border-left-primary shadow h-100 py-2\">\n");
      out.write("            <div class=\"card-body\">\n");
      out.write("                <div class=\"row no-gutters align-items-center\">\n");
      out.write("                    <div class=\"col mr-2\">\n");
      out.write("                        <div class=\"text-xs font-weight-bold text-primary text-uppercase mb-3\">c&oacute;digo: ");
      out.print(c.getCodCita());
      out.write("&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;CONS: ");
      out.print(c.getConsultorio());
      out.write("&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;");
      out.print(c.getEstado());
      out.write("</div>\n");
      out.write("                        <div class=\"text-xs font-weight-bold text-primary text-uppercase mb-3\"></div>\n");
      out.write("                        <div class=\"text-xs font-weight-bold text-primary text-uppercase mb-1\">FECHA DE CITA:&nbsp;&nbsp;&nbsp;");
      out.print(c.getFechaCita());
      out.write("&nbsp;&nbsp;&nbsp;HOTA PARA CITA: </div>\n");
      out.write("                        <div class=\"text-xs font-weight-bold text-primary text-uppercase mb-1\">DOCTOR:&nbsp;&nbsp;&nbsp;");
      out.print(c.getPrimerNombreDoctor());
      out.print(c.getPrimerApellidoDoctor());
      out.write("&nbsp;</div>\n");
      out.write("                        <div class=\"h5 mb-0 font-weight-bold text-gray-800\">");
      out.print(c.getPrimerNombrePaciente());
      out.print(c.getPrimerApellidoPaciente());
      out.write("</div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"col-auto\">\n");
      out.write("                        <!--<i class=\"fas fa-calendar \"></i>-->\n");
      out.write("                        <i class=\"fas fa-address-book fa-3x \"></i>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("    ");

        }
    
      out.write("\n");
      out.write("</div>\n");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "footer.jsp", out, false);
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
