package cn.com.dlsp228z;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;

public class Ming {
	public static void main(String[] args) {
		File file = new File("E:\\java测试\\替换测试\\名字.txt");
		try {
			BufferedReader isp = new BufferedReader(new FileReader(file));
			ArrayList<String>list = new ArrayList<String>();
			String line = null;
			while((line = isp.readLine())!=null) {
			list.add(line);
			}
			isp.close();
			Random ra = new Random();
			int b = ra.nextInt(2);
			String name = list.get(b);
			System.out.println(name);

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
