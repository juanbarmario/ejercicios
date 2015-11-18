public class AprovadoSuspenso{
	public static void main(String[] args){
		double nota = Double.parseDouble(args[0]);
		int num=0;
		if(nota >=0 && nota <=10)
		{
			if(nota>=0 && nota<=4)
				num= 1;
			else if (nota == 5 )
				num = 2;
			else if (nota == 6)
				num = 3;
			else if (nota >=7 && nota <=8)
				num = 4;
			else
				num = 5;	
			
			switch(num){
				case 1:
					System.out.println("Nota suspensa: " +nota);
					break;
				case 2:
					System.out.println("Nota raspada: "+nota);
					break;
				case 3:
					System.out.println("Nota buenecilla: " +nota);
					break;
				case 4: 
					System.out.println("Nota notable: " +nota);
					break;
				case 5:
					System.out.println("Nota sobresaliente: " +nota);
					break;
				default:
					return;
			}
			
		}else
		System.out.println("Nota no valida");
	}
}
