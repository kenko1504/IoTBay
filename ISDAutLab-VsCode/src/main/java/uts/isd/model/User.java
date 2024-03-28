package uts.isd.model;

import java.io.Serializable;

public class User implements Serializable {
	private String email;
	private String name;
	private String password;


	public User() {
	}

	public User(String _email, String _name, String _password) {
		this.email = _email;
		this.name = _name;

		this.password = _password;

	}

	public void setEmail(String value) {
		this.email = value;
	}

	public void setName(String value) {
		this.name = value;
	}


	public void setPassword(String value) {
		this.password = value;
	}


	public String getEmail() {
		return this.email;
	}

	public String getName() {
		return this.name;
	}


	public String getPassword() {
		return this.password;
	}
}
