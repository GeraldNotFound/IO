package cn.com.dlsp227z;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class AJ {

	public static void main(String[] args) {
		File file = new File("E:\\java测试\\AJ.png");
		InputStream ip = null;
		OutputStream op = null;
		try {
			ip = new FileInputStream(file);
			op = new FileOutputStream("E:\\java测试\\AJmn.png");
			int len = ip.read();
			while (len != -1) {
				op.write(len);
				len = ip.read();
			}
			System.out.println("成功");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			if (ip != null) {
				try {
					if (op != null) {
						op.close();
						ip.close();
					}

				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}

	}

}
