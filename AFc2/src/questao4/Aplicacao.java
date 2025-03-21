package questao4;

import java.util.Scanner;

public class Aplicacao {

	public static void main(String[] args) {
		String nomePac; 
		String enderecoPac; 
		int idadePac; 
		float alturaPac; 
		float pesoPac; 
		
		Scanner teclado = new Scanner(System.in); 
		
		System.out.println("Informe seu nome: ");
		nomePac = teclado.nextLine(); 
		
		System.out.println("Informe sua idade: ");
		idadePac = teclado.nextInt(); 
		
		System.out.println("Informe seu endereço: ");
		enderecoPac = teclado.nextLine(); 
		
		teclado.nextLine(); 
		
		System.out.println("Informe seu peso: ");
		pesoPac = teclado.nextFloat(); 
		
		System.out.println("Informe sua altura: ");
		alturaPac = teclado.nextFloat(); 
		
		teclado.close(); 
		
		Paciente pac1 = new Paciente(nomePac, enderecoPac, idadePac, alturaPac, pesoPac); 
		System.out.println(pac1);
	
	}
	
}
