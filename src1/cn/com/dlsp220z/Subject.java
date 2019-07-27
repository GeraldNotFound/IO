package cn.com.dlsp220z;

import java.util.List;

public class Subject {
	private String name;
	private List<Person> personlist;
	
	public Subject() {
		super();
	}
	public Subject(String name, List<Person> personlist) {
		super();
		this.name = name;
		this.personlist = personlist;
	}
	public Subject(String name) {
		super();
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<Person> getPersonlist() {
		return personlist;
	}
	public void setPersonlist(List<Person> personlist) {
		this.personlist = personlist;
	}
	@Override
	public String toString() {
		return "Subject [name=" + name + ", personlist=" + personlist + "]";
	}
	
	

}
