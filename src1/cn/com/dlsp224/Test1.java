package cn.com.dlsp224;

import java.util.Scanner;

public class Test1 {

	public static void main(String[] args) {
		Database dat = new Database();
		boolean falg = true;
		do {
			Scanner sc = new Scanner(System.in);
			int key = sc.nextInt();
			switch (key) {
			case 1:
				dat.cun();
				dat.bianli();
				break;
			case 2:
				dat.insert();
				break;
			case 3:
				dat.update();
				break;
			case 4:
				dat.delete();
				break;
			default:
				System.out.println("sftc y/n");
				String i = sc.next();
				if (i.equals("y")) {
					falg = false;
				}
				break;
			}
		} while (falg);
	}
}
