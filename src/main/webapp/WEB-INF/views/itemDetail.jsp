<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
</head>
<body>
<form action="orderItem.shop" method="get">
<input type="hidden" name="itemId" value="${itemDetail.itemId}">
<input type="hidden" name="itemName" value="${itemDetail.itemName}">
<input type="hidden" name="price" value="${itemDetail.price}">
	<div>
		<div>
			<span>�����۾��̵�:</span>
			<span>${itemDetail.itemId}</span>
		</div>
		<div>
			<span>�������̸�:</span>
			<span>${itemDetail.itemName}</span>
		</div>
		<div>
			<span>�����۰���:</span>
			<span>${itemDetail.price}</span>
		</div>
		<div>
			<span>�����ۻ���:</span>
			<span>${itemDetail.description}</span>
		</div>
		<div>
			<span>�����ۻ���:</span>
			<span>${itemDetail.pictureUrl}</span>
		</div>
	</div>
	<div>
		<input type="submit" value="�ֹ�">
	</div>
</form>

</body>
</html>