package Test0225;

public class Prob01 {
	
	public static String[] stringSplit(String str1, String str2) {
		String[] s = new String[str2.length()];
		
			s[0] += str1.replace(str2, "\n");
			
		return s;
	}

	public static void main(String[] args) {
		
		String str = "PROD-001#X-note#Samsung#3#6000000";
		
		String[] strs = stringSplit(str, "#");
		
		System.out.println("=== 문자열 처리 결과 ===");
		
		for(int i = 0; i < strs.length; i++) {
			
			System.out.println(strs[i]);
		}
	}//end of main
}//end of class
