package cn.hanley.lbs.mapper;

import java.util.List;

import cn.hanley.lbs.model.User;

public interface UserMapper { 
    public void insertUser(User user); 
    public User getUser(int userId); 
    public List<User>  queryAllUser();
} 