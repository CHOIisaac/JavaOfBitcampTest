package Test0302;

import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.PrintWriter;

public class Grade {
	
	public void printGrade(String fileName) {
		try {
			BufferedReader br = new BufferedReader(new FileReader(fileName));
			PrintWriter pw = new PrintWriter(new FileOutputStream(fileName, true));
			
			String line = "";
			
			int sum = 0;
			int result = 0;
			String[] array = null;
			int count = 0;
			
			while((line=br.readLine()) != null) {
				
				array = line.split(",");
				
				sum = Integer.parseInt(array[1]);
				
				pw.println(array[0]+"의 점수는 "+array[1]+"점 입니다.");
				System.out.println(array[0]+"의 점수는 "+array[1]+"점 입니다.");
				result += sum;
				count++;
			}
			pw.println("모두의 총점은 "+result+"점 입니다.");
			System.out.println("모두의 총점은 "+result+"점 입니다.");
			pw.println("모두의 평균는 "+result/count+"점 입니다.");
			System.out.println("모두의 평균는 "+result/count+"점 입니다.");
			
			pw.flush();
			pw.close();
			
		} catch (Exception e) {
		e.printStackTrace();
		}
		
		
	}//end of method

	public static void main(String[] args) {
		
		Grade grade = new Grade();
		String fileName = "C:\\workspace\\HOMEWORK\\files\\score.txt";
		grade.printGrade(fileName);
		
	}//end of main

}//end of class

