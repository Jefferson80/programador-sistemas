package controller;

public class EscopoDeVariavel {
	static int x = 2; //vari�vel local

	public static void main(String[] args) {
		metodoA();
		metodoB();
		int x = 5;
		System.out.println("x no inicio de main() � " + x);
		metodoA();
		metodoB();
		System.out.println("=========================================");
		metodoB(x);
		System.out.println(x);
	}
	
	
	
	public static void metodoA( ) {
		int x = 25;
		System.out.println("Variavel local x ao entrar no metodoA � " + x);
		x=x+1;
		System.out.println("variavel local x antes de sair do metodoA � " + x);
	}
	
	
	public static void metodoB() {
		System.out.println("variavel x ao entrar no metodoB � " + x + " global");
		x = x*10;
		System.out.println("Variavel x antes de sair do metodoB � " + x);
	}
	
	
	public static void metodoB(int x) {
		System.out.println("vari�vel x ao entrar no metodoB � "+ x + " global.");
		x = x*10;
		System.out.println("vari�vel x antes de sair do metodoB � "+  x);
	}
}
