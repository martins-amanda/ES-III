
public class Desembacador extends Acessorios {
	Automovel automovel;

	public Desembacador(Automovel automovel) {

		this.automovel = automovel;
	}

	@Override
	public String getDescription() {

		return automovel.getDescription() + " Desemba�ador, ";
	}

	@Override
	public double cost() {

		return 115.00 + automovel.cost();
	}
}
