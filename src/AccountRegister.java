import java.util.ArrayList;

public class AccountRegister {

    private ArrayList<Account> accounts;

    public AccountRegister() {
        accounts = new ArrayList<>();
    }

    public void createAccount(String owner, double startingBalance) {
        Account account = new Account(owner, startingBalance);
        accounts.add(account);

    }

    public void showAllAccounts() {
        for (Account account : accounts) {
            System.out.println("Ägare: " + account.getOwner());
            System.out.println("Saldo: " + account.getBalance());
        }
    }

    public Account findAccount(String owner) {
        for (Account account : accounts) {
            if (account.getOwner().equals(owner)) {
                return account;
            }
        }
        return null;
    }
}