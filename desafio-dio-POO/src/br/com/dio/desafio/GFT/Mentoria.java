package br.com.dio.desafio.GFT;

import java.time.LocalDate;

public class Mentoria extends Conteudo {
	LocalDate data;
	
	
	@Override
	public double calcularXp() {
		return XP_PADRAO= 20D;
	}
	public Mentoria() {
		
	}
	
	
	
	public LocalDate getData() {
		return data;
	}
	public void setData(LocalDate data) {
		this.data = data;
	}
	@Override
	public String toString() {
		return "\n===\tMENTORIAS\t=== \nT�tulo: " + getTitulo() +
				"\n" + getDescricao() + 
				"\nData Inscri��o: " + data + "";
	}


	

	
	
}
