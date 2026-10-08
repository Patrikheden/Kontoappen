import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        AccountRegister register = new AccountRegister();
        Scanner scanner = new Scanner(System.in);

        boolean running = true;

        while (running) {
            System.out.println("1. Skapa konto");
            System.out.println("2. Lista konton");
            System.out.println("3. Sätt in pengar");
            System.out.println("4. Ta ut pengar");
            System.out.println("5. Avsluta");

            System.out.print("Välj ett alternativ: ");
            int choice = scanner.nextInt();

            if (choice == 1) {
                System.out.print("Ange ägarens namn: ");
                String owner = scanner.next();

                System.out.print("Ange startbelopp: ");
                double startingBalance = scanner.nextDouble();

                register.createAccount(owner, startingBalance);

            } else if (choice == 2) {
                register.showAllAccounts();
            }
            else if (choice == 3) {
                System.out.print("Ange ägarens namn: ");
                String depositOwner = scanner.next();

                Account account = register.findAccount(depositOwner);

                if (account != null) {
                    System.out.print("Ange belopp att sätta in: ");
                    double amount = scanner.nextDouble();

                    account.deposit(amount);
                } else {
                    System.out.println("Kontot kunde inte hittas.");
                }
            }
            else if (choice == 4) {
                System.out.print("Ange ägarens namn: ");
                String withdrawOwner = scanner.next();

                Account withdrawAccount = register.findAccount(withdrawOwner);

                if (withdrawAccount != null) {
                    System.out.print("Ange belopp att ta ut: ");
                    double amount = scanner.nextDouble();

                    withdrawAccount.withdraw(amount);
                } else {
                    System.out.println("Kontot kunde inte hittas.");
                }

            }
            else if (choice == 5) {
                running = false;
                System.out.println("Programmet avslutas.");
            }
        }
    }
}
