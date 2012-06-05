package cn.hanley.lbs.service.impl;


import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import cn.hanley.lbs.mapper.AccountMapper;
import cn.hanley.lbs.mapper.UserMapper;
import cn.hanley.lbs.model.Account;
import cn.hanley.lbs.model.User;
import cn.hanley.lbs.service.LoginService;


@Service
public class LoginServiceImpl implements LoginService {

	@Resource
	private AccountMapper accountMapper;
	
	@Resource
	private UserMapper userMapper;

	public UserMapper getUserMapper() {
		return userMapper;
	}

	public void setUserMapper(UserMapper userMapper) {
		this.userMapper = userMapper;
	}

	public AccountMapper getAccountMapper() {
		return accountMapper;
	}

	public void setAccountMapper(AccountMapper accountMapper) {
		this.accountMapper = accountMapper;
	}


	@Override
	public void insertAccount(Account account) {
		accountMapper.insertAccount(account);
	}

	@Override
	public void insertUser(User user) {
		userMapper.insertUser(user);
	}

	@Override
	public User getUser(int userId) {
		User user = userMapper.getUser(userId);
		return user;
	}

	@Override
	public int getAccount(String username, String password) {
		Account account = new Account();
		account.setUsername(username);
		account.setPassword(password);
		int userId = accountMapper.getAccount(account);
		return userId;
	}

	@Override
	public Account getAccount(int accountId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<User> queryAllUser() {
		List<User> listUser = userMapper.queryAllUser();
		return listUser;
	}
 




}
