<%-- 
    Document   : index
    Created on : 21 sept 2023, 19:49:25
    Author     : HP
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Register</title>
    <link rel="preconnect" href="https://fonts.googleapis.com">
    <link href='https://unpkg.com/boxicons@2.1.4/css/boxicons.min.css' rel='stylesheet'>
    <link rel="stylesheet" href="./css/styleIR.css">
</head>
<body>
    <div class="wrapper">
        <form action="./php/register.php" method="post">
            <h1>Registrarte</h1>
            <div class="input-box">
                <input type="text" placeholder="Nombres" name="name" required>
                <i class='bx bxs-user-minus' ></i>           
             </div>
            <div class="input-box">
                <input type="text" placeholder="Apellido" name="lastname" required>
                <i class='bx bxs-user-detail'></i>
            </div>
            <div class="input-box">
                <input type="text" placeholder="Correo" name="mail" required>
                <i class='bx bxs-envelope' ></i>
            </div>
            <div class="input-box">
                <input type="text" placeholder="Username" name="username" required>
                <i class='bx bxs-user'></i>
            </div>     
            <div class="input-box">
                <input type="password" placeholder="Password"  name="password" required>
                <i class='bx bxs-lock-alt' ></i>
            </div>
            <div class="remember-forgot">
                <label for="">
                    <input type="checkbox" name="" id="">Remeber me
                </label>
                <a href="#">Forgot password?</a>
            </div>
            <button type="submit" class="btn">Registrarte</button>
            <div class="register-link">
                <p>¿Tienes una cuenta? <a href="login.jsp">Inicia Sesion</a></p>
            </div>
        </form>

    </div>
</body>
</html>
