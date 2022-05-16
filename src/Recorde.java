
public class Recorde 
{
	public TipoRecordeEnum tipo;
	public int valor;
	
	public void Recorde(TipoRecordeEnum tipo)
	{
		this.tipo = tipo;
	}
	
	public void obterResultado(int valor)
	{
		if(valor <= 95)
		{
			System.out.println(tipo.MUNDIAL);
		}
		else
		{
			System.out.println("*");
		}
		
		if(valor <=98)
		{
			System.out.println(tipo.OLIMPICO);
		}
		else
		{
			System.out.println("*");
		}
	}
}
