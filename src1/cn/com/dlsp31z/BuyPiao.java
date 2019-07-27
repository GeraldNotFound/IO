package cn.com.dlsp31z;

import java.awt.List;

public class BuyPiao implements Runnable {
	private People p;
	private HuoCe t;
	
	
	public BuyPiao(People p, HuoCe t) {
		super();
		this.p = p;
		this.t = t;
	}


	public People getP() {
		return p;
	}


	public void setP(People p) {
		this.p = p;
	}


	public HuoCe getT() {
		return t;
	}


	public void setT(HuoCe t) {
		this.t = t;
	}


	@Override
	public void run() {
		synchronized (t) {
		HuoCe hc = Tiock.sell(t);
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if (hc==null) {
			System.out.println("抱歉"+p.getName());
		}else {
			System.out.println("成功"+p.getName()+hc);
		}

		}
		 

	}

}
