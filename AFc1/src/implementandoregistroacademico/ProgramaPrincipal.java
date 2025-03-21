package implementandoregistroacademico;

public class ProgramaPrincipal {

	public static void main(String[] args) {
		RegistroAcademico aluno1 = new RegistroAcademico("Helena", 3333, true);
		aluno1.calculaMensaldiade(0);
		aluno1.mostraRegistro();
		
	}
}
