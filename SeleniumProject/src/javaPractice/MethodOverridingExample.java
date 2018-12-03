package javaPractice;

class ParentClass{
	
	public void prent(){
		
		System.out.println("I am in parent class");
	}
	public void parentnew(){
		
		System.out.println("I am in parentnew method");
		
	}

}

public class MethodOverridingExample extends ParentClass {
	
	public void prent(){
		
		System.out.println("I am in subclass");
	} 
	
	public void childnew(){
		System.out.println("I am in child new method");
	}

	public static void main(String[] args) {
		
		ParentClass obj= new MethodOverridingExample();
		obj.parentnew();
		MethodOverridingExample obj1= new MethodOverridingExample();
		obj1.childnew();
		obj1.parentnew();
		

	}

}
