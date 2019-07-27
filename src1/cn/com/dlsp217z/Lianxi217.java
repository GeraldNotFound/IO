package cn.com.dlsp217z;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Lianxi217 {
	public long getDay(String st1,String st2) {
		long day = -1;
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		try {
			Date dat1 = sdf.parse(st1);
			Date dat2 = sdf.parse(st2);
			day = (dat2.getTime()-dat1.getTime())/(1000*60*60*24);
					
		}catch (Exception e) {
			System.out.println("不合法");
		}
		return day;
		
	}

}
