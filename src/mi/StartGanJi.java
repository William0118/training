package mi;

public class StartGanJi {
	public static void main(String[] args) {
		DataStore d = new DataStore();
		DataStore d1 = new DataStore();
		//ֻ����һ������װ��
		Paper<HomeModel> h = new Paper<>();
		h.browsePage(1, DataStore.Hmlist);
		System.out.println(h.getData());
		
		System.out.println("                 --------------------------------------------------------------------------");
		
		Paper<CarModel> c = new Paper<>();
		c.browsePage(2, DataStore.Crlist);
		System.out.println(c.getData());
	}
}
