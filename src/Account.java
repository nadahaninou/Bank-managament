import java.util.List;
public class Account {
    private   int Account_Number;
    private String Account_Type;
    private double Balance;
    private String Account_Holder_LastName;
    private String Account_Holder_FistName;
    private int Account_holder_Id;
    private String Status;
    private List<Integer> Transactions;

    public Account(int account_Number, String account_Type, double balance, String account_Holder_LastName, String account_Holder_FistName, int account_holder_Id, String status, List<Integer> transactions) {
        Account_Number = account_Number;
        Account_Type = account_Type;
        Balance = balance;
        Account_Holder_LastName = account_Holder_LastName;
        Account_Holder_FistName = account_Holder_FistName;
        Account_holder_Id = account_holder_Id;
        Status = status;
        Transactions = transactions;
    }

    public int getAccount_Number() {
        return Account_Number;
    }

    public void setAccount_Number(int account_Number) {
        Account_Number = account_Number;
    }

    public String getAccount_Type() {
        return Account_Type;
    }

    public void setAccount_Type(String account_Type) {
        Account_Type = account_Type;
    }

    public double getBalance() {
        return Balance;
    }

    public void setBalance(double balance) {
        Balance = balance;
    }

    public String getAccount_Holder_LastName() {
        return Account_Holder_LastName;
    }

    public void setAccount_Holder_LastName(String account_Holder_LastName) {
        Account_Holder_LastName = account_Holder_LastName;
    }

    public String getAccount_Holder_FistName() {
        return Account_Holder_FistName;
    }

    public void setAccount_Holder_FistName(String account_Holder_FistName) {
        Account_Holder_FistName = account_Holder_FistName;
    }

    public int getAccount_holder_Id() {
        return Account_holder_Id;
    }

    public void setAccount_holder_Id(int account_holder_Id) {
        Account_holder_Id = account_holder_Id;
    }

    public String getStatus() {
        return Status;
    }

    public void setStatus(String status) {
        Status = status;
    }

    public List<Integer> getTransactions() {
        return Transactions;
    }

    public void setTransactions(List<Integer> transactions) {
        Transactions = transactions;
    }

    @Override
    public String toString() {
        return "Account{" +
                "Account_Number=" + Account_Number +
                ", Account_Type='" + Account_Type + '\'' +
                ", Balance=" + Balance +
                ", Account_Holder_LastName='" + Account_Holder_LastName + '\'' +
                ", Account_Holder_FistName='" + Account_Holder_FistName + '\'' +
                ", Account_holder_Id=" + Account_holder_Id +
                ", Status='" + Status + '\'' +
                ", Transactions=" + Transactions +
                '}';
    }
}
