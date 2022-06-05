import java.util.ArrayList;

public abstract class Sanduiche {
	String name;
	String bread;
	String sauce;
	ArrayList toppings = new ArrayList();

	public String getName() {
		return name;
	}

	public void prepare() {
		System.out.println("Preparing " + name);
		System.out.println("Tossing dough...");
		System.out.println("Adding sauce...");
		System.out.println("Adding toppings: ");
		for (int i = 0; i < toppings.size(); i++) {
			System.out.println("   " + toppings.get(i));
		}
	}

	public void mount() {
		System.out.println("Mouting " + name);
	
	}

	public void cut() {
		System.out.println("Cutting " + name);
	}

	public void box() {
		System.out.println("Boxing " + name);
	}
	
	public String toString() {

		StringBuffer display = new StringBuffer();
		display.append("----" + name + "----\n");
		display.append(bread + "\n");
		display.append(sauce + "\n");
		for (int i = 0; i < toppings.size(); i++) {
			display.append((String) toppings.get(i) + "\n");
		}
		return display.toString();
	}

}
