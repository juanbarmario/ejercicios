/*
Dado un numero que pasamos por parametro o desde una variable, quiero que el programa me detecta si es 0 par o impar.
*/

public class EjercicioIFClase{
	public static void main(String[] args){
	int escape = 0;
	do{
		int numero = (int)(10*Math.random());
		escape = numero;
		if(numero==0){
			System.out.println("El numero "+numero+" es 0");
		}else if(numero%2==0){
			System.out.println("El numero "+numero+" es par");
		}else{ 
			System.out.println("El numero "+numero+" es impar");
		}
	}while(escape!=0 || escape==5);

	}

}
