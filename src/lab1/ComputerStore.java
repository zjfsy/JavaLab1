package lab1;

public class ComputerStore {
	public ComputerStore() {
		computer1=new Computer("Computer1", new Intel(), new Samsung(), new Seagate(), new Gigabyte());
		computer2=new Computer("Computer2", new AMD(), new Samsung(), new WestDigitals(), new Asus());
		computer3=new Computer("Computer3", new Intel(), new Kingston(), new WestDigitals(), new Asus());
	}
	public void show(Computer computer) {
		System.out.println(computer.getName()+":");
		computer.describe();
		System.out.println("Price:"+computer.getPrice());
		computer.work();
		System.out.println();
	}
	public void showStore() {
		show(computer1);
		show(computer2);
		show(computer3);
	}
	private Computer computer1;
	private Computer computer2;
	private Computer computer3;
}
