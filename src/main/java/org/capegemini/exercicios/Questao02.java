package org.capegemini.exercicios;

public class Questao02 {

	@SuppressWarnings("unused")
	public void  senhaForte(String senha) {

	    boolean achouNumero = false;
	    boolean achouMaiuscula = false;
	    boolean achouMinuscula = false;
	    boolean achouSimbolo = false;
	    
	    int validarNumero = 0 ; 
	    int validarMaiuscula = 0 ; 
	    int validarMinusculo = 0 ; 
	    int validarSimbolo = 0 ; 

	    int contador = 0 ;
	    
	    for (char c : senha.toCharArray()) {
	         if (c >= '0' && c <= '9') {
	             achouNumero = true;
	             validarNumero  =1;
	         } else if (c >= 'A' && c <= 'Z') {
	             achouMaiuscula = true;
	             validarMaiuscula = 1 ;
	         } else if (c >= 'a' && c <= 'z') {
	             achouMinuscula = true;
	             validarMinusculo =1 ;
	         } else {
	             achouSimbolo = true;
	             validarSimbolo=1;
	             }
	    }
	    
	    contador = validarNumero+validarMaiuscula+validarMinusculo+validarSimbolo;
	    
	    if(contador>=4 && senha.length()>=6) {
		    System.out.println("A senha preenche todos os Requisitos");  

	    }else {
	    System.out.println("Para validar sua senha e necessario adicionar "+(-1*(senha.length()-6))+" caracteres");  }
	}  
}
