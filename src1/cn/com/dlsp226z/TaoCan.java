package cn.com.dlsp226z;

import java.util.List;

public class TaoCan {
	private String name;
	private List<Xiang> xlist;
	private double zjiage;

	public TaoCan() {
		super();
	}

	public TaoCan(String name, List<Xiang> xlist) {
		super();
		this.name = name;
		this.xlist = xlist;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Xiang> getXlist() {
		return xlist;
	}

	public void setXlist(List<Xiang> xlist) {
		this.xlist = xlist;
	}

	public double getZjiage() {
		int total = 0;
		for (Xiang xiang : xlist) {
			
			total += xiang.getJiage();
		}
		this.zjiage = total;
		return zjiage;
	}

	public void setZjiage(double zjiage) {
		this.zjiage = zjiage;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((xlist == null) ? 0 : xlist.hashCode());
		long temp;
		temp = Double.doubleToLongBits(zjiage);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		TaoCan other = (TaoCan) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (xlist == null) {
			if (other.xlist != null)
				return false;
		} else if (!xlist.equals(other.xlist))
			return false;
		if (Double.doubleToLongBits(zjiage) != Double.doubleToLongBits(other.zjiage))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "TaoCan [name=" + name + ", xlist=" + xlist + ", zjiage=" + zjiage + "]";
	}
	
}