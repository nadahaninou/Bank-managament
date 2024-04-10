public class Loan {
    public  int Loan_ID;
    private double Loan_Amount;
    private int Id_Borrower;
    private String lastName_Borrower;
    private String firstName_Borrower;
    private String Loan_Type;

    public Loan(int loan_ID, double loan_Amount, int id_Borrower, String lastName_Borrower, String firstName_Borrower, String loan_Type) {
        Loan_ID = loan_ID;
        Loan_Amount = loan_Amount;
        Id_Borrower = id_Borrower;
        this.lastName_Borrower = lastName_Borrower;
        this.firstName_Borrower = firstName_Borrower;
        Loan_Type = loan_Type;
    }

    public int getLoan_ID() {
        return Loan_ID;
    }

    public void setLoan_ID(int loan_ID) {
        Loan_ID = loan_ID;
    }

    public double getLoan_Amount() {
        return Loan_Amount;
    }

    public void setLoan_Amount(double loan_Amount) {
        Loan_Amount = loan_Amount;
    }

    public int getId_Borrower() {
        return Id_Borrower;
    }

    public void setId_Borrower(int id_Borrower) {
        Id_Borrower = id_Borrower;
    }

    public String getLastName_Borrower() {
        return lastName_Borrower;
    }

    public void setLastName_Borrower(String lastName_Borrower) {
        this.lastName_Borrower = lastName_Borrower;
    }

    public String getFirstName_Borrower() {
        return firstName_Borrower;
    }

    public void setFirstName_Borrower(String firstName_Borrower) {
        this.firstName_Borrower = firstName_Borrower;
    }

    public String getLoan_Type() {
        return Loan_Type;
    }

    public void setLoan_Type(String loan_Type) {
        Loan_Type = loan_Type;
    }

    @Override
    public String toString() {
        return "Loan{" +
                "Loan_ID=" + Loan_ID +
                ", Loan_Amount=" + Loan_Amount +
                ", Id_Borrower='" + Id_Borrower + '\'' +
                ", lastName_Borrower='" + lastName_Borrower + '\'' +
                ", firstName_Borrower='" + firstName_Borrower + '\'' +
                ", Loan_Type='" + Loan_Type + '\'' +
                '}';
    }
}
