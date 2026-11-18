
import java.util.Scanner;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ATM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double balance = 5000.0;

        try {
            System.out.println("===== ATM WITHDRAWAL SYSTEM =====");
            System.out.println("Available Balance: Rs. " + balance);
            System.out.print("Enter withdrawal amount: ");

            double amount = sc.nextDouble();

            if (amount <= 0) {
                throw new IllegalArgumentException(
                    "Withdrawal amount must be positive.");
            }

            if (amount > balance) {
                throw new ArithmeticException(
                    "Insufficient balance.");
            }

            balance -= amount;
            System.out.println("Withdrawal successful!");
            System.out.println("Remaining Balance: Rs. " + balance);

        } catch (ArithmeticException e) {
            System.out.println("Transaction Error: " + e.getMessage());

        } catch (IllegalArgumentException e) {
            System.out.println("Invalid Amount: " + e.getMessage());

        } catch (java.util.InputMismatchException e) {
            System.out.println("Input Error: Enter numbers only.");

        } finally {
            System.out.println("ATM transaction process completed.");
        }

        sc.close();
    }
}
