package Test0225;

class CellPhone {
	
	private String phoneNumber;
	private int totalCallTime;
	private int totalFee;
	private int feePerCallTime;
	
	public CellPhone() {
		super();
	}
	public CellPhone(String phoneNumber, int feePerCallTime) {
		this.phoneNumber = phoneNumber;
		this.feePerCallTime = feePerCallTime;
	}
	
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public int getTotalCallTime() {
		return totalCallTime;
	}
	public void setTotalCallTime(int totalCallTime) {
		this.totalCallTime = totalCallTime;
	}
	public int getTotalFee() {
		return totalFee;
	}
	public void setTotalFee(int totalFee) {
		this.totalFee = totalFee;
	}
	public int getFeePerCallTime() {
		return feePerCallTime;
	}
	public void setFeePerCallTime(int feePerCallTime) {
		this.feePerCallTime = feePerCallTime;
	}
	
	public void call(String phoneNumber, int totalCallTime) {
		
		System.out.println(phoneNumber+" 번호로 "+totalCallTime+"시간 통화함.");
		
		this.totalCallTime += totalCallTime;
	}
	
	public int calculationTotalFee() {
		totalFee=totalCallTime * feePerCallTime;
		return totalFee;
	}
	
}//end of class

class SmartPhone extends CellPhone{
	
	private boolean isMonthlyFixedRate;
	private int monthlyFixedFee;
	
	public SmartPhone() {
	}
	public SmartPhone(String phoneNumber, int feePerCallTime) {
		super(phoneNumber, feePerCallTime);
	}
	public SmartPhone(String phoneNumber, int feePerCallTime, boolean isMonthlyFixedRate, int monthlyFixedFee) {
		super(phoneNumber, feePerCallTime);
		this.isMonthlyFixedRate = isMonthlyFixedRate;
		this.monthlyFixedFee = monthlyFixedFee;
	}
	
//	public boolean isMonthlyFixedRate() {
//		return isMonthlyFixedRate;
//	}
//	public void setMonthlyFixedRate(boolean isMonthlyFixedRate) {
//		this.isMonthlyFixedRate = isMonthlyFixedRate;
//	}
//	public int getMonthlyFixedFee() {
//		return monthlyFixedFee;
//	}
//	public void setMonthlyFixedFee(int monthlyFixedFee) {
//		this.monthlyFixedFee = monthlyFixedFee;
//	}
	public int calculationTotalFee() {
		if(isMonthlyFixedRate) {
			System.out.println("고객님은 "+monthlyFixedFee+"정액 요금제입니다.");
			setTotalFee(monthlyFixedFee);
			return getTotalFee();
		}else 
			return super.calculationTotalFee();
	}
}//end of class

public class Prob3 {

	public static void main(String[] args) {
		CellPhone cellPhone = new CellPhone("010-010-010", 1000);
		cellPhone.call("017-017-017", 10);
		cellPhone.call("016-016-016", 10);
		cellPhone.calculationTotalFee();
		System.out.println(cellPhone.getPhoneNumber()+"의 통화시간은 "+cellPhone.getTotalCallTime()+"이며 \n"+"단가 "
							+cellPhone.getFeePerCallTime()+"원 총 요금은 "+cellPhone.getTotalFee()+"입니다.");
		
		System.out.println("==========================================");
		
		SmartPhone smartPhone = new SmartPhone("000-000-000", 200);
		smartPhone.call("017-017-017", 10);
		smartPhone.calculationTotalFee();
		System.out.println(smartPhone.getPhoneNumber()+"의 통화시간은 "+smartPhone.getTotalCallTime()+"이며 \n"+"단가 "
							+smartPhone.getFeePerCallTime()+"원 총 요금은 "+smartPhone.getTotalFee()+"입니다.");
		
		System.out.println("==========================================");
		SmartPhone smartPhone01 = new SmartPhone("111-111-111", 0, true, 3000);
		smartPhone01.call("017-017-017", 10);
		smartPhone01.call("016-016-016", 10);
		smartPhone01.calculationTotalFee();
		System.out.println(smartPhone01.getPhoneNumber()+"의 통화시간은 "+smartPhone01.getTotalCallTime()+"이며 \n"+"단가 "
							+smartPhone01.getFeePerCallTime()+"원 총 요금은 "+smartPhone01.getTotalFee()+"입니다.");
		
	}//end of main
}//end of class
