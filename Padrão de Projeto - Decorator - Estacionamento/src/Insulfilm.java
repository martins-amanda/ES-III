
public class Insulfilm extends Acessorios {
	Automovel automovel;

	public Insulfilm(Automovel automovel) {

		this.automovel = automovel;
	}

	@Override
	public String getDescription() {

		return automovel.getDescription() + "  Insufilm,";
	}

	@Override
	public double cost() {

		return 10.00 + automovel.cost();
	}

}
