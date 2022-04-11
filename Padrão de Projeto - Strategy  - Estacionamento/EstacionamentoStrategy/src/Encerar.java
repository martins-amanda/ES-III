
public class Encerar implements TiposDeLimpeza {
	String descricao;

	@Override
	public void preco() {
		System.out.println("Preço: R$ 220");
	}

	@Override
	public void descricao() {
		System.out.println("Desc: Encerar");

	}

}
