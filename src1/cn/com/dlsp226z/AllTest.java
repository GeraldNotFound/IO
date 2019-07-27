package cn.com.dlsp226z;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

import javax.net.ssl.SNIHostName;

public class AllTest {
	Xiang high, zhong, xue, niao, xguang, ct;
	List<Xiang> allxiang = new ArrayList<Xiang>();
	Map<String, TaoCan> alltc = new HashMap<String, TaoCan>();
	Scanner sc = new Scanner(System.in);

	public AllTest() {
		init();
		worktj();

	}

	public void init() {
		high = new Xiang("身高", "量身高", 10.1);
		zhong = new Xiang("体重", "量体重", 11.1);
		xue = new Xiang("血常规", "抽三管子", 50.3);
		niao = new Xiang("尿检", "多喝水", 15.3);
		xguang = new Xiang("X—光", "透视", 70.41);
		ct = new Xiang("CT", "身体内部观察", 101.1);
		allxiang.add(high);
		allxiang.add(zhong);
		allxiang.add(xue);
		allxiang.add(niao);
		allxiang.add(xguang);
		allxiang.add(ct);
	}

	public void worktj() {
		TaoCan wtj = new TaoCan("工作体检", null);
		List<Xiang> wlist = new ArrayList<>();
		wlist.add(high);
		wlist.add(zhong);
		wlist.add(xue);
		wtj.setXlist(wlist);
		wtj.getZjiage();
		alltc.put(wtj.getName(), wtj);

	}

	public void showSet(TaoCan set) {
		System.out.println("当前套餐为：" + set.getName());
		System.out.println("包含：");
		// for (Xiang xian : set.getXlist()) {
		// System.out.println(xian);
		// }
		this.showitems(set.getXlist());
		System.out.println("套餐总金额：" + set.getZjiage());
	}

	public void showallset() {
		for (TaoCan set : alltc.values()) {
			this.showSet(set);
		}
	}

	public void showitems(List<Xiang> xiang) {
		int i = 1;
		for (Xiang xiangs : xiang) {
			System.out.println(i + "." + xiangs);
			i++;
		}
	}

	public void addSet() {
		System.out.println("请输入新套餐名称：");
		String setName = sc.next();
		while (alltc.containsKey(setName)) {
			System.out.println("已存在请重新。");
			setName = sc.next();
		}
		TaoCan set = new TaoCan(setName, null);
		List<Xiang> list = new ArrayList<>();
		List<Xiang> allitemsbak = new ArrayList<>();
		allitemsbak.addAll(allxiang);
		System.out.println("当前可添加项");
		this.showitems(allitemsbak);
		System.out.println("请添加检查项：-1结束");
		int data = sc.nextInt();
		while (data != -1 && allitemsbak.size() > 0) {
			list.add(allitemsbak.get(data - 1));
			allitemsbak.remove(data - 1);
			System.out.println("请继续添加");
			this.showitems(allitemsbak);
			data = sc.nextInt();
		}
		System.out.println("添加完毕");
		set.setXlist(list);
		set.getZjiage();
		alltc.put(set.getName(), set);
		this.showSet(set);
	}

	public void shan() {
		System.out.println("请输入删除套餐名");
		do {
			String sname = sc.next();
			TaoCan tc = alltc.get(sname);
			if (!alltc.containsKey(tc)) {
				System.out.println("没有这个");
				continue;
			}
			this.alltc.remove(sname);
			System.out.println("删除成功");
			break;
		} while (true);
	}

public void gen() {
	System.out.println("请输入更改套餐名称：");
	String setname = sc.next();
	if(!alltc.containsKey(setname)) {
		System.out.println("没有这个");
}else {
	System.out.println("123");
	int num = sc.nextInt();
	if (num==1) {
		System.out.println("添加检测项");
	} else if(num==2){
		System.out.println("如下");
		TaoCan set = alltc.get(setname);
		this.showSet(set);
		System.out.println("输入要检查的项：");
		
		
		
	}

	}
}

	public void gai() {
		while (true) {
			System.out.println("请输入更改套餐名称：");
			String snam = sc.next();
			TaoCan tc = alltc.get(snam);
			if (tc == null) {
				System.out.println("没有");
				continue;
			}
			System.out.println("找到了" + alltc.toString());
			this.alltc.remove(snam);
			System.out.println("请输入更改后套餐名称：");
			String setName = sc.next();
			TaoCan set = new TaoCan(setName, null);
			List<Xiang> list = new ArrayList<>();
			List<Xiang> allitemsbak = new ArrayList<>();
			allitemsbak.addAll(allxiang);
			this.showitems(allitemsbak);
			System.out.println("请添加检查项：-1结束");
			int data = sc.nextInt();
			while (data != -1) {
				list.add(allitemsbak.get(data - 1));
				allitemsbak.remove(data - 1);
				System.out.println("请继续添加");
				this.showitems(allitemsbak);
				data = sc.nextInt();
			}
			break;
		}
	}

	public void menus() {
		do {
			System.out.println("1,2,3,4");
			int data = sc.nextInt();
			switch (data) {
			case 1:
				this.showallset();
				break;
			case 2:
				this.addSet();
				break;
			case 3:
				this.shan();
				break;
			case 4:
				this.gai();
				break;

			default:
				break;
			}
		} while (true);
	}

	public static void main(String[] args) {
		AllTest at = new AllTest();
		at.menus();
	}

}
