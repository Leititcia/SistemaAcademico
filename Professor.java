package rAcademico;

public class Professor {
	
    int idProfessor;
    String nome;
    String email;
    String dataNasc;
    String areaAtuacao;
    String titulacao;

    Professor() {

    }

    Professor(int idProfessor, String nome, String email, String dataNasc, String areaAtuacao, String titulacao) {
        this.idProfessor = idProfessor;
        this.nome = nome;
        this.email = email;
        this.dataNasc = dataNasc;
        this.areaAtuacao = areaAtuacao;
        this.titulacao = titulacao;
    }
    
     public static void cadastrarProfessor() {
    	
    }

}
