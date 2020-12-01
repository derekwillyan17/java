package curso_java;

public class Alunos {
	
	private int id;
	private String name;
	private double soma = 0, media;
	private double[] notas;
	
	
	public void setId(int id) {
		
		this.id = id;
		
	}
	
	public void setNome(String name) {
		
		this.name = name;
		
	}
	
	public void setNotas(double[] notas) {
		
		for(int cont = 0; cont < notas.length; cont++) {
			
			this.notas[cont] = notas[cont];
			this.soma += this.notas[cont];
			
		}
		
	}
	
	public double getMedia() {
		
		this.media = this.soma/this.notas.length;
		return this.media;
		
	}
	
	public int getId() {
		
		return this.id;
		
	}
	
	public String getName() {
		
		return this.name;
		
	}
	
}
