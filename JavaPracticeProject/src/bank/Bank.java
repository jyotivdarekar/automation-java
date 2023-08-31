package bank;

public class Bank {

	String bankName = "Union";
	String IFSCCode = "UBI54542";

	String getBankName() {
		return bankName;
	}

	public void setBankName(String bankName) {
		bankName = bankName;
	}

	public String getIFSCCode() {
		return IFSCCode;
	}

	public void setIFSCCode(String iFSCCode) {
		IFSCCode = iFSCCode;
	}

	public Bank(String name, String code) {
		bankName = name;
		IFSCCode = code;

	}

}
