

import java.util.*;
public class StrCompare {

	public static void main(String[] args) {
		
		Scanner c1=new Scanner(System.in);
		
		System.out.println("Enter 1st string:");
		String st1=c1.nextLine();	
		
		System.out.println("Enter 2nd string:");
		String st2=c1.nextLine();
		
		boolean result=st1.equals(st2);
		boolean result1=(st1==st2);
		

	System.out.println("result:"+result);
	System.out.println("result1:"+result1);
		

//		if(st1.equals(st2))
//		{
//			System.out.println("Both String values are same");
//		}
//		else {
//			System.out.println("Both String values are not same");
//			
//		}
	}

}
