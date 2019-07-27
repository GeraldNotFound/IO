package cn.com.dlsp227z;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class Txt {

	public static void main(String[] args) {
		File file = new File("E:\\java测试\\我的世界.txt");
		InputStream in = null;
		OutputStream out = null;

		try {
			in = new FileInputStream(file);
			out = new FileOutputStream("E:\\java测试\\我的世界md.txt");
			int ln = in.read();
			while (ln != -1) {
				out.write(ln);
				ln = in.read();
			}
			System.out.println("成功");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			if (in != null)
				try {
					if (out != null)
						out.close();
					in.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		}

	}

}
