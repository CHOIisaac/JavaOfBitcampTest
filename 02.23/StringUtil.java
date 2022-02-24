package Test0223;

public class StringUtil {
	private static String replaceString(String[] arr) {
		int countCheck=0;
		int count=0;
		int result = 0;
		String arrr;
		
		for(int i = 0; i < arr.length; i++) {
				
			count = 0;
				
			for(int j = 0; j < arr[i].length(); j++) {
				
				
				if(arr[i].charAt(j) == 'a') {
					count++;
//					countCheck++;
				}
				if(count >= countCheck) {
					countCheck = count;
					result = i;
				}
			}
		}
		arrr =  arr[result].replace('a', 'A');
		return arrr;
		
	}//end of method

	public static void main(String[] args) {
		
		String[] arr = {"java program", "array", "java program area", "append"};
		String result = StringUtil.replaceString(arr);
		System.out.println("변경된 문자열 "+result);
		
	}//end of main

}//end of class
