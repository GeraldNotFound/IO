package cn.com.dlsp220z;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class Login {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("请您登陆");
		boolean flag = true;
		do {
			try {
				System.out.println("请输入用户名：");
				System.out.println("请输入密码：");
				String name = sc.nextLine();
				int pass = sc.nextInt();
				if (name.equals("admin") && pass == 1234) {
					flag = false;
					System.out.println("成功");
				} else {
					System.out.println("重新输入");
				}
			} catch (InputMismatchException e) {
				System.out.println("密码只能是数字");
			}
		} while (flag);
		
		
//		int num1 = new Random().nextInt(10)+1;
//		int num2 = new Random().nextInt(10)+1;
//		int num3 = new Random().nextInt(10)+1;
//		String str = "";
//        for (int i = 0;i<1;i++){
//            str = str+ (char)(Math.random()*26+'a');
//        }
//		System.out.println("验证码：");
//		System.out.println(num1+"-"+num2+str+"-"+num3);	
		
		String str = "0123456789abcdefghigklmnopqrsduvwxyz";
		for (int i = 0; i <2; i++) {			
			int num1 = new Random().nextInt(34)+1;					
			System.out.print(str.charAt(num1));
		}
		


	}

}
