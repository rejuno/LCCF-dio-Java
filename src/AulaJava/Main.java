package AulaJava;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		//EXERCICIO 1 - MES
		Scanner r = new Scanner(System.in);
		
		System.out.println("Digite o número referente ao mes desejado: ");
		int numero = r.nextInt();
		Mes.obterMes(numero);

		//EXERCICIO 2 - SEMANA
		Scanner s = new Scanner(System.in);
		System.out.println("Digite um dia da semana: ");
		String nome = s.next();
		Semana.obterSemana(nome);
		
		//EXERCICIO 3 - NUMERO
		Scanner n = new Scanner(System.in);
		System.out.println("Adivinhe o número! Digite um número: ");
		int num = n.nextInt();
		Numero.obterNumero(num);
		
	}

}
