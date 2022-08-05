package BobbleSort;

import java.util.Scanner;

public class Main {
    
	static int a[] = new int[20],n;
	static  Scanner ab = new Scanner(System.in);

	public static void main(String[] args)
	{
		int i, j;
	
		System.out.println("\n Enter the range of the array ::: ");
		 n = ab.nextInt();
		
		System.out.println("\n Enter the elements in thr array :::\n ");
		for(i=0;i<n;i++)
		{
			a[i]= ab.nextInt();
		}
		
		//printing the original value 
		
		System.out.println("\n Our Original value of the array is:::");
		for(i=0;i<n;i++)
		{
			System.out.println(a[i]);
		}
		
		//Sorting using bubble sort
		
		for(i=0;i<n;i++)
			for(j=0;j<n-i-1;j++)
				if(a[j]>a[j+1])
				{
					 int temp;
					 temp = a[j];
					 a[j]= a[j+1];
					 a[j+1]= temp;
				}
		
		System.out.println("\n Our sorted value of the array is:::");

		for(i=0;i<n;i++)
		{
			System.out.println(a[i]);
		}
		
	}

}
