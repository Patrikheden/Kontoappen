public class Account {
    private String owner;
    private double balance;

    public Account(String owner, double startingBalance) {
        this.owner = owner;
        this.balance = startingBalance;
    }

    public String getOwner() {
        return owner;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {

        if (amount > 0) {
            balance += amount;
        } else {
            System.out.println("Beloppet måste vara större än 0.");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0) {
            if (amount <= balance) {
                balance -= amount;
            } else {
                System.out.println("Uttaget nekades. Det finns inte tillräckligt med pengar.");
            }
        } else {
            System.out.println("Beloppet måste vara större än 0.");

        }
    }
}
