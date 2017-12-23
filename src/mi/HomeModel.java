package mi;

public class HomeModel {
	private String name;
	private double price;
	private String locate;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getLocate() {
		return locate;
	}
	public void setLocate(String locate) {
		this.locate = locate;
	}
	public HomeModel(){
		
	}
	public HomeModel(String name , double price , String locate){
		
		this.name=name;
		this.price=price;
		this.locate=locate;
	}
	
	public String toString(){
		return ("商家:"+name+" 价格:"+price+" 地址位于:"+locate);
	}
}
