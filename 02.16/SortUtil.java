package b.method.ex05;

public class SortUtil {
	
	public int[] ascending(int[] inputNumbers) {
		//implements method
		int tmp = 0;
		for(int i = 0; i < inputNumbers.length-1; i++) {
			
			for(int j = i+1; j < inputNumbers.length; j++) {
				
				if(inputNumbers[i]>inputNumbers[j]) {
					
				tmp = inputNumbers[i];
				inputNumbers[i]= inputNumbers[j];
				inputNumbers[j]= tmp; 
				}
			}
		}
		return inputNumbers;
	}
	public static void main(String[] args) {
		SortUtil util = new SortUtil();
		int[] numbers = new int[] {7, 5, 2, 19, 34, 51, 32, 11, 67, 21};
		
		numbers = util.ascending(numbers);
		
		for(int i = 0; i < numbers.length; i++) {
			System.out.print(numbers[i]);
			
			if(i != numbers.length-1) {
				System.out.print(", ");
			}else {
				System.out.println("");
			}
		}
		System.out.println("Successful!!");
	}//end of main
}//end of class
