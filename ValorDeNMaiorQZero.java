/*
 * ValorDeNMaiorQZero.java
 * 
 * 
 * 
 * 
 */

import java.util.Scanner;

public class ValorDeNMaiorQZero {
	
	public static void main (String[] args) {
		//Matheus de sousa do nascimento
		
		Scanner entrada = new Scanner (System.in);
		
		int x;
		
		do {
			
			System.out.print("Digite um numero positivo maior que zero: ");
			x = entrada.nextInt();
			
		}while(x <= 0);
		
		for (int i = 1;i <= x; i++){
			System.out.print(i+" ");
			}
	}
}

