
public class Account {
	
	private int accountNo;
	private int accBalance;
	public int getAccountNo() {
		return accountNo;
	}
	public void setAccountNo(int accountNo) {
		this.accountNo = accountNo;
	}
	public int getAccBalance() {
		return accBalance;
	}
	public void setAccBalance(int accBalance) {
		this.accBalance = accBalance;
	}
	
	Account(int accNo, int accBal){
		accountNo = accNo;
		accBalance = accBal;
		
	}
	
	
	
	
}
