<%@page import="com.clinica.modelo.ServiciosModelo"%>
<%@page import="java.util.*"%>
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
    ServiciosModelo serv = new ServiciosModelo();
%>
<form method="post" action="ServiciosController" name="frmServicios">
    <table class="table">
        <tr>
            <th>C&oacute;digo Servicio</th>
            <td>
                <%
                    ServiciosModelo obj = new ServiciosModelo();
                    Object n = obj.contar(obj);
                %>
                <input type="text" name="codServi" value="SERV-<%=n%>" class="form-control" readonly="true">
            </td>
            <th>Nombre</th>
            <td>
                <input type="text" name="nombreServi" class="form-control">
            </td>
        </tr>
        <tr>
            <th>Precio($)</th>
            <td>
                <input type="numeric" name="precioServi" class="form-control">
            </td>
            <th>Costo($)</th>
            <td>
                <input type="numeric" name="costoServi" class="form-control">
            </td>
        </tr>
        <tr>
            <th></th>
            <td></td>
            <th></th>
            <td>
                <input type="submit" value="Guardar" class="btn btn-info" name="guardarServicio" />
            </td>
        </tr>
    </table>
</form>
<jsp:include page="footer.jsp" />