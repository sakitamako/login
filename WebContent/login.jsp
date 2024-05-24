<%@ page language="java" contentType="texr/html; charset=UTF-8" pageEncoding="utf-8" %>
<%@ taglib prefix="s" uri="/struts-tags" %>

<!DOCTYPE html>
<html>
    <head>
        <meta charset="utf-8">
        <title>ログイン画面</title>
    </head>
    <body>
        <s:form action="LoginAction">
            <s:textfield name="name"/>
            <s:password name="password"/>
            <s:submit value="ログイン"/>
        </s:form>
    </body>
</html>