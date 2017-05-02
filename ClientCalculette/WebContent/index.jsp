<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

<form action="CalculServlet">
x : <input type="text" name="x"/> <br/>
y : <input type="text" name="y"/> <br/> 
<input type="submit" value="valider" />
</form>
<c:if test="${!empty(resultatadd)}"> 
RESULTAT ADDITION : ${resultatadd}
</c:if>
<br/>
<c:if test="${!empty(resultatmult)}"> 
RESULTAT MULTIPLICATION : ${resultatmult}
</c:if>
<br/>
<c:if test="${!empty(resultatdiv)}"> 
RESULTAT DIVISION : ${resultatdiv}
</c:if>
<br/>
<c:if test="${!empty(resultatsous)}"> 
RESULTAT SOUSTRACTION : ${resultatsous}
</c:if>

</body>
</html>