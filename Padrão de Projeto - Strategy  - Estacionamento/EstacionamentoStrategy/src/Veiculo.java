
public abstract class Veiculo {
	Estacionamento estacionamento;
	TiposDeLimpeza tiposDeLimpeza;
	String placa;

	public Veiculo() {
	}

	public void placa(String placa) {
		System.out.println("Placa: " + placa);

	}

	public void setEstacionamento(Estacionamento est) {
		estacionamento = est;
	}

	public void setTiposDeLimpeza(TiposDeLimpeza tdl) {
		tiposDeLimpeza = tdl;
	}

	abstract void display();

	public void estacionamento() {
		estacionamento.preco();
	}

	public void tiposDeLimpeza() {
		tiposDeLimpeza.descricao();
		tiposDeLimpeza.preco();
	}

}
