<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://www.hhm.com/myTag" prefix="myTag" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
普通资源，对用户角色没有限制<br/>
<img  src="/tagDemo/sn1.jpg"  height="300"/>
<a href="">普通资源下载地址</a>

<hr/>
精品资源，需要vip用户才可访问<br/>
<myTag:myView>
	<img  src="/tagDemo/bg1.jpg"  height="300"/>
	<a href="">精品资源下载地址</a>
</myTag:myView>
</body>
</html>