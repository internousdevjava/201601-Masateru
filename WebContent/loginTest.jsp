
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" %>
<%@ taglib prefix="s" uri="/struts-tags" %>

<!DOCTYPE html>
<html lang="ja">
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title>Login</title>
</head>
<body>
	
<!-- ユーザー名とパスワードのログイン==================================== -->		
	<s:form action="LoginTestAction">
		<h2>ログイン</h2>
		<p>ユーザーID<br>
			<s:textfield label="ID1" name="id"/>
		</p>
		<p>パスワード(数字を入力してください。)<br>
			<s:password label="パスワード" name="password"/>
		</p>
		<s:submit value="ログイン" />
	</s:form>
	
	<s:iterator value = "myId">
		<p><s:property value = "myId"/>さん、こんにちは。</p>
	</s:iterator>
	

	<s:iterator value = "loginError">
		<s:property value = "loginError"/>
	</s:iterator>
	<s:iterator value = "numberError">
		<s:property value = "numberError"/>
	</s:iterator>
	

	
</body>
</html>