package questao1;

public class Academia {
	private String nomeCliente; 
	private String planoEscolhido; 
	private float valorPlano; 
	private boolean planoPromocional;
	
	public Academia(String nomeCliente, String planoEscolhido, float valorPlano, boolean planoPromocional) {
		super();
		this.nomeCliente = nomeCliente;
		this.planoEscolhido = planoEscolhido;
		this.valorPlano = valorPlano;
		this.planoPromocional = planoPromocional;
	} 
	
	public Academia ()
	{
		this.nomeCliente = nomeCliente; 
		this.valorPlano = 100f; 
		this.planoPromocional = false; 
	}

	
	public void mostraPlano()
	{
		System.out.println("Nome do Cliente: " +nomeCliente);
		System.out.println("Plano Escolhido (Anual/Mensal):" +planoEscolhido);
		System.out.println("Valor Plano: " +valorPlano);
		System.out.println("Plano Promocional? " +planoPromocional);
	}

	public String getNomeCliente() {
		return nomeCliente;
	}

	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}

	public String getPlanoEscolhido() {
		return planoEscolhido;
	}

	public void setPlanoEscolhido(String planoEscolhido) {
		this.planoEscolhido = planoEscolhido;
	}

	public float getValorPlano() {
		return valorPlano;
	}

	public void setValorPlano(float valorPlano) {
		this.valorPlano = valorPlano;
	}

	public boolean isPlanoPromocional() {
		return planoPromocional;
	}

	public void setPlanoPromocional(boolean planoPromocional) {
		this.planoPromocional = planoPromocional;
	}
	
	
	

}
