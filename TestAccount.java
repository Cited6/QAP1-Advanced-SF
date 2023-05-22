public class TestAccount {
    public static void main(String[] args) {
        
        Account account1 = new Account("Acc1","Savanna Lynn", 5000);
        Account account2 = new Account("Acc2","Abby Peach", 4000);

       System.out.println("Initial Account Balance:");
       System.out.println("Account 1 balance: $" + account1.getBalance());
       System.out.println("Account 2 balance: $" + account2.getBalance());


       //Transfer from acc1 to acc2

       account1.transferTo(account2, 1000);

       //Display new balances of each account

       System.out.println("\nUpdated Account Balances:");

       System.out.println("Account 1 balance: $ " + account1.getBalance());
       System.out.println("Account 2 balance: $" + account2.getBalance());



    }
    
}
