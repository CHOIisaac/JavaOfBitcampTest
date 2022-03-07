package Test0304;

import java.io.FileWriter;
import java.io.PrintWriter;

import javax.sound.midi.Soundbank;

public class Prob02 {
	
	private static int[] generateRandomNumber() {
		
		int[] arrayInt = new int[10];
		int[] arr = new int[10];
		
		for(int i = 0; i < 10; i++) {
			
			arrayInt[i] = (int)(Math.random()*20)+1;
			
			for(int j = 0; j < i; j++) {
				if(arrayInt[i]==arrayInt[j]) {
					i--;
					break;
				}
			}
			
			}
//		System.out.println(arrayInt[0]);
//		System.out.println(arrayInt[1]);
		
//		for(int i = 0; i < arrayInt.length; i++) {
//			arr = arrayInt;
//		}
		
		return arrayInt;
		
	}//end of method
	
	public static void printStatistics(int[] array) throws Exception {
		PrintWriter bw = null;
		
		int max = array[0];
		int min = array[0];
		int sum = 0;
		float avg = 0;
		
		try {
			bw = new PrintWriter(new FileWriter("/Users/choiingyu/eclipse-workspace/Bitcamp02/store.txt"));
			
			for(int i = 0; i < array.length; i++) {

				sum += array[i];
				
				avg = sum / (float)array.length;
				
				bw.println(array[i]);
				
				if(array[i] > max) {
					
					max = array[i];
					
				}else if(array[i] < min){
					
					min = array[i];
				}
			}
			bw.println("최대값 : "+max);
			bw.println("최소값 : "+min);
			bw.println("평균값 : "+avg);
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			bw.close();
		}
		
		
	}

	public static void main(String[] args) throws Exception {
		
		int[] array = generateRandomNumber();
		printStatistics(array);
	}//end of main

}//end of class
