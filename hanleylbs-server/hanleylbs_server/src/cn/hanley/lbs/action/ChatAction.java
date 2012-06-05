package cn.hanley.lbs.action;


import java.util.HashMap;
import java.util.Locale;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.sf.json.JSONObject;

import org.apache.struts2.interceptor.ServletRequestAware;
import org.apache.struts2.interceptor.ServletResponseAware;
import org.apache.struts2.json.annotations.JSON;

import com.opensymphony.xwork2.ActionSupport;

public class ChatAction extends ActionSupport implements ServletRequestAware, ServletResponseAware {

	private static final long serialVersionUID = -3673239543319779855L;
	
	private String param;
	
	private HttpServletResponse response;
	private HttpServletRequest request;

	@JSON(serialize=false)
	public String getParam() {
		return param;
	}


	public void setParam(String param) {
		this.param = param;
	}

	@Override
	public String execute() throws Exception {
		
		return super.execute();
	}
	

	@SuppressWarnings("unchecked")
	public synchronized String receive() throws Exception{
		
		try {
			JSONObject jsonObj = JSONObject.fromObject(this.getParam());
			String userId = jsonObj.getString("userId");
			ServletContext context = request.getServletContext();
			HashMap<String, String> map = (HashMap<String, String>) context.getAttribute("chatBox");
			String content = map.get(userId);
			response.setCharacterEncoding("UTF-8");
			response.setLocale(Locale.CHINESE);
			response.getWriter().write(content); 
			map.put(userId, "");
		} catch (Exception e) {
			response.getWriter().write("");
		}
		
		return null;
		
	}

	@SuppressWarnings("unchecked")
	public synchronized String send() throws Exception{
		
		
		JSONObject jsonObj = JSONObject.fromObject(this.getParam());
		String userId = jsonObj.getString("userId");
		String content = jsonObj.getString("content");
		
		HashMap<String,String> map = null;
		ServletContext context = request.getServletContext();
		
		if(null != context.getAttribute("chatBox")){
			map = (HashMap<String, String>) context.getAttribute("chatBox");
		}else{
			 map = new HashMap<String,String>();
		}
		
		map.put(userId, content);
		context.setAttribute("chatBox", map);
		return null;
		
	}
	


	@Override
	public void setServletResponse(HttpServletResponse response) {
		this.response = response;
	}


	@Override
	public void setServletRequest(HttpServletRequest request) {
		this.request = request;
	}
	
}
