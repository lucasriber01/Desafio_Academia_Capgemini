package org.capegemini.exercicios;

public class Questao01 {

	   public  void  escadinha(Integer tamanho) {
		   for (int k=1;k<=tamanho;k++){
		        for (int k1=1;k1<=tamanho-k;k1++){
		            System.out.printf(" ");
		        }
		        for (int i=1;i<=k;i++){
		            System.out.print("*");
		        }
		        System.out.println("");
		    }
	   }
}
