package com.diworksdev.login.action;
import java.sql.SQLException;

import com.diworksdev.login.dao.LoginDAO;
import com.diworksdev.login.dto.LoginDTO;
import com.opensymphony.xwork2.ActionSupport;

public class LoginAciton extends ActionSupport {
	private String name;
	private String password;

	public String execute() throws SQLException {
		String ret = ERROR;

		LoginDAO dao = new LoginDAO();
		LoginDTO dto = new LoginDTO();

		dto = dao.select(name, password);

		if (name.equals(dto.getName())) {

			if (password.equals(dto.getPassword())) {
				ret = SUCCESS;
			}

		}

		return ret;

	}

	public String getName() {
		return name;
	}

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

