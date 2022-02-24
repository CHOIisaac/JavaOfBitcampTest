package Test0223;

public class Prob02 {
	
	public String leftPad(String str, int size, char padChar) {
		if(str.length()>size) {
			return str;
		}
		for(int i = str.length(); i < size; i++) {
			
			System.out.print(padChar);
		}
		System.out.print(" ");
		return str;
	}

	public static void main(String[] args) {
		Prob02 prob03 = new Prob02();
		
		System.out.println(prob03.leftPad("ABC", 6, '#'));
		System.out.println(prob03.leftPad("ABC", 5, '$'));
		System.out.println(prob03.leftPad("ABC", 2, '&'));
	}

}
