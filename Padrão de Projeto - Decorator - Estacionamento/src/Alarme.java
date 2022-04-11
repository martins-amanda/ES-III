
public class Alarme extends Acessorios {
	Automovel automovel;

	public Alarme(Automovel automovel) {

		this.automovel = automovel;
	}

	@Override
	public String getDescription() {

		return automovel.getDescription() + " Alarme,";
	}

	@Override
	public double cost() {

		return 115.00 + automovel.cost();
	}
}
