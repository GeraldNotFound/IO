package cn.com.dlsp220z;

import java.util.List;

public class Person {
	
	private String name;
	private int school;
	private List<Subject> subjectlist;
	
	
	public Person() {
		super();
	}
	public Person(String name, int school) {
		super();
		this.name = name;
		this.school = school;
	}
	public Person(String name, int school,List<Subject> subjectlist) {
		super();
		this.name = name;
		this.school = school;
		this.subjectlist = subjectlist;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSchool() {
		return school;
	}
	public void setSchool(int school) {
		this.school = school;
	}
	public List<Subject> getSubjectlist() {
		return subjectlist;
	}
	public void setSubjectlist(List<Subject> subjectlist) {
		this.subjectlist = subjectlist;
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", school=" + school + ", subjectlist=" + subjectlist + "]";
	}
	
	

}
