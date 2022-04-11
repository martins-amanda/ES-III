
public class Radio extends Acessorios {
	Automovel automovel;

	public Radio(Automovel automovel) {

		this.automovel = automovel;
	}

	@Override
	public String getDescription() {

		return automovel.getDescription() + " Radio,";
	}

	@Override
	public double cost() {

		return 95.00 + automovel.cost();
	}
}
