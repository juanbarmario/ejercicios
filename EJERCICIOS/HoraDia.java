public class HoraDia{
	public static void main(String[] args){
	String shora = args[0];
	String sminuto = args[1];
	int hora = Integer.parseInt(shora);
	int minuto = Integer.parseInt(sminuto);
	/*
	madrugada: 00:01 a 05:59
	mañana: 06:00 a 11:59
	mediodia: 12:00
	tarde: 12:01 a 17:59
	noche: 6:00 a 23:59
	medianoche: 00:00
	*/
	if(hora ==  0 && minuto == 0)
	System.out.println("Es medianoche.");
	
	else if((hora >= 0 && minuto >= 1) &&(hora <=5 && minuto<=59) )
	System.out.println("Es madrugada.");

	else if((hora >= 6 && minuto >=0) && (hora<=11 && minuto<=59))
	System.out.println("Es por la mañana.");
	
	else if(hora == 12 && minuto == 0)
	System.out.println("Es mediodía.");

	else if((hora >= 12 && minuto>=1) && (hora <= 17 && minuto <= 59))
	System.out.println("Es por la tarde.");
	
	else
	System.out.println("Ya es por la noche.");
	
	}

}
