package cn.com.dlsp31zm;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class CategroyMsg {
	List<Categroy> cats = new ArrayList<>();
	File file = new File("E:\\java测试\\数据保存\\商店测试.txt");

	public void init() {
		Categroy cat1 = new Categroy(1, "蔬菜");
		Categroy cat2 = new Categroy(2, "水果");

		cats.add(cat1);
		cats.add(cat2);
		NongTools.writeObj(file, cats);
	}

	public void addCategroy(Categroy cat) {
		List<Categroy> lists = NongTools.readObj(file);
		lists.add(cat);
		NongTools.writeObj(file, lists);
	}

	public Categroy getCategroycname(String cname) {
		Categroy cat = null;
		List<Categroy> lists = NongTools.readObj(file);
		for (Categroy c : lists) {
			c.getCname().equals(cname);
			cat = c;
		}
		return cat;
	}

	public void deleteCategroyById(int id) {
		List<Categroy> lists = NongTools.readObj(file);
		lists.remove(id);
		NongTools.writeObj(file, lists);
	}

	public void showCategroy() {
		List<Categroy> lists = NongTools.readObj(file);
		for (Categroy c : lists) {
			System.out.println(c.getCid() + "\t" + c.getCname());
		}
	}

	public void updatecategroy(Categroy cat) {
		List<Categroy> lists = NongTools.readObj(file);
		for (int i = 0; i < lists.size(); i++) {
			if (lists.get(i).getCid() == cat.getCid()) {
				lists.get(i).setCname(cat.getCname());
				break;
			}

		}
		NongTools.writeObj(file, lists);
	}
}
