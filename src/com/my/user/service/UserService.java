package com.my.user.service;

import java.util.List;

import com.my.user.domain.User;
import com.my.utils.domain.IdCreater;

public interface UserService {
	
	public void save(User user);
	public boolean update(User user);
	public boolean delete(String userid);
	public User queryById(String userid);
	public List<User> queryAllUsers();
	public String getId(IdCreater idc);
}
