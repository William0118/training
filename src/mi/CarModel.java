package mi;

public class CarModel {
	private String brand;
	private double price;
	private String address;
	public CarModel(){
		
	}
	public CarModel(String brand , double price , String address){
		
		this.brand=brand;
		this.price=price;
		this.address=address;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String toString(){
		return ("品牌:"+brand+" 价位:"+price+" 地址:"+address);
	}
}
