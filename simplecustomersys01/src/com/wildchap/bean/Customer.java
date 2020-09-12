package com.wildchap.bean;
/**
 * 
 * @description 一些个人信息的属性
 * @wang 993704315@qq.com
 * @params 姓名，性别，年龄，电话，邮箱
 * @method get, set, 两种构造函数
 * @return
 * 
 */
public class Customer {
	private String name;
	private String sex;
	private int age;
	private String phone;
	private String email;
	public Customer() {
		
	}
	public Customer(String name, String sex, int age, String phone, String email) {
		super();
		this.name = name;
		this.sex = sex;
		this.age = age;
		this.phone = phone;
		this.email = email;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
}
