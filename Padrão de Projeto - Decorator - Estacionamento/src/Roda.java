
public class Roda extends Acessorios {
	Automovel automovel;

	public Roda(Automovel automovel) {

		this.automovel = automovel;
	}

	@Override
	public String getDescription() {

		return automovel.getDescription() + " Roda,";
	}

	@Override
	public double cost() {

		return 350.00 + automovel.cost();
	}

}
