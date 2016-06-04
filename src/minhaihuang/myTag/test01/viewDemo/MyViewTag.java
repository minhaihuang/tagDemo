package minhaihuang.myTag.test01.viewDemo;

import java.util.List;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.tagext.TagSupport;

public class MyViewTag extends TagSupport {

	@Override
	public int doStartTag() throws JspException {

		// 1 先取出当前登录的User对象 ,判断是否为null
		// 2 如果不为空,取出此用户的角色列表
		// 3 遍历此角色列表,只要有一个角色的角色等级大于等于100 return EVAL_BODY_INCLUDE
		// 否则 返回SKIP_BODY

		User user = (User) pageContext.getSession().getAttribute("user");
		if (user != null) {

			List<Role> roles = user.getRoles();
			if (roles != null) {
				for (Role role : roles) {
					if (role.getLevel() >= 100) {
						return EVAL_BODY_INCLUDE;
					}
				}
			}
		}
		return SKIP_BODY;
	}
}
