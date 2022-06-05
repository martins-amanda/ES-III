
public class SanduicheTestDrive {

	public static void main(String[] args) {
		SanduicheStore estrela = new EstrelaStore();
		SanduicheStore saldanha = new SaldanhaStore();

		Sanduiche sanduiche = estrela.orderSanduiche("xSalada");
		System.out.println("Ana pediu um " + sanduiche.getName() + "\n");
		
		sanduiche = saldanha.orderSanduiche("xTudo");
		System.out.println("João pediu um " + sanduiche.getName() + "\n");
		
		sanduiche= estrela.orderSanduiche("natural");
		System.out.println("Gabi pediu um " + sanduiche.getName() + "\n");
		
		sanduiche = saldanha.orderSanduiche("xEgg");
		System.out.println("Lucas pediu um " + sanduiche.getName() + "\n");
		
		
	}

}
