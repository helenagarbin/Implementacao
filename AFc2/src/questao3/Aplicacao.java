package questao3;

import java.util.Scanner;

public class Aplicacao {
	public static void main(String[] args) {
		String primeiroNome; 
		int numCaracteres; 
		String nomeCompleto; 
		int indiceUltimaLetra; 
		String nomeMaiusculo; 
		String nomeSubstituido; 
		
		Scanner teclado = new Scanner(System.in);
		
	    System.out.println("Informe seu nome completo: ");
	    nomeCompleto = teclado.nextLine();
	    System.out.println("Nome completo: " +nomeCompleto);
	    
	    numCaracteres = nomeCompleto.length(); 
	    System.out.println("Numero de caracteres:" +numCaracteres);
	    
	    primeiroNome = nomeCompleto.split(" " )[0]; 
	    System.out.println("Primeiro nome: " +primeiroNome);
	    
	    indiceUltimaLetra = primeiroNome.length() - 1; 
	    System.out.println("Indíce ultima letra: " +indiceUltimaLetra);
	    
	    nomeMaiusculo = nomeCompleto.toUpperCase(); 
	    System.out.println("Nome maiusculo: " +nomeMaiusculo);
	    
	    nomeSubstituido = nomeCompleto.replaceFirst(primeiroNome, "Teste"); 
	    System.out.println("Nome Substituido: " +nomeSubstituido);
	    
	    
	    
	    
	    
	 
	}
}
