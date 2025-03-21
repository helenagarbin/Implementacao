package implementandoregistroacademico;

public class RegistroAcademico {
	private String nomeAluno; 
	private int numeroMatricula;
	private boolean eBolsista; 
	
	
	public RegistroAcademico(String nomeAluno, int numeroMatricula, boolean eBolsista) {
		super();
		this.nomeAluno = nomeAluno;
		this.numeroMatricula = numeroMatricula;
		this.eBolsista = eBolsista;
	}
	
	
	public void calculaMensaldiade(float valormens)
	{	
		valormens = 1000; 
		if(eBolsista == true)
		{
			valormens = valormens/2; 
		}
		else
		{
			valormens = valormens; 
		}
		System.out.println("Valor mensalidade = " +valormens);
	}
	public void mostraRegistro()
	{
		System.out.println("Nome aluno: " +nomeAluno);
		System.out.println("Numero matricula: " +numeroMatricula);
		System.out.println("eBolsista: " +eBolsista);
	}

}
