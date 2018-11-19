package controller;

import java.util.Date;
import java.text.DateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.TimeZone;

public class ExemploFormatData {

	public static void main(String[] args) {
		
		Date data =  new Date();
		System.out.println("Data" + data +"\n");
		
		@SuppressWarnings("deprecation")
		Date dataInserida = new Date(9,11,2018);
		System.out.print("Data inserida "+ dataInserida);
		//Classe está obsoleta, mas ainda funciona
		
		Calendar data2 = new GregorianCalendar();
		System.out.print("Data" + data2+"\n");
		
		data2.set(2011,  3, 19);
		
		System.out.println("===============");
		System.out.println("Mês: " + data2.get(Calendar.MONTH)+"\n");
		System.out.println("Dia da Semana: "+ data2.get(Calendar.DAY_OF_WEEK)+"\n");
		System.out.println("Dia do mês: "+ data2.get(Calendar.DAY_OF_MONTH)+"\n");
		System.out.println("Dia do ano: "+ data2.get(Calendar.DAY_OF_YEAR));
		System.out.println("=============" +"\n");
		
		DateFormat df3 = DateFormat.getDateInstance(DateFormat.FULL);
		Calendar data3 = new GregorianCalendar();
		data3.set(2010,8,25);
		System.out.println("Data 3 (FULL) "+ df3.format(data3.getTime())+"\n");
		
		DateFormat df4 = DateFormat.getDateInstance(DateFormat.LONG);
		Calendar data4 = new GregorianCalendar();
		data4.set(2010,8,25);
		System.out.println("Data 4 (LONG) "+ df4.format(data4.getTime())+"\n");
		
		DateFormat df5 = DateFormat.getDateInstance(DateFormat.MEDIUM);
		Calendar data5 = new GregorianCalendar();
		data5.set(2010,8,25);
		System.out.println("Data 5 (MIDIUM) "+ df5.format(data5.getTime())+"\n");
		
		DateFormat df6 = DateFormat.getDateInstance(DateFormat.SHORT);
		Calendar data6 = new GregorianCalendar();
		data6.set(2010,8,25);
		System.out.println("Data 6 (SHORT) "+ df6.format(data6.getTime())+"\n");
		
		
		TimeZone tz = TimeZone.getTimeZone("GMT-2:00");
		TimeZone.setDefault(tz);
		System.out.println(DateFormat.getTimeInstance().format(new Date())+"\n");
		
		
	}

}
