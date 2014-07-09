<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="f" uri="http://java.sun.com/jsf/core" %>
<%@ taglib prefix="h" uri="http://java.sun.com/jsf/html" %>
<!doctype HTML>
<html>
<body>
<h2>Hello World!</h2>
<f:view>
    <h:form>

        <h:inputText value="#{ MessageBean.inputNum }"></h:inputText>
        <h:commandButton value="提交" action="#{MessageBean.check}"/>
    </h:form>


</f:view>
</body>
</html>
