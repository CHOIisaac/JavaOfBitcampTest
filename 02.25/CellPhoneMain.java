package Test0225;

class CellPhone1 {
	String model;
	double battery;
	
	public CellPhone1(){
	}
	public CellPhone1(String model) {
	}
	
	public void call(int time) throws IllegalArgumentException{
		battery = -(time * 0.5);
		
		if(battery < 0) {
			
			battery = 0;
			
		}else if(time<0) {
			
			time = 0;
			
			throw new IllegalArgumentException("통화 시간 입력 오류");
		}
		System.out.println("통화 시간 : "+time+"분");
	}
	
	public void charge(int time) throws IllegalArgumentException{
		battery = time * 3;
		
		if(battery>100) {
			
			battery=100;
			
		}else if(time<0){
			
			time =0;
			
			throw new IllegalArgumentException("충전 시간 입력 오류");
		}
		
		System.out.println("충전 시간 : "+time+"분");
	}
	
	public void printBattery() {
		
		System.out.println("남은 배터리 양 : "+battery);
	}
	
	public boolean equals(Object otherObject) {
		if (otherObject instanceof CellPhone1) {
			CellPhone1 CellPhone1 = (CellPhone1)otherObject;
			return true;
        } else {
            return false;
        }
		
	}
}

public class CellPhoneMain {

	public static void main(String[] args) {
		
		CellPhone1 myPhone = new CellPhone1("SCH-600");
		
		myPhone.charge(20);
		myPhone.printBattery();
		System.out.println();
		
		myPhone.call(300);
		myPhone.printBattery();
		System.out.println();
		
		myPhone.charge(50);
		myPhone.printBattery();
		System.out.println();
		
		myPhone.call(40);
		myPhone.printBattery();
		System.out.println();
		
		try {
			myPhone.call(-20);
		}catch(IllegalArgumentException e) {
			System.out.println(e.getMessage());
		}
		System.out.println();
		
		CellPhone1 yourPhone = new CellPhone1("SCH-600");
		
		if(myPhone.equals(yourPhone)) {
			System.out.println("동일 모델입니다.");
		}else {
			System.out.println("다른 모델입니다.");
		}
		
	}

}
