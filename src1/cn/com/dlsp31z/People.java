package cn.com.dlsp31z;

public class People {
	private String name;
	

	public People(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	public void buy(HuoCe hc) {
		BuyPiao buy = new BuyPiao(this, hc);
		Thread t = new Thread(buy);
		t.start();
	}

}
