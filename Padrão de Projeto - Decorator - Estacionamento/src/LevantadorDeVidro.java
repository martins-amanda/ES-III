
public class LevantadorDeVidro extends Acessorios {
	Automovel automovel;

	public LevantadorDeVidro(Automovel automovel) {

		this.automovel = automovel;
	}

	@Override
	public String getDescription() {

		return automovel.getDescription() + " Levantador de Vidro,";
	}

	@Override
	public double cost() {

		return 20.00 + automovel.cost();
	}
}
