package lab1;

public abstract class HardDisk {
	public HardDisk() {

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
	public void setVolume(int volume) {
		this.volume=volume;
	}
	public int getVolume() {
		return volume;
	}
	public void setPrice(int price) {
		this.price=price;
	}
	public int getPrice() {
		return price;
	}
	private String name;
	private int volume;
	private int price;
}
