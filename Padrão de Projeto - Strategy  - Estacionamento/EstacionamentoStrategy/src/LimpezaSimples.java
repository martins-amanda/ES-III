
public class LimpezaSimples implements TiposDeLimpeza {
	@Override
	public void descricao() {

		System.out.println("Desc: Limpeza simples");
	}

	@Override
	public void preco() {
		System.out.println("Pre�o: R$ 50,00");
	}

}
