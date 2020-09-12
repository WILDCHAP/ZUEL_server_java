package com.wildchap.customers;
import com.wildchap.bean.*;
/**
 * 
 * @description 
 * @wang 993704315@qq.com
 * @params
 * @method
 * @return
 */
public class CustomersList {
	private Customer[] customers;
	private int numbers = -1;	//当前有多少个用户(下标)
	/**
	 * 初始化数组长度
	 * @param std_length
	 */
	public CustomersList(int std_length) {
		customers = new Customer[std_length];
	}
	/**
	 * 添加客户信息，返回是否添加成功
	 * @param c
	 * @return
	 */
	public boolean addCustomer(Customer c) {
		if(numbers >= customers.length)
			return false;
		else {
			customers[++numbers] = c;
			return true;
		}
	}
	/**
	 * 修改客户信息，返回是否修改成功
	 * @param c
	 * @param key
	 * @return
	 */
	public boolean alterCustomer(Customer c, int key) {
		if(key < 0 || key > numbers)
			return false;
		else {
			customers[key] = c;
			return true;
		}
	}
	/**
	 * 修改用户信息，返回是否修改成功
	 * @param c
	 * @param key
	 * @return
	 */
	public boolean deleteCustomer(int key) {
		if(key < 0 || key > numbers)
			return false;
		else {
			for(int i=key; i<numbers; i++)
				customers[i+1] = customers[i];
			numbers--;
			return true;
		}
	}
	/**
	 * 返回现有的用户数据值
	 * @return
	 */
	public Customer[] selectAll() {
		Customer[] c = new Customer[numbers+1];
		for(int i=0; i<=numbers; i++)
			c[i] = customers[i];
		//System.out.println(numbers);
		return c;
	}
	public int getNumbers() {
		return numbers;
	}
}
