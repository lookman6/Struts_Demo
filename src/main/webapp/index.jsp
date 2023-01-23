<%-- 
    Document   : index
    Created on : 8 janv. 2021, 09:19:27
    Author     : elhaddadmohamed
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
     <s:form action="Marhaba">
	<s:textfield name="Name" label="Votre Nom    " />
	<s:submit value="Valider"/>   
      </s:form>
    </body>
</html>
