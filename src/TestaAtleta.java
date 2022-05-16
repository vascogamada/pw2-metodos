
public class TestaAtleta {
	
	public static void main(String[] args) {
		Atleta a1 = new Atleta();
		
		a1.altura = 1.74;
		a1.peso = 68;
		
		a1.obterIMC();
		a1.classificar();
		a1.obterRisco();
	}

}
