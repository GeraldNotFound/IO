package cn.com.dlsp227z;

import java.io.File;

public class First1 {

	public static void main(String[] args) {
		File file = new File("E:\\java测试");
		String[] files = file.list();
		File[] fs = file.listFiles();
		for (int i = 0; i < files.length; i++) {			
			String string = files[i];
			System.out.println("文件名："+files[i]);			
			for (int j = 0; j < fs.length; j++) {
				File file2 = fs[j];
				System.out.println("路径地址："+fs[i-j]);
				System.out.println("------------------");
				break;
		}
		}

		// for (String str : files) {
		// System.out.println("文件名："+str);
		// for(File f : fs) {
		// System.out.println("路径地址："+f);
		// System.out.println("-------------------------------");
		// break;
		// }
		// }

		
		
		}

		// for (File f : fs){
		// System.out.println("路径地址："+f);
		// }
	}

