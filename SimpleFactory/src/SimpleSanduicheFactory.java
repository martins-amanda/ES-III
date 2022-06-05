
public class SimpleSanduicheFactory {

	public Sanduiche createSanduiche(String type) {
		Sanduiche sanduiche = null;

		if (type.equals("natural")) {
			sanduiche = new SanduicheNatural();
		} else if (type.equals("Xbacon")) {
			sanduiche = new XBacon();
		} else if (type.equals("Xegg")) {
			sanduiche = new XEgg();
		} else if (type.equals("Xsalada")) {
			sanduiche = new XSalada();
		} else if (type.equals("Xtudo")) {
			sanduiche = new XTudo();
		}

		return sanduiche;

	}
}
