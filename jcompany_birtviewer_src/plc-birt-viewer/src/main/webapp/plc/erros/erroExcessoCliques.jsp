<%@ taglib uri="/WEB-INF/fmt.tld" prefix="fmt" %>

<!DOCTYPE html
PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN"
"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<fmt:setBundle basename="jCompanyResources"/>
<%--
																
	    			       Jaguar-jCompany Developer Suite.																		
			    		        Powerlogic 2010-2014.
			    		    
		Please read licensing information in your installation directory.Contact Powerlogic for more 
		information or contribute with this project: suporte@powerlogic.com.br - www.powerlogic.com.br																								

--%>
<html>
	<head>
		<title><fmt:message key="jcompany.error.excesso.cliques.titulo"/></title>
		<meta http-equiv="Content-Type" content="text/html;" />
		<link href="<%=request.getContextPath()%>/plc/erros/erros.css" rel="stylesheet" type="text/css" />
	</head>
<body class="erros" marginheight="0" marginwidth="0" style="background-image: url(<%=request.getContextPath()%>/plc/erros/error_500.jpg)">
	<h1><fmt:message key="jcompany.error.503.titulo"/></h1>
	<h2><fmt:message key="jcompany.error.503.subtitulo"/></h2>
	<p><fmt:message key="jcompany.error.saudacao"/></p>
	<p><fmt:message key="jcompany.error.503.explicacao"/></p>
	<p><fmt:message key="jcompany.error.503.solucao1"/><fmt:message key="jcompany.error.503.solucao2"/></p>
	<hr color="#B70C0C" size="1" noshade width="100%" />
</body>
</html>