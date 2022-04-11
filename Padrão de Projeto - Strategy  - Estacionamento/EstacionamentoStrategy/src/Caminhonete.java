
public class Caminhonete extends Veiculo {

	public Caminhonete() {
		estacionamento = new TrintaMinutos();
		tiposDeLimpeza = new Carioca();
	}

	@Override
	void display() {
		System.out.println("Caminhonete");
	}

}
