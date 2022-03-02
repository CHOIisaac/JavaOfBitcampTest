package Test0228;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;

public class FileController {
	
	public void reverseLine(String oldf, String newf) throws Exception{
		
		BufferedReader br = new BufferedReader(new FileReader(oldf));
		
		List<String> list = new ArrayList<String>();
		
		String line = null;
		
//		line = br.readLine();
		
		while((line = br.readLine()) != null) {
			list.add(line);
		}
		br.close();
		
		BufferedWriter pw = new BufferedWriter(new FileWriter(newf));
		
		for(int i = list.size()-1; i >= 0; i--) {
			pw.write(list.get(i)+"\n");
		}
		pw.flush();
		pw.close();
		
		
		
		
	}//end of method

	public static void main(String[] args) throws Exception {

		FileController c = new FileController();
		String oldf = "/Users/choiingyu/eclipse-workspace/Bitcamp02/test.txt";
		String newf = "/Users/choiingyu/eclipse-workspace/Bitcamp02/newf.txt";
		c.reverseLine(oldf, newf);
		
	}//end of main

}//end of class
