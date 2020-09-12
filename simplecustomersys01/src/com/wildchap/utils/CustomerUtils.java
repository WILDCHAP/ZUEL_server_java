package com.wildchap.utils;
import java.util.Scanner;
/**
 * 
 * @description 
 * @wang 993704315@qq.com
 * @params
 * @method
 * @return
 */
public class CustomerUtils {
	Scanner scan = new Scanner(System.in);
	public CustomerUtils() {
		
	}
	/**
	 * 获取用户输入信息，返回合法的选择值
	 */
	public int getMenuChoice() {
		char ch;
		for(;;) {
			String s = scan.next();
			ch = s.charAt(0);
			if(ch!='1' && ch!='2' && ch!='3' && ch!='4'
					&& ch!='5')
				System.out.print("请输入合法选择：");
			else
				break;
		}
		return ch-48;
	}
	/**
	 * 获取新的String值，返回
	 */
	public String getStringInfo() {
		String s = scan.next();
		return s;
	}
	/**
	 * 获取修改的String值，没修改则返回原值
	 */
	public String getStringInfo(String std) {
		String s = scan.next();
		return s.equals("q")? std:s;
	}
	/**
	 * 获取新的int值，返回
	 */
	public int getIntInfo() {
		int n = scan.nextInt();
		return n;
	}
	/**
	 * 获取修改的int值，为0则返回原值
	 */
	public int getIntInfo(int std) {
		int n = scan.nextInt();
		return n==0? std:n;
	}
	/**
	 * 询问用户是否退出，返回1退出，2不退出
	 */
	public int getYesOrNo() {
		for(;;) {
			System.out.print("确定吗？(Y/N)：");
			String s = scan.next();
			s = s.toUpperCase();
			char ch = s.charAt(0);
			if(ch=='Y')	return 1;
			else if (ch=='N')	return 0;
			else
				System.out.println("输入有误请重新输入");
		}
	}
}
