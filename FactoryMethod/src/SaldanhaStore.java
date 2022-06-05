
public class SaldanhaStore extends SanduicheStore{

	
	Sanduiche createSanduiche(String item) {
		if (item.equals("natural")) {
			return new NaturalSaldanha();
		} else if (item.equals("xEgg")) {
			return new XEggSaldanha();
		} else if (item.equals("xSalada")) {
			return new XSaladaSaldanha();
		} else if (item.equals("xTudo")) {
			return new XTudoSaldanha();
		} else return null;
	}

}
