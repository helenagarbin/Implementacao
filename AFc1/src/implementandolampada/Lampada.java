package implementandolampada;

public class Lampada {
	private String estadoDaLampada;

	public Lampada(String estadoDaLampada) {
		super();
		this.estadoDaLampada = estadoDaLampada;
		estadoDaLampada = "Apagada"; //inicialmente apaga 
	} 
	
	public void acende()
	{
		estadoDaLampada = "Acesa"; 
	}
	public void apaga()
	{
		estadoDaLampada = "Apagada"; 
	}
	public void mostraEstado()
	{
		System.out.println("Estado da Lampada: " +estadoDaLampada);
	}

	public String getEstadoDaLampada() {
		return estadoDaLampada;
	}

	public void setEstadoDaLampada(String estadoDaLampada) {
		this.estadoDaLampada = estadoDaLampada;
	}
	
	

}
