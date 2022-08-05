package OpratorPrecedence;

public class Main {
	
	public static void main(String[] args)
	{
		int a = 4;
		float b = 3.5f;
		int c =7;
		int d = 6;
		int e = 10;
		int r = 12;
		
	    float p = (b+a*r/a*c-e+d);
	    System.out.println("\n Our result data is :::"+p);
	    
	}
	
}
