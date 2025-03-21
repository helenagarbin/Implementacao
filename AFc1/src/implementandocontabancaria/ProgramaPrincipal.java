package implementandocontabancaria;

public class ProgramaPrincipal {
	public static void main(String[] args) {
		
	ContaBancaria nome1 = new ContaBancaria("Helena", 500, true); 
	nome1.deposita(0);
	nome1.reitra(500);
	nome1.mostraDados(); 
	
	}

}
