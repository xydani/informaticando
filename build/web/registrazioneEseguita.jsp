<%-- 
    Document   : registrazioneEseguita
    Created on : 13 set 2022, 17:41:37
    Author     : fpw
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Registrazione eseguita</title>
        <link rel="stylesheet" type="text/css" href="style.css" media="screen">
        <script type="text/javascript" src="js/jquery.js"></script>
        <script type="text/javascript" src="js/fontChanger.js"></script>
    </head>
    <body>
        
        <div class="container">
            
            <jsp:include page="header.jsp"/>

            <jsp:include page="navbar.jsp"/>

            <main class="mainColumn">
                <h2>Registrazione eseguita con successo!</h2>
            </main>

            <jsp:include page="secondary.jsp"/>
            
            <jsp:include page="footer.jsp"/>
                
        </div>
    </body>
</html>
