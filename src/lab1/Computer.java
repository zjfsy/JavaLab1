package lab1;

public class Computer {
	public Computer(String name,CPU cpu,Memory memory,HardDisk hardDisk,MainBoard mainBoard) {
		this.name=name;
		this.cpu=cpu;
		this.mem=memory;
		this.hd=hardDisk;
		this.mb=mainBoard;
	}
	public String getName() {
		return name;
	}
	public void describe() {
		System.out.println("CPU:"+cpu.getName());
		System.out.println("Memory:"+mem.getName());
		System.out.println("HardDisk:"+hd.getName());
		System.out.println("MainBoard:"+mb.getName());
	}
	public void work() {
		cpu.work();
		mem.work();
		hd.work();
		mb.work();
	}
	public int getPrice() {
		return cpu.getPrice()+mem.getPrice()+hd.getPrice()+mb.getPrice();
	}
	private String name;
	private CPU cpu;
	private Memory mem;
	private HardDisk hd;
	private MainBoard mb;
}
