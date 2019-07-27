package cn.com.dlsp228z;

import java.util.Scanner;

public class YongHu {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入用户名");
		String name = sc.next();
		System.out.println("请输入密码");
		int pass = sc.nextInt();
		if(name=="admin"&&pass==1234) {
			System.out.println("登陆成功");
		}

	}

}
