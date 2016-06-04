package minhaihuang.myTag.test01.viewDemo;

import java.util.List;

//代表一个角色，一个角色有角色等级level，有一组权限
public class Role {

	// 角色等级，整数类型，值越大等级越高
	private int level;

	private String rolename;

	private List<Permission> permissions;

	public Role() {
	}

	public Role(int level, String rolename) {
		this.level = level;
		this.rolename = rolename;
	}

	public String getRolename() {
		return rolename;
	}

	public void setRolename(String rolename) {
		this.rolename = rolename;
	}

	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		this.level = level;
	}

	public List<Permission> getPermissions() {
		return permissions;
	}

	public void setPermissions(List<Permission> permissions) {
		this.permissions = permissions;
	}

}
