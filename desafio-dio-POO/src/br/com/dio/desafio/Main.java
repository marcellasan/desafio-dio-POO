package br.com.dio.desafio;
import java.time.LocalDate;

import br.com.dio.desafio.GFT.Bootcamp;
import br.com.dio.desafio.GFT.Conteudo;
import br.com.dio.desafio.GFT.Curso;
import br.com.dio.desafio.GFT.Devs;
import br.com.dio.desafio.GFT.Mentoria;

public class Main {

	public static void main(String[] args) {
		
		Curso curso1 = new Curso();
		curso1.setTitulo("curso Java Script");
		curso1.setDescricao("Descrição: Curso Java Script");
		curso1.setCargaHoraria(4);
		//System.out.println(curso1);
		
		Curso curso2 = new Curso();
		curso2.setTitulo("curso Java");
		curso2.setDescricao("Descrição: Curso Java");
		curso2.setCargaHoraria(8);
		//System.out.println(curso2);
		
		Mentoria mentoria1 = new Mentoria();
		mentoria1.setTitulo("Mentoria de Java");
		mentoria1.setDescricao("Descrição: Mentoria Java");
		mentoria1.setData(LocalDate.now());
		//System.out.println(mentoria1);
		
		Conteudo conteudo1 = new Curso();
		new Mentoria();
		
		
		Bootcamp bootcamp = new Bootcamp();
		bootcamp.setNome("Bootcamp Java Developer");
		bootcamp.getConteudos().add(curso1);
		bootcamp.getConteudos().add(curso2);
		bootcamp.getConteudos().add(mentoria1);
		
		Devs devMarcella = new Devs();
		devMarcella.setNome("Marcella");
		devMarcella.inscreverBootcamp(bootcamp);
		System.out.println("Conteudos Inscritos Marcella" + devMarcella.getConteudosInscritos());
		devMarcella.progredir();
		System.out.println("****\tPROGRESSO\t****");
		System.out.println("Conteudos Inscritos Marcella" + devMarcella.getConteudosInscritos());
		System.out.println("Conteudos Concluídos Marcella" + devMarcella.getConteudosConcluidos());
		System.out.println("XP:" + devMarcella.calcularTotalXp());
		
		System.out.println("\n===================\n");
		
		Devs devVictor = new Devs();
		devVictor.setNome("Victor Hugo");
		devVictor.inscreverBootcamp(bootcamp);
		System.out.println("Conteudos Inscritos Victor" + devVictor.getConteudosInscritos());
		devVictor.progredir();
		devVictor.progredir();
		devVictor.progredir();
		System.out.println("****\tPROGRESSO\t****");
		System.out.println("Conteudos Inscritos Victor" + devVictor.getConteudosInscritos());
		System.out.println("Conteudos Concluídos Victor" + devVictor.getConteudosConcluidos());
		System.out.println("XP:" + devVictor.calcularTotalXp());

		
		
		
				
		
		

		
	}

}
