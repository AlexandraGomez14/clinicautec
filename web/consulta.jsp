<%@page import="com.clinica.modelo.Servicios"%>
<%@page import="com.clinica.modelo.Doctores"%>
<%@page import="com.clinica.modelo.Datos"%>
<%@page import="com.clinica.modelo.ConsultaModelo"%>
<%@page import="com.clinica.modelo.CitaModelo"%>
<%@page import="com.clinica.modelo.Paciente"%>
<%@page import="java.text.SimpleDateFormat"%>
<%@page import="java.util.*"%>
<%@page import="com.clinica.modelo.UsuarioModelo"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"	pageEncoding="UTF-8"%>
<jsp:include page="header.jsp" />
<%
    if (request.getAttribute("valor") != null) {%>
<script>
    alert('<%= request.getAttribute("valor")%>');
</script>
<%
    }
%>
<%
    ConsultaModelo cmm = new ConsultaModelo();
   
%>
<%--<%=new java.text.SimpleDateFormat("dd/MM/yyyy  hh:mm").format(new java.util.Date())%>--%>
<form action="ConsultaController" method="post" name="frmBusquedad">
    <table class="table" name="frmConsulta">
        <tr>
            <td>
                <%
                    ConsultaModelo obj = new ConsultaModelo();
                    Object n = obj.contar(obj);
                %>
                <input type="text" name="codConsulta" class="form-control" value="CONS-<%=n %>" hidden="true">
            </td>
        </tr>
        <tr>
            <th>
                Fecha de Cita Realizada
            </th>
            <td>
                <input type="date" name="fechaCita" class="form-control">
            </td>
        </tr>
        <tr>
            <th>Paciente atendido</th>
            <td>
                <select name="codPaciente" class="form-control">
                    <%
                        CitaModelo cm = new CitaModelo();
                        List<Paciente> listPac = cm.listaPaciente();
                        for (Paciente lis : listPac) {%>
                    <option value="<%=lis.getCodPaciente()%>"><%=lis.getPrimerNombre()%> <%=lis.getPrimerApellido()%></option>
                    <%}%>
                </select>
            </td>
            <th>Doctor</th>
            <td>
                <select name="medico" class="form-control">
                    <%
                        List<Doctores> lisD = cm.listaDoctores();
                        for (Doctores doc : lisD) {%>
                    <option value="<%=doc.getCodDoctor()%>"><%=doc.getPrimerNombre()%><%=doc.getPrimerApellido()%></option>
                    <%}
                    %>
                </select>
            </td>
        </tr>
        <tr><th colspan="4">Especificaciones del Servicio</th></tr>
        <tr>
            <td></td>
        </tr>
        <tr>
            <th>Fecha Inicio</th>
            <td>
                <input type="date" name="fechaInicioServicio" class="form-control" >
            </td>
        
            <th>Fecha Fin</th>
            <td>
                <input type="date" name="fechaFinServicio" class="form-control" >
            </td>
        </tr>
        <tr>
            <th>Servicio</th>
            <td>
                <%
                    List<Servicios> listS = cmm.listaServicio();
                    for (Servicios se : listS) {%>
                    <input type="checkbox" name="servicios" value="<%=se.getCodServicio() %>" class="ol"><%=se.getNombreServicio() %><br>
                <%}
                %>
            </td>
            <td></td>
        </tr>
        <tr>
            <th>Observaciones</th>
            <td colspan="2">
                <input type="text" class="form-control" name="observacion"/>
            </td>
            <td>
                <input type="submit" name="guardarC" value="Guardar" class="btn btn-success">
            </td>
        </tr>

    </table>
</form>
<!--<script type="text/javascript">
    $(document).ready(function(){
        var voto = [];
       $('ol').click(function(){
          voto[voto.length] = $(this).attr('id');

       });
       $('nav').click(function (){
          var votos = voto.toString();
          var dui = document.getElementById("dui").value;
          $.ajax({
                         type: "GET",
                         contentType: "application/json",
                         url: "/SistemaVotaciones/Voto",
                         data : {voto: votos, dui: dui},
                         //data : JSON.stringify({voto: voto.toString(), dui: dui}),
                         success: function(data){
                             alert("Gracias por su voto, bye!");
                             window.location.replace("http://localhost:8080/SistemaVotaciones/LogOut?btnCerrar=true");
                         }
          });
          if(window.top==window) {
    // You're not in a frame, so you reload the site.
            //alert("Tu voto fue procesado correctamente, gracias por utilizar el servicio de votaciones online");
            //window.location.replace("http://localhost:8080/SistemaVotaciones/votante.jsp")
    //  //Reloads after three seconds
        }
       });
   });
</script>-->
<jsp:include page="footer.jsp" />
