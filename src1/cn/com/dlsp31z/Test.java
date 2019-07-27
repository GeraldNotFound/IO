package cn.com.dlsp31z;

public class Test {

	public static void main(String[] args) {
		People p1 = new People("d");
		People p2 = new People("c");
		People p3 = new People("e");
		People p4 = new People("u");
		HuoCe hc1 = new HuoCe("1004", "yz22", 20190302);
		HuoCe hc2 = new HuoCe("1003", "yz22", 20190302);
		p1.buy(hc1);
		p2.buy(hc1);
		p3.buy(hc2);
		p3.buy(hc2);
		
	}

}
