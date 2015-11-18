public class BucleIf{
	public static void main(String[] args){
	
	int valor = Integer.parseInt(args[0]);
	
	if(valor<5)
		System.out.println("Valor vale menor que 5");
	else if(valor>5)
		System.out.println("Valor vale mayor que 5");
	else
		System.out.println("La variable valor vale 5");		

	}

}
