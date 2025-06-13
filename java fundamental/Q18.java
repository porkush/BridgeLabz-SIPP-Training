import java.util.Scanner;

public class PurchasePrice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter unit price in INR: ");
        double unitPrice = sc.nextDouble();

        System.out.print("Enter quantity: ");
        int quantity = sc.nextInt();

        double total = unitPrice * quantity;

        System.out.printf("The total purchase price is INR %.2f if the quantity is %d and the unit price is INR %.2f%n", total, quantity, unitPrice);
    }
}
