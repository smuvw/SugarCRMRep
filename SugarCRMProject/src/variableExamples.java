
public class variableExamples {
	
	static int i; //instace variable 
	static int m; //instace variable 

	public static void main(String[] args) {
		 int j; //this local variable to MAin method 
		 //Student s1=new Student();
		 Student.name="sri";
		 System.out.println("student name is " + Student.name);
		 variableExamples.add();
		 variableExamples.i=10;
		variableExamples.m=100;
	}
	
	public static void add(){
		int k; //this local variable to add method 
		k=10;
		System.out.println(k);
		
	}

}
