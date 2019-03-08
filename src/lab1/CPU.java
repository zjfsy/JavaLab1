package lab1;

public abstract class CPU {
	public CPU() {
		
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
	public void setPrice(int price) {
		this.price=price;
	}
	public int getPrice() {
		return price;
	}
	public void setCore(int core) {
		this.core = core;
	}
	public int getCore() {
		return core;
	}
	private String name;
	private int core;
	private int price;
}
