
public class Test {
	
	public static void main(String[] args) {
		System.out.println(getBinary(2, ""));
	}
	
	private static String getBinary(int n, String value) {
		
		if(n == 1 || n == 0) {
			return n + "";
		}
		
		n = n % 2;
		value = n + "";
		return getBinary(n, value) + value;
	}

}
