package Test0302;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

public class FileCompareUtil {
	
	
	public ArrayList compareFile(String fstFileName, String scdFileName) throws Exception {
		
		BufferedReader br1 = new BufferedReader(new FileReader(fstFileName));
		BufferedReader br2 = new BufferedReader(new FileReader(scdFileName));
		
		ArrayList list = new ArrayList();
		
		String line1 = null;
		String line2 = null;
		
//		list1 = br1.readLine();
//		line = br.readLine();
		
		int count = 1;
		
		while((line1 = br1.readLine()) != null && (line2 = br2.readLine())!=null) {
//			String[] str1 = line1.split("\n"); 
			if(!(line1.equals(line2))) {
				
				list.add("Line "+count+": "+line1+"\n");
				count++;
			}
			
		}
		br1.close();
		br2.close();
		return list;
		
		
		
		
		
		
	}

	public static void main(String[] args) throws Exception{
		
		FileCompareUtil util = new FileCompareUtil();
		System.out.println(util.compareFile("/Users/choiingyu/eclipse-workspace/Bitcamp02/fstFile1.txt", 
											"/Users/choiingyu/eclipse-workspace/Bitcamp02/scdFile1.txt"));
		System.out.println("Successful!!!");
		
	}

}
