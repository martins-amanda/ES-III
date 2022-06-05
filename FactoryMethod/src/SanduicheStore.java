
public abstract class SanduicheStore {
	
	abstract Sanduiche createSanduiche(String item);
	
	public Sanduiche orderSanduiche(String type) {	
		Sanduiche sanduiche = createSanduiche(type);
		System.out.println("--- Making a " + sanduiche.getName() + " ---");
		sanduiche.prepare();
		sanduiche.mount();
		sanduiche.cut();
		sanduiche.box();
		return sanduiche;
}
}