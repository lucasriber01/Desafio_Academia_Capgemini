package org.capegemini.exercicios;

public class Questao02 {

	@SuppressWarnings("unused")
	public void  senhaForte(String senha) {

	    boolean achouNumero = false;
	    boolean achouMaiuscula = false;
	    boolean achouMinuscula = false;
	    boolean achouSimbolo = false;
	    int contador = 0 ;
	    
	    for (char c : senha.toCharArray()) {
	         if (c >= '0' && c <= '9') {
	             achouNumero = true;
	             contador  = contador+1;
	         } else if (c >= 'A' && c <= 'Z') {
	             achouMaiuscula = true;
	             contador  = contador+1;
	         } else if (c >= 'a' && c <= 'z') {
	             achouMinuscula = true;
	             contador  = contador+1;
	         } else {
	             achouSimbolo = true;
	             contador  = contador+1;
	         }
	    }
	    if(contador>=4 && senha.length()>=6) {
		    System.out.println("A senha preenche todos os Requisitos");  

	    }else {
	    System.out.println("Para validar sua senha e necessario adicionar "+(-1*(senha.length()-6))+" caracteres");  }
	}  
}
