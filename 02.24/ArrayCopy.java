package Test0224;

import java.util.Vector;

public class ArrayCopy {
	
	public Vector<String> moveToVector(String[] datas){
		
		Vector<String> vector = new Vector<String>();
		
		for(int  i = 0; i < datas.length; i++) {
			vector.add(i, "\""+datas[datas.length-i-1]+"\"" ); 
		}
		return vector;
	}

	public static void main(String[] args) {
		
		ArrayCopy ac = new ArrayCopy();
		String datas[] = {"1","2","3","4","5"};
		System.out.println(ac.moveToVector(datas));
		
	}

}
