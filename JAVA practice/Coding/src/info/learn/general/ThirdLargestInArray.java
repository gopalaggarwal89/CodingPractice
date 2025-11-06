package info.learn.general;

public class ThirdLargestInArray {
	
	public static void main(String[] args) {
		
		int[] array = {1,5,10,2,8,5,19};
		
		int first = 0;
		int second = 0;
		int third = 0;
		
		for(int i=0;i<array.length;i++) {
			int temp = array[i];
			if(temp > first) {
				third = second;
				second = first;
				first = temp;
			}
			
			if(temp > second && temp != first) {
				second = temp;
			}
			
			if(temp > third && temp !=first && temp !=second) {
				third = temp;
			}
		}
		
		System.out.println(third);
	}
}
