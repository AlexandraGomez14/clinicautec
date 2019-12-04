<%@page import="com.clinica.modelo.Usuarios"%>
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
    UsuarioModelo um = new UsuarioModelo();
%>
<script Language='JavaScript'>
    function cargar(u, r, c)
    {
        document.frmUsuario.usuario.value = u;
        document.frmUsuario.rol.value = r;
        document.frmUsuario.contra.value = c;
        console.log();
    }
</script>
<form action="UsuariosController" method="POST" name="frmUsuario">
    <table class="table">
        <tr>
            <td>Usuario</td>
            <td>
                <input type="text" name="usuario" class="form-control">
            </td>
        </tr>
        <tr>
            <td>Contrase&ntilde;a</td>
            <td>
                <input type="password" name="contra" class="form-control">
            </td>
            <td>Rol de Usuario</td>
            <td>
                <select class="form-control" name="rol">
                    <option value="1">Administrador</option>
                    <option value="2">Doctor</option>
                    <option value="3">Secreatria</option>
                    <option value="4">RRHH</option>
                </select>
            </td>
        </tr>
        <tr>
            <td></td>
            <td></td>
            <td></td>
            <td>
                <input type="submit" value="Registrar Usuario" name="agregar" class="btn btn-info float-right" >            
                <input type="submit" value="Eliminar Usuario" name="eliminar" class="btn btn-danger" >            
            </td>
        </tr>
    </table>
</form>
<form action="UsuariosController" method="POST" name="frmUsuarioEliminar">
    <table class="table ">
        <thead>
            <tr class="thead-light">
                <th colspan="2"></th>
                <th>Usuario</th>
                <th>Rol de Usuario</th>
                <th>Operaci&oacute;n</th>
            </tr>
        </thead>
        <tbody>
            <%
                List<Usuarios> lista = um.mostrarUsuario();
                for (Usuarios us : lista) {
            %>
            <tr>
                <td colspan="2"></td>
                <td><%= us.getUsuario()%></td>
                <td><%= us.getCodigoRol()%></td>
                <td>
                    <a href="javascript:cargar('<%=us.getUsuario()%>','<%=us.getContra() %>','<%=us.getCodigoRol()%>')">SELECCIONAR</a>
                </td>
            </tr>
            <%}%>
        </tbody>
    </table>
</form>
<jsp:include page="footer.jsp" />