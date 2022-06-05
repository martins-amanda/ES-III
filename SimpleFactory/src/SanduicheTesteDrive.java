
public class SanduicheTesteDrive {

	public static void main(String[] args) {
	
		SimpleSanduicheFactory factory = new SimpleSanduicheFactory();
		SanduicheStore store = new SanduicheStore(factory);
		
		Sanduiche sanduiche = store.orderSanduiche("natural");
		System.out.println("Nos queremos um " + sanduiche.getName() + "\n");
	
		
		sanduiche = store.orderSanduiche("Xbacon");
		System.out.println("Nos queremos um " + sanduiche.getName() + "\n");
	}

}
