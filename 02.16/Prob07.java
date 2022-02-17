package a.base.ex08;

//프로그램 실행시 명령행 매개변수로 입력 받은 숫자를 이용하여 해당 숫자를 기준으로 역삼각형 모양의 '*'를 콘솔창에 출력하시오
public class Prob07 {

	public static void main(String[] args) {
		//명령행 매개변수로 5를 입력한 경우 
		//명령행 매개변수로 7을 입력한 경우
		//명령행 매개변수로 9를 입력한 경우 
		int input = Integer.parseInt(args[0]);
		
		if(input <= 0 || input % 2 == 0) {
			System.out.println("0보다 큰 홀수만 입력 가능합니다.");
			return;
		}
		
		for(int i = 0; i < input; i++) {
			for(int j = 0; j <= i; j++) {
				System.out.print(" ");
			}
			for(int k = input; k >= i * 2 + 1; k--) {
				System.out.print("*");
			}
			System.out.println();
		}
	}//end of main
}//end of class
