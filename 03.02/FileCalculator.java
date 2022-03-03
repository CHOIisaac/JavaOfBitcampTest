package Test0302;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class FileCalculator {
	
	public void addCalculateResult(String inputFileName) throws Exception{
		
		BufferedReader br = new BufferedReader(new FileReader(inputFileName));
		BufferedWriter bw = new BufferedWriter(new FileWriter(inputFileName, true));
		
		String line2 = null;

		int sum = 0;
		
		int multi = 1;
		while((line2 = br.readLine()) != null) {
			
			System.out.println(line2);

			sum += Integer.parseInt(line2);
			
			multi *= Integer.parseInt(line2);
			
		}
		bw.newLine();
		bw.write(String.valueOf(sum));
		
		bw.newLine();
		bw.write(String.valueOf(multi));
		
		
		bw.flush();
		
		br.close();
		bw.close();	
		System.out.println(sum);
		System.out.println(multi);
		
		
	}

	public static void main(String[] args)  throws Exception{
		
		FileCalculator fc = new FileCalculator();
		fc.addCalculateResult("/Users/choiingyu/eclipse-workspace/Bitcamp02/test.txt");
		
	}//end of main

}//end of class
