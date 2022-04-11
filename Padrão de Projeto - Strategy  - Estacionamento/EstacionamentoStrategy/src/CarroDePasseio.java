
public class CarroDePasseio extends Veiculo {

	public CarroDePasseio() {
		estacionamento = new Mensal();
		tiposDeLimpeza = new LavagemDeMotor();
	}

	@Override
	void display() {
		System.out.println("Carro de Passeio");

	}

}
