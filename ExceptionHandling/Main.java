package ExceptionHandling;


import java.util.Scanner;
public class Main {
	 public static void validate(String str) {  
	        if(str.compareTo("Exception")==0) {  
	            System.out.println("You are !");  

	        }  
	        else {   

	        	throw new ArithmeticException("Person is not eligible to vote");
	        }  
	    }
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		     System.out.println("Enter 'Exception' to visit rest of the code");
		     String str = sc.nextLine();
		        validate(str);
		   try {    
	  
	        System.out.println("Inside the try block");  
	          
	        //below code throws divide by zero exception  
	       int data=25/0;    
	       System.out.println(data);    
	      }    
	       
	      catch(NullPointerException e){  
	        System.out.println(e);  
	      }   
	  
	       // finally block 
	      
	      finally {  
	        System.out.println("finally block is always executed");  
	      }    
	  
	      System.out.println("rest of the code...");    
}    
		        
	}


