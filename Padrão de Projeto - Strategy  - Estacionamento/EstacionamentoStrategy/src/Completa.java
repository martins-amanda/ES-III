
public class Completa implements TiposDeLimpeza {
	String descricao;

	@Override
	public void preco() {
		System.out.println("Preço: R$ 200");
	}

	@Override
	public void descricao() {
		System.out.println("Desc: Limpeza completa");

	}

}
