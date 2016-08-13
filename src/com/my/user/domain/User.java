package com.my.user.domain;

/**
 * 用户实体
 * @author MoYalan
 *
 */
public class User {
	
	private String userid;				//用户标识
	private String username;			//用户名
	private String upasswd;				//用户密码
	
	public String getUserid() {
		return userid;
	}
	public void setUserid(String userid) {
		this.userid = userid;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getUpasswd() {
		return upasswd;
	}
	public void setUpasswd(String upasswd) {
		this.upasswd = upasswd;
	}
	
}
