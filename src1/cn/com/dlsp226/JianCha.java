package cn.com.dlsp226;

public class JianCha {
	private String id;
	private String ming;
	private String jieshao;
	private double danjia;

	public JianCha(String id, String ming, String jieshao, double danjia) {
		super();
		this.id = id;
		this.ming = ming;
		this.jieshao = jieshao;
		this.danjia = danjia;
	}
	public JianCha() {
		super();
	}
	public String getMing() {
		return ming;
	}
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public void setMing(String ming) {
		this.ming = ming;
	}
	public String getJieshao() {
		return jieshao;
	}
	public void setJieshao(String jieshao) {
		this.jieshao = jieshao;
	}
	public double getDanjia() {
		return danjia;
	}
	public void setDanjia(double danjia) {
		this.danjia = danjia;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(danjia);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((jieshao == null) ? 0 : jieshao.hashCode());
		result = prime * result + ((ming == null) ? 0 : ming.hashCode());
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
		JianCha other = (JianCha) obj;
		if (Double.doubleToLongBits(danjia) != Double.doubleToLongBits(other.danjia))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (jieshao == null) {
			if (other.jieshao != null)
				return false;
		} else if (!jieshao.equals(other.jieshao))
			return false;
		if (ming == null) {
			if (other.ming != null)
				return false;
		} else if (!ming.equals(other.ming))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "JianCha [id=" + id + ", ming=" + ming + ", jieshao=" + jieshao + ", danjia=" + danjia + "]";
	}
	
	
	
	
	

}
