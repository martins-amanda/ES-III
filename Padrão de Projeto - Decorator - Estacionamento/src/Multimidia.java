
public class Multimidia extends Acessorios {
	Automovel automovel;

	public Multimidia(Automovel automovel) {

		this.automovel = automovel;
	}

	@Override
	public String getDescription() {

		return automovel.getDescription() + "  Multimidia,";
	}

	@Override
	public double cost() {

		return 155.00 + automovel.cost();
	}
}
