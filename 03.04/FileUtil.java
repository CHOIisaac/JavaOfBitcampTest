package Test0304;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Vector;

public class FileUtil {
	
	public static void fileToPrint(String fileName) throws Exception {
		
		BufferedReader br = new BufferedReader(new FileReader(fileName));
		
		String line;
		
		while((line = br.readLine()) != null) {
			System.out.println(":: "+line);
		}
		
	}
	
	public static Vector<User> fileFindAddress(String fileName, String address) throws Exception{
		
		BufferedReader br = new BufferedReader(new FileReader(fileName));
		
		Vector<User> vector = new Vector<User>();
		
		
		String line = null;
		String[] str = null;
		
		User user = null;
		
		boolean male = true;
		while((line = br.readLine()) != null) {
			
				
			if(line.contains(address)) {
				str = line.split("/");
				
				
				
			
			
			if(str[3].equals("남")) {
					user = new User(str[0], str[1], str[2], male);
					
			}else {

					male = false;
					user = new User(str[0], str[1], str[2], male);
				}
			vector.add(user);
			}else {
				continue;
				}
			}
		return vector;
	}//end of method
}//end of class
