package org.capegemini;

import java.util.Scanner;

import org.capegemini.exercicios.Questao01;
import org.capegemini.exercicios.Questao02;
import org.capegemini.exercicios.Questao03;

public class Main {

	public static void main(String[] args) {

		Questao01 resolucaoExercicio01 = new Questao01();
		Questao02 resolucaoExercicio02 = new Questao02();
		Questao03 resolucaoExercicio03 = new Questao03();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Quantos degrais você deseja que a escada tenha ??");
		int resposta = sc.nextInt();
		resolucaoExercicio01.escadinha(resposta);
		
		System.out.println("___________________________________________________________________");

		System.out.println("Digite sua senha . A senha deve ter letra maiuscula e minuscula, numero e um caracter e no minimo 6 digitos");
		String resposta2 = sc.next();
		resolucaoExercicio02.senhaForte(resposta2);
		
		System.out.println("___________________________________________________________________");
		System.out.println("Digite sua palavra : ");
		String resposta3 = sc.next();
		resolucaoExercicio03.getQuantidadeDeAnagramasPares(resposta3);

		
		
		sc.close();

		
		
	}

}
