package cn.com.dlsp31z;

public class HuoCe {
	private String id;
	private String name;
	private int day;

	public HuoCe(String id, String name, int day) {
		super();
		this.id = id;
		this.name = name;
		this.day = day;
	}

	public HuoCe() {
		super();
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + day;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
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
		HuoCe other = (HuoCe) obj;
		if (day != other.day)
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
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
		return "HuoCe [id=" + id + ", name=" + name + ", day=" + day + "]";
	}

}
