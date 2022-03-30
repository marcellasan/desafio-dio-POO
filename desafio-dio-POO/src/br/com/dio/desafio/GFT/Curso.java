package br.com.dio.desafio.GFT;

public class Curso extends Conteudo {

	private int cargaHoraria;
	
	@Override
	public double calcularXp() {
		return XP_PADRAO * cargaHoraria;
	}
	
	
	public Curso() {
		
	}
	
	public int getCargaHoraria() {
		return cargaHoraria;
	}
	public void setCargaHoraria(int cargaHoraria) {
		this.cargaHoraria = cargaHoraria;
	}
	@Override
	public String toString() {
		return "\n===\tCURSOS\t===\nT�tulo: " + getTitulo() + 
				" \n" + getDescricao() + 
				" \nCarga Hor�ria: " + cargaHoraria + " horas \n" ;
	}
	
 
}
