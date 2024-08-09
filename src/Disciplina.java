import java.util.List;
import java.util.Scanner;

public class Disciplina {
    public int idDisciplina;
    public String nomeDisciplina;
    public int cargaHoraria;

    public Professor professor;

    public Disciplina() {

    }

    public Disciplina(int idDisciplina, String nomeDisciplina, int cargaHoraria, Professor professor) {
        this.idDisciplina = idDisciplina;
        this.nomeDisciplina = nomeDisciplina;
        this.cargaHoraria = cargaHoraria;
        this.professor = professor;
    }

    public static Disciplina cadastrarDisciplina() {

        Scanner input = new Scanner(System.in);

        System.out.println("Informe o código da disciplina:");
        int idDisciplina = input.nextInt();
        input.nextLine();

        System.out.println("Informe o nome da disciplina:");
        String nomeDisciplina = input.nextLine();

        System.out.println("Informe a carga horária da disciplina:");
        int cargaHoraria = input.nextInt();

        System.out.println("Disciplina cadastrada!");

        Professor professor1 = Professor.cadastrarProfessor();

        return new Disciplina(idDisciplina, nomeDisciplina, cargaHoraria, professor1);
    }
}
