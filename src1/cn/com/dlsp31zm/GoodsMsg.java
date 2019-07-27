package cn.com.dlsp31zm;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GoodsMsg {
	List<Goods> glists = new ArrayList<Goods>();
	CategroyMsg cgm = new CategroyMsg();
	Scanner sc = new Scanner(System.in);
	File filecat = new File("E:\\java测试\\数据保存\\商店测试.txt");
	File filegoods = new File("E:\\java测试\\数据保存\\商品.txt");

	public void addGoods(Goods goods) {
		
		glists.add(goods);
		glists = NongTools.readObjGoods(filegoods);
		NongTools.writeObjGoods(filegoods, glists);
		// while(true) {
		// System.out.println("请选择类别");
		// List<Categroy> cats = NongTools.readObj(filegoods);
		// System.out.println("请输入增加商品编号：");
		// int id = sc.nextInt();
		// if (id==goods.getGid()) {
		// System.out.println("已存在，重新输。");
		// continue;
		// }else {
		// System.out.println("输入名称");
		// String name = sc.next();
		// System.out.println("输入单价");
		// double pirce = sc.nextDouble();
		// list.
		// break;
		// }
		// }
	}

	public void upDelete(int id) {

	}

	public void change(Goods goods) {

	}

	public void showGoods(List<Goods> list) {

	}

	public Goods input(int id) {
		Goods goods = null;

		return goods;
	}

	public void mun() {
		System.out.println("1.新增商品");
		System.out.println("请选择菜单");
		int key = sc.nextInt();
		switch (key) {
		case 1:
		 System.out.println("请选择类别");
		 List<> cats = NongTools.readObjGoods(filegoods);
			break;
		case 2:
			
			break;
		default:
			break;
		}
	}
}