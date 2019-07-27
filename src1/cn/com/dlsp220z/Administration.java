package cn.com.dlsp220z;

import java.util.ArrayList;
import java.util.List;

public class Administration {
	public static void f1() {
		Person per = new Person("小明", 1);
		Person per1 = new Person("小刚", 1);
		Person per2 = new Person("小红", 2);
		Person per3 = new Person("小李", 2);

		List<Person> personlist1 = new ArrayList<>();
		personlist1.add(per);
		personlist1.add(per1);
		List<Person> personlist2 = new ArrayList<>();
		personlist2.add(per2);
		personlist2.add(per3);
		List<Person> personlist3 = new ArrayList<>();
		personlist3.add(per3);
		personlist3.add(per1);

		Subject sub = new Subject("数学", personlist1);
		Subject sub1 = new Subject("语文", personlist1);
		Subject sub2 = new Subject("英语", personlist2);
		Subject sub3 = new Subject("体育", personlist2);
		Subject sub4 = new Subject("音乐", personlist3);
		Subject sub5 = new Subject("物理", personlist3);

		List<Subject> zlist = new ArrayList<Subject>();
		zlist.add(sub);
		zlist.add(sub1);
		zlist.add(sub2);
		zlist.add(sub3);
		zlist.add(sub4);
		zlist.add(sub5);

		for (Subject subject : zlist) {
			System.out.print(subject.getName());
			System.out.println("选课学生为:");
			for (Person person : subject.getPersonlist()) {
				System.out.println(person.getName());
			}
		}
	}

	public static void f2() {
		Subject sub = new Subject("数学");
		Subject sub1 = new Subject("语文");
		Subject sub2 = new Subject("英语");
		Subject sub3 = new Subject("体育");
		Subject sub4 = new Subject("音乐");
		Subject sub5 = new Subject("物理");

		List<Subject> subjectlist1 = new ArrayList<>();
		subjectlist1.add(sub);
		subjectlist1.add(sub1);
		List<Subject> subjectlist2 = new ArrayList<>();
		subjectlist2.add(sub);
		subjectlist2.add(sub1);
		subjectlist2.add(sub4);
		subjectlist2.add(sub5);
		List<Subject> subjectlist3 = new ArrayList<>();
		subjectlist3.add(sub2);
		subjectlist3.add(sub3);
		List<Subject> subjectlist4 = new ArrayList<>();
		subjectlist4.add(sub2);
		subjectlist4.add(sub3);
		subjectlist4.add(sub4);
		subjectlist4.add(sub5);


		Person per = new Person("小明", 12, subjectlist1);
		Person per1 = new Person("小刚", 11, subjectlist2);
		Person per2 = new Person("小红", 10, subjectlist3);
		Person per3 = new Person("小李", 12, subjectlist4);
		
		List<Person> zlist = new ArrayList<Person>();
		zlist.add(per);
		zlist.add(per1);
		zlist.add(per2);
		zlist.add(per3);

		for (Person person : zlist) {
			System.out.println(person.getName());
			System.out.println("选课情况：");
			for (Subject subject : person.getSubjectlist()) {
				System.out.println(subject.getName());
			}
		}


	}

}
