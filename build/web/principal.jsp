<%@page import="com.clinica.modelo.CitasAll"%>
<%@page import="java.text.SimpleDateFormat"%>
<%@page import="java.text.DateFormat"%>
<%@page import="com.clinica.modelo.CitaModelo"%>
<%@page import="com.clinica.modelo.Cita"%>
<%@page import="com.clinica.modelo.Departamento"%>
<%@page import="com.clinica.modelo.PacienteModelo"%>
<%@page import="com.clinica.modelo.Usuarios"%>
<%@page import="java.util.*"%>
<%@page import="com.clinica.modelo.UsuarioModelo"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"	pageEncoding="UTF-8"%>
<jsp:include page="header.jsp" />
<CENTER><h3>!!!CITAS RESERVADAS!!!</h3></CENTER>
<div class="row" style="padding: 10px;">
    <%
        DateFormat formatoHora = new SimpleDateFormat("HH:mm:ss");
        CitaModelo cm = new CitaModelo();
        List<CitasAll> lista = cm.allCitas();
        for (CitasAll c : lista) {
    %>
    <div class="col-xl-5 col-md-6 mb-4">
        <div class="card border-left-primary shadow h-100 py-2">
            <div class="card-body">
                <div class="row no-gutters align-items-center">
                    <div class="col mr-2">
                        <div class="text-xs font-weight-bold text-primary text-uppercase mb-3">c&oacute;digo: <%=c.getCodCita()%>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;CONS: <%=c.getConsultorio()%>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<%=c.getEstado()%></div>
                        <div class="text-xs font-weight-bold text-primary text-uppercase mb-3"></div>
                        <div class="text-xs font-weight-bold text-primary text-uppercase mb-1">FECHA DE CITA:&nbsp;&nbsp;&nbsp;<%=c.getFechaCita()%>&nbsp;&nbsp;&nbsp;HOTA PARA CITA: </div>
                        <div class="text-xs font-weight-bold text-primary text-uppercase mb-1">DOCTOR:&nbsp;&nbsp;&nbsp;<%=c.getPrimerNombreDoctor()%><%=c.getPrimerApellidoDoctor()%>&nbsp;</div>
                        <div class="h5 mb-0 font-weight-bold text-gray-800"><%=c.getPrimerNombrePaciente()%><%=c.getPrimerApellidoPaciente()%></div>
                    </div>
                    <div class="col-auto">
                        <!--<i class="fas fa-calendar "></i>-->
                        <i class="fas fa-address-book fa-3x "></i>
                    </div>
                </div>
            </div>
        </div>
    </div>
    <%
        }
    %>
</div>
<jsp:include page="footer.jsp" />