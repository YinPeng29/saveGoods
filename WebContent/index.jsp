<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="GoodsServlet" method="post" onsubmit="return save(this);">
		<table>
			<tr>
				<td>录入商品信息</td>
			</tr>
			<tr>
				<td>商品名称</td>
				<td><input name="name" type="text"></td>
			</tr>
			<tr>
				<td>商品价格</td>
				<td><input name="price" type="text"></td>
			</tr>
			<tr>
				<td>商品描述</td>
				<td><textarea name="description" type="text" cols="30" rows="3"></textarea></td>
			</tr>
			<tr>
				<td><input type="submit" value="提交" /> <input type="reset"
					value="重置" /></td>
			</tr>
		</table>
	</form>
</body>
</html>