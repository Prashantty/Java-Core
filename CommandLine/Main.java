package CommandLine;

public class Main {
	public static void main(String[] args)
	{
		System.out.println("\n welcome to command line argument in java ::: ");
		System.out.println("\n our value is :::: "+args[0]);
		for(String x:args)
		{
			System.out.println("\n Our data is ::: "+ x);
		}
		
		for(int i=0 ; i<args.length;i++)
		{
			System.out.println("\n Our data is :::" + args[i]); 
		}
		
	}

}
