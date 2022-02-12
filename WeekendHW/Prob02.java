package a.base.ex02;

//50이하의 소수를 모두 출력하기 
public class Prob02 {

	public static void main(String[] args) {
		int limit = 50;
		 int count=0;
 		boolean prime = false;
 		
 		int i = 1;
 		while(!prime) {
 			i++;
 			for(int j = 2; j <= i; j++) {
 				if(i%j==0) {
 					count++;
 				}
 			}
 			if(count==1) {
 				System.out.println(i);
 			}else if(i > limit){
 				return;
 			}
 			count=0;
 			
 		}

	}//end of main

}//end of class
