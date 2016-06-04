package minhaihuang.myTag.test01;

import java.io.IOException;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.tagext.TagSupport;

/**
 * 测试如何自定义标签，掌握原理以及内容
 * @author 黄帅哥
 *
 */
public class MyTag01 extends TagSupport{

	@Override
	public int doStartTag() throws JspException {
		System.out.println("我的自定义标签开始执行啦");
		try {
			pageContext.getOut().print("hahahaha");
		} catch (IOException e) {
			System.out.println("有异常");
			e.printStackTrace();
		}
		return SKIP_BODY;
	}
}
