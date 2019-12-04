<%-- 
    Document   : login
    Created on : Nov 30, 2019, 11:45:32 PM
    Author     : Gabriela Alexandra Gomez
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
        <meta name="description" content="">
        <meta name="author" content="">
        <title>Clinica Odontologica</title>

        <!-- Custom styles for this template-->
        <link href="css/sb-admin-2.min.css" rel="stylesheet">

    </head>
    <body class="bg-gradient-primary">
        <div class="container">

            <!-- Outer Row -->
            <div class="row justify-content-center">

                <div class="col-xl-10 col-lg-12 col-md-9">

                    <div class="card o-hidden border-0 shadow-lg my-5">
                        <div class="card-body p-0">
                            <!-- Nested Row within Card Body -->
                            <div class="row">
                                <div class="col-lg-6 d-none d-lg-block">
                                    <image src="imagen/login1.jpg"/>
                                </div>
                                <div class="col-lg-6">
                                    <div class="p-5">
                                        <div class="text-center">
                                            <strong><h1 class="h4 mb-4">BIENVENIDO A CLINCA B&Eacute;LEN!</h1></strong>
                                        </div>
                                        <form class="user" action="LoginController">
                                            <div class="form-group">
                                                <input type="text" class="form-control form-control-user"   placeholder="Usuario" name="txtUser">
                                            </div>
                                            <div class="form-group">
                                                <input type="password" class="form-control form-control-user" id="exampleInputPassword" placeholder="Password" name="txtPass">
                                            </div>
                                            <input type="submit" name="btnIniciar" value="Iniciar Sesi&oacute;n" class="btn btn-primary btn-user btn-block">
                                            <hr>
                                        </form>
                                        <hr>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>

                </div>

            </div>

        </div>
        <%
                HttpSession sesion = request.getSession();
                int nivel = 0;
                if(request.getAttribute("codigoRol") != null){
                    nivel = (Integer)request.getAttribute("codigoRol");
                    if(nivel == 1){
                        sesion.setAttribute("usuario", request.getAttribute("codigoRol"));
                        sesion.setAttribute("codigoRol", nivel);
                        response.sendRedirect("principal.jsp");
                    }
                }
            %>

        <!-- Bootstrap core JavaScript-->
        <script src="vendor/jquery/jquery.min.js"></script>
        <script src="vendor/bootstrap/js/bootstrap.bundle.min.js"></script>

        <!-- Core plugin JavaScript-->
        <script src="vendor/jquery-easing/jquery.easing.min.js"></script>

        <!-- Custom scripts for all pages-->
        <script src="js/sb-admin-2.min.js"></script>

    </body>

</html>
