
public class ArCondicionado extends Acessorios {
	Automovel automovel;

	public ArCondicionado(Automovel automovel) {

		this.automovel = automovel;
	}

	@Override
	public String getDescription() {

		return automovel.getDescription() + " Ar Condicionado,";
	}

	@Override
	public double cost() {

		return 215.00 + automovel.cost();
	}

}
