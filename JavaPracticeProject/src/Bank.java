
public class Bank {

	static String bankName = "Union";
	String IFSCCode = "UBI54542";


	public static String getBankName() {
		return bankName;
	}

	public static void setBankName(String bankName) {
		Bank.bankName = bankName;
	}

	public String getIFSCCode() {
		return IFSCCode;
	}

	public void setIFSCCode(String iFSCCode) {
		IFSCCode = iFSCCode;
	}

	Bank(String name, String code) {
		bankName = name;
		IFSCCode = code;

	}

	/// static String bankName = "Sbi";

}
