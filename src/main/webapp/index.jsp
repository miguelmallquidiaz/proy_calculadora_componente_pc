<%-- 
    Document   : index
    Created on : 21 sept 2023, 19:49:25
    Author     : HP
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
String username = (String) session.getAttribute("username");
if (username == null) {
    response.sendRedirect("login.jsp");
}
%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Calculadora de componentes</title>
        <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.1/dist/css/bootstrap.min.css">
        <link rel="stylesheet" href="css/style.css">
    </head>
    <body>
        <nav class="navbar navbar-expand-lg navbar-dark bg-black">
            <div class="container bg-black">
                <a class="navbar-brand" href="#">
                    <img src="img/logo.png" alt="Logo" height="30">
                </a>
                <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarNav"
                    aria-controls="navbarNav" aria-expanded="false" aria-label="Toggle navigation">
                    <span class="navbar-toggler-icon"></span>
                </button>
                <div class="collapse navbar-collapse justify-content-end" id="navbarNav">
                    <ul class="navbar-nav">
                        <li class="nav-item">
                            <a class="nav-link text-light"><%= username %></a>
                        </li>
                        <li class="nav-item">
                            <a class="nav-link text-light" href="logout.jsp">Salir</a>
                        </li>
                    </ul>
                </div>
            </div>
        </nav>

        <div class="container text-center mt-3">
            <img src="img/banner.jpg" alt="Banner" class="img-fluid max-width-100">
        </div>

        <div class="container my-5 title">
            <div class="row">
                <div class="col-12">
                    <h1 class="text-center text-lg-left text-black">Elegir tus componentes: </h1>
                </div>
            </div>
        </div>

        <div class="container mt-4">
            <div class="row align-items-center">
                <div class="col-3">
                    <label for="miCampoTexto" class="text-left fs-4">Ingresar monto: </label>
                </div>
                <div class="col-3">
                    <input type="text" id="miCampoTexto" name="miCampoTexto">
                </div>
            </div>
        </div>
        
        <div class="container mt-4">
            <div class="row align-items-center">
                <div class="col">
                    <p class="text-left fs-4">CPU:</p>
                </div>
            </div>
            <div class="row align-items-center">
                <div class="col-12 col-md-6 d-md-none">
                    <div class="d-flex">
                        <div class="mr-3">
                            <img src="" alt="Cpu" class="img-fluid img-height">
                        </div>
                        <div>
                            <p class="text-center text-md-left fs-6">AMD Ryzen 5 5600X 3.7 GHz 6-Core Processor</p>
                            <p class="text-center text-md-left fs-6">$155</p>
                        </div>
                    </div>
                </div>
                <div class="col-12 col-md-3 d-none d-md-block">
                    <img src="img/cpu.jpg" alt="Tu imagen" class="img-fluid img-height">
                </div>
                <div class="col-12 col-md-3 d-none d-md-block">
                    <p class="text-center text-md-left fs-6">AMD Ryzen 5 5600X 3.7 GHz 6-Core Processor</p>
                </div>
                <div class="col-12 col-md-3 d-none d-md-block">
                    <p class="text-center text-md-left fs-6">$155</p>
                </div>
                <div class="col-12 col-md-3 mt-3 mt-md-0">
                    <button class="btn btn-secondary btn-block">Remover</button>
                </div>
            </div>
        </div>

        <div class="container mt-4">
            <div class="row align-items-center">
                <div class="col">
                    <p class="text-left fs-4">Tarjeta Madre: </p>
                </div>
            </div>
            <div class="row align-items-center">
                <div class="col-12 col-md-3 mt-3 mt-md-0">
                    <a href="tabla.html" class="btn btn-primary btn-auto">Seleccionar componente</a>
                </div>
            </div>
        </div>

        <div class="container mt-4">
            <div class="row align-items-center">
                <div class="col">
                    <p class="text-left fs-4">Memoria RAM: </p>
                </div>
            </div>
            <div class="row align-items-center">
                <div class="col-12 col-md-3 mt-3 mt-md-0">
                    <a href="tabla.html" class="btn btn-primary btn-auto">Seleccionar componente</a>
                </div>
            </div>
        </div>
        
        <div class="container mt-4 mb-4">
            <div class="row align-items-center">
                <div class="col">
                    <p class="text-left fs-4">Tarjeta Gráfica: </p>
                </div>
            </div>
            <div class="row align-items-center">
                <div class="col-12 col-md-3 mt-3 mt-md-0">
                    <a href="tabla.html" class="btn btn-primary btn-auto">Seleccionar componente</a>
                </div>
            </div>
        </div>

        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.1/dist/js/bootstrap.bundle.min.js"></script>
        <script src="https://kit.fontawesome.com/a3ad0e6149.js" crossorigin="anonymous"></script>
    </body>
</html>
