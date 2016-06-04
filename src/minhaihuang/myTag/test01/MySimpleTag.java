package minhaihuang.myTag.test01;

import java.io.IOException;

import javax.servlet.jsp.JspContext;
import javax.servlet.jsp.JspException;
import javax.servlet.jsp.tagext.JspFragment;
import javax.servlet.jsp.tagext.SimpleTagSupport;

/**
 * 测试简单自定义标签
 * @author 黄帅哥
 *
 */
public class MySimpleTag extends SimpleTagSupport{

	@Override
	public void doTag() throws JspException, IOException {
		//获取上下文对象
		JspContext pageContext=getJspContext();
		pageContext.getOut().print("哈哈哈");
		
		JspFragment fragment=getJspBody();//获取jspbody对象
		for(int i=0;i<10;i++){
			fragment.invoke(pageContext.getOut());
		}
		
		super.doTag();
	}
}
