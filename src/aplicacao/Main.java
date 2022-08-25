package aplicacao;

import java.util.Locale;
import java.util.Scanner;

import entidade.Estudante;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Estudante r1 = new Estudante();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite seu nome: ");
		r1.nome = sc.next();
		
		System.out.println("Digite a primeira nota: ");
		r1.nota1 = sc.nextDouble();
		
		System.out.println("\nDigite a segunda nota: ");
		r1.nota2 = sc.nextDouble();
		
		System.out.println("\nDigite a terceira nota: ");
		r1.nota3 = sc.nextDouble();
		
		System.out.printf("NOTA FINAL = %.2f", r1.notaFinal());
		r1.aprovadoReporvado();
		
		sc.close();

	}

}
