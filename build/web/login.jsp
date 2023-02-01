<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Informaticando - Login</title>
        <meta charset="UTF-8">
        <meta name = "viewport" content="width=device-width, initial-scale=1.0">
        <meta name = "author" content ="Daniele Lurani, Fabio Sanna, Emanuele Frau">
        <meta name ="description" content ="Registrati o accedi al sito!">
        <meta name ="keywords" content ="it, informatica, pc, computer,
              login, registrati, accedi ">
        <link rel ="stylesheet" type="text/css" href="style.css" media="screen">
        <link rel="preconnect" href="https://fonts.googleapis.com">
        <link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
        <link href="https://fonts.googleapis.com/css2?family=Poppins:wght@100&family=Roboto+Slab&display=swap" rel="stylesheet">
        <script type="text/javascript" src="js/jquery.js"></script> 
        <script type="text/javascript" src="js/login.js"></script>
        <script type="text/javascript" src="js/fontChanger.js"></script>
        
    </head>
    <body>
        
        <div class="container">
            <jsp:include page="header.jsp"/>

            <jsp:include page="navbar.jsp"/>

            <main class="mainColumn">
                <div id="loginBox">
                    
                    <h2>Login</h2>
                    <form action="LoginServlet" method="post">
                        
                        <p id="userCh">Caratteri: 0/50</p>
                        <input type="text" placeholder="Username" id="userLogin" name="userLog">
                        <p id="passCh">Caratteri: 0/50</p>
                        <input type="password" placeholder="Password" id="passLogin" name="passLog">
                        <button type="submit" value="Accedi" id="logButt">Accedi</button>

                    </form>
                </div>
                <div id="regBox">
                    <h2>Registrati</h2>
                    <form action="RegistrazioneServlet" method="post">
                        
                        <p id="nomeCh">Caratteri: 0/50</p>
                        <input type="text" id="nomeReg" placeholder="Nome" name="nomeReg">
                        <p id="cognomeCh">Caratteri: 0/50</p>
                        <input type="text" id="cognomeReg" placeholder="Cognome" name="cognomeReg">
                        <p id="userRegCh">Caratteri: 0/50</p>
                        <input type="text" id="userReg" placeholder="Username" name="userReg">
                        <p id="passRegCh">Caratteri: 0/50</p>
                        <input type="password" id="passReg" placeholder="Password" name="passReg">
                        <p id="emailCh">Caratteri: 0/50</p>
                        <input type="text" id="emailReg" placeholder="email" name="emailReg">
                        <p id="cittaCh">Caratteri: 0/50</p>
                        <input type="text" id="cittaReg" placeholder="Città" name="cittaReg">
                        
                        <button type="submit" value="Registrati" id="regButt">Registrati</button>

                    </form>
                 </div>
            </main>

            <jsp:include page="secondary.jsp"/>
            
            <jsp:include page="footer.jsp"/>
            
        </div>
 
    </body>
</html>
