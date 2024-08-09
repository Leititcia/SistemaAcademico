import java.util.List;
import java.util.Scanner;

public class Turma {
    public String nomeTurma;

    public Turma() {

    }
    public Turma(String nomeTurma) {
        this.nomeTurma = nomeTurma;
    }

    public Turma cadastraTurma() {
        Scanner input = new Scanner(System.in);

        System.out.println("Nome dessa turma suja e fedida: ");
        String nomeTurma = input.nextLine();

        Turma turma = new Turma(nomeTurma);

        return turma;
    }

    public static void listarTurmas(List<Disciplina> disciplinas) {
        if (!disciplinas.isEmpty()) {
            System.out.println("Turmas para a disciplina :");
             for (Disciplina disciplina : disciplinas) {
                for (Turma turma : disciplina.professor.turmas) {
                    System.out.println("Turma: " + turma.nomeTurma +
                            ", Professor: " + disciplina.professor.nome);
                }
            }
        }else {

            System.out.println("Não há turmas cadastradas");
        }
    }

}
