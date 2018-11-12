package controller;


import util.Teclado;

public class ComTraramentoDeErro {

	public static void main(String[] args) {
		
		try {
		
		double a = Teclado.lerDouble ("Digite o Numerador: ");
		double b = Teclado.lerDouble ("Digite o Denominador: ");
		
		double c = a/b;
		System.out.println("Resultado da Divis�o de por b: " + c);
		
	} catch (NumberFormatException nfe) {
		System.out.println("Caracter inv�lido! ");
		
		
	// Este tratamento abaixo s� funcion para vers�es anteriores ao Java 6	
	} catch (ArithmeticException ae) {
		System.out.println("Divis�o por Zaro");
		
		
		
	}

	}
}
