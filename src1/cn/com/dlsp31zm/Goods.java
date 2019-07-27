package cn.com.dlsp31zm;

import java.io.Serializable;

public class Goods implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private int gid;
	private int cid;
	private String name;
	private double price;
	public Goods() {
		super();
	}
	public Goods(int gid, int cid, String name, double price) {
		super();
		this.gid = gid;
		this.cid = cid;
		this.name = name;
		this.price = price;
	}
	public int getGid() {
		return gid;
	}
	public void setGid(int gid) {
		this.gid = gid;
	}
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Goods [产品ID=" + gid + ", cid=" + cid + ", 产品名字=" + name + ", 单价=" + price + "]";
	}
	
}
