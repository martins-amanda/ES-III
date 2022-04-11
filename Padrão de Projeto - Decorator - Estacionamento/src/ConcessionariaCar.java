
public class ConcessionariaCar {

	public static void main(String[] args) {
		Automovel automovel = new Fox();
		System.out.println(automovel.getDescription() + " \n=> $" + automovel.cost());

		Automovel automovel2 = new Gol();
		automovel2 = new Radio(automovel2);
		automovel2 = new Insulfilm(automovel2);
		automovel2 = new Roda(automovel2);
		System.out.println(automovel2.getDescription() + "\n=> $" + automovel2.cost());

		Automovel automovel3 = new HRV();
		automovel3 = new Multimidia(automovel3);
		automovel3 = new Twitter(automovel3);
		System.out.println(automovel3.getDescription() + "\n=> $" + automovel3.cost());

		Automovel automovel4 = new WRV();
		automovel4 = new AltoFalante(automovel4);
		automovel4 = new Alarme(automovel4);
		System.out.println(automovel4.getDescription() + " \n=> $" + automovel4.cost());

		Automovel automovel5 = new Yaris();
		automovel5 = new ArCondicionado(automovel5);
		automovel5 = new Desembacador(automovel5);
		automovel5 = new LevantadorDeVidro(automovel5);
		System.out.println(automovel5.getDescription() + "\n=> $" + automovel5.cost());

	}

}
