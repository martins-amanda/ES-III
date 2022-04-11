
public class Twitter extends Acessorios {
	Automovel automovel;

	public Twitter(Automovel automovel) {

		this.automovel = automovel;
	}

	@Override
	public String getDescription() {

		return automovel.getDescription() + " Twiter,";
	}

	@Override
	public double cost() {

		return 110.00 + automovel.cost();
	}
}
