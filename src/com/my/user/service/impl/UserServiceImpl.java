package com.my.user.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.my.mapper.IdCreaterMapper;
import com.my.mapper.UserMapper;
import com.my.utils.helper.Constans;
import com.my.user.domain.User;
import com.my.user.service.UserService;
import com.my.utils.domain.IdCreater;

@Service
@Transactional
//此处不再进行创建SqlSession和提交事务，都已交由spring去管理了。
public class UserServiceImpl implements UserService {
	
	@Resource
	private UserMapper usermapper;
	
	@Resource
	private IdCreaterMapper idmapper;

	public boolean delete(String userid) {
		System.out.println("[serviceImpl] 删除的id " + userid);
		return usermapper.delete(userid);
	}

	public List<User> queryAllUsers() {
		System.out.println("进入到serviceimpl");
		List<User> findAllList = usermapper.queryAllUsers();
		return findAllList;
	}

	public User queryById(String userid) {

		User user = usermapper.queryById(userid);
		
		return user;
	}

	public void save(User user) {
		IdCreater idc = new IdCreater();
		idc.setPrefix(Constans.USER_ID_PREFIX);
		idc.setSuffix(Constans.COMMON_ID_SUFFIX);
		user.setUserid(getId(idc));
		usermapper.save(user);
	}

	public boolean update(User user) {

		return usermapper.update(user);
	}

	public String getId(IdCreater idc) {
		
		return idmapper.getId(idc);
	}

}
