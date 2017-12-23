package mi;

import java.util.ArrayList;
import java.util.List;

public class DataStore {
	public static List<HomeModel> Hmlist = new ArrayList<>();
	public static List<CarModel> Crlist = new ArrayList<>();
	
	static
	{
		HomeModel h1 = new HomeModel("为你而选为你为家", 2300 , "沙河口 - 幸福e家租房 - 幸福E家五期八区 ");
		HomeModel h2 = new HomeModel("艺墅相当便宜的房子", 3600 , "开发区 - 海滨路租房 - 红星海艺墅 ");
		HomeModel h3 = new HomeModel("宜客宜家", 3300 , "沙河口 - 宜客宜家 - 4期");
		HomeModel h4 = new HomeModel("软景一期", 4300 , "软件园 - 软景中心 - 1期五楼 ");
		HomeModel h5 = new HomeModel("<优HOME>一一景山小区", 3000 , "中山 - 中南路租房 - 中南路小区 ");
		HomeModel h6 = new HomeModel("keylife青年社区", 1200 , "高新园区 - 龙王塘租房 - 玲珑居 ");
		
		Hmlist.add(h1);
		Hmlist.add(h2);
		Hmlist.add(h3);
		Hmlist.add(h4);
		Hmlist.add(h5);
		Hmlist.add(h6);
		
		CarModel c1 = new CarModel("奥迪 Q7 2016款 40 TFSI S Line运动型" ,598000, "甘井子区亿丰汽车城B区一楼");
		CarModel c2 = new CarModel("奔驰 GLK级 2015款 GLK260 2.0T 自动" ,328000, "大连甘井子区后");
		CarModel c3 = new CarModel("奥迪 A4L 2015款 35TFSI 2.0T 自动 舒适型" ,210000, "大连市甘井子区虹城路550号");
		CarModel c4 = new CarModel("奔驰 GL级 2014款 GL350 3.0T 自动" ,828000, "辽宁省大连市甘井子区华北路492号");
		CarModel c5 = new CarModel("丰田 埃尔法 2012款 3.5 自动 尊贵版" ,568000, "长春市绿园区华港市场对面");
		CarModel c6 = new CarModel(" R级 2014款 R320 4MATIC商务型" ,385000, "沈阳市于洪区昆山西路177号亚马逊名");
		
		Crlist.add(c1);
		Crlist.add(c2);
		Crlist.add(c3);
		Crlist.add(c4);
		Crlist.add(c5);
		Crlist.add(c6);
		
	System.out.println("数据加载完成");
		
	}
	
}
