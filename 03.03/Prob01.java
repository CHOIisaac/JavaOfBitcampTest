package Test0303;

public class Prob01 {

	public static void main(String[] args) {
		
		Account account01 = new Account("111-111-111", true, 1000000, 100000);
		try {
			System.out.println("0. 최초 계좌 상태");
			System.out.println("[계좌정보]"+account01);
			
			System.out.println("\n1. "+account01.getAccountNo()+" 계좌 200000 출금 요청");
			account01.withdraw(200000);
			System.out.println("[계좌정보]"+account01);
			
			System.out.println("\n2. "+account01.getAccountNo()+" 계좌 100000 입금 요청");
			account01.deposit(100000);
			System.out.println("[계좌정보]"+account01);
			
			System.out.println("\n3. "+account01.getAccountNo()+" 계좌 500000 출금 요청");
			account01.withdraw(500000);
			System.out.println("[계좌정보]"+account01);
			
			System.out.println("\n4. "+account01.getAccountNo()+" 계좌 600000 출금 요청");
			account01.withdraw(600000);
			System.out.println("[계좌정보]"+account01);
			
		}catch (Exception e) {
			System.out.println(">>> 예외발생 : "+account01.getAccountNo()+ " : "+e.getMessage());
		}
		System.out.println("\n==================================\n");
		
		Account account02 = new Account("222-222-222");
		try {
			System.out.println("0. 최초 계좌 상태");
			System.out.println("[계좌정보]"+account02);
			
			System.out.println("\n1. "+account02.getAccountNo()+" 계좌 100000 입금 요청");
			account02.deposit(100000);
			System.out.println("[계좌정보]"+account02);
			
			System.out.println("\n2. "+account02.getAccountNo()+" 계좌 50000 출금 요청");
			account02.withdraw(50000);
			System.out.println("[계좌정보]"+account02);
			
			System.out.println("\n3. "+account02.getAccountNo()+" 계좌 60000 출금 요청");
			account02.withdraw(600000);
			System.out.println("[계좌정보]"+account02);
			
		}catch (Exception e) {
			System.out.println(">>> 예외발생 : "+account02.getAccountNo()+ ":"+e.getMessage());
		}
		System.out.println("\n==================================\n");
	}

}
