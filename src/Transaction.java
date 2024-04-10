import java.util.Date;

public class Transaction {
    public   int  Transaction_ID;
    private String Transaction_Type;
    private double Amount;
    private String Date_Transaction;
    private int Source_Account;
    private int Destination_Account;

    public Transaction(int transaction_ID, String transaction_Type, double amount, String date_Transaction, int source_Account, int destination_Account) {
        Transaction_ID = transaction_ID;
        Transaction_Type = transaction_Type;
        Amount = amount;
        Date_Transaction = date_Transaction;
        Source_Account = source_Account;
        Destination_Account = destination_Account;
    }

    public int getTransaction_ID() {
        return Transaction_ID;
    }

    public void setTransaction_ID(int transaction_ID) {
        Transaction_ID = transaction_ID;
    }

    public String getTransaction_Type() {
        return Transaction_Type;
    }

    public void setTransaction_Type(String transaction_Type) {
        Transaction_Type = transaction_Type;
    }

    public double getAmount() {
        return Amount;
    }

    public void setAmount(double amount) {
        Amount = amount;
    }

    public String getDate_Transaction() {
        return Date_Transaction;
    }

    public void setDate_Transaction(String date_Transaction) {
        Date_Transaction = date_Transaction;
    }

    public int getSource_Account() {
        return Source_Account;
    }

    public void setSource_Account(int source_Account) {
        Source_Account = source_Account;
    }

    public int getDestination_Account() {
        return Destination_Account;
    }

    public void setDestination_Account(int destination_Account) {
        Destination_Account = destination_Account;
    }

    @Override
    public String toString() {
        return "Transaction{" +
                "Transaction_ID=" + Transaction_ID +
                ", Transaction_Type='" + Transaction_Type + '\'' +
                ", Amount=" + Amount +
                ", Date_Transaction=" + Date_Transaction +
                ", Source_Account=" + Source_Account +
                ", Destination_Account=" + Destination_Account +
                '}';
    }
}
