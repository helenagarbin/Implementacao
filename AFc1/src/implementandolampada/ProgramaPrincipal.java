package implementandolampada;

public class ProgramaPrincipal {
	public static void main(String[] args) {
		Lampada lamp2 = new Lampada (null);
		Lampada lamp3 = new Lampada (null); 
		Lampada lamp1 = new Lampada ("Acesa"); 
		
		lamp1.mostraEstado();
		lamp2.mostraEstado();
		lamp3.mostraEstado();
		
		lamp3.acende();
		lamp3.mostraEstado();
	}
}

