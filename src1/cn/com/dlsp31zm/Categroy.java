package cn.com.dlsp31zm;

public class Categroy {
	private int cid;
	private String cname;
	public Categroy(int cid, String cname) {
		super();
		this.cid = cid;
		this.cname = cname;
	}
	public Categroy() {
		super();
	}
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	@Override
	public String toString() {
		return "Categroy [cid=" + cid + ", cname=" + cname + "]";
	}
	
}
