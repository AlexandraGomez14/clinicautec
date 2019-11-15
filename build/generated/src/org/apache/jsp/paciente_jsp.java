package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.clinica.modelo.Departamento;
import com.clinica.modelo.PacienteModelo;
import com.clinica.modelo.Usuarios;
import java.util.*;
import com.clinica.modelo.UsuarioModelo;

public final class paciente_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "header.jsp", out, false);
      out.write('\n');

    PacienteModelo pm = new PacienteModelo();

      out.write("\n");
      out.write("<form action=\"PacienteController\" name=\"frmPaciente\" method=\"post\">\n");
      out.write("    <table class=\"table\">\n");
      out.write("        <tr>\n");
      out.write("            <th>Codigo<span>*</span></th>\n");
      out.write("                ");

                    PacienteModelo obj = new PacienteModelo();
                    Object n = obj.contar(obj);
                
      out.write("\n");
      out.write("            <th>\n");
      out.write("                <input type=\"text\" name=\"codigoP\" value=\"PCNT-");
      out.print(n);
      out.write("\" class=\"form-control\" readonly=\"true\">\n");
      out.write("            </th>\n");
      out.write("        </tr>\n");
      out.write("        <tr>\n");
      out.write("            <th>Primer Nombre<span>*</span></th>\n");
      out.write("            <td>\n");
      out.write("                <input type=\"text\" name=\"pNombre\"  class=\"form-control\" required=\"\">\n");
      out.write("            </td>\n");
      out.write("            <th>Segundo Nombre</th>\n");
      out.write("            <td>\n");
      out.write("                <input type=\"text\" name=\"sNombre\"  class=\"form-control\">\n");
      out.write("            </td>\n");
      out.write("        </tr>\n");
      out.write("        <tr>\n");
      out.write("            <th>Primer Apellido<span>*</span></th>\n");
      out.write("            <td>\n");
      out.write("                <input type=\"text\" name=\"pApellido\"  class=\"form-control\" required=\"\">\n");
      out.write("            </td>\n");
      out.write("            <th>Segundo Apellido</th>\n");
      out.write("            <td>\n");
      out.write("                <input type=\"text\" name=\"sApellido\"  class=\"form-control\">\n");
      out.write("            </td>\n");
      out.write("        </tr>\n");
      out.write("        <tr>\n");
      out.write("            <th>Telefono Personal<span>*</span></th>\n");
      out.write("            <td>\n");
      out.write("                <input type=\"text\" name=\"telPersonal\"  class=\"form-control\">\n");
      out.write("            </td>\n");
      out.write("            <th>Telefono Casa</th>\n");
      out.write("            <td>\n");
      out.write("                <input type=\"text\" name=\"telCasa\"  class=\"form-control\">\n");
      out.write("            </td>\n");
      out.write("        </tr>\n");
      out.write("        <tr>\n");
      out.write("            <th>Departamento<span>*</span></th>\n");
      out.write("            <td>\n");
      out.write("                <select name=\"departamento\" class=\"form-control\">\n");
      out.write("                    ");

                        List<Departamento>lis = pm.listaDepartamento();
                        for(Departamento dep: lis){
      out.write("\n");
      out.write("                        <option value=\"");
      out.print(dep.getCodDepartamento() );
      out.write('"');
      out.write('>');
      out.print(dep.getNombre() );
      out.write("</option>\n");
      out.write("                    ");
}
                    
      out.write("\n");
      out.write("                    \n");
      out.write("                </select>\n");
      out.write("            </td>\n");
      out.write("            <th>Municipio<span>*</span></th>\n");
      out.write("            <td>\n");
      out.write("                <input type=\"text\" name=\"municipio\"  class=\"form-control\">\n");
      out.write("            </td>\n");
      out.write("        </tr>\n");
      out.write("        <tr>\n");
      out.write("            <th>Colonia<span>*</span></th>\n");
      out.write("            <td>\n");
      out.write("                <input type=\"text\" name=\"colonia\"  class=\"form-control\">\n");
      out.write("            </td>\n");
      out.write("            <th>Pasaje</th>\n");
      out.write("            <td>\n");
      out.write("                <input type=\"text\" name=\"pasaje\"  class=\"form-control\">\n");
      out.write("            </td>\n");
      out.write("        </tr>\n");
      out.write("        <tr>\n");
      out.write("            <th>Nº Casa<span>*</span></th>\n");
      out.write("            <td>\n");
      out.write("                <input type=\"text\" name=\"numCasa\"  class=\"form-control\">\n");
      out.write("            </td>\n");
      out.write("            <td>\n");
      out.write("                <input type=\"submit\" value=\"Guardar\" class=\"btn btn-info\" name=\"agregarP\" style=\"\">\n");
      out.write("            </td>\n");
      out.write("        </tr>\n");
      out.write("    </table>\n");
      out.write("</form>\n");
      out.write("\n");
      out.write("\n");
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
