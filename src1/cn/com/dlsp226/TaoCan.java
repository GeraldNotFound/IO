package cn.com.dlsp226;

import java.util.List;

public class TaoCan {
	private String id;
	private String name;
	private double zjia;
	private List<JianCha> jclist;
	
	public TaoCan(String id, String name, List<JianCha> jclist) {
		super();
		this.id = id;
		this.name = name;
		this.jclist = jclist;
	}
	public TaoCan() {
		super();
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<JianCha> getJclist() {
		return jclist;
	}
	public void setJclist(List<JianCha> jclist) {
		this.jclist = jclist;
	}
	
	public double getZjia() {
		
		return zjia;
	}
	public void setZjia(double zjia) {
		this.zjia = zjia;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((jclist == null) ? 0 : jclist.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		long temp;
		temp = Double.doubleToLongBits(zjia);
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
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (jclist == null) {
			if (other.jclist != null)
				return false;
		} else if (!jclist.equals(other.jclist))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (Double.doubleToLongBits(zjia) != Double.doubleToLongBits(other.zjia))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "TaoCan [id=" + id + ", name=" + name + ", zjia=" + zjia + ", jclist=" + jclist + "]";
	}
	
}
