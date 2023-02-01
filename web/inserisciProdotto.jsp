<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!-- Servlet per gestire l'inserimento di un prodotto-->

<!DOCTYPE html>
<html>
    <head>
        <title>Informaticando - Inserisci Prodotto</title>
        <meta charset="UTF-8">
        <meta name = "viewport"
              content="width=device-width, initial-scale=1.0">
        <meta name = "author"
              content ="Daniele Lurani, Fabio Sanna, Emanuele Frau">
        <meta name ="description"
              content ="Richiedi il servizio di cui hai bisogno!">
        <meta name ="keywords"
              content ="pc, it, computer, informatica, assistenza
              servizi, prodotti">
        <link rel ="stylesheet"
              type="text/css"
              href="style.css"
              media="screen">
        <link rel="preconnect" href="https://fonts.googleapis.com">
        <link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
        <link href="https://fonts.googleapis.com/css2?family=Poppins:wght@100&family=Roboto+Slab&display=swap" rel="stylesheet">
        <script type="text/javascript" src="js/jquery.js"></script>
        <script type="text/javascript" src="js/fontChanger.js"></script>
        <script type="text/javascript" src="js/inserimento.js"></script>
    </head>
    
    <!<!-- Controllo se l'utente è loggato, in caso negativo rimando alla pagina
            di login-->
    <c:if test="${empty user}">
        <c:redirect url="login.jsp"/>
    </c:if>
        
    <c:if test="${not empty user}">
        
    <body>
        <div class="container">
            <jsp:include page="header.jsp"/>

            <jsp:include page="navbar.jsp"/>
            
            <main class="mainColumn">
                <div id="prodottoBox">
                    
                    <h2>Inserisci prodotto</h2>
                    
                    <form action="InserimentoProdottoServlet" method="post">
                        
                        <p id="nomeProdCh">Caratteri: 0/50</p>
                        <input type="text"
                               placeholder="Inserisci il nome del prodotto"
                               id="nomeProdotto"
                               name="nomeProdotto"/>  </br>

                        <p id="descrProdCh">Caratteri: 0/325</p>
                        <textarea
                                id="descrizioneProdotto"
                                placeholder="Descrivi brevemente il prodotto"
                                name="descrizioneProdotto"
                                rows='4'
                                cols='20'></textarea><br>

                        
                        <input type="number" id="prezzoProdotto"
                               name="prezzoProdotto"
                               placeholder="Inserisci il prezzo del prodotto"
                               /> <br>
                        
                        <button "type="submit" id="insButt" value="Pubblica">Inserisci</button>
                    </form>
                    
                </div>
            </main>
            
            <jsp:include page="secondary.jsp"/>
            
            <jsp:include page="footer.jsp"/>
            
        </div>
    </body>
    
    </c:if>
</html>
