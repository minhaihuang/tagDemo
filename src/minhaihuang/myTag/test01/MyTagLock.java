package minhaihuang.myTag.test01;

import java.io.IOException;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.tagext.TagSupport;

public class MyTagLock extends TagSupport {

	private String pattern = "hh:mm:ss";

	public void setPattern(String pattern) {
		this.pattern = pattern;
	}

	private String getJsCode() {
		String jsCode = "<label id='clockLabel'></label>"
				+ "<script type='text/javascript'>"
				+ "//月(M)、日(d)、小时(h)、分(m)、秒(s) 可以用 1-2 个占位符，\n"
				+ "//年(y)可以用 1-4 个占位符，毫秒(S)只能用 1 个占位符(是 1-3 位的数字)\n"
				+ "Date.prototype.format = function (fmt) {  "
				+ "var o = {"
				+ "'M+': this.getMonth() + 1, //月份\n"
				+ "'d+': this.getDate(), //日 \n"
				+ "'h+': this.getHours(), //小时\n"
				+ "'m+': this.getMinutes(), //分 \n"
				+ "'s+': this.getSeconds(), //秒 \n"
				+ "'S': this.getMilliseconds() //毫秒\n"
				+ "};"
				+ "if (/(y+)/.test(fmt)) fmt = fmt.replace(RegExp.$1, (this.getFullYear() + '').substr(4 - RegExp.$1.length));"
				+ "for (var k in o)"
				+ "if (new RegExp('(' + k + ')').test(fmt)) fmt = fmt.replace(RegExp.$1, (RegExp.$1.length == 1) ? (o[k]) : (('00' + o[k]).substr(('' + o[k]).length)));"
				+ "return fmt;" + "};" + "function flash(){"
				+ "	var clock_label = document.getElementById('clockLabel');"
				+ "	clock_label.innerText=new Date().format('" + pattern
				+ "');" + "}" + "	setInterval('flash()', 1000);" + "</script>";
		return jsCode;
	}

	@Override
	public int doStartTag() throws JspException {

		try {
			pageContext.getOut().print(getJsCode());
		} catch (IOException e) {
			e.printStackTrace();
		}
		return super.doStartTag();
	}
}
