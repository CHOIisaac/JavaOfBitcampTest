package Test0223;

public class Util {
	int count = 0;
	int countCheck = 0;
	int countCheck1 = 0;
	
	int[] prime = new int[19];
	public int findPrimeCount(int limit) {
		 int count=0;
	        for(int i=2; i<=limit; i++){
	            for(int j=2; j<=i; j++){
	                if(i%j == 0){
	                    count ++;
	                    
	                }
	            }

	            // 핵심 : 1을 제외하고 자기 자신으로 한 번만 나눠질때 소수
	            if(count==1){
	            	countCheck++;
	            }
	            count=0;
	        }
	        return countCheck;
	}
	
	public int[] findPrimeReturnArray(int limit) {
		 int count=0;
	        for(int i=2; i<=limit; i++){
	            for(int j=2; j<=i; j++){
	                if(i%j == 0){
	                    count ++;
	                }
	            }

	            // 핵심 : 1을 제외하고 자기 자신으로 한 번만 나눠질때 소수
	            if(count==1){
	            	prime[countCheck1++] = i;
	            }
	            count=0;
	        }
	        return prime;
	}

}//end of class
