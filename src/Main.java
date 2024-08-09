import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // cria um Scanner para obter entrada a partir da janela de comando
        Scanner input = new Scanner(System.in);

        do {

            System.out.println("*******************************");
            System.out.println("Bem-vindo ao Sistema Acadêmico!");
            System.out.println("*******************************");

            System.out.println("\nSelecione uma opção:");
            System.out.println("1. Cadastrar disciplina");
            System.out.println("2. Cadastrar professor e associar à disciplina");
            System.out.println("3. Listar turmas por disciplina");
            System.out.println("4. Sair\n");

            int op = input.nextInt();

            List<Disciplina> disciplinaList = null;
            if (op == 1) {

                Disciplina disciplina = new Disciplina();

                System.out.println("\n---------------------------------");
                disciplina.cadastrarDisciplina();
                System.out.println("---------------------------------\n");

            } else if (op == 2) {
                System.out.println("\n---------------------------------");
                Professor.cadastrarProfessor();
                System.out.println("\n---------------------------------");
            } else if (op == 3) {
                System.out.println("\n---------------------------------");
                Turma.listarTurmas(disciplinaList);
                System.out.println("\n---------------------------------");
            } else if (op == 4) {
                System.exit(0);
            } else {
                System.out.println("Escolha uma opção válida.");
            }

        } while(true);


    }




}
