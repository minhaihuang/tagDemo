package minhaihuang.myTag.test01;

import java.io.IOException;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.PageContext;
import javax.servlet.jsp.tagext.TagSupport;

/**
 * 模拟自定义标签库中的out标签
 * @author 黄帅哥
 *
 */
public class MyTagOut extends TagSupport{

	//设置两个字段
	private Object value;
	private Object default2;
	
	@Override
	public int doStartTag() throws JspException {
		
			try {
				if(value==null){
				pageContext.getOut().print(default2);
				}else{
				pageContext.getOut().print(value);	
				}
			} catch (IOException e) {
				
				e.printStackTrace();
			}
		return super.doStartTag();
	}

	
	//生成两个字段的set和get方法
	
	public Object getValue() {
		return value;
	}

	public void setValue(Object value) {
		this.value = value;
	}

	public Object getDefault() {
		return default2;
	}

	public void setDefault(Object default2) {
		this.default2 = default2;
	}
	
	
}
