package a.base.ex09;

import java.util.Scanner;

public class Prob09 {
	
public static void main(String[] args) {
		
//		int input = Integer.parseInt(args[0]);
//		
//		if(input <= 0 || input % 2 == 0) {
//			System.out.println("0보다 큰 홀수만 입력 가능합니다.");
//			return;
//		}
		Scanner scanner = new Scanner(System.in);
		int count = scanner.nextInt();
		int starCount = count;
		
		for(int i = 0; i < count; i++) {
			for(int j = count; j > i; j--) {
				System.out.print(" ");
			}
			for(int k = 1; k <= i * 2 + 1; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		
		
	}// end of main

}// end of class
