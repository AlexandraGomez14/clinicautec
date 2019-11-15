<%@page import="com.clinica.modelo.Doctores"%>
<%@page import="com.clinica.modelo.Paciente"%>
<%@page import="com.clinica.modelo.CitaModelo"%>
<%@page import="com.clinica.modelo.Departamento"%>
<%@page import="com.clinica.modelo.PacienteModelo"%>
<%@page import="com.clinica.modelo.Usuarios"%>
<%@page import="java.util.*"%>
<%@page import="com.clinica.modelo.UsuarioModelo"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"	pageEncoding="UTF-8"%>
<jsp:include page="header.jsp" />
<%
    CitaModelo cm = new CitaModelo();
%>
<form action="CitaController" method="post" name="frmCita">
    <table class="table">
        <tr>
            <th>C&oacute;digo Cita</th>
            <td>
                <%
                    CitaModelo obj = new CitaModelo();
                    Object n = obj.contar(obj);
                %>
                <input type="text" name="codigoC" value="PCNT-<%=n%>" class="form-control" readonly="true">
            </td>
        </tr>
        <tr>
            <th>Paciente</th>
            <td>
                <select name="paci" class="form-control">
                 <%
                     List<Paciente>lis = cm.listaPaciente();
                     for(Paciente pa: lis){%>
                     <option value="<%=pa.getCodPaciente()%>"><%=pa.getPrimerNombre() %><%=pa.getPrimerApellido() %></option>
                 <%}
                 %>
                </select>
            </td>
            <th>Fecha de Cita</th>
            <td>
                <input type="date" name="fCita" class="form-control" pattern="dd/MM/yyyy"/>
            </td>
        </tr>
        <tr>
            <th>Hora de Cita</th>
            <td>
                <!--<input type="time" class="form-control" name="horaCita"/>-->
                <input type="time" class="form-control" name="horaCita"/>
            </td>
            <th>Estado de Cita</th>
            <td>
                <select class="form-control" name="estado">
                    <option value="Reservada">Reservada</option>
                    <option value="Cancelada">Cancelada</option>
                </select>
            </td>
        </tr>
        <tr>
            <th>M&eacute;dico</th>
            <td>
                <select name="medico" class="form-control">
                 <%
                     List<Doctores>lisD = cm.listaDoctores();
                     for(Doctores doc: lisD){%>
                     <option value="<%=doc.getCodDoctor() %>"><%=doc.getPrimerNombre() %><%=doc.getPrimerApellido() %></option>
                 <%}
                 %>
                </select>
            </td>
            <th>Consultario</th>
            <td>
                <input type="text" class="form-control" name="consultorio"/>
            </td>
        </tr>
        <tr>
            <th></th>
            <td>
            </td>
            <th></th>
            <td>
                <input type="submit" value="Guardar" class="btn btn-info" name="guardarCita" />
            </td>
        </tr>
    </table>
</form>
<jsp:include page="footer.jsp" />