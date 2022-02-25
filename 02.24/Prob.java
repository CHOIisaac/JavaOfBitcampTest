package Test0224;

public class Prob {

	public static String myReplace(String str, char oldChar, char newChar) {
		String var = "";
		for(int i = 0; i < str.length(); i++) {
			if(str.charAt(i)==oldChar) {
				var += newChar;
			}else {
				var += str.charAt(i);
			}
		}
		return var;
		
	}
	
	public static void main(String[] args) {
		System.out.println("문자열에 특정 문자변경하는 테스트");
		System.out.println("------Sample 1--------");
		String str1 = myReplace("hello world",'l','*');
		System.out.println(str1);
		
		System.out.println("------Sample 2--------");
		String str2 = myReplace("hello world",' ','-');
		System.out.println(str2);
		
		System.out.println("------Sample 3--------");
		String str3 = myReplace("hello world",'a','*');
		System.out.println(str3);
		
	}

}
