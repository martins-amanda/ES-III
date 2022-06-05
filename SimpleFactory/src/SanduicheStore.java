
public class SanduicheStore {
	SimpleSanduicheFactory factory;

	public SanduicheStore(SimpleSanduicheFactory factory) {
		this.factory = factory;
	}

	public Sanduiche orderSanduiche(String type) {
		Sanduiche sanduiche;

		sanduiche = factory.createSanduiche(type);
		sanduiche.prepare();
		sanduiche.mount();
		sanduiche.cut();
		sanduiche.box();
		sanduiche.toppings();

		return sanduiche;
	}

}
