package Test0304;

import java.util.Vector;

public class Prob03 {

	public static void main(String[] args) throws Exception {
		
		String pathName ="/Users/choiingyu/eclipse-workspace/Bitcamp03/data.txt";
		
		FileUtil.fileToPrint(pathName);
		
		System.out.println("====================");
		System.out.println("파일 내용 중 서울 정보 검색");
		Vector<User> vector = FileUtil.fileFindAddress(pathName, "서울");
		
		User user = new User();
		
		for(int i = 0; i < vector.size(); i++) {
			System.out.println(vector.elementAt(i));
		}
		
		System.out.println("====================");
		System.out.println("파일 내용 중 경주 정보 검색");
		vector = FileUtil.fileFindAddress(pathName, "경주");
		
		for(int i = 0; i < vector.size(); i++) {
			System.out.println(vector.elementAt(i));
			
		}
		
		System.out.println("====================");
		System.out.println("파일 내용 중 경기도 정보 검색");
		vector = FileUtil.fileFindAddress("/Users/choiingyu/eclipse-workspace/Bitcamp03/data.txt", "경기도");
		
		for(int i = 0; i < vector.size(); i++) {
			
			System.out.println(vector.elementAt(i));
		}
		
		
	}//end of main

}//end of class
