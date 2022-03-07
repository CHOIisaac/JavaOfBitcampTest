package Test0304;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Prob04 {
	
	public static char checkGrade(double avg) {
		
		if(avg >= 90) {
			
		}else if(avg >= 80) {
			
			return 'B';
			
		}else if(avg >= 70) {
			
			return 'C';
			
		}else if(avg >= 60) {
			
			return 'D';
			
		}else {
			
			return 'F';
			
		}
		
		return 'A';
	}//end of method

	public static void main(String[] args) {
		
		String stdNum = "";
		int kor = 0;
		int math = 0;
		int eng = 0;
		int java = 0;
		int sum = 0;
		double avg = 0;
		
		PrintWriter bw = null;
		
		try {
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("학번을 입력하세요.");
		stdNum = keyboard.nextLine();
		System.out.println("국어 성적을 입력하세요.");
		kor = keyboard.nextInt();
		System.out.println("수학 성적을 입력하세요.");
		math = keyboard.nextInt();
		System.out.println("영어 성적을 입력하세요.");
		eng = keyboard.nextInt();
		System.out.println("자바 성적을 입력하세요.");
		java = keyboard.nextInt();
		
		sum = kor + math + eng + java;
		
		avg = sum / (double)4;
		
		bw = new PrintWriter(new FileWriter("/Users/choiingyu/eclipse-workspace/Bitcamp03/grade.txt"));
			
			bw.println("---------------");
			bw.println("학번 : "+stdNum);
			bw.println("---------------");
			bw.println("국어 : "+kor);
			bw.println("수학 : "+math);
			bw.println("영어 : "+eng);
			bw.println("---------------");
			bw.println("총점 : "+sum);
			bw.println("평균 : "+avg);
			bw.println("학점 : "+checkGrade(avg));
			bw.println("---------------");
			
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			bw.close();
		}
		
	}//end of main

}//end of class
