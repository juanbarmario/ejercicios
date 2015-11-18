/*
@autor: Juan Berenguer
Fecha: 09/11/2015
*/

public class MinombreACSSI{
	public static void main(String[] args){
		//Recojo mi nombre en HEXA
		char n1 = 0X4A;
		char n2 = 0X75;
		char n3 = 0x61;
		char n4 = 0x6E;
		System.out.println("Mi nombre es: "+n1+n2+n3+n4);
		//Recojo primer apellido en Octal
		char n5 = 0102;
		char n6 = 0145;
		char n7 = 0162;
		char n8 = 0145;
		char n9 = 0156;
		char n10 = 0147;
		char n11 = 0165;
		char n12 = 0145;
		char n13 = 0162;
		//también, se puede poner su código ASCCI
		String apellido = ""+n5+n6+n7+n8+n9+n10+n11+n12+n13;
		System.out.println("Mi primer apellido es: "+apellido);
	}
}
//Para hexadecimal se pone 0x delante del numero.
/* para Octal se coloca un 0 delante para que se confunda con los numeros 
decimales.*/
