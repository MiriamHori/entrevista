<%@taglib uri="http://struts.apache.org/tags-bean" prefix="bean" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
	<script language="JavaScript" src="../site/scripts.js"></script>
	<script language="JavaScript" src="../site/masks.js"></script>

<title>Insert title here</title>
</head>
<body>

    	   <%=request.getAttribute("nomeDaPessoa") %>

   <form action="teste.do" method="get">
		Nome: <input type="text" size="25" name="nome" />
		<input type="submit" value="OK" />
	</form>
	
</body>


</html>