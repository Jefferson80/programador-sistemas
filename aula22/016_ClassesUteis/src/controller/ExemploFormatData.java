package controller;

import java.sql.Date;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class ExemploFormatData {

	public static void main(String[] args) {
		
		Date data = new Date(0);
		System.out.println("Data " + data);
		
		@Deprecated
		Date dataInserida = new Date (2011,9,14);
		System.out.println("Data Inserida" + dataInserida);
		
		//Esta Classe est� obsoleta.
		
		Calendar data2 = new GregorianCalendar();
		System.out.println("Data: " + data2);
		
		
	
		
		
		
	}

}
