
public class StudentMain {
	
	int stuno;
	public void add(){
		System.out.println("add method");
	}

	public static void main(String[] args) {
		
		//Create object
		//<class name> <Ref varaibalename> = new <classname()>;
		//new is keyword in java to create object 
		
	
		Student s1=new Student(); 
		
		s1.name="srini";
		System.out.println(s1.name);
		s1.fee=100;
		System.out.println(s1.fee);
		s1.course="Selenium";
		System.out.println(s1.course);
		s1.name="raju";

		
		StudentMain s2=new StudentMain();
		s2.add();
		s2.stuno=100;
		System.out.println(s2.stuno);
	}

}
