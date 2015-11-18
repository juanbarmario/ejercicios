/*Vamos a crear un programa que reciba 3 parametros: Primero un operador, el segundo el operando y el tercero el segundo numero.*/

public class Calculadora1{

	public static void main(String[] args){
	int operador1 = Integer.parseInt(args[0]);
	String operando = args[1];
	int operador2 = Integer.parseInt(args[2]);

	switch(operando)
	{
		case "+":
			System.out.println("La suma de " + operador1 + " + " + operador2 + " = "+ (operador1+operador2));
			break;
		case "-":
			System.out.println("La resta de " + operador1 + " - " + operador2 + " = "+ (operador1-operador2));
			break;
		case "*":
			System.out.println("La multiplicacion de " + operador1 + " * " + operador2 + " = "+ (operador1*operador2));
			break;
		case "/":
			System.out.println("La divicion de " + operador1 + " / " + operador2 + " = "+ (operador1/operador2));
			break;
		default:
			System.out.println("El operando introducido no es valido (operador1 + operando + operador2)");
			break;
	}		

	}
}

