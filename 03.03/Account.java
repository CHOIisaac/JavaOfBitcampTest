package Test0303;

public class Account {
	
	private String accountNo; //계좌 번호 
	private boolean creditLine; //마이너스 통장 유무 
	private int creditLineLimit; //마이너스 금액 한도 
	private int balance; //통장 잔고
	
	public Account() {
	}
	public Account(String accountNo) {
		this.accountNo = accountNo;
	}
	public Account(String accountNo, boolean creditLine, int creditLineLimit, int balance) {
		this.accountNo = accountNo;
		this.creditLine = creditLine;
		this.creditLineLimit = -creditLineLimit;
		this.balance = balance;
		
	}
	public boolean isCreditLine() {
		return creditLine;
	}
	public void setCreditLine(boolean creditLine) {
		this.creditLine = creditLine;
	}
	public String getAccountNo() {
		return accountNo;
	}
	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}
	public int getCreditLineLimit() {
		return creditLineLimit;
	}
	public void setCreditLineLimit(int creditLineLimit) {
		this.creditLineLimit = creditLineLimit;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	
	public void deposit(int money) {
		balance += money;
	}
	public void withdraw(int money) throws Exception {
		balance -= money;
		if(balance < creditLineLimit) {
			
			throw new Exception("잔고부족 출금 불가합니다.");
		}
	}
	
	public String toString() {
		if(creditLine) {
			return "계좌 번호 :"+accountNo+", 잔고 :"+balance+"\t[["+creditLineLimit+"원 마이너스통장]]";
		}
		return "계좌 번호 :"+accountNo+", 잔고 :"+balance+"원";
	}
	

}
