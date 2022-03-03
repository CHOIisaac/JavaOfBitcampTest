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
			String[] array = null;
			
			while((line = br.readLine()) != null) {
				
				array = line.split(",");
				pw.println(array[0]+"의 점수는 "+array[1]+"점 입니다.");
				
			}
			pw.flush();
			pw.close();
			
		} catch (Exception e) {
		
		}
		
		
	}

	public static void main(String[] args) {
		
		Grade grade = new Grade();
		String fileName = "/Users/choiingyu/eclipse-workspace/Bitcamp02/score.txt";
		grade.printGrade(fileName);
		
	}

}
