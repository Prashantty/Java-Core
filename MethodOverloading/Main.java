package MethodOverloading;

public class Main {
	void sum(int a, int b)
	{
		int c = a+b;
		System.out.println(c);
	}
	void sum(float a, int b)
	{
		int c=  (int)(a+b);
		System.out.println(c);
	}
	void mul(int a, int b)
	{
		int c= a*b;
		System.out.println(c);
		
	}
	void mul(float a, int b)
	{
		int c = (int)(a*b);
		System.out.println(c);
	}
	public static void main(String[] args)
	{
	 Main ob = new Main();
	      ob.sum(5, 40);
	      ob.sum(4.5f, 5);
	      ob.mul(10 , 4);
	      ob.mul(4.9f, 10);
	}

}
