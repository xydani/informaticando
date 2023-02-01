$(document).ready(function()
{

    /*Array di ids di login e registrazione di elementi da modificare*/
    var idsLogReg = ['userLogin', 'passLogin', 'userReg', 'nomeReg', 'cognomeReg',
        'cittaReg', 'emailReg', 'passReg'];

    /*L'utente può scrivere nei campi di login e registrazione solo fino a 50 caratteri*/
    idsLogReg.forEach(elemento => document.getElementById(elemento).onkeydown = function(e)
    {
        var key = e.keyCode || e.charCode;
        if(this.value.length >= 50)
            if(!(key === 46 || key === 8))
                e.preventDefault();
    });

    /*Contatori caratteri rimanenti nei campi di testo login e registrazione*/
    $('#userLogin').keyup(function()
    {
       $('#userCh').text("Caratteri: " + $(this).val().length + "/50");
    });

    $('#passLogin').keyup(function()
    {
       $('#passCh').text("Caratteri: " + $(this).val().length + "/50");
    });

    $('#nomeReg').keyup(function()
    {
        $('#nomeCh').text("Caratteri: " + $(this).val().length + "/50");
    });

    $('#cognomeReg').keyup(function()
    {
        $('#cognomeCh').text("Caratteri: " + $(this).val().length + "/50");
    });

    $('#userReg').keyup(function()
    {
        $('#userRegCh').text("Caratteri: " + $(this).val().length + "/50");
    });

    $('#passReg').keyup(function()
    {
        $('#passRegCh').text("Caratteri: " + $(this).val().length + "/50");
    });

    $('#emailReg').keyup(function()
    {
        $('#emailCh').text("Caratteri: " + $(this).val().length + "/50");
    });

    $('#cittaReg').keyup(function()
    {
        $('#cittaCh').text("Caratteri: " + $(this).val().length + "/50");
    });
    
    /*Controllo lunghezza stringhe nei campi di testo e
     *  scrivo messaggio di errore se non rispettano i parametri*/
    
    //campo username login
    var testoUserLogin = '<p id="msgErrUserLogin">Devi inserire almeno 4 caratteri!</p>';
    
    function controllaTestoUserLogin()
    {
        if( $('#userLogin').val().length < 4)
        {
            if( $('#msgErrUserLogin').length === 0)
            {
                $('#userLogin').after(testoUserLogin);
                $('#msgErrUserLogin').addClass("redText");
            }
        } else
        {
            $('#msgErrUserLogin').remove();
            $('#msgErrUserLogin').removeClass("redText");
        }
    };
    
    $('#userLogin').on('keyup', controllaTestoUserLogin);
    
    //campo password login
    var testoPassLogin = '<p id="msgErrPassLogin">Devi inserire almeno 4 caratteri!</p>';
    
    function controllaTestoPassLogin()
    {
        if( $('#passLogin').val().length < 4)
        {
            if( $('#msgErrPassLogin').length === 0)
            {
                $('#passLogin').after(testoPassLogin);
                $('#msgErrPassLogin').addClass("redText");
            }
        } else
        {
            $('#msgErrPassLogin').remove();
            $('#msgErrPassLogin').removeClass("redText");
        }
    };
    
    $('#passLogin').on('keyup', controllaTestoPassLogin);
    
    /*Campo nome registrazione*/
    var testoNomeReg = '<p id="msgErrNomeReg">Devi inserire almeno 4 caratteri!</p>';
    
    function controllaTestoNomeReg()
    {
        if( $('#nomeReg').val().length < 4)
        {
            if( $('#msgErrNomeReg').length === 0)
            {
                $('#nomeReg').after(testoNomeReg);
                $('#msgErrNomeReg').addClass("redText");
            }
        } else
        {
            $('#msgErrNomeReg').remove();
            $('#msgErrNomeReg').removeClass("redText");
        }
    };
    
    $('#nomeReg').on('keyup', controllaTestoNomeReg);
    
    /*Campo cognome registrazione*/
    var testoCognomeReg = '<p id="msgErrCognomeReg">Devi inserire almeno 4 caratteri!</p>';
    
    function controllaTestoCognomeReg()
    {
        if( $('#cognomeReg').val().length < 4)
        {
            if( $('#msgErrCognomeReg').length === 0)
            {
                $('#cognomeReg').after(testoCognomeReg);
                $('#msgErrCognomeReg').addClass("redText");
            }
        } else
        {
            $('#msgErrCognomeReg').remove();
            $('#msgErrCognomeReg').removeClass("redText");
        }
    };
    
    $('#cognomeReg').on('keyup', controllaTestoCognomeReg);
    
    /*Campo username registrazione*/
    var testoUserReg = '<p id="msgErrUserReg">Devi inserire almeno 4 caratteri!</p>';
    
    function controllaTestoUserReg()
    {
        if( $('#userReg').val().length < 4)
        {
            if( $('#msgErrUserReg').length === 0)
            {
                $('#userReg').after(testoUserReg);
                $('#msgErrUserReg').addClass("redText");
            }
        } else
        {
            $('#msgErrUserReg').removeClass("redText");
            $('#msgErrUserReg').remove();
            
        }
    };
    
    $('#userReg').on('keyup', controllaTestoUserReg);
    
    /*Campo password registrazione*/
    var testoPassReg = '<p id="msgErrPassReg">Devi inserire almeno 4 caratteri!</p>';
    
    function controllaTestoPassReg()
    {
        if( $('#passReg').val().length < 4)
        {
            if( $('#msgErrPassReg').length === 0)
            {
                $('#passReg').after(testoPassReg);
                $('#msgErrPassReg').addClass("redText");
            }
        } else
        {
            $('#msgErrPassReg').removeClass("redText");
            $('#msgErrPassReg').remove();
        }
    };
    
    $('#passReg').on('keyup', controllaTestoPassReg);
    
    /*Campo email registrazione*/
    var testoEmailReg = '<p id="msgErrEmailReg">Devi inserire almeno 4 caratteri!</p>';
    
    function controllaTestoEmailReg()
    {
        if( $('#emailReg').val().length < 4)
        {
            if( $('#msgErrEmailReg').length === 0)
            {
                $('#emailReg').after(testoEmailReg);
                $('#msgErrEmailReg').addClass("redText");
            }
        } else
        {
            $('#msgErrEmailReg').removeClass("redText");
            $('#msgErrEmailReg').remove();
        }
    };
    
    $('#emailReg').on('keyup', controllaTestoEmailReg);
    
    /*Campo citta registrazione*/
    var testoCittaReg = '<p id="msgErrCittaReg">Devi inserire almeno 4 caratteri!</p>';
    
    function controllaTestoCittaReg()
    {
        if( $('#cittaReg').val().length < 4)
        {
            if( $('#msgErrCittaReg').length === 0)
            {
                $('#cittaReg').after(testoCittaReg);
                $('#msgErrCittaReg').addClass("redText");
            }
        } else
        {
            $('#msgErrCittaReg').removeClass("redText");
            $('#msgErrCittaReg').remove();
        }
    };
    
    $('#cittaReg').on('keyup', controllaTestoCittaReg);
    
    /*attivo il pulsante login solo se i dati sono corretti*/
    var button = document.getElementById("logButt");
    var input1 = document.getElementById("userLogin");
    var input2 = document.getElementById("passLogin");
    
    button.addEventListener('click', () =>{
        if(input1.value.length < 4){
            button.disabled = true;
            if(document.getElementById("msgErrUserLogin"))
                return;
            else{
                $('#userLogin').after(testoUserLogin);
                $('#msgErrUserLogin').addClass("redText");
            }
        }
    });
    
    button.addEventListener('click', () =>{
        if(input2.value.length < 4){
            button.disabled = true;
            if(document.getElementById("msgErrPassLogin"))
                return;
            else{
                $('#passLogin').after(testoPassLogin);
                $('#msgErrPassLogin').addClass("redText");
            }
        }
    });
    
    input1.addEventListener('keyup', () => {
        if(input1.value.length >= 4){
            button.disabled = false;
            $('#msgErrUserLogin').removeClass("redText");
        }
    });
    
    input2.addEventListener('keyup', () => {
        if(input2.value.length >= 4){
            button.disabled = false;
            $('#msgErrPassLogin').removeClass("redText");
        }
    });
    
    /*attivo il pulsante registrati solo se i dati sono corretti*/
    var button2 = document.getElementById("regButt");
    var input3 = document.getElementById("nomeReg");
    var input4 = document.getElementById("cognomeReg");
    var input5 = document.getElementById("userReg");
    var input6 = document.getElementById("passReg");
    var input7 = document.getElementById("emailReg");
    var input8 = document.getElementById("cittaReg");
    
    
    button2.addEventListener('click', () =>{
        if(input3.value.length < 4){
            button2.disabled = true;
            if(document.getElementById("msgErrNomeReg"))
                return;
            else{
                $('#nomeReg').after(testoNomeReg);
                $('#msgErrNomeReg').addClass("redText");
            }
        }
    });
    
    button2.addEventListener('click', () =>{
        if(input4.value.length < 4){
            button2.disabled = true;
            if(document.getElementById("msgErrCognomeReg"))
                return;
            else{
                $('#cognomeReg').after(testoCognomeReg);
                $('#msgErrCognomeReg').addClass("redText");
            }
        }
    });
    
    button2.addEventListener('click', () =>{
        if(input5.value.length < 4){
            button2.disabled = true;
            if(document.getElementById("msgErrUserReg"))
                return;
            else{
                $('#userReg').after(testoUserReg);
                $('#msgErrUserReg').addClass("redText");
            }
        }
    });
    
    button2.addEventListener('click', () =>{
        if(input6.value.length < 4){
            button2.disabled = true;
            if(document.getElementById("msgErrPassReg"))
                return;
            else{
                $('#passReg').after(testoPassReg);
                $('#msgErrPassReg').addClass("redText");
            }
        }
    });
    
    button2.addEventListener('click', () =>{
        if(input7.value.length < 4){
            button2.disabled = true;
            if(document.getElementById("msgErrEmailReg"))
                return;
            else{
                $('#emailReg').after(testoEmailReg);
                $('#msgErrEmailReg').addClass("redText");
            }
        }
    });
    
    button2.addEventListener('click', () =>{
        if(input8.value.length < 4){
            button2.disabled = true;
            if(document.getElementById("msgErrCittaReg"))
                return;
            else{
                $('#cittaReg').after(testoCittaReg);
                $('#msgErrCittaReg').addClass("redText");
            }
        }
    });
    
    input3.addEventListener('keyup', () => {
        if(input3.value.length >= 4){
            button2.disabled = false;
            $('#msgErrNomeReg').removeClass("redText");
        }
    });
    
    input4.addEventListener('keyup', () => {
        if(input4.value.length >= 4){
            button2.disabled = false;
            $('#msgErrCognomeReg').removeClass("redText");
        }
    });
    
    input5.addEventListener('keyup', () => {
        if(input5.value.length >= 4){
            button2.disabled = false;
            $('#msgErrUserReg').removeClass("redText");
        }
    });
    
    input6.addEventListener('keyup', () => {
        if(input6.value.length >= 4){
            button2.disabled = false;
            $('#msgErrPassReg').removeClass("redText");
        }
    });
    
    input7.addEventListener('keyup', () => {
        if(input7.value.length >= 4){
            button2.disabled = false;
            $('#msgErrEmailReg').removeClass("redText");
        }
    });
    
    input8.addEventListener('keyup', () => {
        if(input8.value.length >= 4){
            button2.disabled = false;
            $('#msgErrCittaReg').removeClass("redText");
        }
    });
});
