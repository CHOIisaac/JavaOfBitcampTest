package Test0224;


public class ArrayUtil {
	
	public char[] reverseString(char[] s, int start, int end) {
		char[] a = s.clone();
		char aa;
		while(start < end) {
			aa = a[start];
			a[start] = a[end];
			a[end] = aa;
			start++;
			end--;
			
		}
		return a;
	}

	public static void main(String[] args) {
		
		ArrayUtil au = new ArrayUtil();
		
		char[] s = {'J','a','v','a','P','r','o','g','r','a','m'};
		
		System.out.println(au.reverseString(s, 0, 3));
		System.out.println(au.reverseString(s, 4, 7));
		System.out.println(au.reverseString(s, 8, 10));
		System.out.println(au.reverseString(s, 0, 10));
		
	}//end of main

}//end of class
