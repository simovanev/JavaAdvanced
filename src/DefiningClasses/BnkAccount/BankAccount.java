package DefiningClasses.BnkAccount;

public class BankAccount {
    private  final static double DEFAULT_INTEREST_RATE=0.02;
    private  static double interestRate=DEFAULT_INTEREST_RATE;
    private  static int accountCount=0;
    private int id;
    private double balance;
    public BankAccount(){
        accountCount++;
        this.id=accountCount;
        this.balance=0;
    }

    public double getInterest(int years){
        return balance*interestRate*years;
    }
    public void deposit(double balance){
        this.balance+=balance;
    }
    public static void setInterestRate(double interest){
        interestRate=interest;
    }

    public int getId() {
        return  this.id;

    }


    }

