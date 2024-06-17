<!-- このファイルが通常のHTMLファイルではなく、JSPであることを示している -->
<!-- strutsタグ（下の補足参照）を使用する際に記述します。ここでは”s”としてタグを使用 -->
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>

<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8">
        <title>ログイン画面</title>
    </head>
    <body>
    <!-- ＜form>タグ内の”name”と“password”をLoginActionに”submit”（送信） -->
         <s:form action="LoginAction">
             <s:textfield name="name"/>
            <s:password name="password"/>
            <s:submit value="ログイン"/>
         </s:form>
    </body>
</html>