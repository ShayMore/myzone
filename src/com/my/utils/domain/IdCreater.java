package com.my.utils.domain;

/**
 * Id生成器实体
 * @author MoYalan
 *
 */
public class IdCreater {
	
	private String prefix;			//第一个字符
	private String suffix;			//第二个字符
	
	public String getPrefix() {
		return prefix;
	}
	public void setPrefix(String prefix) {
		this.prefix = prefix;
	}
	public String getSuffix() {
		return suffix;
	}
	public void setSuffix(String suffix) {
		this.suffix = suffix;
	}	
}
