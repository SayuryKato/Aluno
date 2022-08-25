package entidade;

public class Estudante {
	public double nota1;
	public double nota2;
	public double nota3;
	public String nome;
	
	public double notaFinal() {
		double soma = nota1 +nota2 + nota3;
		return soma;
	}
	
	public void aprovadoReporvado() {
		if(this.notaFinal()>= 60) {
			System.out.println("\nAPROVADO");
		}
		else {
			System.out.println("\nREPROVADO");
			double pontos = 60 -  this.notaFinal();
			System.out.printf("\nFaltam %.2f pontos", pontos);
		}
	}
	
	

}
