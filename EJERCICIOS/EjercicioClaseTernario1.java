/*EJERCICIO PANDILLA*/

public class EjercicioClaseTernario1{
	public static void main(String[] args){
	boolean dinero = Boolean.parseBoolean(args[0]);
	boolean pandilla = Boolean.parseBoolean(args[1]);
	boolean zona = Boolean.parseBoolean(args[2]);

	String decision = (zona &&(dinero | pandilla))?"Ole de copas":"Putada";
	System.out.println(decision);
	}
}
