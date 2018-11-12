package controller;


import util.Teclado;

public class SemTraramentoDeErro {

	public static void main(String[] args) {
		
		double a = Teclado.lerDouble ("Digite o Numerador: ");
		double b = Teclado.lerDouble ("Digite o Denominador: ");
		
		double c = a/b;
		System.out.println("Resultado da Divisão de por b: " + c);
		
		
		
		
		
	}

}
