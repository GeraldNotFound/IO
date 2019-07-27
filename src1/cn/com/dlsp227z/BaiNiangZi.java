package cn.com.dlsp227z;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class BaiNiangZi {
	public static void main(String[] args) {
		File file = new File("E:\\java测试\\Bi.mp4");
		InputStream ips = null;
		OutputStream ops = null;
		try {
			ips = new FileInputStream(file);
			ops = new FileOutputStream("E:\\\\java测试\\\\copy.mp4");
			int len = ips.read(); 
			while(len!=-1) {
				ops.write(len);
				len = ips.read();
			}
			System.out.println("成功");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			if(ips!=null) {
				try {
					ips.close();
					ops.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}

	}

}
