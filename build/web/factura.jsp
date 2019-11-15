<%@page import="com.clinica.modelo.FacturaModelo"%>
<%@page import="com.clinica.modelo.Paciente"%>
<%@page import="java.util.List"%>
<%@page import="java.util.List"%>
<%@page import="com.clinica.modelo.CitaModelo"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"	pageEncoding="UTF-8"%>
<jsp:include page="header.jsp" />
<%
    FacturaModelo fm = new FacturaModelo();
%>
<form>
    <table class="table">
        <thead>
            <tr>
                <th>C&oacute;digo Factura</th>
                <td>
                    <%
                        FacturaModelo obj = new FacturaModelo();
                        Object n = obj.contar(obj);
                    %>
                    <label name="codFactura" class="form-control" value="Nº-FCDB-<%=n %>"/>
                </td>
                <th>Paciente</th>
                <td><select name="codPaciente" class="form-control">
                        <%
                            CitaModelo cm = new CitaModelo();
                            List<Paciente> listPac = cm.listaPaciente();
                            for (Paciente lis : listPac) {%>
                        <option value="<%=lis.getCodPaciente()%>"><%=lis.getPrimerNombre()%> <%=lis.getPrimerApellido()%></option>
                        <%}%>
                    </select></td>
            </tr>
        </thead>
        <tbody>
            <tr>
                
            </tr>
            <tr>
                <td></td>
                <td></td>
            </tr>
        </tbody>
    </table>

</form>
<jsp:include page="footer.jsp" />