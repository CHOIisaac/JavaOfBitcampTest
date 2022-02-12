package BitTest;

// 두 수를 입력 받고 두 사이의 값의 합 구하기 
public class Example3 {

	public static void main(String[] args) {
		int input1 = Integer.parseInt(args[0]);
		int input2 = Integer.parseInt(args[1]);
		int sum = 0;
		int tmp = 0;
		
//		if(input1 < input2) {
//			for(int i = input1; i <=input2; i++) {
//				sum += i;
//			}
//		}else if(input1 > input2){
//			for(int i = input2; i<=input1; i++ ) {
//				sum += i;
//			}
//		}else {
//			System.out.println("입력값이 같습니다.");
//			return;
//		}
//		System.out.println(sum);
		
		if(input2 < input1) {
			tmp = input1;
			input1 = input2;
			input2 = tmp;
		}else if(input1==input2){
			System.out.println("입력값이 같습니다.");
		}
		for(int i = input1; i <= input2; i++) {
			sum += i;
		
		}
		System.out.println(sum);
	}//end of main

}//end of class
