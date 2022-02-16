//package a.base.ex06;

import java.util.Arrays;

//주어진 일차원 배열의 내용을 오름차순으로 정렬하는 프로그램 만들기 - 이중포문 사용하기
public class Prob05 {

	public static void main(String[] args) {
		
		int[] array = { 3, 24, 1, 55, 17, 43, 5 };
		int tmp = 0;
		for(int i = 0; i < array.length-1; i++) {
			
			for(int j = i+1; j < array.length; j++) {
				if(array[i]>array[j]) {
				tmp = array[i];
				array[i]= array[j];
				array[j]= tmp; 
				}
			}
		}
		for(int i = 0; i < array.length; i++) {
			if(array[i] == array[6]){
			System.out.print(+array[6]+"");
		}else{
			System.out.print(+array[i]+", ");
		}
	}
//	System.out.println(Arrays.toString(array));
	}//end of main
}//end of class
