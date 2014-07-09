<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="f" uri="http://java.sun.com/jsf/core" %>
<%@ taglib prefix="h" uri="http://java.sun.com/jsf/html" %>
<!doctype HTML>
<html>
<head>
    <title></title>
</head>
<body>
<f:view>
    <h:form>
        <h:commandButton action="back" value="back"></h:commandButton>
    </h:form>
   <h:outputLabel value="#{MessageBean.response}"></h:outputLabel>
</f:view>
</body>
</html>
