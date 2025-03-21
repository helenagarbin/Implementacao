package implementandocontabancaria;

public class ContaBancaria {

	private String nomeCorrentista; 
	private float saldo; 
	private boolean contaEspecial;
	
	
	public ContaBancaria(String nomeCorrentista, float saldo, boolean contaEspecial) {
		super();
		this.nomeCorrentista = nomeCorrentista;
		this.saldo = saldo;
		this.contaEspecial = contaEspecial;
	}
	
	public void deposita(float valordep)
	{
		this.saldo = this.saldo + valordep; 
	}
	public void reitra(float valorret)
	{
		float saldoaux = saldo - valorret; 
		
		if(saldoaux<0)
		{
			System.out.println("Saldo Insuficiente");
		}
		else 
		{
			this.saldo = this.saldo - valorret; 
		}
	}
	public void mostraDados()
	{
		System.out.println("Nome correntista: " +nomeCorrentista);
		System.out.println("Saldo Atual: " +saldo);
		System.out.println("Conta Especial? " +contaEspecial);
	}

	public String getNomeCorrentista() {
		return nomeCorrentista;
	}

	public void setNomeCorrentista(String nomeCorrentista) {
		this.nomeCorrentista = nomeCorrentista;
	}

	public float getSaldo() {
		return saldo;
	}

	public void setSaldo(float saldo) {
		this.saldo = saldo;
	}

	public boolean isContaEspecial() {
		return contaEspecial;
	}

	public void setContaEspecial(boolean contaEspecial) {
		this.contaEspecial = contaEspecial;
	}
	
}
