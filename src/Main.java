import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int pin = 1234;
        int balance = 10000;
        int addAmount = 0;
        int takeAmount = 0;
        String name;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your pin number");

        int password = scanner.nextInt();

        if (password == pin) {
            System.out.println("Enter your name");
            name = scanner.next();
            System.out.println("Welcome " + name);

            while (true) {
                System.out.println("Press 1 to check your balance");
                System.out.println("Press 2 to add amount");
                System.out.println("Press 3 to take amount");
                System.out.println("Press 4 to take receipt");
                System.out.println("Press 5 to exit");

                int opt = scanner.nextInt();
                switch (opt) {
                    case 1:
                        System.out.println("Your current balance is " + balance);
                        break;
                    case 2:
                        System.out.println("How much amount did you want to add to your account ?");
                        addAmount = scanner.nextInt();
                        System.out.println("Successfully credited");
                        balance = addAmount + balance;
                        // 10000 = 100 + 10000
                        // balance = 10100
                        break;
                    case 3:
                        System.out.println("How much amount did you want to take ?");
                        takeAmount = scanner.nextInt();
                        if (takeAmount > balance) {
                            System.out.println("Your balance is insufficient");
                            System.out.println("Try less than your available balance");
                        } else {
                            System.out.println("Successfully taken");
                            balance = balance - takeAmount;
                            // balance = 10100 = 10100 - 100
                            // balance = 10000
                        }
                        break;
                    case 4:
                        System.out.println("Welcome to All in One mini ATM");
                        System.out.println("Available balance is " + balance);
                        System.out.println("Amount deposited " + addAmount);
                        System.out.println("Amount taken " + takeAmount);
                        System.out.println("Thanks for coming");
                        break;
                }
                if (opt == 5) {
                    System.out.println("Thank you");
                    break;
                }
            }
        } else {
            System.out.println("Wrong pin number");
        }
    }
}