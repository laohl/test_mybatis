package com.mybatis.bean;

import java.math.BigDecimal;
import java.util.Date;

/**用户*/
public class User {
	
	private Integer id;
	private String name;
	private BigDecimal balance;
	private Date add_time;
	private char sex;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public BigDecimal getBalance() {
		return balance;
	}
	public void setBalance(BigDecimal balance) {
		this.balance = balance;
	}
	public Date getAdd_time() {
		return add_time;
	}
	public void setAdd_time(Date add_time) {
		this.add_time = add_time;
	}
	public char getSex() {
		return sex;
	}
	public void setSex(char sex) {
		this.sex = sex;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", balance=" + balance + ", add_time=" + add_time + ", sex=" + sex
				+ "]";
	}
	public User(Integer id, String name, BigDecimal balance, Date add_time, char sex) {
		super();
		this.id = id;
		this.name = name;
		this.balance = balance;
		this.add_time = add_time;
		this.sex = sex;
	}
	public User() {
	}
	
	
}
