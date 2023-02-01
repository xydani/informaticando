$(document).ready(function()
{
    /*Cliccando su ogni rispettivo pulsante cambia font size*/
    $("#btnA").click(function() {
        $(".mainColumn").css("fontSize","16px");
        $("#btnA").addClass(".btn active");
        $("#btnAA").removeClass(".btn active");
        $("#btnAAA").removeClass(".btn active");
    });
    
    $("#btnAA").click(function() {
        $(".mainColumn").css("fontSize","20px");
        $("#btnAA").addClass(".btn active");
        $("#btnA").removeClass(".btn active");
        $("#btnAAA").removeClass(".btn active");
    });
    
    $("#btnAAA").click(function() {
        $(".mainColumn").css("fontSize","24px");
        $("#btnAAA").addClass(".btn active");
        $("#btnAA").removeClass(".btn active");
        $("#btnA").removeClass(".btn active");
    });
});
