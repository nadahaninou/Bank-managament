import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Account> accounts=new ArrayList<>();
        List<ATM> atms=new ArrayList<>();
        List<Customer> customers=new ArrayList<>();
        List<Employee> employees=new ArrayList<>();
        List<Loan> loans=new ArrayList<>();
        List<Transaction> transactions=new ArrayList<>();
        for(int i=0;i<2;i++){
        Customer customer=bank.Customer();
        customers.add(customer);

        }
        System.out.println(customers);
        for(int i=0;i<2;i++){
            Account account=bank.CreateAccount(customers);
            accounts.add(account);
        }
        System.out.println(accounts);
        System.out.println(customers);
        for(int i=0;i<1;i++){
            Loan loan=bank.CreateLoan(customers);
            loans.add(loan);
        }
        System.out.println(loans);
        System.out.println(customers);
        for(int i=0;i<1;i++){
            Transaction transaction=bank.performTransaction(accounts,customers);
            transactions.add(transaction);
        }
        System.out.println(accounts);
        System.out.println(transactions);
        System.out.println(customers);


    }
}