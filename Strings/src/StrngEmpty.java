import java.util.*; 
public class StrngEmpty {

	public static void main(String[] args) {
		 
		Scanner str=new Scanner(System.in);
		System.out.println("Enter Your Name: ");
	
		String name=str.nextLine();

		System.out.println("Enter Your Email: ");
		String email=str.nextLine();

		System.out.println("Enter Your Password: ");
		String password=str.nextLine();
		
		System.out.println("Name is :"+ name);
		System.out.println("Email is :"+ email);
		System.out.println("Password is :"+ password);
		str.close();
		 

	}

}
