package questao1;

public class Cinema {
	private String nomeFilme; 
	private int valorIngresso; 
	private int classificacao; 
	private boolean meiaEntrada;
	
	public Cinema(String nomeFilme, int valorIngresso, int classificacao, boolean meiaEntrada) {
		super();
		this.nomeFilme = nomeFilme;
		this.valorIngresso = valorIngresso;
		this.classificacao = classificacao;
		this.meiaEntrada = meiaEntrada;
	} 

	public Cinema()
	{
		this.nomeFilme = " "; 
		this.valorIngresso = 0; 
		this.classificacao = 0;
		this.meiaEntrada = false;  
	}

	public void mostraEstado()
	{
		System.out.println("Nome filme: " +nomeFilme);
		System.out.println("Valor ingresso: " +valorIngresso);
		System.out.println("Classificação: " +classificacao);
		System.out.println("É meia entrada? " +meiaEntrada);
	}
	public String getNomeFilme() {
		return nomeFilme;
	}

	public void setNomeFilme(String nomeFilme) {
		this.nomeFilme = nomeFilme;
	}

	public int getValorIngresso() {
		return valorIngresso;
	}

	public void setValorIngresso(int valorIngresso) {
		this.valorIngresso = valorIngresso;
	}

	public int getClassificacao() {
		return classificacao;
	}

	public void setClassificacao(int classificacao) {
		this.classificacao = classificacao;
	}

	public boolean isMeiaEntrada() {
		return meiaEntrada;
	}

	public void setMeiaEntrada(boolean meiaEntrada) {
		this.meiaEntrada = meiaEntrada;
	}
	
	
	

}
