package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.clinica.modelo.Servicios;
import com.clinica.modelo.Doctores;
import com.clinica.modelo.Datos;
import com.clinica.modelo.ConsultaModelo;
import com.clinica.modelo.CitaModelo;
import com.clinica.modelo.Paciente;
import java.text.SimpleDateFormat;
import java.util.*;
import com.clinica.modelo.UsuarioModelo;

public final class consulta_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "header.jsp", out, false);
      out.write('\n');

    ConsultaModelo cmm = new ConsultaModelo();
   

      out.write('\n');
      out.write("\n");
      out.write("<form action=\"ConsultaController\" method=\"post\" name=\"frmBusquedad\">\n");
      out.write("    <table class=\"table\" name=\"frmConsulta\">\n");
      out.write("        <tr>\n");
      out.write("            <td>\n");
      out.write("                ");

                    ConsultaModelo obj = new ConsultaModelo();
                    Object n = obj.contar(obj);
                
      out.write("\n");
      out.write("                <input type=\"text\" name=\"codConsulta\" class=\"form-control\" value=\"CONS-");
      out.print(n );
      out.write("\" hidden=\"true\">\n");
      out.write("            </td>\n");
      out.write("        </tr>\n");
      out.write("        <tr>\n");
      out.write("            <th>\n");
      out.write("                Fecha de Cita Realizada\n");
      out.write("            </th>\n");
      out.write("            <td>\n");
      out.write("                <input type=\"date\" name=\"fechaCita\" class=\"form-control\">\n");
      out.write("            </td>\n");
      out.write("        </tr>\n");
      out.write("        <tr>\n");
      out.write("            <th>Paciente atendido</th>\n");
      out.write("            <td>\n");
      out.write("                <select name=\"codPaciente\" class=\"form-control\">\n");
      out.write("                    ");

                        CitaModelo cm = new CitaModelo();
                        List<Paciente> listPac = cm.listaPaciente();
                        for (Paciente lis : listPac) {
      out.write("\n");
      out.write("                    <option value=\"");
      out.print(lis.getCodPaciente());
      out.write('"');
      out.write('>');
      out.print(lis.getPrimerNombre());
      out.write(' ');
      out.print(lis.getPrimerApellido());
      out.write("</option>\n");
      out.write("                    ");
}
      out.write("\n");
      out.write("                </select>\n");
      out.write("            </td>\n");
      out.write("            <th>Doctor</th>\n");
      out.write("            <td>\n");
      out.write("                <select name=\"medico\" class=\"form-control\">\n");
      out.write("                    ");

                        List<Doctores> lisD = cm.listaDoctores();
                        for (Doctores doc : lisD) {
      out.write("\n");
      out.write("                    <option value=\"");
      out.print(doc.getCodDoctor());
      out.write('"');
      out.write('>');
      out.print(doc.getPrimerNombre());
      out.print(doc.getPrimerApellido());
      out.write("</option>\n");
      out.write("                    ");
}
                    
      out.write("\n");
      out.write("                </select>\n");
      out.write("            </td>\n");
      out.write("        </tr>\n");
      out.write("        <tr><th colspan=\"4\">Especificaciones del Servicio</th></tr>\n");
      out.write("        <tr>\n");
      out.write("            <td></td>\n");
      out.write("        </tr>\n");
      out.write("        <tr>\n");
      out.write("            <th>Fecha Inicio</th>\n");
      out.write("            <td>\n");
      out.write("                <input type=\"date\" name=\"fechaInicioServicio\" class=\"form-control\" >\n");
      out.write("            </td>\n");
      out.write("        \n");
      out.write("            <th>Fecha Fin</th>\n");
      out.write("            <td>\n");
      out.write("                <input type=\"date\" name=\"fechaFinServicio\" class=\"form-control\" >\n");
      out.write("            </td>\n");
      out.write("        </tr>\n");
      out.write("        <tr>\n");
      out.write("            <th>Servicio</th>\n");
      out.write("            <td>\n");
      out.write("                ");

                    List<Servicios> listS = cmm.listaServicio();
                    for (Servicios se : listS) {
      out.write("\n");
      out.write("                    <input type=\"checkbox\" name=\"servicios\" value=\"");
      out.print(se.getCodServicio() );
      out.write("\" class=\"ol\">");
      out.print(se.getNombreServicio() );
      out.write("<br>\n");
      out.write("                ");
}
                
      out.write("\n");
      out.write("            </td>\n");
      out.write("            <th>Tratamiento</th>\n");
      out.write("            <td></td>\n");
      out.write("        </tr>\n");
      out.write("        <tr>\n");
      out.write("            <th>Observaciones</th>\n");
      out.write("            <td colspan=\"2\">\n");
      out.write("                <input type=\"text\" class=\"form-control\" name=\"observacion\"/>\n");
      out.write("            </td>\n");
      out.write("            <td>\n");
      out.write("                <input type=\"submit\" name=\"guardarC\" value=\"Guardar\" class=\"btn btn-success\">\n");
      out.write("            </td>\n");
      out.write("        </tr>\n");
      out.write("\n");
      out.write("    </table>\n");
      out.write("</form>\n");
      out.write("<!--<script type=\"text/javascript\">\n");
      out.write("    $(document).ready(function(){\n");
      out.write("        var voto = [];\n");
      out.write("       $('ol').click(function(){\n");
      out.write("          voto[voto.length] = $(this).attr('id');\n");
      out.write("\n");
      out.write("       });\n");
      out.write("       $('nav').click(function (){\n");
      out.write("          var votos = voto.toString();\n");
      out.write("          var dui = document.getElementById(\"dui\").value;\n");
      out.write("          $.ajax({\n");
      out.write("                         type: \"GET\",\n");
      out.write("                         contentType: \"application/json\",\n");
      out.write("                         url: \"/SistemaVotaciones/Voto\",\n");
      out.write("                         data : {voto: votos, dui: dui},\n");
      out.write("                         //data : JSON.stringify({voto: voto.toString(), dui: dui}),\n");
      out.write("                         success: function(data){\n");
      out.write("                             alert(\"Gracias por su voto, bye!\");\n");
      out.write("                             window.location.replace(\"http://localhost:8080/SistemaVotaciones/LogOut?btnCerrar=true\");\n");
      out.write("                         }\n");
      out.write("          });\n");
      out.write("          if(window.top==window) {\n");
      out.write("    // You're not in a frame, so you reload the site.\n");
      out.write("            //alert(\"Tu voto fue procesado correctamente, gracias por utilizar el servicio de votaciones online\");\n");
      out.write("            //window.location.replace(\"http://localhost:8080/SistemaVotaciones/votante.jsp\")\n");
      out.write("    //  //Reloads after three seconds\n");
      out.write("        }\n");
      out.write("       });\n");
      out.write("   });\n");
      out.write("</script>-->\n");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "footer.jsp", out, false);
      out.write('\n');
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
