package br.com.dio.desafio;
import java.time.LocalDate;

import br.com.dio.desafio.GFT.Curso;
import br.com.dio.desafio.GFT.Mentoria;

public class Main {

	public static void main(String[] args) {
		
		Curso curso1 = new Curso();
		curso1.setTitulo("curso Java Script");
		curso1.setDescricao("Descri��o: Curso Java Script");
		curso1.setCargaHoraria(4);
		System.out.println(curso1);
		
		Curso curso2 = new Curso();
		curso2.setTitulo("curso Java");
		curso2.setDescricao("Descri��o: Curso Java");
		curso2.setCargaHoraria(8);
		System.out.println(curso2);
		
		Mentoria mentoria1 = new Mentoria();
		mentoria1.setTitulo("Mentoria de Java");
		mentoria1.setDescricao("Descri��o: Mentoria Java");
		mentoria1.setData(LocalDate.now());
		System.out.println(mentoria1);
		

		
	}

}
