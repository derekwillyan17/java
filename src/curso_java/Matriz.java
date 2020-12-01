package curso_java;

import java.util.Scanner;

public class Matriz {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in); 
		
		System.out.print("Digite o tamanho da matriz: ");
		int num = input.nextInt();
		
		int[][] matriz = new int[num][num];
		
		int aux = 0;
		
		for (int linha = 0; linha < matriz.length; linha++) {
			
			for (int coluna = 0; coluna < matriz.length; coluna++) {
				
				matriz[linha][coluna] = input.nextInt();
				
				if (matriz[linha][coluna] < 0) {
					
					aux ++;
					
				}
				
			}
			
		}
		
		System.out.printf("Main Diagonal:\n");
		
		for (int cont = 0; cont < matriz.length; cont++) {
			
			System.out.printf("%d ", matriz[cont][cont]);
			
		}
		
		System.out.printf("\n");
		System.out.printf("Negative Numbers:\n");
		System.out.printf("%d", aux);
		
		input.close();
		
	}

}
