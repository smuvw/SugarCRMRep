package Login;

public class validateLopinPage {

	public static void main(String[] args) {
		
		
		//Access non-static data members creating thru non-statis 
		
		LoginApp s1=new LoginApp();  //Object Created 
		
		s1.a=100;
		s1.b=200;
		//s1.c=300;
		s1.name="sri";
		s1.city="NY";
		System.out.println(s1.city);
		
		LoginApp.city="chicago";
		System.out.println(LoginApp.city);
		
		LoginApp.address="123 Main";
		
		
		
				
			
		

	}

}
