package br.com.hackaton.palindromo;

import java.util.Scanner;

public class Palindromo {
	
		public static void main(String[] args) {
			
			Integer opcao;
			
			Scanner input = new Scanner(System.in);
			
			do {
				System.out.println("1. Informar palavra");
				System.out.println("2. Sair");
				
				opcao = input.nextInt();
				
				switch (opcao) {
				case 1:
					System.out.printf("Palavra: ");
					
					StringBuilder palavra = new StringBuilder(input.next());
					
					for (int i = palavra.length()-2; i >= 0; i--) {
						for (int j = i + 1; j < palavra.length(); j++) {
							if(palavra.charAt(j) == palavra.charAt(i)) {
								palavra.deleteCharAt(j);
								palavra.deleteCharAt(i);
							
								break;
							}
						}
					}
					
					if(palavra.length() == 0 || palavra.length() == 1) {
						System.out.println("true");
					}else {
						System.out.println("false");
					}
					
					break;
				}
				
			}while(opcao != 2);
			
		}
}