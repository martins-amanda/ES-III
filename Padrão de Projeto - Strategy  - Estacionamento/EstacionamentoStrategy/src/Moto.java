
public class Moto extends Veiculo {

	public Moto() {
		estacionamento = new QuinzeMinutos();
		tiposDeLimpeza = new Completa();
	}

	@Override
	void display() {
		System.out.println("Moto");
	}

}
