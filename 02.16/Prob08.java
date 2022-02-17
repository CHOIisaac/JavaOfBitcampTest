package b.method.ex01;

//두 개의 숫자를 매개변수로 받아서 두 숫자 사이의 차를 구하되, 실행 결과가 음수일 경우 양의 정수로 변경하여 리턴하는 abs()메서드를 구현하시오
public class Prob08 {
	
	public int abs(int num1, int num2) {
		int sum = num1 - num2;
		return sum < 0 ? -(sum) : sum;
	}


	public static void main(String[] args) {
		int num1 =6;
		int num2 = 15;
		
		Prob08 prob = new Prob08();
		System.out.println("두 수의 차는 : "+prob.abs(num1, num2));
	}

}
