public class PasarVariables{
	public static void main(String[] args){

		boolean dinero = Boolean.parseBoolean(args[0]);
		boolean pandilla = Boolean.parseBoolean(args[1]);
		boolean zona = Boolean.parseBoolean(args[2]);
		boolean salidaCopas = zona && (dinero || pandilla);
		System.out.println(salidaCopas);
	}
}
