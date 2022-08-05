package AbstractClass;


abstract class a
{
	void Abs()
	{
	 
	 System.out.println("Method of abstract clsss \n");
	}
	abstract void abs1();
	public a()
	{
	System.out.println("Constructor of abstact class \n ");	
	}
	
}
public class Main extends a{
	
	void abs1()
	{
		System.out.println("this is method of abstract class \n");
	}
  public static void main(String[] args)
  {
	  Main ob = new Main();
            ob.Abs();
            ob.abs1();
      
	  
	  
  }
}
