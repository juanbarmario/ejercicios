/*EJERCICIO CONDICIONAL ANIDADO*/

public class EjercicioCasaAnidarIf{
	public static void main(String[] args){
	boolean dinero = Boolean.parseBoolean(args[0]);
	boolean pandilla = Boolean.parseBoolean(args[1]);

	String decision = (dinero==true?(pandilla==true?"SALE LA PANDILLA Y SALGO":"MEJOR NO SALGO"):"NO RESUELTA");
	System.out.println(decision);
	}
}
