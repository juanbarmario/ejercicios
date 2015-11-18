public class DimeCambioMoneda{
	public static void main(String[] args){
	int cantidad = Integer.parseInt(args[0]);
	boolean escape = false;
	int quinien=0,doscien=0,veinte=0,diez=0,cinco=0,dos=0,uno=0,cien=0,cincuen=0,result=0;

		if(cantidad >= 500){
			quinien = cantidad/500;
			cantidad %= 500;
		}
		if(cantidad >= 200 && cantidad < 500){
			doscien = cantidad/200;
			cantidad %= 200;		
		}
		if(cantidad >= 100 && cantidad < 200){
		        cien = cantidad/100;
			cantidad %= 100;
		}
		if(cantidad >= 50 && cantidad < 100){
			cincuen = cantidad/50;
			cantidad %= 50;
				
		}
		if(cantidad >= 20 && cantidad < 50){
			veinte = cantidad/20;
			cantidad %= 20;
				
		}
		if(cantidad >= 10 && cantidad < 20){
			diez = cantidad/10;
			cantidad %= 10;
		}
		if(cantidad >= 5 && cantidad < 10){
			cinco=cantidad/5;
			cantidad %= 5;
		}
		if(cantidad >=2 && cantidad < 5){
			dos = cantidad/2;
			cantidad %= 2;
		}
		if(cantidad >=1 && cantidad <2){
			uno = cantidad/1;
			cantidad %= 1;
		}
			if(cantidad == 0 || cantidad < 1)
				escape = true;
		

	if(quinien>0)
		System.out.println("Hay " + quinien + " billetes de 500");
	if(doscien>0)
		System.out.println("Hay " + doscien + " billetes de 200");
	if(cien>0)
		System.out.println("Hay " + cien + " billetes de 100");
	if(cincuen>0)
		System.out.println("Hay " + cincuen + " billetes de 50");
	if(veinte>0)
		System.out.println("Hay " + veinte + " billetes de 20");
	if(diez>0)
		System.out.println("Hay " + diez + " billetes de 10");
	if(cinco>0)
		System.out.println("Hay " + cinco + " billetes de 5");
	if(dos>0)
		System.out.println("Hay " + dos + " modedas de 2");
	if(uno>0)
		System.out.println("Hay " + uno + " monedas de 1");
	
		System.out.println("Ha sobrado " + cantidad);
	}

}
