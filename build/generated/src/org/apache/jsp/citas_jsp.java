package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.clinica.modelo.Doctores;
import com.clinica.modelo.Paciente;
import com.clinica.modelo.CitaModelo;
import com.clinica.modelo.Departamento;
import com.clinica.modelo.PacienteModelo;
import com.clinica.modelo.Usuarios;
import java.util.*;
import com.clinica.modelo.UsuarioModelo;

public final class citas_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "header.jsp", out, false);
      out.write('\n');

    CitaModelo cm = new CitaModelo();

      out.write("\n");
      out.write("<form action=\"CitaController\" method=\"post\" name=\"frmCita\">\n");
      out.write("    <table class=\"table\">\n");
      out.write("        <tr>\n");
      out.write("            <th>C&oacute;digo Cita</th>\n");
      out.write("            <td>\n");
      out.write("                ");

                    CitaModelo obj = new CitaModelo();
                    Object n = obj.contar(obj);
                
      out.write("\n");
      out.write("                <input type=\"text\" name=\"codigoC\" value=\"PCNT-");
      out.print(n);
      out.write("\" class=\"form-control\" readonly=\"true\">\n");
      out.write("            </td>\n");
      out.write("        </tr>\n");
      out.write("        <tr>\n");
      out.write("            <th>Paciente</th>\n");
      out.write("            <td>\n");
      out.write("                <select name=\"paci\" class=\"form-control\">\n");
      out.write("                 ");

                     List<Paciente>lis = cm.listaPaciente();
                     for(Paciente pa: lis){
      out.write("\n");
      out.write("                     <option value=\"");
      out.print(pa.getCodPaciente());
      out.write('"');
      out.write('>');
      out.print(pa.getPrimerNombre() );
      out.print(pa.getPrimerApellido() );
      out.write("</option>\n");
      out.write("                 ");
}
                 
      out.write("\n");
      out.write("                </select>\n");
      out.write("            </td>\n");
      out.write("            <th>Fecha de Cita</th>\n");
      out.write("            <td>\n");
      out.write("                <input type=\"date\" name=\"fCita\" class=\"form-control\" pattern=\"dd/MM/yyyy\"/>\n");
      out.write("            </td>\n");
      out.write("        </tr>\n");
      out.write("        <tr>\n");
      out.write("            <th>Hora de Cita</th>\n");
      out.write("            <td>\n");
      out.write("                <!--<input type=\"time\" class=\"form-control\" name=\"horaCita\"/>-->\n");
      out.write("                <input type=\"time\" class=\"form-control\" name=\"horaCita\"/>\n");
      out.write("            </td>\n");
      out.write("            <th>Estado de Cita</th>\n");
      out.write("            <td>\n");
      out.write("                <select class=\"form-control\" name=\"estado\">\n");
      out.write("                    <option value=\"Reservada\">Reservada</option>\n");
      out.write("                    <option value=\"Cancelada\">Cancelada</option>\n");
      out.write("                </select>\n");
      out.write("            </td>\n");
      out.write("        </tr>\n");
      out.write("        <tr>\n");
      out.write("            <th>M&eacute;dico</th>\n");
      out.write("            <td>\n");
      out.write("                <select name=\"medico\" class=\"form-control\">\n");
      out.write("                 ");

                     List<Doctores>lisD = cm.listaDoctores();
                     for(Doctores doc: lisD){
      out.write("\n");
      out.write("                     <option value=\"");
      out.print(doc.getCodDoctor() );
      out.write('"');
      out.write('>');
      out.print(doc.getPrimerNombre() );
      out.print(doc.getPrimerApellido() );
      out.write("</option>\n");
      out.write("                 ");
}
                 
      out.write("\n");
      out.write("                </select>\n");
      out.write("            </td>\n");
      out.write("            <th>Consultario</th>\n");
      out.write("            <td>\n");
      out.write("                <input type=\"text\" class=\"form-control\" name=\"consultorio\"/>\n");
      out.write("            </td>\n");
      out.write("        </tr>\n");
      out.write("        <tr>\n");
      out.write("            <th></th>\n");
      out.write("            <td>\n");
      out.write("            </td>\n");
      out.write("            <th></th>\n");
      out.write("            <td>\n");
      out.write("                <input type=\"submit\" value=\"Guardar\" class=\"btn btn-info\" name=\"guardarCita\" />\n");
      out.write("            </td>\n");
      out.write("        </tr>\n");
      out.write("    </table>\n");
      out.write("</form>\n");
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
