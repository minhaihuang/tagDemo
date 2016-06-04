package minhaihuang.myTag.test01.viewDemo;

import java.util.List;

//用户，一个用户可以有多个角色，用户并不和权限直接相关
public class User {

	private String username;
	private List<Role> roles;

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public List<Role> getRoles() {
		return roles;
	}

	public void setRoles(List<Role> roles) {
		this.roles = roles;
	}

}
