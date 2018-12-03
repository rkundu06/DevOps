package javaPractice;

class Teacher {

	private String designation = "Teatcher";
	private String collegename = "Beginnersbook";

	protected String getDesignation() {

		return designation;
	}

	public void setDesignation(String desig) {

		this.designation = desig;

	}
	
	private void Teacher(String des){
		this.designation= des;
		
	}
	
	

}

public class InheritanceExample extends Teacher {

	public static void main(String[] args) {
		InheritanceExample test= new InheritanceExample();
		Teacher tc=new Teacher();
		test.setDesignation("Student");
		//tc.setDesignation("Rajesh");
		//String str=test.getDesignation();
		tc.setDesignation("Rajesh");
		System.out.println("Designation:-"+ tc.getDesignation());
		

	}

}
