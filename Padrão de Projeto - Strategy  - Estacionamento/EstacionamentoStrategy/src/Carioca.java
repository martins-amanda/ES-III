
public class Carioca implements TiposDeLimpeza {
	String descricao;

	@Override
	public void preco() {
		System.out.println("Pre�o: R$ 45,00");
	}

	@Override
	public void descricao() {
		System.out.println("Desc: Carioca");
		
	}
}
