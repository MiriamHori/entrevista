<%@taglib uri="http://struts.apache.org/tags-bean" prefix="bean" %>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<form action="calculadora.do" method="get">
		Valor A: <input type="text" size="10" name="valorA" />
		<br/>
		<br/>
		Valor B: <input type="text" size="10" name="valorB"/>
		<br/>
		<br/>
		<input type="submit" value="somar" name="acao"/>&nbsp;&nbsp;&nbsp;
		<input type="submit" value="subtrair" name="acao"/>
		<br/>
		<br/>
		Resultado:  <input type="text" size="15" value="<%=request.getAttribute("resultado") %>"/>
	</form>
	
</body>
</html>