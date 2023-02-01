<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<nav>
    <ul>
        <li><a href="index.jsp">Home</a></li>
        <li><a href="inserisciProdotto.jsp">Inserisci Prodotto</a></li>
        <li><a href="chi-siamo.jsp">Chi siamo</a></li>
        <li><a href="product">Prodotti</a></li>
        
        <!– Se la sessione è attiva compare la pagina Area personale altrimenti compare la pagina Login->
        <c:if test="${empty user}">
            <li><a href="login.jsp">Login</a></li>
        </c:if>
            
        <c:if test="${not empty user}">
            <li><a href="areaPersonale.jsp">Area Personale</a></li>
        </c:if>
        
        <c:set var="page" value="navbar" scope="request"/>
    </ul>
</nav>
