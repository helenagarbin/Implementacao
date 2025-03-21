package questao2;

import java.util.Scanner;

public class Aplicacao {
	
		public static void main(String[] args) {
		
		int num1; 
		int num2; 
		
		Scanner teclado = new Scanner (System.in); 
		
		System.out.println("Digite o primeiro número: ");
		num1 = teclado.nextInt();
		
		System.out.println("Digite o segundo número: ");
		num2 = teclado.nextInt(); 
		
		String binario1 = Integer.toBinaryString(num1); 
		String binario2 = Integer.toBinaryString(num2); 
		
		System.out.println("Primeiro num em binário: " +binario1);
		System.out.println("Segundo num em binário: " +binario2);
		
		teclado.close();
		
		}
	}

