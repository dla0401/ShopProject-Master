<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html>
<head>
	<title>Shopping List!</title>
</head>
<body>

	<c:forEach var="item" items="${listItem}">
		${item.itemId}
	
	</c:forEach>
</body>
</html>
