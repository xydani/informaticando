<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Informaticando</title>
        <meta charset="UTF-8">
        <meta 
            name = "viewport"
            content="width=device-width, initial-scale=1.0"
            >
        <meta name = "author"
              content ="Daniele Lurani, Fabio Sanna, Emanuele Frau"
              >
        <meta name ="description" content ="Il miglior sito di vendita di cappelli al mondo">
        <meta name ="keywords" content ="informatica, consulenza, it, pc, computer">
        
        <link rel ="stylesheet"
              type="text/css"
              href="style.css"
              media="screen"
              >
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
                <div class="welcome">
                    <div class="presentazione">
                        <h2>Benvenuti su Informaticando!</h2>
                        <p>
                            Migliaia di clienti stanno già migliorando le loro
                            attività costruendo un futuro radioso insieme a
                            <b>Informaticando</b>. Scopri i nostri prodotti, ti
                            pentirai solo di non averci scoperto <b>prima</b>.
                        </p>
                    </div>
                    
                    <div id="lettera">
                        <h3>Perchè scegliere noi?</h3>
                        <hr/>
                        <p>
                            Informaticando è un progetto nato da 2 ragazzi
                            appassionati di informatica. Abbiamo sempre visto
                            le persone intorno a noi avere problemi con la tecnologia,
                            e ci siamo promessi di rendere questo meraviglioso mondo
                            più semplice e accessibile per tutti. Abbiamo per questo
                            creato Informaticando, una azienda dove qualsiasi problema 
                            informatico possa essere discusso e risolto. Serietà, competenza e
                            passione sono i valori che ci accompagnano in questa avventura.
                            Scegli noi perchè ti tratteremo come fossi un nostro caro.
                        </p>
                    </div>
                </div>
            </main>

            <jsp:include page="secondary.jsp"/>
            
            <jsp:include page="footer.jsp"/>
            
        </div>
        
    </body>
</html>
