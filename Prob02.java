package Test0228;


public class Prob02 {
	
	private static String getParameter(String url, String paramName) {
		
		int  location = url.indexOf("?");
		
		String str = url.substring(location, url.length());
		
		String[] string = str.split("&");
		
		String result = "";
		
		for(int i = 0; i < string.length; i++) {
			
			if(string[i].startsWith(paramName)) {
				
				String[] stringA = string[i].split("=");
				
				result = stringA[1];
			}
		}
		return result;
		
	}//end of method
	

	public static void main(String[] args) {
		
		String url1 = "http://localhost/order?prodId=PROD-001&prodName=갤럭시3&price=980000";
		String prodName = getParameter(url1, "prodName");
		System.out.println("제품 이름 : "+prodName);
		
		String url2 = "http://localhost/registUser?userId=USER-001&userName=홍길동&address=서울시 강남구&userAge=26";
		String uesrAddress = getParameter(url2, "address");
		System.out.println("회원 주소 : "+uesrAddress);
		
	}//end of main

}//end of class
