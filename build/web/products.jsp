<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Informaticando - Prodotti e Servizi</title>
        <meta charset="UTF-8">
        <meta name = "viewport" content="width=device-width, initial-scale=1.0">
        <meta name = "author" content ="Daniele Lurani, Fabio Sanna, Emanuele Frau">
        <meta name ="description" content ="Informaticando, i nostri prodotti e servizi ad un prezzo incredibile!">
        <meta name ="keywords" content ="pc, it, computer, informatica, assistenza
              servizi, prodotti">
        <link rel ="stylesheet" type="text/css" href="style.css" media="screen">
        <link rel="preconnect" href="https://fonts.googleapis.com">
        <link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
        <link href="https://fonts.googleapis.com/css2?family=Poppins:wght@100&family=Roboto+Slab&display=swap" rel="stylesheet">
        <script type="text/javascript" src="js/jquery.js"></script> 
        <script type="text/javascript" src="js/fontChanger.js"></script>
    </head>
    
    <c:if test="${empty user}">
        <c:redirect url="login.jsp"/>
    </c:if>
        
    <c:if test="${not empty user}">
        
    <c:set var="page" value="products" scope="request"/>
    
    <body>
        
        <div class="container">
            
            <jsp:include page="header.jsp"/>

            <jsp:include page="navbar.jsp"/>
            
            
            <c:if test="${empty listaProdotti}">
                <c:redirect url="index.jsp"/>
            </c:if>
            
            <c:if test="${not empty listaProdotti}">
            <main  class="mainColumn">

                <div class="descrizioneProdotti">
                    
                    <h2>Informaticando - I nostri Prodotti e Servizi</h2>
                    <p>Scegli tra una vasta e convenienete gamma di prodotti
                        e servizi incredibili!
                    </p>
                    
                </div>

                <%-- Prendo i prodotti dal database--%>                
                <c:forEach items="${listaProdotti}" var="prodotto">
                <div class="product">
                           
                        <div class="productFoto">
                            <img title="${prodotto.getNome()}" alt="${prodotto.getNome()}" 
                                src="img/products/${prodotto.getFoto()}" width="150" height="150">
                        </div>
                        
                        <div class="productContent">
                            <p><b>Nome: </b>${prodotto.getNome()}</p>
                            <p><b>Descrizione: </b>${prodotto.getDescrizione()}</p>
                            <p><b>Prezzo di partenza: </b>${prodotto.getPrezzo()} €</p>
                            <p><b>Inserito da: </b>${prodotto.getCreatore()}</p>
                        </div>
                </div>
                </c:forEach>
                
            </main>
            </c:if>

            <jsp:include page="secondary.jsp"/>
            
            <jsp:include page="footer.jsp"/>
        </div>
    </body>
    
   </c:if>
</html>
