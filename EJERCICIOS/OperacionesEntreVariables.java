//OPERACIONES ENTRE VARIABLES
/*CASTEO - CONVIERTE UN TIPO DE VARIABLE EN OTRO
*/
public class OperacionesEntreVariables{
	public static void main(String[] args){
	System.out.println("\nOPERACIONES ARITMETICAS\n");
		int a = 7;
		int b = 11;
		double d = 25.4;
		
		System.out.println(b / a);
		System.out.println(b % a);
		System.out.println(d / a);
		System.out.println((double) (b / a));
		System.out.println((double) b / (double) a);
		System.out.println((double) b % (double) a +"\n");

	System.out.println("\nINCREMENTO Y DECREMENTO");
		int preI = 1;
		int postI = 1;

		System.out.println(postI++);
		System.out.println(++preI + "\n");
		System.out.println(postI++);
		System.out.println(++preI);

	System.out.println("\nOPERADORES\n");
		System.out.println("+= | -= | *= | /= | %=");

		System.out.println("\nOperadores combinados");
		int miComb = 1;
		System.out.println(miComb);
		miComb += 5-3; // a = a + (5+3)
		System.out.println(miComb + "\n");

	System.out.println("\nOPERADORES LOGICOS\n");
		System.out.println("! | ^ & || &&");

/*EJERCICIO: Tengo un programa en el cual necesito conocer la salida para 
los casos en que se cumpla la condición de o tengo dinero para salir o 
sale toda la pandilla y salga por la zona donde vivo.*/
		Boolean TengoDinero = true;
		Boolean SalePandilla = false;
		Boolean ZonaDondeVivo = false;
		
	System.out.println((TengoDinero || SalePandilla) && ZonaDondeVivo);

	}
}
