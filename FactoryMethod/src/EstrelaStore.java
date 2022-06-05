
public class EstrelaStore extends SanduicheStore {

	Sanduiche createSanduiche(String item) {
		if (item.equals("natural")) {
			return new NaturalEstrela();
		} else if (item.equals("xEgg")) {
			return new XEggEstrela();
		} else if (item.equals("xSalada")) {
			return new XSaladaEstrela();
		} else if (item.equals("xTudo")) {
			return new XTudoEstrela();
		} else return null;
	}


}
