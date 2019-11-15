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
        document.frmModificarUsuario.usuario.value = u;
        document.frmModificarUsuario.rol.value = r;
        document.frmModificarUsuario.contra.value = c;
        console.log();
    }
</script>
<button type="agregar" class="btn btn-info align-items-center" data-toggle="modal" data-target="#myModal">
   Crear Usuario
</button>
<br><br>
<table border="1" class="table table-striped">
    <thead>
        <tr class="thead-dark">
            <th colspan="2"></th>
            <th>Usuario</th>
            <th>Rol de Usuario</th>
            <th>Operaciones</th>
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
                <a href="javascript:cargar('<%=us.getUsuario()%>','<%=us.getCodigoRol()%>','<%=us.getContra() %>')">
                    <input type="submit" class="btn btn-warning" value="Modificar" data-toggle="modal" data-target="#modimodal">    
                </a>
                <input type="submit" class="btn btn-danger" value="Eliminar">
            </td>
        </tr>
        <%}%>
    </tbody>
</table>

<div class="modal" id="myModal" tabindex="-1">
    <div class="modal-dialog">
        <div class="modal-content">

            <!-- Modal Header -->
            <div class="modal-header">
                <h4 class="modal-title">Usuarios</h4>
                <button type="button" class="close" data-dismiss="modal">&times;</button>
            </div>

            <!-- Modal body -->
            <div class="modal-body">
                <form action="usuarioController" method="post" name="frmUsuario">
                    <table>
                        <tr>
                            <td>Usuario</td>
                            <td>
                                <input type="text" name="usuario" class="form-control">
                            </td>
                        </tr>
                        <tr>
                            <td>Contrase&ntilde;a</td>
                            <td>
                                <input type="text" name="contra" class="form-control">
                            </td>
                        </tr>
                        <tr>
                            <td>Rol de Usuario</td>
                            <td>
                                <input type="text" name="rol" class="form-control">
                            </td>
                        </tr>
                    </table>
                </form>
            </div>
            <!-- Modal footer -->
            <div class="modal-footer">
                <!--<button type="button" class="btn btn-danger" data-dismiss="modal">Close</button>-->
                <input type="submit" value="guardar" name="agregar" class="btn btn-info">
                <input type="submit" value="guardar" name="agregar" class="btn btn-info">
            </div>

        </div>
    </div>
</div>     

<!-- moda para modificar -->
<div class="modal" id="modimodal" tabindex="-1">
    <div class="modal-dialog">
        <div class="modal-content">

            <!-- Modal Header -->
            <div class="modal-header">
                <h4 class="modal-title">Usuarios</h4>
                <button type="button" class="close" data-dismiss="modal">&times;</button>
            </div>

            <!-- Modal body -->
            <div class="modal-body">
                <form action="usuarioController" method="post" name="frmModificarUsuario">
                    <table>
                        <tr>
                            <td>Usuario</td>
                            <td>
                                <input type="text" name="usuario" class="form-control">
                            </td>
                        </tr>
                        <tr>
                            <td>Contrase&ntilde;a</td>
                            <td>
                                <input type="text" name="contra" class="form-control">
                            </td>
                        </tr>
                        <tr>
                            <td>Rol de Usuario</td>
                            <td>
                                <input type="text" name="rol" class="form-control">
                            </td>
                        </tr>
                    </table>
                </form>
            </div>
            <!-- Modal footer -->
            <div class="modal-footer">
                <!--<button type="button" class="btn btn-danger" data-dismiss="modal">Close</button>-->
                <input type="submit" value="guardar" name="modificar" class="btn btn-warning">
            </div>

        </div>
    </div>
</div>     


</form>
<jsp:include page="footer.jsp" />