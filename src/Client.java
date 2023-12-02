public class Client {
    public static void main(String[] args) {

        // Reference/pointer
        Bank b1 = new Bank("Omar");
        Bank b2 = new Bank("Ahmad", 100);

        Bank b3 = new Bank("Fahed");
        Bank b4 = new Bank("Mohammad", 550);
        Bank b5;

//        b1.balance += 500;
        b1.deposit(200);

        b3.withdraw(100);

        b4.deposit(200);

//        System.out.println(b1.getCount()); Should NOT be static
//        System.out.println(b2.getCount());
        System.out.println(Bank.getCount());


    }
}
