package mi;

import java.util.ArrayList;
import java.util.List;

public class DataStore {
	public static List<HomeModel> Hmlist = new ArrayList<>();
	public static List<CarModel> Crlist = new ArrayList<>();
	
	static
	{
		HomeModel h1 = new HomeModel("Ϊ���ѡΪ��Ϊ��", 2300 , "ɳ�ӿ� - �Ҹ�e���ⷿ - �Ҹ�E�����ڰ��� ");
		HomeModel h2 = new HomeModel("�����൱���˵ķ���", 3600 , "������ - ����·�ⷿ - ���Ǻ����� ");
		HomeModel h3 = new HomeModel("�˿��˼�", 3300 , "ɳ�ӿ� - �˿��˼� - 4��");
		HomeModel h4 = new HomeModel("��һ��", 4300 , "���԰ - ������ - 1����¥ ");
		HomeModel h5 = new HomeModel("<��HOME>һһ��ɽС��", 3000 , "��ɽ - ����·�ⷿ - ����·С�� ");
		HomeModel h6 = new HomeModel("keylife��������", 1200 , "����԰�� - �������ⷿ - ����� ");
		
		Hmlist.add(h1);
		Hmlist.add(h2);
		Hmlist.add(h3);
		Hmlist.add(h4);
		Hmlist.add(h5);
		Hmlist.add(h6);
		
		CarModel c1 = new CarModel("�µ� Q7 2016�� 40 TFSI S Line�˶���" ,598000, "�ʾ������ڷ�������B��һ¥");
		CarModel c2 = new CarModel("���� GLK�� 2015�� GLK260 2.0T �Զ�" ,328000, "�����ʾ�������");
		CarModel c3 = new CarModel("�µ� A4L 2015�� 35TFSI 2.0T �Զ� ������" ,210000, "�����иʾ��������·550��");
		CarModel c4 = new CarModel("���� GL�� 2014�� GL350 3.0T �Զ�" ,828000, "����ʡ�����иʾ���������·492��");
		CarModel c5 = new CarModel("���� ������ 2012�� 3.5 �Զ� ����" ,568000, "��������԰�������г�����");
		CarModel c6 = new CarModel(" R�� 2014�� R320 4MATIC������" ,385000, "�������ں�����ɽ��·177������ѷ��");
		
		Crlist.add(c1);
		Crlist.add(c2);
		Crlist.add(c3);
		Crlist.add(c4);
		Crlist.add(c5);
		Crlist.add(c6);
		
	System.out.println("���ݼ������");
		
	}
	
}
