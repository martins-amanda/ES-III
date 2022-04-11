
public class MiniEstacionamentoSimulator {

	public static void main(String[] args) {
		Veiculo caminhao = new Caminhao();
		Veiculo moto = new Moto();
		Veiculo carro = new CarroDePasseio();
		Veiculo caminhonete = new Caminhonete();

		caminhao.display();
		caminhao.placa("ABC123");
		caminhao.estacionamento();
		caminhao.tiposDeLimpeza();
		System.out.println("-----------------");
		caminhao.setEstacionamento(new QuinzeMinutos());
		caminhao.estacionamento();
		System.out.println("-----------------");
		caminhao.setTiposDeLimpeza(new Completa());
		caminhao.tiposDeLimpeza();
		System.out.println("-----------------");

		moto.display();
		moto.placa("MOTO123");
		moto.estacionamento();
		moto.tiposDeLimpeza();
		System.out.println("-----------------");

		carro.display();
		carro.placa("CAR123");
		carro.estacionamento();
		carro.tiposDeLimpeza();
		System.out.println("-----------------");

		caminhonete.display();
		caminhonete.placa("CAM123");
		caminhonete.estacionamento();
		caminhonete.tiposDeLimpeza();
		System.out.println("-----------------");
	}

}
