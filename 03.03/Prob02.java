package Test0303;
 
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Vector;

public class Prob02 {

	public Vector getScore(String fileName) {
		
		Vector vector = new Vector();
		String line = " ";
		
		String[] array = null;
		int count = 0;
		try {
			BufferedReader br = new BufferedReader(new FileReader(fileName));
			while((line= br.readLine()) != null) {
				
				array = line.split("/");
			
				String name = array[0];
				int kor = Integer.valueOf(array[1]);
				int eng = Integer.valueOf(array[2]);
				int math = Integer.valueOf(array[3]);
				int sum = kor+eng+math;
				
				Score s = new Score(name, kor, eng, math, sum);
				
				vector.add(s);
			}
			
			
		br.close();
		
		}catch (Exception e) {
			e.printStackTrace();
		}
		return vector;
		
	}
	
	public static void main(String[] args) {
		
		Prob02 p2 = new Prob02();
		Vector scores = p2.getScore("/Users/choiingyu/eclipse-workspace/Bitcamp02/data.txt");
		for(int i = 0; i < scores.size(); i++) {
			Score score = (Score)scores.get(i);
			System.out.println(score.getName()+":"+score.getKor()+" "+score.getEng()+" "+score.getMath()+ " "+score.getSum());
		}
		
	}//end of main

}//end of class
