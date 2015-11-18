public class PruebaCasting{
	public static void main(String[] args){
	//CASTING IMPLICITO

	System.out.println("\nCASTING IMPLICITO");
	/* Se pone la L para decir a la variable miLong que el valor que le vamos a meter es tipo L (long)*/
	long miLong = 1200000000000L;
	
	/*Se le pone la F de float para indicar que le vamos a asignar un valor Float*/
	Float miFloat = 145.23F; 
	System.out.println("Long "+miLong+"\nFloat "+miFloat);
	
	//CASTING EXPLICITO
	System.out.println("\nCASTING EXPLICITO");
	
	long otroLong = 12000000000000L;
	int otroInt = (int) otroLong;

	System.out.println("El valor de otroInt es "+otroInt+"\nY otroLong es "+otroLong);
	System.out.println("\n--------------------------------\n");

	double miDouble = 1234.45e-15;
	float miFloat2 = (float) miDouble;
	
	System.out.println("Valor de miDouble es "+miDouble+"\nValor de miFloat2 es "+miFloat);

	System.out.println("\n---------------------------------\n");
	System.out.println("Convertir Float a Int\n");
	float esteFloat = 45.999F;
	int esteInt = (int) esteFloat;

	System.out.println("esteFloat vale "+esteFloat+"\nY esteInt es "+esteInt);

	System.out.println("\n--------------------------------\n");
	System.out.println("Convertir un int en un char\n");
	
	int hayInt = 122;
	char hayChar = (char) hayInt;

	System.out.println("hayInt vale "+hayInt+"\nY hayChar "+hayChar);
	
	System.out.println("\n----------------------------------\n");
	System.out.println("Convertir un char en un int\n");
	
	char elChar = 'z';
	int elInt = (int)elChar;

	System.out.println("elChar vale "+elChar+"\nY elInt vale "+elInt); 
	

	}
}
