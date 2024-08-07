package rAcademico;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Disciplina {

	int idDisciplina;
	String nomeDisciplina;
	int cargaHoraria;
	int creditos;
	
	Disciplina() {
	
	}
	
	Disciplina(int idDisciplina, String nomeDisciplina, int cargaHoraria, int creditos) {
		 this.idDisciplina = idDisciplina;
		 this.nomeDisciplina = nomeDisciplina;
		 this.cargaHoraria = cargaHoraria;
		 this.creditos = creditos;
	}
		    
	public static void cadastrarDisciplina() {
		    	
		Scanner input = new Scanner(System.in);
		
		System.out.println("Informe o código da disciplina:");
		int idDisciplina = input.nextInt();
		input.nextLine();
		
		System.out.println("Informe o nome da disciplina:");
		String nomeDisciplina = input.nextLine();
		
		System.out.println("Informe a carga horária da disciplina:");
		int cargaHoraria = input.nextInt();
		
		System.out.println("Informe os crédiots da disciplina:");
		int creditos = input.nextInt();
		
	}

	
}
