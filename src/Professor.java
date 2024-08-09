package Main;

import java.util.Scanner;
public class Professor {

    public int idProfessor;
    public String nome;


    Professor() {

    }

    Professor(int idProfessor, String nome) {
        this.idProfessor = idProfessor;
        this.nome = nome;
    }

    public static void cadastrarProfessor() {
        Scanner input = new Scanner(System.in);

        System.out.println("Informe o código do professor:");
        int idProfessor = input.nextInt();
        input.nextLine();

        System.out.println("Informe o nome do professor:");
        String nome = input.nextLine();

        System.out.println("Professor cadastrado!");

    }

}
