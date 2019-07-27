package cn.com.dlsp226;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class JianChaTest {
	static Scanner sc = new Scanner(System.in);
	Map<String, TaoCan> tz1 = new HashMap<String, TaoCan>();

	public void zeng() {
		
		System.out.println("请输入增加编号");
		String id = sc.next();
		TaoCan tc=tz1.get(id);
		if (tc==null) {
			
			System.out.println("套餐名称：");
			String ming = sc.next();
			boolean flag = true;
			while(flag) {
			System.out.println("请选择增加检查项：");
			int a = sc.nextInt();
			
			if (a==-1) {
				flag = false;
				break;
			}
			
		}
		}
	}
	public void shan() {
		System.out.println("请输入删除套餐的ID：");
		
		while (true) {
			Scanner sc = new Scanner(System.in);
			 String id = sc.next();
			TaoCan st = 

			if (st == null) {
				System.out.println("该套餐不存在！");
				continue;
			} else {
				this.remove(id);
				System.out.println("删除成功！还剩：" + );
				break;
				
			}
			
		}
		bianli();
	}
	}


	public static void main(String[] args) {
		Map<String, TaoCan> tz = new HashMap<String, TaoCan>();

		JianCha jc1 = new JianCha("1", "身高", "量身高", 12.3);
		JianCha jc2 = new JianCha("2", "体重", "量体重", 15.3);
		JianCha jc3 = new JianCha("3", "肺活量", "吹气", 17.3);
		JianCha jc4 = new JianCha("4", "血常规", "抽血化验", 22.3);

		List ltao1 = new ArrayList();
		ltao1.add(jc1);
		ltao1.add(jc2);
		ltao1.add(jc3);

		List ltao2 = new ArrayList();
		ltao1.add(jc1);
		ltao1.add(jc4);
		
		TaoCan mtao1 = new TaoCan("01", "单位体检套餐", ltao1);
		tz.put(mtao1.getId(), mtao1);

		TaoCan mtao2 = new TaoCan("02", "飞行员体检套餐", ltao2);
		tz.put(mtao2.getId(), mtao2);

		List all = new ArrayList();
		all.add(jc1);
		all.add(jc2);
		all.add(jc3);
		all.add(jc4);

		System.out.println("欢迎");
		System.out.println("请输入序号：");
		int key = 0;
		do {
			key = sc.nextInt();
			switch (key) {
			case 1:
				JianChaTest jc = new JianChaTest();
				
				break;
			case 2:

				break;

			default:

				break;
			}
		} while (key > 0);

	}

}
