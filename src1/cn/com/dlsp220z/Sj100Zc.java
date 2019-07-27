package cn.com.dlsp220z;

public class Sj100Zc {

	public static void main(String[] args) {
		String str = "";
		int num = 0;
		for (int i = 0; i < 10; i++) {			
			str = str + (char) (Math.random() * 26 + 'a');			
}		
		for (int j = 0; j < str.length(); j++) {			
			if (str.charAt(j)=='c') {
				num++;
			}			
		}		
		System.out.println(str);
		System.out.println(num);
	}
	}