package Test0225;

import java.util.Vector;

public class Prob02 {
	
	public Vector<String> dataChange(String[] strData){

		Vector<String> vector = new Vector<String>(strData.length);
		
		for(int  i = 0; i < strData.length; i++) {
			
			StringBuffer sb = new StringBuffer(strData[i]);
			System.out.println(sb.reverse());
			vector.add(0, sb.reverse().toString()); 
			
		}
		
		
		return vector;
	}

	public static void main(String[] args) {
		Prob02 st = new Prob02();
		String[] strData = {"Java Programming", "JDBC", "Oracle10g", "JSP/Servlet"};
		Vector<String> v = st.dataChange(strData);
		
		for(int i = 0; i < v.size(); i++) {
			System.out.println(v.elementAt(i));
		}
	
	}

}
