package AdditionOFTwoMatrix;

import java.util.Scanner;

public class Main 
{
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args)
	{
		int i,j;
	System.out.println("Enter the Row ::::");
	int r= sc.nextInt();
	System.out.println("Enter the column::::");
	int c = sc.nextInt();
	int[][] a= new int[r][c];
	int[][] b= new int[r][c];
	int[][] p= new int[r][c];
	
	
	// Defining First array 
	System.out.println("Enter the Elements in the first array :::\n ");
	for(i=0;i<r;i++)
		for(j=0;j<c;j++)
			a[i][j]=sc.nextInt();
	// Defining Second array 
	System.out.println("Enter the elements in the second array::::\n");
	for(i=0;i<r;i++)
		for(j=0;j<c;j++)
			b[i][j]=sc.nextInt();
	//Adding both array 
	for(i=0;i<r;i++)
		for(j=0;j<c;j++)
			p[i][j]=a[i][j]+b[i][j];
	//Printing summation of both array
	System.out.println("After summation our array is :::\n");
	for(i=0;i<r;i++)
	{
		System.out.println();
		for(j=0;j<c;j++)
		{
			System.out.print(" "+p[i][j]);
		}
	}
		
			
	}

}
