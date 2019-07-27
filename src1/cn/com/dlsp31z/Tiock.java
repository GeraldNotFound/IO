package cn.com.dlsp31z;

import java.util.ArrayList;
import java.util.List;

public class Tiock {
	static List<HuoCe> poor = new ArrayList<HuoCe>();
	static {
		HuoCe hc1 = new HuoCe("1004", "yz22", 20190302);
		HuoCe hc2 = new HuoCe("1003", "yz22", 20190302);
		HuoCe hc3 = new HuoCe("1002", "yz22", 20190302);
		HuoCe hc4 = new HuoCe("1001", "yz22", 20190302);
		poor.add(hc1);
		poor.add(hc2);
		poor.add(hc3);
		poor.add(hc4);

	}

	// *买票
	public static HuoCe sell(HuoCe hc) {
		HuoCe h = null;
		for (HuoCe hcr : poor) {
			if (hcr.equals(hc)) {
				h = hcr;
				System.out.println("正在出票" + hcr);
				poor.remove(hcr);
				break;
			}
		}
		return h;
	}
	//退票
	public static void go(HuoCe hc) {
		if(poor.contains(hc)) {
			System.out.println("无法退票");
		}else {
			poor.add(hc);
			System.out.println("退票成功");
		}
	}
}
