package controller;


import model.*;


public class Teste {

	public static void main(String[] args) {
		
		
		//ItemDePedido - 2 Objetos
		
		ItemDePedido Idp1 = new ItemDePedido();
		Idp1.setQtde(2);
		Idp1.setSubtotal(22.98);
		System.out.println(Idp1.toString());
		
						
		ItemDePedido Idp2 = new ItemDePedido();
		Idp2.setQtde(1);
		Idp2.setSubtotal(98.75);
		System.out.println(Idp2.toString());
				
		
		System.out.println("____________________________________________________________________________________");
		
		//Usuario - 1 Objeto
		
		Usuario Idp3 = new Usuario();
		Idp3.setQtde(1);
		Idp3.setSubtotal(98.75);
		System.out.println(Idp3.toString());
		
		
		System.out.println("____________________________________________________________________________________");
				
		
		
		
	}

}
