<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Informaticando - Chi siamo</title>
        <meta charset="UTF-8">
        <meta name = "viewport" content="width=device-width, initial-scale=1.0">
        <meta name = "author" content ="Daniele Lurani, Fabio Sanna, Emanuele Frau">
        <meta name ="description" content ="Chi siamo">
        <meta name ="keywords" content ="it, informatica, pc, computer, chi siamo, consulenza">
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
                
                <div class="descrizioneChiSiamo">
                    
                    <h2>Informaticando - Chi siamo</h2>
                    <p>Informaticando nasce dalla passione di due ragazzi amanti
                        dell'informatica, che sono:
                    </p>.
                    
                </div>

                    <div class="chiSiamo">
                           
                        <div class="chiSiamoFoto">
                            <img title="Daniele Lurani" alt="Daniele Lurani" 
                                src="img/daniele.png" width="150" height="150">
                        </div>
                        
                        <div class="chiSiamoContent">
                            <h3>Daniele Lurani</h3>
                            <p>Appassionato di informatica e computer sin da 
                                quando era piccolissimo, Daniele ha sempre voluto
                                lavorare in questo mondo. Sempre alla ricerca
                                di una nuova tecnologia da provare, le sue
                                esperte mani sono una garanzia per chiunque abbia
                                bisogno d'aiuto.
                            </p>
                        </div>
                        
                    </div>
                                
                    <div class="chiSiamo">
                           
                        <div class="chiSiamoFoto">
                            <img title="Fabio Sanna" alt="Fabio Sanna" 
                                src="img/fabio.png" width="150" height="150">
                        </div>
                        
                        <div class="chiSiamoContent">
                            <h3>Fabio Sanna</h3>
                            <p>Laureato in Ingegneria Informatica a Sassari, Fabio
                                è uno dei più grandi esperti di Cybersecurity in 
                                Sardegna. Appassionato di videogiochi, nel suo tempo
                                libero lo si può trovare programmando il suo gioco personale.
                                
                            </p>
                        </div>
                        
                    </div>
            </main>

            <jsp:include page="secondary.jsp"/>
            
            <jsp:include page="footer.jsp"/>
        </div>
    </body>
</html>
