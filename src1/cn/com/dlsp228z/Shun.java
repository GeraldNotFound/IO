package cn.com.dlsp228z;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Random;

public class Shun {

	public static void main(String[] args) {
		Random ra = new Random();
		for (int i = 0; i <100; i++) {
			
		
		int bw = ra.nextInt(100)+100;
		FileOutputStream fop=null;
		File fi = new File("E:\\java测试\\替换测试\\sz.txt");
		try {
			fop = new FileOutputStream(fi,true);
			if(i%5==0) {
				System.out.println("\n");
			}
			fop.write(bw);
			fop.flush();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			
				try {
					if(fop!=null)
					fop.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		}
	}

}
}