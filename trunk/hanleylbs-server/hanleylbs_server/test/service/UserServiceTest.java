package service;


import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cn.hanley.lbs.mapper.UserMapper;


public class UserServiceTest{

	
	@Test
	public void testMybatis(){
		ClassPathXmlApplicationContext bf = new ClassPathXmlApplicationContext("applicationContext.xml");
		UserMapper userMapper = bf.getBean(UserMapper.class);
		
//		User user = new User();
//		user.setPassword("lqy@9r943");
//		user.setUsername("Lacey Lee");
//		userMapper.insertUser(user);
	}

}
