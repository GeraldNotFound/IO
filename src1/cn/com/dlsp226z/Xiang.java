package cn.com.dlsp226z;

public class Xiang {
	private String name;
	private String jieshao;
	private double jiage;

	public Xiang() {
		super();
	}

	public Xiang(String name, String jieshao, double jiage) {
		super();
		this.name = name;
		this.jieshao = jieshao;
		this.jiage = jiage;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getJieshao() {
		return jieshao;
	}

	public void setJieshao(String jieshao) {
		this.jieshao = jieshao;
	}

	public double getJiage() {
		return jiage;
	}

	public void setJiage(double jiage) {
		this.jiage = jiage;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(jiage);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((jieshao == null) ? 0 : jieshao.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
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
		Xiang other = (Xiang) obj;
		if (Double.doubleToLongBits(jiage) != Double.doubleToLongBits(other.jiage))
			return false;
		if (jieshao == null) {
			if (other.jieshao != null)
				return false;
		} else if (!jieshao.equals(other.jieshao))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Xiang [name=" + name + ", jieshao=" + jieshao + ", jiage=" + jiage + "]";
	}
	
}