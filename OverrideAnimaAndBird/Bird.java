package OverrideAnimaAndBird;


	class Animal {
	    public void eat()
	    {
	        System.out.println("eat method");

	    }
	    public void sleep()
	    {
	        System.out.println("sleep method");

	    }

	}
	public class Bird extends Animal{
	    
	    public void eat() {
	        
	        System.out.println("overide eat");
	    }

	    
	    public void sleep() {
	      
	        System.out.println("override sleep");
	    }

	    public void fly()
	    {
	        System.out.println("in fly method");

	    }
	
	 public static void main(String[] args) {
	        Animal a =new Animal();
	        Bird b = new Bird();
	        a.eat();
	        a.sleep();
	        b.eat();
	        b.sleep();
	        b.fly();
	    }

}
