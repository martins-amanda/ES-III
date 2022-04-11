
public class AltoFalante extends Acessorios {
	Automovel automovel;

	public AltoFalante(Automovel automovel) {

		this.automovel = automovel;
	}

	@Override
	public String getDescription() {

		return automovel.getDescription() + " Alto Falante, ";
	}

	@Override
	public double cost() {

		return 100.00 + automovel.cost();
	}
}
