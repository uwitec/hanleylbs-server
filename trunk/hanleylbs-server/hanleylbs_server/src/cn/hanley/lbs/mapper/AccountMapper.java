package cn.hanley.lbs.mapper;

import cn.hanley.lbs.model.Account;
import cn.hanley.lbs.model.User;

public interface AccountMapper {

    public void insertAccount(Account account); 
    public int getAccount(Account account); 
    public Account getAccountById(int accountId);
}
