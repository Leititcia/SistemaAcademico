package Main;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
public class Disciplina {

    public int idDisciplina;
    public String nomeDisciplina;
    public int cargaHoraria;
    public List<Professor> professores;
    public List<Turma> turmas;

    public Disciplina(int idDisciplina, String nomeDisciplina, int cargaHoraria) {
        this.idDisciplina = idDisciplina;
        this.nomeDisciplina = nomeDisciplina;
        this.cargaHoraria = cargaHoraria;
        this.professores = new ArrayList<>();
        this.turmas = new ArrayList<>();
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


        return new Disciplina(idDisciplina, nomeDisciplina, cargaHoraria);
    }

}
