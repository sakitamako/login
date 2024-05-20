package com.diworksdev.login.action;

import java.sql.SQLException;

import com.diworksdev.login.dao.LoginDAO;
import com.diworksdev.login.dto.LoginDTO;
import com.opensymphony.xwork2.ActionSupport;

//struts2が持つActionSupportというクラスを継承します。
//（Actionクラスは基本的にこのクラスを継承します）
//LoginAciton（子クラス） extends（継承） ActionSupport（親クラス）
//すでにあるクラスとにたクラスを作る場合、元のクラスに必要な機能だけを追加する形で、新しいクラスを作ることを継承
public class LoginAciton extends ActionSupport {

	//① setterを定義することで、JSPでユーザーが入力した値がフィールドに格納される
	//フィールド変数
	//JSPから受け取る値、ここではnameとpassword を定義します。
	//※必ずJSPでの定義と同じ名前にします！
	private String name;
	private String password;

	//メソッド名は「execute」
	//②execute()メソッドを定義
	public String execute() throws SQLException {

		//メソッドの戻り値「ret」String ret = ERROR; を定義し、初期値としてERRORを代入します
		String ret = ERROR;

		//②DBConnectorのインスタンス化
		//DBへの接続準備、DBと会話するためのコード、これでログインできる
		//Connectionは特定のデータベースとの接続
		LoginDAO dao = new LoginDAO();
		LoginDTO dto = new LoginDTO();

		//JSPから送られてきたnameとpasswordを引数として、
		//LoginDAOクラスのselectメソッドを呼び出します。
		//その後、DAOで取得した結果をLoginDTOに代入します。
		dto = dao.select(name, password);

		//③条件分岐でSUCCESSかERRORかを決める
		//（ここでは、ユーザーがJSPで入力した値とDTOに格納してある値を比較している）
		//ユーザーが入力した「ログインID」（name）と「パスワード」(password)が、
		//DTOからもってきた値（dto.getName()）と(dto.getPassword())にそれぞれ一致するか確認
		if (name.equals(dto.getName())) {

			//if文の条件を満たした場合、戻り値「ret」の内容をSUCCESSに書き換えます。
			if (password.equals(dto.getPassword())) {
				ret = SUCCESS;
			}

		}

		//④execute()メソッドの結果 SUCCESS、ERRORを返す
		//（それにより、あらかじめstruts.xmlに遷移先として定義したそれぞれのJSPに振り分けられる）
		//if文の条件を満たした場合、戻り値「ret」の内容をSUCCESSに書き換えます。
		return ret;

	}

	//オブジェクト指向カプセル化
	//一部のデータを取り出したり、書き換えたりすることができます。
	public String getName() {
		return name;
	}

	//setName、setPassword(setter）を定義することで、
	//JSPでユーザーが入力したnameとpasswordの値が
	//それぞれのフィールド変数に格納されます
	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}

