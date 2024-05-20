<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="s" uri="/struts-tags" %>

<!DOCTYPE html>

<!-- 上記JSPファイルを宣言するための記述 -->
<!-- 上記strutsタグ（下の補足参照）を使用する際に記述します。ここでは”s”としてタグを使用 -->

<html>
    <head>
        <meta charset="UTF-8">
        <title>ログイン画面</title>
    </head>
    <body>

        <!-- ”strutsタグ”とはStrutsフレームワークで使える専用のHTMLタグです。（<s: で使うことができます） -->
        <!-- ＜form>タグ内の”name”と“password”をLoginActionに”submit”（送信）します -->
        <!-- ユーザーが入力したユーザーネームとパスワードの値に、それぞれname、passwordという名前をつけて送信 -->

        <!-- 「<s:form>」で囲まれたタグに入力された情報が「action=""」で指定した「Actionクラス」へ渡される -->
        <s:from action="LoginAction">

            <!-- 「name=""」で指定した名前と同名のActionクラスのフィールドに情報を渡します。 -->
            <!-- ※情報が渡される前提として、Actionクラスで該当フィールドのsetterの定義が必要 -->
            <s:textfield name="name"/>

            <!-- <input>タグ「type="text"」「type="password」 「 type="submit"」としてブラウザで認識します。 -->
            <s:password name="password"/>
            <s:submit value="ログイン"/>
        </s:from>

    </body>
</html>