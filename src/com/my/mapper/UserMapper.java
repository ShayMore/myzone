package com.my.mapper;

import java.util.List;

import com.my.user.domain.User;

/**
 * 用户信息接口
 * @author MoYalan
 *
 */
public interface UserMapper {

	public void save(User user);
	
	public boolean update(User user);
	
	public boolean delete(String userid);
	
	public User queryById(String userid);
	
	public List<User> queryAllUsers();

}
