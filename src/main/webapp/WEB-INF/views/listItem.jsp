<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
</head>
<body>

		<div>
			<span>상품아이디</span>
			<span>상품이름</span>
			<span>상품가격</span>
		</div>
		
		<c:forEach var="item" items="${listItem}">
			<div>
			<span><a href="detailItem.shop?itemId=${item.itemId}">${item.itemId}</a></span>
			<span>${item.itemName}</span>
			<span>${item.price}</span>
		</div>
		</c:forEach>

</body>
</html>