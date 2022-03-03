package Test0303;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Vector;

public class Prob03 {
	
	
	public Vector<String> getList() {
		
		Vector<String> vector = new Vector<String>();
		
		BufferedReader br = null;
		try {
			br= new BufferedReader(new FileReader("/Users/choiingyu/eclipse-workspace/Bitcamp02/list.txt"));
			
			String[] array = null;
			
			int score = 0;
			
			String line = "";
			while((line = br.readLine()) != null) {
				array = line.split("/");
				
				score = Integer.valueOf(array[2]);
				
				if((array[1].equalsIgnoreCase("JAVA") && score >= 80) || (array[1].equalsIgnoreCase("sql") && score >= 90)) {
					
					array[2]= String.valueOf(score);
					
					vector.add(array[0]+", "+array[1]+", "+array[2]+", 수료");
					
				}else {
					
					vector.add(array[0]+", "+array[1]+", "+array[2]+", 미수료");
				}
			}
			System.out.println(vector.get(0));
			
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		return vector;
	}

	public static void main(String[] args) {
		
		Prob03 e = new Prob03();
		Vector<String> scores = e.getList();
		for(int i = 0; i < scores.size(); i++) {
			System.out.println(scores.get(i));
			
		}
		
	}//end of main

}//end of class
