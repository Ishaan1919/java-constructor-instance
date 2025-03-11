class BankAccount{
    public String accountNumber;
    protected String accountHolder;
    private int balance;

    protected BankAccount(String accountNumber, String accountHolder, int balance){
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    public double accessBalance(){
        return this.balance;
    }

    public void modifyBalance(int updatedBalance){
        this.balance = updatedBalance;
    }
}

class SavingsAccount extends BankAccount{

    public SavingsAccount(String number, String holder, int balance){
        super(number,holder,balance);
    }

    public void display(){
        System.out.println("Account number is " + accountNumber);
        System.out.println("Account holder is " + accountHolder);
    }
}

public class BankAccountManagement{
    public static void main(String[] args) {
        SavingsAccount account = new SavingsAccount("2110990642","Ishaan",10000);
        account.display();
        account.modifyBalance(90000);
        System.out.println(account.accessBalance());
        account.display();


//        Account number is 2110990642
//        Account holder is Ishaan
//        90000.0
//        Account number is 2110990642
//        Account holder is Ishaan
    }
}