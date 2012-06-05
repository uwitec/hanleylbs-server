package cn.hanley.lbs.action;

import java.util.List;

import javax.annotation.Resource;

import org.apache.struts2.json.annotations.JSON;
import org.springframework.stereotype.Controller;

import cn.hanley.lbs.model.User;
import cn.hanley.lbs.service.LoginService;

import com.opensymphony.xwork2.ActionSupport;

@Controller
public class QueryAction extends ActionSupport{

	private static final long serialVersionUID = -9187687514922851368L;

	private List<User> userList;
	
	@Resource
	private LoginService loginService;

	public List<User> getUserList() {
		return userList;
	}

	public void setUserList(List<User> userList) {
		this.userList = userList;
	}


	@JSON(serialize=false)
	public LoginService getLoginService() {
		return loginService;
	}

	public void setLoginService(LoginService loginService) {
		this.loginService = loginService;
	}

	@Override
	public String execute() throws Exception {

		userList = loginService.queryAllUser();
		
		return "userList"; 

	}

}
