
public class Transaction {
	
	int transactionId;
	int amount;
	public int getTransactionId() {
		return transactionId;
	}
	public void setTransactionId(int transactionId) {
		this.transactionId = transactionId;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	
	public Transaction(int transId, int amt) {
		
		transactionId = transId;
		amount = amt;
		
	}
	
	
	

}
