package Test0228;

public class Prob01 {
	
	public String toEncoding(String str) {
		
		String in = "";
		
		for(int i = 0; i < str.length(); i++) {
			
			char c = str.charAt(i);
			
			if( (c <='9' && '0'<=c) || (c >='A' && 'z'>=c) || c==' ') {
				in += c;
				
				
			}else {	
				String tmpString = c+"";
				byte[] temp = tmpString.getBytes();
				for(int j = 0; j < temp.length; j++) {
					
					in += "%"+Integer.toHexString(temp[j]).toUpperCase().substring(6,8);
				}
				
			}
			
		}
		return in;
		
		
	}//end of method

	public static void main(String[] args) {
		Prob01 p1 = new Prob01();
		
		System.out.println("입력 : Korea");
		System.out.println("출력 : "+p1.toEncoding("korea"));
		System.out.println("입력 : 홍길동");
		System.out.println("출력 : "+p1.toEncoding("홍길동"));
		System.out.println("입력 : 홍 길 동");
		System.out.println("출력 : "+p1.toEncoding("홍 길 동"));
		System.out.println("입력 : Hong 길 동");
		System.out.println("출력 : "+p1.toEncoding("Hong 길 동"));
		System.out.println("입력 : 0319");
		System.out.println("출력 : "+p1.toEncoding("0319"));
		
		
	}//end of main

}//end of class
