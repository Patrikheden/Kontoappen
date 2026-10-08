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