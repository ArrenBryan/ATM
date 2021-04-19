package w13_guiATM;

/**
 *
 * @author arrenbryan
 */
public class Account {

    private String accountName = "";
    private String accountNumber = "";
    private String accountPin = "";
    private int accountBalance = 0;

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public String getAccountPin() {
        return accountPin;
    }

    public int getAccountBalance() {
        return accountBalance;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }
    
    public void setAccountPin(String accountPin) {
        this.accountPin = accountPin;
    }

    public void setAccountBalance(int accountBalance) {
        this.accountBalance = accountBalance;
    }

    public void appendAccountNumber(String accountNumber) {
        this.accountNumber += accountNumber;
    }

    public void appendAccountPin(String accountPin) {
        this.accountPin += accountPin;
    }
}
