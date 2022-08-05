package Overriding;

import java.util.Scanner;

class Shape
{
	static int length, bredth , side ,redius;
	void area()
	{
	 Scanner sc = new Scanner(System.in);
	 System.out.println("\n Enter the length :::");
	  length = sc.nextInt();
	 System.out.println("\n Enter the bredth :::");
	  bredth  = sc.nextInt();
	 System.out.println("\n Ente the side of square :::");
	  side = sc.nextInt();
	 System.out.println("\n Enter the Radius ::::");
	   redius = sc.nextInt();
	 
	}
	
}
public class Main extends Shape {
	void area()
	{
		int AreaOfRactangle = length * bredth;
		System.out.println("\n Area of rectange is:::"+AreaOfRactangle);
		int AreaOfSquare = side *side;
		System.out.println("\n Area of square is ::::"+AreaOfSquare);
		int AreaofCircle = (22/7)*(redius * redius);
	    System.out.println("\n Area of circle is :::::"+AreaofCircle);
	}
	public static void main(String[] args)
	{
		Shape  ob1 =  new Shape ();
		      ob1.area();
		Main ob = new Main();
		     ob.area();
	}

}
