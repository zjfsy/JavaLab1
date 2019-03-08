package lab1;

public abstract class MainBoard {
	public MainBoard() {

	}
	public void work() {
		System.out.println(name+" work");
	}
	public void setName(String name) {
		this.name=name;
	}
	public String getName() {
		return name;
	}
	public void setSpeed(int speed) {
		this.speed=speed;
	}
	public int getSpeed() {
		return speed;
	}
	public void setPrice(int price) {
		this.price=price;
	}
	public int getPrice() {
		return price;
	}
	private String name;
	private int speed;
	private int price;
}
