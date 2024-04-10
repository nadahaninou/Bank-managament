import java.util.List;

public class Customer {
    public   int Customer_ID;
    private String LastName;
    private String FirstName;
    private String Address;
    private String national_ID;
    private List<Integer> Account_Numbers;
    private List<Integer> Transaction_History;
    private List<Integer> Loan_History;

    public Customer(int customer_ID, String lastName, String firstName, String address, String national_ID, List<Integer> account_Numbers, List<Integer> transaction_History, List<Integer> loan_History) {
        Customer_ID = customer_ID;
        LastName = lastName;
        FirstName = firstName;
        Address = address;
        this.national_ID = national_ID;
        Account_Numbers = account_Numbers;
        Transaction_History = transaction_History;
        Loan_History = loan_History;
    }

    public int getCustomer_ID() {
        return Customer_ID;
    }

    public void setCustomer_ID(int customer_ID) {
        Customer_ID = customer_ID;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }

    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String firstName) {
        FirstName = firstName;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public String getNational_ID() {
        return national_ID;
    }

    public void setNational_ID(String national_ID) {
        this.national_ID = national_ID;
    }

    public List<Integer> getAccount_Numbers() {
        return Account_Numbers;
    }

    public void setAccount_Numbers(List<Integer> account_Numbers) {
        Account_Numbers = account_Numbers;
    }

    public List<Integer> getTransaction_History() {
        return Transaction_History;
    }

    public void setTransaction_History(List<Integer> transaction_History) {
        Transaction_History = transaction_History;
    }

    public List<Integer> getLoan_History() {
        return Loan_History;
    }

    public void setLoan_History(List<Integer> loan_History) {
        Loan_History = loan_History;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "Customer_ID=" + Customer_ID +
                ", LastName='" + LastName + '\'' +
                ", FirstName='" + FirstName + '\'' +
                ", Address='" + Address + '\'' +
                ", national_ID='" + national_ID + '\'' +
                ", Account_Numbers=" + Account_Numbers +
                ", Transaction_History=" + Transaction_History +
                ", Loan_History=" + Loan_History +
                '}';
    }
}
