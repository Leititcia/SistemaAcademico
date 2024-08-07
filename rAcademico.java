package rAcademico;
import java.util.Scanner; // programa utiliza a classe Scanner

public class rAcademico {

	public static void main(String[] args) {
		
		// cria um Scanner para obter entrada a partir da janela de comando
		Scanner input = new Scanner(System.in);
				
		
		System.out.println("*******************************");
		System.out.println("Bem-vindo ao Sistema Acadêmico!");
		System.out.println("*******************************");
		
		System.out.println("\nSelecione uma opção:");
		System.out.println("1. Cadastrar disciplina");
		System.out.println("2. Associar professor a disciplina");
		System.out.println("3. Listar turmas por disciplina");
		
		int op = input.nextInt();
		
		if (op == 1) {
			
			System.out.println("\n---------------------------------");
			Disciplina.cadastrarDisciplina();
			System.out.println("---------------------------------\n");
			
		} else if (op == 2) {
			
			Professor.cadastrarProfessor();
			
		} else if (op == 3) {
			
			Turma.listarTurmas();
			
		} else {
			System.out.println("Escolha uma opção válida.");
		}
		
		
	}
	
}
