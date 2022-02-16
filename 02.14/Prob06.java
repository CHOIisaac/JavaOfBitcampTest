//package a.base.ex07;

//주어진 년도의 월에 해당하는 말일을 계산하는 프로그램 만들기. 윤년인 경우 아래
//1. 4의 배수인 해는 윤년.
//2. 4의 배수이면서 100의 배수인 해는 윤년인이 아님
//3. 100의 배수이면서 400의 뱌수인 해는 윤년 
public class Prob06 {

	public static void main(String[] args) {
		
		int year = 2020;
		int month = 2;
		int maxDay = 0;
		
		if(year % 4 == 0 || year % 400 ==0 ){
			if(month == 2) {
				maxDay = 29;
			}else {
				System.out.println("윤년에 해당하는 달이 아닙니다.");
				return;
			}
		}else {
			maxDay = 28;
		}
			System.out.println(year+"년 "+month+"월의 말일은 "+maxDay+"일 입니다.");
	}

}
