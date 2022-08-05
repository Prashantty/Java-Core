package ScannerInFunction;

import java.util.Scanner;


public class Main {
	
	Scanner ab1 = new Scanner(System.in);
	
	int sum()
	{
		System.out.println("\n Enter the First number ::: ");
		int a =  ab1.nextInt();
		System.out.println("\n Enter the Secind Number ::: ");
		int b =  ab1.nextInt();
		return a+b;
	}
	public static void main(String[] args)
	{
		Main ab = new Main();
		int result = (ab.sum());
		System.out.println("\n Our result is ::: "+result);
		
	}

}
