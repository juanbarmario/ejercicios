/*Crear para el archivo sumar variables, crear una variable C de tipo numerico
y le asiganamos el valor resultado de la multiplicacion  a y b * c mostrarlo por 
pantalla.*/

public class MultiplicarVariables{
	public static void main(String[] args){
		//Declaramos la variable a
		int a = 7;

		//Declaramos la variable b
		int b = 5;

		//Declaramos la variable c y le asignamos el valor de a+b(resultado)
		int c=a+b;

		// Declaramos la variable d
		int d=a*(b-c);

		System.out.println("La suma total de c es = " + d);
	}
}
