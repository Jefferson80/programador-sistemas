package controller;

public class EscopoDeVariavel {
	static int x = 2; //variável local

	public static void main(String[] args) {
		metodoA();
		metodoB();
		int x = 5;
		System.out.println("x no inicio de main() é " + x);
		metodoA();
		metodoB();
		System.out.println("=========================================");
		metodoB(x);
		System.out.println(x);
	}
	
	
	
	public static void metodoA( ) {
		int x = 25;
		System.out.println("Variavel local x ao entrar no metodoA é " + x);
		x=x+1;
		System.out.println("variavel local x antes de sair do metodoA é " + x);
	}
	
	
	public static void metodoB() {
		System.out.println("variavel x ao entrar no metodoB é " + x + " global");
		x = x*10;
		System.out.println("Variavel x antes de sair do metodoB é " + x);
	}
	
	
	public static void metodoB(int x) {
		System.out.println("variável x ao entrar no metodoB é "+ x + " global.");
		x = x*10;
		System.out.println("variável x antes de sair do metodoB é "+  x);
	}
}
