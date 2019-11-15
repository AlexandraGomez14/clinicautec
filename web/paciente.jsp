<%@page import="com.clinica.modelo.Departamento"%>
<%@page import="com.clinica.modelo.PacienteModelo"%>
<%@page import="com.clinica.modelo.Usuarios"%>
<%@page import="java.util.*"%>
<%@page import="com.clinica.modelo.UsuarioModelo"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"	pageEncoding="UTF-8"%>
<jsp:include page="header.jsp" />
<%
    PacienteModelo pm = new PacienteModelo();
%>
<form action="PacienteController" name="frmPaciente" method="post">
    <table class="table">
        <tr>
            <th>Codigo<span>*</span></th>
                <%
                    PacienteModelo obj = new PacienteModelo();
                    Object n = obj.contar(obj);
                %>
            <th>
                <input type="text" name="codigoP" value="PCNT-<%=n%>" class="form-control" readonly="true">
            </th>
        </tr>
        <tr>
            <th>Primer Nombre<span>*</span></th>
            <td>
                <input type="text" name="pNombre"  class="form-control" required="">
            </td>
            <th>Segundo Nombre</th>
            <td>
                <input type="text" name="sNombre"  class="form-control">
            </td>
        </tr>
        <tr>
            <th>Primer Apellido<span>*</span></th>
            <td>
                <input type="text" name="pApellido"  class="form-control" required="">
            </td>
            <th>Segundo Apellido</th>
            <td>
                <input type="text" name="sApellido"  class="form-control">
            </td>
        </tr>
        <tr>
            <th>Telefono Personal<span>*</span></th>
            <td>
                <input type="text" name="telPersonal"  class="form-control">
            </td>
            <th>Telefono Casa</th>
            <td>
                <input type="text" name="telCasa"  class="form-control">
            </td>
        </tr>
        <tr>
            <th>Departamento<span>*</span></th>
            <td>
                <select name="departamento" class="form-control">
                    <%
                        List<Departamento>lis = pm.listaDepartamento();
                        for(Departamento dep: lis){%>
                        <option value="<%=dep.getCodDepartamento() %>"><%=dep.getNombre() %></option>
                    <%}
                    %>
                    
                </select>
            </td>
            <th>Municipio<span>*</span></th>
            <td>
                <input type="text" name="municipio"  class="form-control">
            </td>
        </tr>
        <tr>
            <th>Colonia<span>*</span></th>
            <td>
                <input type="text" name="colonia"  class="form-control">
            </td>
            <th>Pasaje</th>
            <td>
                <input type="text" name="pasaje"  class="form-control">
            </td>
        </tr>
        <tr>
            <th>Nº Casa<span>*</span></th>
            <td>
                <input type="text" name="numCasa"  class="form-control">
            </td>
            <td>
                <input type="submit" value="Guardar" class="btn btn-info" name="agregarP" style="">
            </td>
        </tr>
    </table>
</form>


<jsp:include page="footer.jsp" />