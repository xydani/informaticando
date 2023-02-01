<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta charset="UTF-8">
        <meta name = "viewport" content="width=device-width, initial-scale=1.0">
        <meta name = "author" content ="Daniele Lurani, Fabio Sanna, Emanuele Frau">
        <meta name ="description" content ="Richiedi il servizio di cui hai bisogno!">
        <meta name ="keywords" content ="pc, it, computer, informatica, assistenza
              servizi, prodotti">
        <link rel ="stylesheet" type="text/css" href="style.css" media="screen">
        <link rel="preconnect" href="https://fonts.googleapis.com">
        <link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
        <link href="https://fonts.googleapis.com/css2?family=Poppins:wght@100&family=Roboto+Slab&display=swap" rel="stylesheet">
        <script type="text/javascript" src="js/jquery.js"></script>
        <script type="text/javascript" src="js/fontChanger.js"></script>
    </head>
    <body>
        
        
        <div class="container">
            
            <jsp:include page="header.jsp"/>

            <jsp:include page="navbar.jsp"/>

            <main class="mainColumn">
                
                <div id="inseritaJSP">
                    <h1>Nuovo prodotto inserito con successo</h1>
                </div>
            </main>

            <jsp:include page="secondary.jsp"/>
            
            <jsp:include page="footer.jsp"/>
                
        </div>
        
    </body>
</html>