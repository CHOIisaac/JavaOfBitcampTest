package a.base.ex04;

import java.util.Scanner;

//임의의 정수를 입력 받아서, 1부터 1000까지의 수 중에서 입력받은 정수의 배수 개수와 배수들의 합을 출력하기.
public class prob04 {

	public static void main(String[] args) {
		int number = 0;
		int count = 0;
		int sum = 0;
		
		Scanner keyboard = new Scanner(System.in);
		System.out.print("양의 정수를 입력하세요 : ");
		number = keyboard.nextInt();
		
		if( 1 <= number || number <= 1000 ) {
			count = 1000 / number;
			System.out.println(number+"의 배수 개수 = "+count);
			for(int i = number; i <= 1000; i++) {
				if( i % number == 0) {
					sum += i;
				}
			}
			System.out.println(number+"의 배수 합 = "+sum);
		}
	}

}
