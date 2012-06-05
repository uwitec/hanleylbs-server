package cn.hanley.lbs.service;

import java.util.List;

import cn.hanley.lbs.model.Account;
import cn.hanley.lbs.model.User;

public interface LoginService {

	public int getAccount(String username,String password);
	 public Account getAccount(int accountId);
	public void insertAccount(Account account);
	public void insertUser(User user); 
    public User getUser(int userId); 
    public List<User> queryAllUser();
}
