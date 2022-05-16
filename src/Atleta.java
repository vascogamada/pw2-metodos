
public class Atleta
{
	
	public double altura, peso, imc;
	
	public void obterIMC()
	{
		imc = peso / (altura*altura);
		
		System.out.printf("IMC = %.2f %n", imc);
	}
	
	public void classificar()
	{
		if(imc < 18.5) {
			System.out.println("Abaixo do peso.");
		}
		else if(imc >= 18.5 && imc <= 24.9) {
			System.out.println("Peso normal.");
		}
		else if(imc >= 25 && imc <= 29.9) {
			System.out.println("Pré-obesidade.");
		}
		else if(imc >= 30 && imc <= 34.9) {
			System.out.println("Obesidade Grau I");
		}
		else if(imc >= 35 && imc <= 39.9) {
			System.out.println("Obesidade Grau II");
		}
		else if(imc > 40) {
			System.out.println("Obesidade Grau III");
		}
		
	}
	
	public void obterRisco()
	{
		if(imc < 18.5) {
			System.out.println("Muito alto.");
		}
		else if(imc >= 18.5 && imc <= 24.9) {
			System.out.println("Baixo.");
		}
		else if(imc >= 25 && imc <= 29.9) {
			System.out.println("Médio.");
		}
		else if(imc >= 30 && imc <= 34.9) {
			System.out.println("Alto.");
		}
		else if(imc >= 35 && imc <= 39.9) {
			System.out.println("Muito alto.");
		}
		else if(imc > 40) {
			System.out.println("Muitíssimo alto.");
		}
	}

}
