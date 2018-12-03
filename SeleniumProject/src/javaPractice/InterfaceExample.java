package javaPractice;

interface Animal {

	public void sound(); 

}

interface Dog {

	public void sound();

}

public class InterfaceExample implements Animal, Dog {
	
	public void sound(){
		System.out.println("I am in main");
	}

	public static void main(String[] args) {
		
		InterfaceExample inter=new InterfaceExample();
		
		inter.sound();
	

	}

}
