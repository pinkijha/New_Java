
public class StrngSplit {

	public static void main(String[] args) {
		String str="I love u";
		
		String[] result=str.split(" ");
		System.out.println("result = ");

		for(String str1:result) {
			System.out.println(str1+ " ");
		}
	}

}
