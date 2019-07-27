package cn.com.dlsp220z;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		System.out.println("1，查询学生选什么课程。2，查询课程被多少学生选。");

		while (true) {
			
			Scanner sc = new Scanner(System.in);
			int key = sc.nextInt();
			
			Administration an = new Administration();
			switch (key) {			
			case 1:
				an.f2();
				break;
			case 2:				
				an.f1();
				break;

			default:
				System.out.println("输入错误，重新输入");
				break;
			}
		}

	}

}
