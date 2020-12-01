package curso_java;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;


public class curso {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Digite a quantidade de alunos que vocẽ quer registrar as notas: ");
		int num = input.nextInt();
		
		Alunos[] aluno = new Alunos[num];
		List <Alunos> lista_alunos= new ArrayList<Alunos>();
		
		
		for (int cont = 0; cont < aluno.length; cont++) {
			
			aluno[cont] = new Alunos();
			
			System.out.printf("Aluno #%d\n", cont+1);
			System.out.print("Id: ");
			int id = input.nextInt(); input.nextLine();
			aluno[cont].setId(id);
			System.out.print("Nome: ");
			String nome = input.nextLine();
			aluno[cont].setNome(nome);
			System.out.print("Digite a quantidade de notas que você quer registrar: ");
			int num_not = input.nextInt();
			
			double[] notas = new double[num_not];
			
			for (int cont2 = 0; cont2 < notas.length; cont2++) {
				
				System.out.printf("Digite a Nota %d: ", cont+1);
				notas[cont2] = input.nextDouble();
				
				
			}
			
			lista_alunos.add(aluno[cont]);
			
			System.out.printf("\n");
			
		}
		
		for (int cont = 0; cont < aluno.length; cont++) {
			
			System.out.printf("%d, %s, %.2f", lista_alunos.get(cont).getId(), lista_alunos.get(cont).getName(), lista_alunos.get(cont).getMedia());
			
		}

		input.close();
	}

}
