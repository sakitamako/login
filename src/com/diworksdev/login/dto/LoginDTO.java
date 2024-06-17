package com.diworksdev.login.dto;

//DTOクラスは、DAOがDBから取得した値をActionへ戻す時、値を格納するのに利用されるファイル
public class LoginDTO {

	//テーブルから取得するデータに対応したフィールド変数を宣言
	private int id;
	private String name;
	private String password;

	//フィールド変数に対応したgetterとsetterを定義
	//Actionクラスから呼び出され、IDフィールドの値をActionに渡す
	public int getId() {
		return id;

	}

	//フィールド変数に対応したgetterとsetterを定義
	//DAOクラスから呼び出され、引数として受け取ったテーブルの値を自身のDTO IDフィールドに格納
	public void setId(int id) {
		this.id = id;

	}

	//Actionクラスから呼び出され、nameフィールドの値をActionに渡す
	public String getName() {
		return name;

	}

	//DAOクラスから呼び出され、引数として受け取ったテーブルの値を自身のDTO nameフィールドに格納
	public void setName(String name) {
		this.name = name;

	}

	//Actionクラスから呼び出され、passwordフィールドの値をActionに渡す
	public String getPassword() {
		return password;

	}

	//DAOクラスから呼び出され、引数として受け取ったテーブルの値を自身のDTO passwordフィールドに格納
	public void setPassword(String password) {
		this.password = password;

	}

}
