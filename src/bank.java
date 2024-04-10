
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public  class bank {
    static Scanner sc=new Scanner(System.in);
    public static Customer Customer(){
        System.out.println("give me the custom_ Id");
        int Id=sc.nextInt();
        System.out.println("give me the last name");
        String lastName=sc.next();
        System.out.println("give me the firstName");
        String firstName=sc.next();
        System.out.println("give me the adresse");
        String adresse=sc.next();
        System.out.println("give me the national Id");
        String National_id=sc.next();
        List<Integer> accountsIds=new ArrayList<>();
        List<Integer> transactionsIds=new ArrayList<>();
        List<Integer> loansIds=new ArrayList<>();
        Customer customer=new Customer(Id,lastName,firstName,adresse,National_id,accountsIds,transactionsIds,loansIds);
        return customer;
    }
    public static  Account CreateAccount(List<Customer> customers){
        System.out.println("give me the Account_Id");
        int Id=sc.nextInt();
        System.out.println("give me the Account type");
        String Accounttype=sc.next();
        System.out.println("give me the balance");
        double Balance=sc.nextDouble();
        System.out.println("give me the Account holder last name");
        String Account_Holder_LastName=sc.next();
        System.out.println("give me the Account holder first name");
        String Account_Holder_FirstName=sc.next();
        System.out.println("give me the Account holder id");
        int Holder_Id=sc.nextInt();
        System.out.println("give me the status");
        String Status=sc.next();
        List<Integer> transactions=new ArrayList<>();
        Account account=new Account(Id,Accounttype,Balance,Account_Holder_LastName,Account_Holder_FirstName,Holder_Id,Status,transactions);
        for(int i=0;i<customers.size();i++){
            if(customers.get(i).Customer_ID==Holder_Id){
               customers.get(i).getAccount_Numbers().add(account.getAccount_Number());
            }
        }
        return account;
    }
    public  static ATM CreateATM(){
        System.out.println("give me the ATM_Id");
        int Id=sc.nextInt();
        System.out.println("give me the location");
        String location=sc.next();
        System.out.println("give me the cash_Availability");
        double cash_Availability=sc.nextDouble();
        System.out.println("give me the status");
        String status=sc.next();

        ATM atm=new ATM(Id,location,status,cash_Availability);
        return atm;
    }
    public static  Employee CreateEmployee(){
        System.out.println("give me the Employee_Id");
        int Id=sc.nextInt();
        System.out.println("give me the last name");
        String lastName=sc.next();
        System.out.println("give me the first name");
        String firstName=sc.next();
        System.out.println("give me the role");
        String role=sc.next();
        System.out.println("give me its departement");
        String departement=sc.next();
        System.out.println("give me the phone number");
        int PhoneNumber=sc.nextInt();
        System.out.println("give me the salary");
        double salary=sc.nextDouble();
        Employee employee=new Employee(Id,lastName,firstName,role,departement,PhoneNumber,salary);
        return employee;
    }
    public static Loan CreateLoan(List<Customer> customers){
        System.out.println("give me the Loan_id");
        int Id=sc.nextInt();
        System.out.println("give me the loan amount");
        double loanAmmount=sc.nextDouble();
        System.out.println("give me the borrower id");
        int borrower_id=sc.nextInt();
        System.out.println("give me the last name of the borrower");
        String lastName=sc.next();
        System.out.println("give me the first name of the borrower");
        String firstName=sc.next();
        System.out.println("give me the loan type");
        String loantype=sc.next();
        Loan loan=new Loan(Id,loanAmmount,borrower_id,lastName,firstName,loantype);
        for(int i=0;i<customers.size();i++){
            if(customers.get(i).getCustomer_ID()==borrower_id){
                customers.get(i).getLoan_History().add(loan.Loan_ID);
            }
        }
        return  loan;

    }
    public static Transaction performTransaction(List<Account> accounts,List<Customer> customers){
    System.out.println("give me the Transaction_Id");
    int Id=sc.nextInt();
    System.out.println("give me the type of the transaction");
    String transaction_type=sc.next();
    System.out.println("give me the ammount");
    double Ammount=sc.nextDouble();
    System.out.println("give me the date of this transaction");
    String date=sc.next();
    System.out.println("give me the source account");
    int SourceAccount=sc.nextInt();
    System.out.println("give me the destination account");
    int DestinationAccount=sc.nextInt();
    Transaction transaction=new Transaction(Id,transaction_type,Ammount,date,SourceAccount,DestinationAccount);
    int Costumer_id=0;
    for(int i=0;i<accounts.size();i++){
        if(accounts.get(i).getAccount_Number()==SourceAccount){
           double value=accounts.get(i).getBalance();
           value=value-Ammount;
           accounts.get(i).setBalance(value);
           accounts.get(i).getTransactions().add(transaction.getTransaction_ID());
           Costumer_id=accounts.get(i).getAccount_holder_Id();
        }
        if(accounts.get(i).getAccount_Number()==DestinationAccount){
            double value=accounts.get(i).getBalance();
            value=value+Ammount;
            accounts.get(i).setBalance(value);
        }
    }
    for(int i=0;i<customers.size();i++){
        if(customers.get(i).getCustomer_ID()==Costumer_id){
            customers.get(i).getTransaction_History().add(transaction.getTransaction_ID());
        }
    }
    return transaction;

    }






}
