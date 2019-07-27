package cn.com.dlsp224;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

import org.junit.Test;

public class Database {
	Map<String, Student> xue = new HashMap<String, Student>();

	@Test // 存储数据,建立key--value映射指向关系。
	public void cun() {

		Student stu1 = new Student("01", "小王", 13);
		Student stu2 = new Student("02", "小李", 14);
		Student stu3 = new Student("03", "小胡", 15);
		Student stu4 = new Student("04", "小孔", 16);
		xue.put(stu1.getId(), stu1);
		xue.put(stu2.getId(), stu2);
		xue.put(stu3.getId(), stu3);
		xue.put(stu4.getId(), stu4);

		// Set<Map.Entry<String, Student>> sets = xue.entrySet();
		// Iterator<Map.Entry<String, Student>> it = sets.iterator();
		// while (it.hasNext()) {
		// Map.Entry<String, Student> entry = it.next();
		// System.out.println(entry.getKey() + entry.getValue());
		// }
	}

	@Test // 遍历集合方法
	public void bianli() {
		Set<Map.Entry<String, Student>> sets = xue.entrySet();
		Iterator<Map.Entry<String, Student>> it = sets.iterator();
		while (it.hasNext()) {
			Map.Entry<String, Student> entry = it.next();
			System.out.println(entry.getKey() + entry.getValue());
		}

	}

	@Test // 寻找集合中的元素
	public void selcet() {

	}
	// 添加对象，分别设置学生编号，姓名，年龄，填入创建对象中。

	public void insert() {
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入加入学生编号：");
		String bian = sc.next();
		Student st = xue.get(bian);
		if (st == null) {
			System.out.println("请输入加入学生姓名：");
			String xing = sc.next();
			System.out.println("请输入加入学生年龄：");
			int nian = sc.nextInt();
			Student stu = new Student(bian, xing, nian);
			xue.put(bian, stu);
			System.out.println("成功添加" + stu.toString());
		} else {
			System.out.println("此id已存在" + bian);
		}
	}

	// 更改集合中对象属性值。
	public void update() {
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println("请输入更改学生id：");
			String i = sc.next();
			Student stu = xue.get(i);
			if (stu != null) {
				System.out.println("找到了" + stu.toString());
				System.out.println("请输入更改后该学生姓名：");
				String xing = sc.next();
				System.out.println("请输入更改后学生年龄：");
				int nian = sc.nextInt();
				stu = new Student(i, xing, nian);
				this.xue.put(i, stu);
				System.out.println("成功添加" + stu.toString());
				break;
			} else {
				System.out.println("没有这个学生");
				break;
			}
		}
		Database.this.bianli();

	}

	@Test
	public void delete() {
		System.out.println("请输入删除学生的ID：");
		while (true) {
			Scanner sc = new Scanner(System.in);
			 String id = sc.next();
			Student st = xue.get(id);

			if (st == null) {
				System.out.println("该学生不存在！");
				continue;
			} else {
				this.xue.remove(id);
				System.out.println("删除成功！还剩：" + xue.size());
				break;
				
			}
			
		}
		bianli();
	}


}
