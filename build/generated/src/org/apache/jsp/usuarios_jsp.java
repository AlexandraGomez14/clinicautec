package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.clinica.modelo.Usuarios;
import java.util.*;
import com.clinica.modelo.UsuarioModelo;

public final class usuarios_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "header.jsp", out, false);
      out.write('\n');

    if (request.getAttribute("valor") != null) {
      out.write("\n");
      out.write("<script>\n");
      out.write("    alert('");
      out.print( request.getAttribute("valor"));
      out.write("');\n");
      out.write("</script>\n");

    }

      out.write('\n');

    UsuarioModelo um = new UsuarioModelo();

      out.write("\n");
      out.write("<script Language='JavaScript'>\n");
      out.write("    function cargar(u, r, c)\n");
      out.write("    {\n");
      out.write("        document.frmUsuario.usuario.value = u;\n");
      out.write("        document.frmUsuario.rol.value = r;\n");
      out.write("        document.frmUsuario.contra.value = c;\n");
      out.write("        console.log();\n");
      out.write("    }\n");
      out.write("</script>\n");
      out.write("<form action=\"UsuariosController\" method=\"POST\" name=\"frmUsuario\">\n");
      out.write("    <table class=\"table\">\n");
      out.write("        <tr>\n");
      out.write("            <td>Usuario</td>\n");
      out.write("            <td>\n");
      out.write("                <input type=\"text\" name=\"usuario\" class=\"form-control\">\n");
      out.write("            </td>\n");
      out.write("        </tr>\n");
      out.write("        <tr>\n");
      out.write("            <td>Contrase&ntilde;a</td>\n");
      out.write("            <td>\n");
      out.write("                <input type=\"password\" name=\"contra\" class=\"form-control\">\n");
      out.write("            </td>\n");
      out.write("            <td>Rol de Usuario</td>\n");
      out.write("            <td>\n");
      out.write("                <select class=\"form-control\" name=\"rol\">\n");
      out.write("                    <option value=\"1\">Administrador</option>\n");
      out.write("                    <option value=\"2\">Doctor</option>\n");
      out.write("                    <option value=\"3\">Secreatria</option>\n");
      out.write("                    <option value=\"4\">RRHH</option>\n");
      out.write("                </select>\n");
      out.write("            </td>\n");
      out.write("        </tr>\n");
      out.write("        <tr>\n");
      out.write("            <td></td>\n");
      out.write("            <td></td>\n");
      out.write("            <td></td>\n");
      out.write("            <td>\n");
      out.write("                <input type=\"submit\" value=\"Registrar Usuario\" name=\"agregar\" class=\"btn btn-info float-right\" >            \n");
      out.write("                <input type=\"submit\" value=\"Eliminar Usuario\" name=\"eliminar\" class=\"btn btn-danger\" >            \n");
      out.write("            </td>\n");
      out.write("        </tr>\n");
      out.write("    </table>\n");
      out.write("</form>\n");
      out.write("<form action=\"UsuariosController\" method=\"POST\" name=\"frmUsuarioEliminar\">\n");
      out.write("    <table class=\"table \">\n");
      out.write("        <thead>\n");
      out.write("            <tr class=\"thead-light\">\n");
      out.write("                <th colspan=\"2\"></th>\n");
      out.write("                <th>Usuario</th>\n");
      out.write("                <th>Rol de Usuario</th>\n");
      out.write("                <th>Operaci&oacute;n</th>\n");
      out.write("            </tr>\n");
      out.write("        </thead>\n");
      out.write("        <tbody>\n");
      out.write("            ");

                List<Usuarios> lista = um.mostrarUsuario();
                for (Usuarios us : lista) {
            
      out.write("\n");
      out.write("            <tr>\n");
      out.write("                <td colspan=\"2\"></td>\n");
      out.write("                <td>");
      out.print( us.getUsuario());
      out.write("</td>\n");
      out.write("                <td>");
      out.print( us.getCodigoRol());
      out.write("</td>\n");
      out.write("                <td>\n");
      out.write("                    <a href=\"javascript:cargar('");
      out.print(us.getUsuario());
      out.write("','");
      out.print(us.getContra() );
      out.write("','");
      out.print(us.getCodigoRol());
      out.write("')\">SELECCIONAR</a>\n");
      out.write("                </td>\n");
      out.write("            </tr>\n");
      out.write("            ");
}
      out.write("\n");
      out.write("        </tbody>\n");
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
