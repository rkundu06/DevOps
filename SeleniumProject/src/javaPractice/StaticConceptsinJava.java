package javaPractice;

public class StaticConceptsinJava {

	static String str = "I am a static variable";
	String str1="I am not a static variable";

	static class staticlass {

		public void method1() {

			System.out.println("I am in method1");
			System.out.println("Static variable:"+ str);
			//System.out.println("NopStatic variable"+ str1);
			method2();
		}

		public static void method2() {

			System.out.println("I am in method2");
			method3();
		}
	}
	
	public static void method3() {

		System.out.println("I am in method3");
	}

	public static void main(String[] args) {

		StaticConceptsinJava.staticlass var = new StaticConceptsinJava.staticlass();
		//var.method1();
		var.method2();
		
	}

}
