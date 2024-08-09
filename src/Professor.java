import java.util.List;
import java.util.Scanner;

public class Professor {
    public int idProfessor;
    public String nome;

    public static List<Turma> turmas;

    public Professor() {}

    public Professor(int idProfessor, String nome, List<Turma> turmas) {
        this.idProfessor = idProfessor;
        this.nome = nome;
        this.turmas = turmas;
    }

    public static Professor cadastrarProfessor() {
        Scanner input = new Scanner(System.in);

        System.out.println("Informe o código do professor:");
        int idProfessor = input.nextInt();
        input.nextLine();

        System.out.println("Informe o nome do professor:");
        String nome = input.nextLine();

        System.out.println("Professor cadastrado!");

        Turma turma = new Turma();
        Turma turma1 = turma.cadastraTurma();
        turmas.add(turma1);
        Professor professor = new Professor(idProfessor, nome, turmas);

        return professor;

    }
}
