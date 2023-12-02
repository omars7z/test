public class Bank {
    // 1. Data fields
    private String ownerName;
    private double balance;
    private static int count = 0;

    private String version = "1.0.0";

    // 3. Constructors
    public Bank(String ownerName){
        this.ownerName = ownerName;
        balance = 0;
    }

    public Bank(String ownerName, double balance){
        this.ownerName = ownerName;
        this.balance = balance;
        count++;
    }

    // 2. Behavior methods
    public void deposit(double amount){
        balance += amount;
    }

    public void withdraw(double amount){
        if (amount <= balance && amount > 0) {
            balance -= amount;
        } else {
            System.out.println("Invalid withdrawal amount");
        }
    }

    String getOwnerName(){
        return ownerName;
    }

    double getBalance(){
        return balance;
    }

    public static int getCount(){ //can modify static variable
        return count;
    }
}
