package questao1;

public class Cafeteria {
	private String tipoCafe; 
	private String nomeCliente; 
	private float valorCafe; 
	private String tamanhoCafe;
	
	public Cafeteria(String tipoCafe, String nomeCliente, float valorCafe, String tamanhoCafe) {
		super();
		this.tipoCafe = tipoCafe;
		this.nomeCliente = nomeCliente;
		this.valorCafe = valorCafe;
		this.tamanhoCafe = tamanhoCafe;
	}

	public Cafeteria ()
	{
		this.tipoCafe = " ";
		this.nomeCliente = " ";
		this.valorCafe = 0.0f;
		this.tamanhoCafe = " ";
	}
	
	public void mostraPedido ()
	{
		System.out.println("Nome cliente: " +nomeCliente);
		System.out.println("Tipo de cafe: " +tipoCafe);
		System.out.println("Valor do cafe: " +valorCafe);
		System.out.println("Tamanho escolhido: " +tamanhoCafe);
	}

	public String getTipoCafe() {
		return tipoCafe;
	}

	public void setTipoCafe(String tipoCafe) {
		this.tipoCafe = tipoCafe;
	}

	public String getNomeCliente() {
		return nomeCliente;
	}

	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}

	public float getValorCafe() {
		return valorCafe;
	}

	public void setValorCafe(float valorCafe) {
		this.valorCafe = valorCafe;
	}

	public String getTamanhoCafe() {
		return tamanhoCafe;
	}

	public void setTamanhoCafe(String tamanhoCafe) {
		this.tamanhoCafe = tamanhoCafe;
	} 
	
	
	
	
}
