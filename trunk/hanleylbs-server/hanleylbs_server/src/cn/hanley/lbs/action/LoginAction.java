package cn.hanley.lbs.action;

import java.io.Serializable;

import javax.annotation.Resource;

import net.sf.json.JSONObject;

import org.apache.struts2.json.annotations.JSON;
import org.springframework.stereotype.Controller;

import cn.hanley.lbs.model.User;
import cn.hanley.lbs.service.LoginService;

import com.opensymphony.xwork2.ActionSupport;
 
@Controller
public class LoginAction extends ActionSupport implements Serializable {
	
	private static final long serialVersionUID = 4441204262186396336L;
	private String username;
	private String password;
	private User user;

	private String param;

	@JSON(serialize=false)
	public String getParam() {
		return param;
	}


	public void setParam(String param) {
		this.param = param;
	}


	public User getUser() {
		return user;
	}


	public void setUser(User user) {
		this.user = user;
	}



	@Resource
	private LoginService loginService;
	
	@JSON(serialize=false)
	public LoginService getLoginService() {
		return loginService;
	}


	public void setLoginService(LoginService loginService) {
		this.loginService = loginService;
	}


	@JSON(serialize=false)
	public String getUsername() {
		return username;
	}


	public void setUsername(String username) {
		this.username = username;
	}


	@JSON(serialize=false)
	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}
 

	@Override
	public String execute() throws Exception {
		jsonBuilder();
		int userId = loginService.getAccount(username, password);
		user = loginService.getUser(userId);
		return "user";
	}
	
	
	public void jsonBuilder(){
		
		JSONObject jsonObj = JSONObject.fromObject(this.getParam());
		username = jsonObj.getString("username");
		password = jsonObj.getString("password");
	}
	
	
}
