package com.diworksdev.login.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

// データベースを使う必要がある場合、DB接続 (コネクション)の設定をするファイル

public class DBConnector {

	//MySQL接続に必要な情報を設定
	private static String driverName = "com.mysql.jdbc.Driver";

	//接続先のデータベース名を指定
	private static String url = "jdbc:mysql://localhost/logindb_suzuki";

	//接続時に使用するユーザー名の定義
	private static String user = "root";

	//接続時に使用するパスワードの定義
	private static String password = "root";

	public Connection getConnection() {

		//接続オブジェクトの定義
		Connection con = null;

		//try.catchはjavaの例外処理のための構文
		try {

			//tryの中にはエラーが発生しそうな処理を書く
			Class.forName(driverName);

			//ドライバーがロードされ使えるような状態にしている、覚える。
			//設定した情報を使って自分のパソコンにインストールされているMySQLサーバへ接続するための記述
			con = (Connection) DriverManager.getConnection(url, user, password);

		//tryの中でエラーが発生した場合、catchが受け取り
		//例外がスローされる原因となったエラーまたは動作の説明を返します
		} catch (ClassNotFoundException e) {
			e.printStackTrace();

		//tryの中でエラーが発生した場合、catchが受け取り
		//例外がスローされる原因となったエラーまたは動作の説明を返しま
		} catch (SQLException e) {
			e.printStackTrace();
		}

		//MySQLサーバに接続した結果をメソッドの呼び出し元に渡します
		return con;

	}

}
