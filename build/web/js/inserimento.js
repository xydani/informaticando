$(document).ready(function()
{
    /*L'utente può scrivere nel campo nome fino a 50 caratteri*/
    document.getElementById('nomeProdotto').onkeydown = function(e)
    {
        var key = e.keyCode || e.charCode;
        if(this.value.length >= 50)
            if(!(key === 46 || key === 8))
                e.preventDefault();
    };
    
    /*L'utente può scrivere nel campo descrizione fino a 500 caratteri*/
    document.getElementById('descrizioneProdotto').onkeydown = function(e)
    {
        var key = e.keyCode || e.charCode;
        if(this.value.length >= 325)
            if(!(key === 46 || key === 8))
                e.preventDefault();
    };
    
    /*Contatori caratteri campi nome e descrizione*/
    $('#nomeProdotto').keyup(function()
    {
       $('#nomeProdCh').text("Caratteri: " + $(this).val().length + "/50");
    });

    $('#descrizioneProdotto').keyup(function()
    {
       $('#descrProdCh').text("Caratteri: " + $(this).val().length + "/325");
    });
    
    /*Controllo lunghezza stringhe nei campi di testo e
     *  scrivo messaggio di errore se non rispettano i parametri*/
    
    //campo nome prodotto
    var testoNomeProdotto = '<p id="msgErrNomeProdotto">Devi inserire almeno 5 caratteri!</p>';
    
    function controllaTestoNomeProdotto()
    {
        if( $('#nomeProdotto').val().length < 5)
        {
            if( $('#msgErrNomeProdotto').length === 0)
            {
                $('#nomeProdotto').after(testoNomeProdotto);
                $('#msgErrNomeProdotto').addClass("redText");
            }
        } else
        {
            $('#msgErrNomeProdotto').remove();
            $('#msgErrNomeProdotto').removeClass("redText");
        }
    };
    
    $('#nomeProdotto').on('keyup', controllaTestoNomeProdotto);
    
    //campo descrizione prodotto
    var testoDescrizioneProdotto = '<p id="msgErrDescrizioneProdotto">Devi inserire almeno 5 caratteri!</p>';
    
    function controllaTestoDescrizioneProdotto()
    {
        if( $('#descrizioneProdotto').val().length < 5)
        {
            if( $('#msgErrDescrizioneProdotto').length === 0)
            {
                $('#descrizioneProdotto').after(testoDescrizioneProdotto);
                $('#msgErrDescrizioneProdotto').addClass("redText");
            }
        } else
        {
            $('#msgErrDescrizioneProdotto').remove();
            $('#msgErrDescrizioneProdotto').removeClass("redText");
        }
    };
    
    $('#descrizioneProdotto').on('keyup', controllaTestoDescrizioneProdotto);
    
    
    /*controllo campo prezzo*/
    var testoPrezzoProdotto = '<p id="msgErrPrezzoProdotto">Il prezzo deve essere almeno 100!</p>';
    
    function controllaValorePrezzoProdotto()
    {
        if( $('#prezzoProdotto').val() < 100)
        {
            if( $('#msgErrPrezzoProdotto').length === 0)
            {
                $('#prezzoProdotto').after(testoPrezzoProdotto);
                $('#msgErrPrezzoProdotto').addClass("redText");
            }
        } else
        {
            $('#msgErrPrezzoProdotto').remove();
            $('#msgErrPrezzoProdotto').removeClass("redText");
        }
    };
    
    $('#prezzoProdotto').on('keyup', controllaValorePrezzoProdotto);
    $('#prezzoProdotto').on('change', controllaValorePrezzoProdotto);
    
    /*attivo il pulsante pubblica solo se i dati sono corretti*/
    var button = document.getElementById("insButt");
    var input1 = document.getElementById("nomeProdotto");
    var input2 = document.getElementById("descrizioneProdotto");
    var input3 = document.getElementById("prezzoProdotto");
    
    button.addEventListener('click', () =>{
        if(input1.value.length < 5){
            button.disabled = true;
            if(document.getElementById("msgErrNomeProdotto"))
                return;
            else{
                $('#nomeProdotto').after(testoNomeProdotto);
                $('#msgErrNomeProdotto').addClass("redText");
            }
        }
    });
    
    button.addEventListener('click', () =>{
        if(input2.value.length < 5){
            button.disabled = true;
            if(document.getElementById("msgErrDescrizioneProdotto"))
                return;
            else{
                $('#descrizioneProdotto').after(testoDescrizioneProdotto);
                $('#msgErrDescrizioneProdotto').addClass("redText");
            }
        }
    });
    
    button.addEventListener('click', () =>{
        if(input3.value < 100){
            button.disabled = true;
            if(document.getElementById("msgErrPrezzoProdotto"))
                return;
            else{
                $('#prezzoProdotto').after(testoPrezzoProdotto);
                $('#msgErrPrezzoProdotto').addClass("redText");
            }
        }
    });
    
    input1.addEventListener('keyup', () => {
        if(input1.value.length >= 5){
            button.disabled = false;
            $('#msgErrNomeProdotto').removeClass("redText");
        }
    });
    
    input2.addEventListener('keyup', () => {
        if(input2.value.length >= 5){
            button.disabled = false;
            $('#msgErrDescrizioneProdotto').removeClass("redText");
        }
    });
    
    input3.addEventListener('keyup', () => {
        if(input3.value >= 100){
            button.disabled = false;
            $('#msgErrPrezzoProdotto').removeClass("redText");
        }
    });
});


