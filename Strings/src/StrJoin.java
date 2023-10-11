import java.util.*;
public class StrJoin {

	public static void main(String[] args) {
		
		Scanner str=new Scanner(System.in);
		
		System.out.println("Enter your 1st string");
		String str1=str.nextLine();
		
		System.out.println("Enter your 2nd string");
		String str2=str.nextLine();
		
		String str3=str1.concat(str2);
		
		System.out.println("Joint String are:"+str3);
		
	}

}
