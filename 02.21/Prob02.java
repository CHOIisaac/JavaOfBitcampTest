package Test0221;

public class Prob02 {

	public static void main(String[] args) {
		
		String sourceString = "everyday we have is one more than we deserve";
		String encodedString = "";
		
		//프로그램 구현부 시작
		//참고 문자'a'의 정수 값은 97이며, 'z'는 122이다. 
		//char c='a';
		//int i = (int)c;
		//char c1 = (char)i;
		
		for(int i = 0; i < sourceString.length(); i++) {
			char c = sourceString.charAt(i);
			 if(c == ' ') {
				 encodedString += ' ';
			 }else if(c== 'x'||c=='y'||c=='z') {
				 encodedString += (char)(c-23);
			 }else {
				 encodedString += (char)(c+3);
			 }
		
		}
		
		System.out.println("암호화할 문자열 : "+sourceString);
		System.out.println("암호화된 문자열 : "+encodedString);
	}
	

}
