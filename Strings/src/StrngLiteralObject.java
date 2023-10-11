
public class StrngLiteralObject {

	public static void main(String[] args) {
		String s1="pinki";
		String s2="pinki";
		String s3=new String("pinki");
		String s4=new String("pinki");
		
		System.out.println("s1==s2"+ s1==s2);
		System.out.println("s1==s2"+ s1==s3);
		System.out.println("equals Method::"+ s4.equals(s2));
		System.out.println("s1==s2"+ s3==s4);

	}

}
