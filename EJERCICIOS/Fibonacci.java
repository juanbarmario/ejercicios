public class Fibonacci{
	public static void main(String[] args){
	int tope = Integer.parseInt(args[0]);
	int total=0,n1=0;
	
		for(int i=0;i<=tope;i++)
		{
			if(i<=2){
			total += n1;
			System.out.println(total);
			n1++;
			}else{
			n2 = n1;
			total += n1;
			System.out.println(total);
				}
			
		}
	}

}
